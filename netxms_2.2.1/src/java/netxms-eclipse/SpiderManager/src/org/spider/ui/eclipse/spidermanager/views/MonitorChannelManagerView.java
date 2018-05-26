package org.spider.ui.eclipse.spidermanager.views;

import java.io.IOException;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.part.*;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.*;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.netxms.client.NXCException;
import org.netxms.client.NXCSession;
import org.netxms.client.SessionListener;
import org.netxms.client.SessionNotification;
import org.netxms.ui.eclipse.actions.RefreshAction;
import org.netxms.ui.eclipse.jobs.ConsoleJob;
import org.netxms.ui.eclipse.shared.ConsoleSharedData;
import org.netxms.ui.eclipse.spidermanager.dialogs.CreateMonitorChannelDialog;
import org.netxms.ui.eclipse.spidermanager.dialogs.EditMonitorChannelDialog;
import org.netxms.ui.eclipse.widgets.SortableTableViewer;
import org.spider.client.MonitorChannelObject;
import org.spider.ui.eclipse.spidermanager.Activator;
import org.spider.ui.eclipse.spidermanager.helper.MonitorChannelLabelProvider;

/**
 * This sample class demonstrates how to plug-in a new workbench view. The view
 * shows data obtained from the model. The sample creates a dummy model on the
 * fly, but a real implementation would connect to the model available either in
 * this or another plug-in (e.g. the workspace). The view is connected to the
 * model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be
 * presented in the view. Each view can present the same model objects using
 * different labels and icons, if needed. Alternatively, a single label provider
 * can be shared between views in order to ensure that objects of the same type
 * are presented in the same way everywhere.
 * <p>
 */

