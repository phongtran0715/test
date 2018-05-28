package SpiderAgentApp.AgentSidePackage;


/**
* SpiderAgentApp/AgentSidePackage/VideoInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Monday, May 28, 2018 5:00:42 PM ICT
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
  public String homeChannelId = null;
  public String monitorChannelId = null;
  public int processStatus = (int)0;
  public int license = (int)0;

  public VideoInfo ()
  {
  } // ctor

  public VideoInfo (String _videoId, String _title, String _tags, String _description, String _thumbnail, String _vDownloadPath, String _vRenderPath, String _homeChannelId, String _monitorChannelId, int _processStatus, int _license)
  {
    videoId = _videoId;
    title = _title;
    tags = _tags;
    description = _description;
    thumbnail = _thumbnail;
    vDownloadPath = _vDownloadPath;
    vRenderPath = _vRenderPath;
    homeChannelId = _homeChannelId;
    monitorChannelId = _monitorChannelId;
    processStatus = _processStatus;
    license = _license;
  } // ctor

} // class VideoInfo
