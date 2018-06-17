package SpiderCorba;


/**
* SpiderCorba/_RenderSideStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Saturday, June 16, 2018 11:03:08 PM ICT
*/

public class _RenderSideStub extends org.omg.CORBA.portable.ObjectImpl implements SpiderCorba.RenderSide
{

  public boolean createRenderJob (int jobId, SpiderCorba.SpiderDefinePackage.VideoInfo vInfo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createRenderJob", true);
                $out.write_long (jobId);
                SpiderCorba.SpiderDefinePackage.VideoInfoHelper.write ($out, vInfo);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createRenderJob (jobId, vInfo        );
            } finally {
                _releaseReply ($in);
            }
  } // createRenderJob

  public boolean deleteRenderJob (int jobId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteRenderJob", true);
                $out.write_long (jobId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteRenderJob (jobId        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteRenderJob

  public void deleteRenderdVideo (String vLocation)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteRenderdVideo", true);
                $out.write_wstring (vLocation);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                deleteRenderdVideo (vLocation        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteRenderdVideo

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SpiderCorba/RenderSide:1.0", 
    "IDL:SpiderCorba/SpiderDefine:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _RenderSideStub
