package SpiderCorba.SpiderDefinePackage;

/**
* SpiderCorba/SpiderDefinePackage/AuthenInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Monday, July 30, 2018 10:51:16 AM ICT
*/

public final class AuthenInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.SpiderDefinePackage.AuthenInfo value = null;

  public AuthenInfoHolder ()
  {
  }

  public AuthenInfoHolder (SpiderCorba.SpiderDefinePackage.AuthenInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.SpiderDefinePackage.AuthenInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.SpiderDefinePackage.AuthenInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.SpiderDefinePackage.AuthenInfoHelper.type ();
  }

}
