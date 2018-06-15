package SpiderCorba;


/**
* SpiderCorba/DownloadSidePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, June 15, 2018 7:14:53 PM ICT
*/

public abstract class DownloadSidePOA extends org.omg.PortableServer.Servant
 implements SpiderCorba.DownloadSideOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("createDownloadJob", new java.lang.Integer (0));
    _methods.put ("modifyDownloadJob", new java.lang.Integer (1));
    _methods.put ("deleteDownloadJob", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // SpiderCorba/DownloadSide/createDownloadJob
       {
         int jobId = in.read_long ();
         SpiderCorba.DownloadSidePackage.DownloadConfig downloadCfg = SpiderCorba.DownloadSidePackage.DownloadConfigHelper.read (in);
         boolean $result = false;
         $result = this.createDownloadJob (jobId, downloadCfg);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // SpiderCorba/DownloadSide/modifyDownloadJob
       {
         int jobId = in.read_long ();
         SpiderCorba.DownloadSidePackage.DownloadConfig downloadCfg = SpiderCorba.DownloadSidePackage.DownloadConfigHelper.read (in);
         boolean $result = false;
         $result = this.modifyDownloadJob (jobId, downloadCfg);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // SpiderCorba/DownloadSide/deleteDownloadJob
       {
         int jobId = in.read_long ();
         String downloadClusterId = in.read_wstring ();
         boolean $result = false;
         $result = this.deleteDownloadJob (jobId, downloadClusterId);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SpiderCorba/DownloadSide:1.0", 
    "IDL:SpiderCorba/SpiderDefine:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public DownloadSide _this() 
  {
    return DownloadSideHelper.narrow(
    super._this_object());
  }

  public DownloadSide _this(org.omg.CORBA.ORB orb) 
  {
    return DownloadSideHelper.narrow(
    super._this_object(orb));
  }


} // class DownloadSidePOA
