package SpiderCorba;


/**
* SpiderCorba/UploadSideOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Thursday, June 7, 2018 2:10:52 PM ICT
*/

public interface UploadSideOperations  extends SpiderCorba.SpiderDefineOperations
{
  boolean createUploadJob (int jobId, SpiderCorba.SpiderDefinePackage.VideoInfo vInfo, SpiderCorba.UploadSidePackage.UploadConfig uploadCfg);
  boolean deleteUploadJob (int jobId, String uploadClusterId);
} // interface UploadSideOperations
