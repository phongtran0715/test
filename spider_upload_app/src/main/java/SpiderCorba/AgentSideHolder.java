package SpiderCorba;

/**
* SpiderCorba/AgentSideHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Sunday, June 17, 2018 9:15:03 AM ICT
*/

public final class AgentSideHolder implements org.omg.CORBA.portable.Streamable
{
  public SpiderCorba.AgentSide value = null;

  public AgentSideHolder ()
  {
  }

  public AgentSideHolder (SpiderCorba.AgentSide initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SpiderCorba.AgentSideHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SpiderCorba.AgentSideHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SpiderCorba.AgentSideHelper.type ();
  }

}
