package SpiderCorba;


/**
* SpiderCorba/AgentSidePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, June 15, 2018 7:14:53 PM ICT
*/

public abstract class AgentSidePOA extends org.omg.PortableServer.Servant
 implements SpiderCorba.AgentSideOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("onDownloadStartup", new java.lang.Integer (0));
    _methods.put ("onRenderStartup", new java.lang.Integer (1));
    _methods.put ("onUploadStartup", new java.lang.Integer (2));
    _methods.put ("getLastSyncTime", new java.lang.Integer (3));
    _methods.put ("updateLastSyntime", new java.lang.Integer (4));
    _methods.put ("updateDownloadedVideo", new java.lang.Integer (5));
    _methods.put ("updateRenderedVideo", new java.lang.Integer (6));
    _methods.put ("updateUploadedVideo", new java.lang.Integer (7));
    _methods.put ("getMonitorChannelId", new java.lang.Integer (8));
    _methods.put ("getClusterInfo", new java.lang.Integer (9));
    _methods.put ("getAuthenInfo", new java.lang.Integer (10));
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
       case 0:  // SpiderCorba/AgentSide/onDownloadStartup
       {
         String appId = in.read_wstring ();
         this.onDownloadStartup (appId);
         out = $rh.createReply();
         break;
       }

       case 1:  // SpiderCorba/AgentSide/onRenderStartup
       {
         String appId = in.read_wstring ();
         this.onRenderStartup (appId);
         out = $rh.createReply();
         break;
       }

       case 2:  // SpiderCorba/AgentSide/onUploadStartup
       {
         String appId = in.read_wstring ();
         this.onUploadStartup (appId);
         out = $rh.createReply();
         break;
       }

       case 3:  // SpiderCorba/AgentSide/getLastSyncTime
       {
         int mappingId = in.read_long ();
         long $result = (long)0;
         $result = this.getLastSyncTime (mappingId);
         out = $rh.createReply();
         out.write_longlong ($result);
         break;
       }

       case 4:  // SpiderCorba/AgentSide/updateLastSyntime
       {
         int mappingId = in.read_long ();
         long lastSyncTime = in.read_longlong ();
         this.updateLastSyntime (mappingId, lastSyncTime);
         out = $rh.createReply();
         break;
       }

       case 5:  // SpiderCorba/AgentSide/updateDownloadedVideo
       {
         SpiderCorba.SpiderDefinePackage.VideoInfo vInfo = SpiderCorba.SpiderDefinePackage.VideoInfoHelper.read (in);
         this.updateDownloadedVideo (vInfo);
         out = $rh.createReply();
         break;
       }

       case 6:  // SpiderCorba/AgentSide/updateRenderedVideo
       {
         int jobId = in.read_long ();
         int processStatus = in.read_long ();
         String vRenderPath = in.read_wstring ();
         this.updateRenderedVideo (jobId, processStatus, vRenderPath);
         out = $rh.createReply();
         break;
       }

       case 7:  // SpiderCorba/AgentSide/updateUploadedVideo
       {
         int jobId = in.read_long ();
         this.updateUploadedVideo (jobId);
         out = $rh.createReply();
         break;
       }

       case 8:  // SpiderCorba/AgentSide/getMonitorChannelId
       {
         int mappingId = in.read_long ();
         String $result = null;
         $result = this.getMonitorChannelId (mappingId);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 9:  // SpiderCorba/AgentSide/getClusterInfo
       {
         int clusterType = in.read_long ();
         int mappingId = in.read_long ();
         SpiderCorba.AgentSidePackage.ClusterInfo $result = null;
         $result = this.getClusterInfo (clusterType, mappingId);
         out = $rh.createReply();
         SpiderCorba.AgentSidePackage.ClusterInfoHelper.write (out, $result);
         break;
       }

       case 10:  // SpiderCorba/AgentSide/getAuthenInfo
       {
         int mappingId = in.read_long ();
         SpiderCorba.AgentSidePackage.AuthenInfo $result = null;
         $result = this.getAuthenInfo (mappingId);
         out = $rh.createReply();
         SpiderCorba.AgentSidePackage.AuthenInfoHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SpiderCorba/AgentSide:1.0", 
    "IDL:SpiderCorba/SpiderDefine:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public AgentSide _this() 
  {
    return AgentSideHelper.narrow(
    super._this_object());
  }

  public AgentSide _this(org.omg.CORBA.ORB orb) 
  {
    return AgentSideHelper.narrow(
    super._this_object(orb));
  }


} // class AgentSidePOA
