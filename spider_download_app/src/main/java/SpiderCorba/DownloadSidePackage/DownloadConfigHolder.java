package SpiderCorba.DownloadSidePackage;

/**
* SpiderCorba/DownloadSidePackage/DownloadConfigHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, June 15, 2018 7:14:53 PM ICT
*/

public final class DownloadConfigHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.DownloadSidePackage.DownloadConfig value = null;

  public DownloadConfigHolder ()
  {
  }

  public DownloadConfigHolder (SpiderCorba.DownloadSidePackage.DownloadConfig initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.DownloadSidePackage.DownloadConfigHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.DownloadSidePackage.DownloadConfigHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.DownloadSidePackage.DownloadConfigHelper.type ();
  }

}
