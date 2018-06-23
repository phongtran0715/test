package SpiderCorba;


/**
* SpiderCorba/DownloadSideHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, June 22, 2018 9:58:23 PM ICT
*/

abstract public class DownloadSideHelper
{
  private static String  _id = "IDL:SpiderCorba/DownloadSide:1.0";

  public static void insert (org.omg.CORBA.Any a, SpiderCorba.DownloadSide that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static SpiderCorba.DownloadSide extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (SpiderCorba.DownloadSideHelper.id (), "DownloadSide");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static SpiderCorba.DownloadSide read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DownloadSideStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, SpiderCorba.DownloadSide value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static SpiderCorba.DownloadSide narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SpiderCorba.DownloadSide)
      return (SpiderCorba.DownloadSide)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      SpiderCorba._DownloadSideStub stub = new SpiderCorba._DownloadSideStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static SpiderCorba.DownloadSide unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof SpiderCorba.DownloadSide)
      return (SpiderCorba.DownloadSide)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      SpiderCorba._DownloadSideStub stub = new SpiderCorba._DownloadSideStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
