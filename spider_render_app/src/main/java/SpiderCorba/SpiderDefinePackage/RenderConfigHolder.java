package SpiderCorba.SpiderDefinePackage;

/**
* SpiderCorba/SpiderDefinePackage/RenderConfigHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Saturday, June 16, 2018 11:03:08 PM ICT
*/

public final class RenderConfigHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.SpiderDefinePackage.RenderConfig value = null;

  public RenderConfigHolder ()
  {
  }

  public RenderConfigHolder (SpiderCorba.SpiderDefinePackage.RenderConfig initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.SpiderDefinePackage.RenderConfigHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.SpiderDefinePackage.RenderConfigHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.SpiderDefinePackage.RenderConfigHelper.type ();
  }

}
