package SpiderCorba.SpiderDefinePackage;

/**
* SpiderCorba/SpiderDefinePackage/UploadConfigHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Monday, July 30, 2018 10:51:16 AM ICT
*/

public final class UploadConfigHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.SpiderDefinePackage.UploadConfig value = null;

  public UploadConfigHolder ()
  {
  }

  public UploadConfigHolder (SpiderCorba.SpiderDefinePackage.UploadConfig initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.SpiderDefinePackage.UploadConfigHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.SpiderDefinePackage.UploadConfigHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.SpiderDefinePackage.UploadConfigHelper.type ();
  }

}
