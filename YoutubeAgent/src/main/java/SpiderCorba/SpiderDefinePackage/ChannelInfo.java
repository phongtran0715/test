package SpiderCorba.SpiderDefinePackage;


/**
* SpiderCorba/SpiderDefinePackage/ChannelInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, July 13, 2018 9:28:06 AM ICT
*/

public final class ChannelInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String channelId = null;
  public String channelName = null;
  public int videoNumber = (int)0;
  public int viewNumber = (int)0;
  public int subcriber = (int)0;
  public int dateCreated = (int)0;
  public int status = (int)0;

  public ChannelInfo ()
  {
  } // ctor

  public ChannelInfo (String _channelId, String _channelName, int _videoNumber, int _viewNumber, int _subcriber, int _dateCreated, int _status)
  {
    channelId = _channelId;
    channelName = _channelName;
    videoNumber = _videoNumber;
    viewNumber = _viewNumber;
    subcriber = _subcriber;
    dateCreated = _dateCreated;
    status = _status;
  } // ctor

} // class ChannelInfo