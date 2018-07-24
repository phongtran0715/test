package SpiderCorba;


/**
* SpiderCorba/AgentSideOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, June 22, 2018 9:58:23 PM ICT
*/

public interface AgentSideOperations  extends SpiderCorba.SpiderDefineOperations
{

  //Download app function
  void onDownloadStartup (String downloadClusterId);
  long getLastSyncTime (int mappingId);
  void updateLastSyntime (int mappingId, long lastSyncTime);
  void insertDownloadedVideo (SpiderCorba.SpiderDefinePackage.VideoInfo vInfo);
  void updateDownloadedVideo (int jobId, SpiderCorba.SpiderDefinePackage.VideoInfo vInfo);
  SpiderCorba.SpiderDefinePackage.DownloadConfig getDownloadConfig (int mappingId);
  SpiderCorba.SpiderDefinePackage.CustomVideoInfor getCustomVideo (String downloadClusterId);
} // interface AgentSideOperations