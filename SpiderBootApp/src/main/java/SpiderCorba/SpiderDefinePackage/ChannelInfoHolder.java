package SpiderCorba.SpiderDefinePackage;

/**
* SpiderCorba/SpiderDefinePackage/ChannelInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SpiderAgentAPI.idl
* Friday, December 20, 2019 2:42:57 PM ICT
*/

public final class ChannelInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.SpiderDefinePackage.ChannelInfo value = null;

  public ChannelInfoHolder ()
  {
  }

  public ChannelInfoHolder (SpiderCorba.SpiderDefinePackage.ChannelInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.SpiderDefinePackage.ChannelInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.SpiderDefinePackage.ChannelInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.SpiderDefinePackage.ChannelInfoHelper.type ();
  }

}