public class MonitorChannelManagerView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.spider.ui.eclipse.spidermanager.views.MonitorChannelManager";

	private TableViewer viewer;
	private Action actAddMonitorChannel;
	private Action actEditMonitorChannel;
	private Action actDeleteMonitorChannel;
	private RefreshAction actionRefresh;
	private NXCSession session;
	private SessionListener sessionListener;

	public static final int COLUMN_ID 				= 0;
	public static final int COLUMN_CHANNEL_ID 		= 1;
	public static final int COLUMN_CHANNEL_NAME 	= 2;

	/*
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewLabelProvider extends LabelProvider implements
	ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public MonitorChannelManagerView() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		session = ConsoleSharedData.getSession();
		final String[] names = { "Id",
				"ChannelID",
		"Channel Name"};
		final int[] widths = { 60, 120, 120};
		viewer = new SortableTableViewer(parent, names, widths, 0, SWT.UP, SortableTableViewer.DEFAULT_STYLE);
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new MonitorChannelLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());
		try {
			viewer.setInput(session.getMonitorChannelList());
		} catch (IOException | NXCException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Create the help context id for the viewer's control
		PlatformUI
		.getWorkbench()
		.getHelpSystem()
		.setHelp(viewer.getControl(),
				"org.spider.ui.eclipse.spider.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		// Listener for server's notifications
		sessionListener = new SessionListener() {
			@Override
			public void notificationHandler(final SessionNotification n) {
				if (n.getCode() == SessionNotification.MONITOR_CHANNEL_CHANGED) {
					viewer.getControl().getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							try {
								viewer.setInput(session.getMonitorChannelList());
							} catch (IOException | NXCException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});
				}
			}
		};

		// Request server to lock user database, and on success refresh view
		new ConsoleJob("Refresh monitor channel list", this,
				Activator.PLUGIN_ID, null) {
			@Override
			protected void runInternal(IProgressMonitor monitor)
					throws Exception {
				runInUIThread(new Runnable() {
					@Override
					public void run() {
						try {
							viewer.setInput(session.getMonitorChannelList());
						} catch (IOException | NXCException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						session.addListener(sessionListener);
					}
				});
			}

			@Override
			protected void jobFailureHandler() {
				runInUIThread(new Runnable() {
					@Override
					public void run() {
						MonitorChannelManagerView.this.getViewSite().getPage()
						.hideView(MonitorChannelManagerView.this);
					}
				});
			}

			@Override
			protected String getErrorMessage() {
				return "Open monitor channel error!";
			}
		}.start();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				MonitorChannelManagerView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(actAddMonitorChannel);
		manager.add(new Separator());
		manager.add(actEditMonitorChannel);
		manager.add(new Separator());
		manager.add(actDeleteMonitorChannel);
		manager.add(new Separator());
		manager.add(actionRefresh);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(actAddMonitorChannel);
		manager.add(actEditMonitorChannel);
		manager.add(actDeleteMonitorChannel);
		manager.add(actionRefresh);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(actAddMonitorChannel);
		manager.add(actEditMonitorChannel);
		manager.add(actDeleteMonitorChannel);
		manager.add(actionRefresh);
	}

	private void makeActions() {
		actAddMonitorChannel = new Action("Add new monitor channel", 
				Activator.getImageDescriptor("icons/account_add.png")) {
			public void run() {
				addMonitorChannel();
			}
		};
		actAddMonitorChannel.setToolTipText("Add new monitor channel");

		actEditMonitorChannel = new Action("Edit monitor channel", 
				Activator.getImageDescriptor("icons/account_edit.png")) {
			public void run() {
				modifyMonitorChannel();
			}
		};
		actEditMonitorChannel.setToolTipText("Edit monitor channel");

		actDeleteMonitorChannel = new Action("Delete monitor channel", 
				Activator.getImageDescriptor("icons/account_delete.png")) {
			public void run() {
				try {
					deleteMonitorChannel();
				} catch (IOException | NXCException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		actDeleteMonitorChannel.setToolTipText("Delete monitor channel");
		
		actionRefresh = new RefreshAction(this) {
			@Override
			public void run() {
				try {
					viewer.setInput(session.getMonitorChannelList());
				} catch (IOException | NXCException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
			}
		});
	}

	public void setFocus() {
		viewer.getControl().setFocus();
	}

	private void addMonitorChannel()
	{
		final CreateMonitorChannelDialog dlg = new CreateMonitorChannelDialog(getViewSite().getShell());
		if (dlg.open() == Window.OK) {
			new ConsoleJob("Create monitor channel",
					this, Activator.PLUGIN_ID, null) {
				@Override
				protected void runInternal(IProgressMonitor monitor)
						throws Exception {
					session.createMonitorChannel(dlg.getChannelId(), dlg.getChannelName());
				}

				@Override
				protected String getErrorMessage() {
					return "Can not create monitor channel";
				}
			}.start();
		}
	}

	private void modifyMonitorChannel()
	{
		final IStructuredSelection selection = (IStructuredSelection) viewer
				.getSelection();
		if(selection.size() <= 0)
		{
			MessageBox dialog =
					new MessageBox(getViewSite().getShell(), SWT.ICON_WARNING | SWT.OK);
			dialog.setText("Warning");
			dialog.setMessage("You must select at least one item to modify!");
			dialog.open();
			return;
		}
		Object firstElement = selection.getFirstElement();
		if(firstElement instanceof MonitorChannelObject)
		{

			final EditMonitorChannelDialog dlg = new EditMonitorChannelDialog(getViewSite().getShell(), 
					(MonitorChannelObject)firstElement);
			if (dlg.open() == Window.OK) {
				new ConsoleJob("Edit monitor channel",
						this, Activator.PLUGIN_ID, null) {
					@Override
					protected void runInternal(IProgressMonitor monitor)
							throws Exception {
						session.modifyMonitorChannel(dlg.getId(), dlg.getChannelId(), dlg.getChannelName());
					}

					@Override
					protected String getErrorMessage() {
						return "Can not edit monitor channel";
					}
				}.start();
			}	
		}

	}

	private void deleteMonitorChannel() throws IOException, NXCException
	{
		final IStructuredSelection selection = (IStructuredSelection) viewer
				.getSelection();
		if(selection.size() <= 0)
		{
			MessageBox dialog =
					new MessageBox(getViewSite().getShell(), SWT.ICON_WARNING | SWT.OK);
			dialog.setText("Warning");
			dialog.setMessage("You must select at least one item to delete!");
			dialog.open();
			return;
		}
		MessageBox dialog =
				new MessageBox(getViewSite().getShell(), SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
		dialog.setText("Confirm to delete item");
		dialog.setMessage("Do you really want to do delete this item?");
		if (dialog.open() == SWT.OK) {
			Object firstElement = selection.getFirstElement();
			if(firstElement instanceof MonitorChannelObject)
			{
				MonitorChannelObject object = (MonitorChannelObject)firstElement;
				session.deleteMonitorChannel(object.getId());
			}
		}
	}
}