package SpiderCorba;

/**
* SpiderCorba/SpiderDefineHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Monday, July 30, 2018 10:51:16 AM ICT
*/

public final class SpiderDefineHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.SpiderDefine value = null;

  public SpiderDefineHolder ()
  {
  }

  public SpiderDefineHolder (SpiderCorba.SpiderDefine initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.SpiderDefineHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.SpiderDefineHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.SpiderDefineHelper.type ();
  }

}
