package SpiderCorba.SpiderDefinePackage;


/**
* SpiderCorba/SpiderDefinePackage/ClusterInfoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Monday, June 18, 2018 11:36:56 AM ICT
*/

abstract public class ClusterInfoHelper
{
  private static String  _id = "IDL:SpiderCorba/SpiderDefine/ClusterInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, SpiderCorba.SpiderDefinePackage.ClusterInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static SpiderCorba.SpiderDefinePackage.ClusterInfo extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "clusterIp",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "userName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "password",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (SpiderCorba.SpiderDefinePackage.ClusterInfoHelper.id (), "ClusterInfo", _members0);
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

  public static SpiderCorba.SpiderDefinePackage.ClusterInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    SpiderCorba.SpiderDefinePackage.ClusterInfo value = new SpiderCorba.SpiderDefinePackage.ClusterInfo ();
    value.clusterIp = istream.read_wstring ();
    value.userName = istream.read_wstring ();
    value.password = istream.read_wstring ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, SpiderCorba.SpiderDefinePackage.ClusterInfo value)
  {
    ostream.write_wstring (value.clusterIp);
    ostream.write_wstring (value.userName);
    ostream.write_wstring (value.password);
  }

}
