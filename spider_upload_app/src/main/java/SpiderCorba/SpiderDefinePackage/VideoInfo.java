package SpiderCorba.SpiderDefinePackage;


/**
* SpiderCorba/SpiderDefinePackage/VideoInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Monday, July 30, 2018 10:51:16 AM ICT
*/

public final class VideoInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String videoId = null;
  public String title = null;
  public String tags = null;
  public String description = null;
  public String thumbnail = null;
  public String vDownloadPath = null;
  public String vRenderPath = null;
  public int mappingId = (int)0;
  public int processStatus = (int)0;
  public int license = (int)0;

  public VideoInfo ()
  {
  } // ctor

  public VideoInfo (String _videoId, String _title, String _tags, String _description, String _thumbnail, String _vDownloadPath, String _vRenderPath, int _mappingId, int _processStatus, int _license)
  {
    videoId = _videoId;
    title = _title;
    tags = _tags;
    description = _description;
    thumbnail = _thumbnail;
    vDownloadPath = _vDownloadPath;
    vRenderPath = _vRenderPath;
    mappingId = _mappingId;
    processStatus = _processStatus;
    license = _license;
  } // ctor

} // class VideoInfo
