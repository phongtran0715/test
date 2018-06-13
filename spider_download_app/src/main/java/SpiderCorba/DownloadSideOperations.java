package SpiderCorba;


/**
* SpiderCorba/DownloadSideOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Thursday, June 7, 2018 2:08:52 PM ICT
*/

public interface DownloadSideOperations  extends SpiderCorba.SpiderDefineOperations
{
  boolean createDownloadJob (int jobId, SpiderCorba.DownloadSidePackage.DownloadConfig downloadCfg);
  boolean modifyDownloadJob (int jobId, SpiderCorba.DownloadSidePackage.DownloadConfig downloadCfg);
  boolean deleteDownloadJob (int jobId, String downloadClusterId);
} // interface DownloadSideOperations
