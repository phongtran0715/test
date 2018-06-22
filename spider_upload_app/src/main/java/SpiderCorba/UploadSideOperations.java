package SpiderCorba;


/**
* SpiderCorba/UploadSideOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Thursday, June 21, 2018 10:14:48 AM ICT
*/

public interface UploadSideOperations  extends SpiderCorba.SpiderDefineOperations
{
  boolean createUploadTimer (String cHomeId);
  boolean deleteUploadTimer (String cHomeId);
  boolean createUploadJob (int jobId, SpiderCorba.SpiderDefinePackage.VideoInfo vInfo, String cHomeId);
  boolean deleteUploadJob (int jobId, String cHomeId);
} // interface UploadSideOperations
