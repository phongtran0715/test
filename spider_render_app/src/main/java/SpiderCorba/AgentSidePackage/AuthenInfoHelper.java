package SpiderCorba.AgentSidePackage;


/**
* SpiderCorba/AgentSidePackage/AuthenInfoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Thursday, June 7, 2018 2:19:30 PM ICT
*/

abstract public class AuthenInfoHelper
{
  private static String  _id = "IDL:SpiderCorba/AgentSide/AuthenInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, SpiderCorba.AgentSidePackage.AuthenInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static SpiderCorba.AgentSidePackage.AuthenInfo extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "userName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "apiKey",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "clientSecret",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "clientId",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (SpiderCorba.AgentSidePackage.AuthenInfoHelper.id (), "AuthenInfo", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static SpiderCorba.AgentSidePackage.AuthenInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    SpiderCorba.AgentSidePackage.AuthenInfo value = new SpiderCorba.AgentSidePackage.AuthenInfo ();
    value.userName = istream.read_wstring ();
    value.apiKey = istream.read_wstring ();
    value.clientSecret = istream.read_wstring ();
    value.clientId = istream.read_wstring ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, SpiderCorba.AgentSidePackage.AuthenInfo value)
  {
    ostream.write_wstring (value.userName);
    ostream.write_wstring (value.apiKey);
    ostream.write_wstring (value.clientSecret);
    ostream.write_wstring (value.clientId);
  }

}
