package SpiderCorba;

/**
* SpiderCorba/UploadSideHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, June 15, 2018 7:08:29 PM ICT
*/

public final class UploadSideHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.UploadSide value = null;

  public UploadSideHolder ()
  {
  }

  public UploadSideHolder (SpiderCorba.UploadSide initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.UploadSideHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.UploadSideHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.UploadSideHelper.type ();
  }

}
