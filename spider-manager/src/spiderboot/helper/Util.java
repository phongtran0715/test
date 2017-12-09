package spiderboot.helper;

import java.io.File;
import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Util {
	private static final int PORT = 9999;
	@SuppressWarnings("unused")
	private static ServerSocket socket;    

	public static boolean checkIfRunning() {
		boolean isRunning = false;
		try {
			//Bind to localhost adapter with a zero connection queue 
			socket = new ServerSocket(PORT,0,InetAddress.getByAddress(new byte[] {127,0,0,1}));
			isRunning = false;
		}
		catch (BindException e) {
			System.err.println("Already running.");
			System.exit(1);
			isRunning = true;
		}
		catch (IOException e) {
			System.err.println("Unexpected error.");
			e.printStackTrace();
			System.exit(2);
		}
		return isRunning;
	}

	public boolean createFolderIfNotExist(String dirName) {
		boolean result = false;
		String path = dirName;
		File theDir = new File(path);
		// if the directory does not exist, create it
		if (!theDir.exists()) {
			try{
				theDir.mkdir();
				result = true;
				System.out.println("Created directory : " + path);
			} 
			catch(SecurityException se){
				System.out.println("Can not creat video directory");
				se.printStackTrace();
			}        
		}
		return result;
	}

	public void deleteFolder(String dirName) {
		String path = dirName;
		File theDir = new File(path);
		if (theDir.isDirectory()) {
			//directory is empty, then delete it
			if(theDir.list().length==0){
				theDir.delete();
				System.out.println("Directory is deleted : "
						+ theDir.getAbsolutePath());

			}else{
				//list all the directory contents
				String files[] = theDir.list();
				for (String temp : files) {
					//construct the file structure
					//recursive delete
					deleteFolder(dirName + "//" + temp);
				}
				theDir.delete();
			}
		}else{
			theDir.delete();
		}
	}
}