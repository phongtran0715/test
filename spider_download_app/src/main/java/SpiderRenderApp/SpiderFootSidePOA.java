package SpiderRenderApp;


/**
* SpiderRenderApp/SpiderFootSidePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Monday, May 28, 2018 5:00:42 PM ICT
*/

public abstract class SpiderFootSidePOA extends org.omg.PortableServer.Servant
 implements SpiderRenderApp.SpiderFootSideOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("createRenderJob", new java.lang.Integer (0));
    _methods.put ("modifyRenderJob", new java.lang.Integer (1));
    _methods.put ("deleteRenderJob", new java.lang.Integer (2));
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
       case 0:  // SpiderRenderApp/SpiderFootSide/createRenderJob
       {
         int timerId = in.read_long ();
         String renderClusterId = in.read_string ();
         boolean $result = false;
         $result = this.createRenderJob (timerId, renderClusterId);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // SpiderRenderApp/SpiderFootSide/modifyRenderJob
       {
         int timerId = in.read_long ();
         String renderClusterId = in.read_string ();
         boolean $result = false;
         $result = this.modifyRenderJob (timerId, renderClusterId);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // SpiderRenderApp/SpiderFootSide/deleteRenderJob
       {
         int timerId = in.read_long ();
         String renderClusterId = in.read_string ();
         boolean $result = false;
         $result = this.deleteRenderJob (timerId, renderClusterId);
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
    "IDL:SpiderRenderApp/SpiderFootSide:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SpiderFootSide _this() 
  {
    return SpiderFootSideHelper.narrow(
    super._this_object());
  }

  public SpiderFootSide _this(org.omg.CORBA.ORB orb) 
  {
    return SpiderFootSideHelper.narrow(
    super._this_object(orb));
  }


} // class SpiderFootSidePOA
