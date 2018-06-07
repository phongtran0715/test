package com.spider.corba;

import org.omg.CosNaming.*;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

import SpiderCorba.RenderSide;
import SpiderCorba.RenderSideHelper;
import SpiderCorba.RenderSidePOA;
import SpiderCorba.RenderSidePackage.RenderConfig;
import SpiderCorba.SpiderDefinePackage.VideoInfo;
import spiderboot.render.DataDefine;
import spiderboot.render.RenderTimerManager;


class RenderImpl extends RenderSidePOA {
	private static final Logger logger = Logger.getLogger(RenderImpl.class);
	@Override
	public boolean createRenderJob(int jobId, VideoInfo vInfo, RenderConfig renderCfg) {
		// TODO Auto-generated method stub
		logger.info("createRenderJob:: jobId = " + jobId);
		DataDefine.RenderJobData jobData = new DataDefine().new RenderJobData(jobId, vInfo, renderCfg);
		RenderTimerManager.qRenderJob.add(jobData);
		return true;
	}
	@Override
	public boolean deleteRenderJob(int jobId, String renderClusterId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteRenderdVideo(String renderClusterId, String vLocation) {
		// TODO Auto-generated method stub

	}
}


public class RenderCorbaServer {
	public final String COMPONENT_NAME = "Spider_Foot_Render_Server";
	private static final Logger logger = Logger.getLogger(RenderCorbaServer.class);

	public boolean initCorba(String refStr) {
		boolean isSuccess = false;
		try 
		{
			String [] agrs = new String[] { "-ORBInitRef", refStr };
			// create and initialize the ORB
			ORB orb = ORB.init(agrs, null);

			// get reference to rootpoa & activate the POAManager
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			// create servant and register it with the ORB
			RenderImpl downloadImpl = new RenderImpl();

			// get object reference from the servant
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(downloadImpl);
			RenderSide href = RenderSideHelper.narrow(ref);

			// get the root naming context
			// NameService invokes the name service
			org.omg.CORBA.Object objRef =
					orb.resolve_initial_references("NameService");
			// Use NamingContextExt which is part of the Interoperable
			// Naming Service (INS) specification.
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// bind the Object Reference in Naming
			NameComponent path[] = ncRef.to_name( COMPONENT_NAME );
			ncRef.rebind(path, href);

			logger.info("Render server ready and waiting ...");

			// wait for invocations from clients
			orb.run();
			logger.info("Render server Exiting ...");
			isSuccess = true;
		}
		catch (Exception e) 
		{
			logger.error(e.toString());
		}
		return isSuccess;
	}
}
