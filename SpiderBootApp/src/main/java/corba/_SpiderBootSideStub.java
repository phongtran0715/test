package corba;


/**
* corba/_SpiderBootSideStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SpiderAgentAPI.idl
* Thursday, December 19, 2019 2:43:12 PM ICT
*/

public class _SpiderBootSideStub extends org.omg.CORBA.portable.ObjectImpl implements corba.SpiderBootSide
{


  //Download function
  public boolean createDownloadTimer (int timerId, int timerInterval)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createDownloadTimer", true);
                $out.write_long (timerId);
                $out.write_long (timerInterval);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createDownloadTimer (timerId, timerInterval        );
            } finally {
                _releaseReply ($in);
            }
  } // createDownloadTimer

  public boolean modifyDownloadTimer (int timerId, int timerInterval, int syncStatus)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modifyDownloadTimer", true);
                $out.write_long (timerId);
                $out.write_long (timerInterval);
                $out.write_long (syncStatus);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return modifyDownloadTimer (timerId, timerInterval, syncStatus        );
            } finally {
                _releaseReply ($in);
            }
  } // modifyDownloadTimer

  public boolean deleteDowloadTimer (int timerId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteDowloadTimer", true);
                $out.write_long (timerId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteDowloadTimer (timerId        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteDowloadTimer

  public boolean deleteDownloadedVideo (int jobId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteDownloadedVideo", true);
                $out.write_long (jobId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteDownloadedVideo (jobId        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteDownloadedVideo


  //Render function
  public boolean createRenderJob (int jobId, corba.variableDefinePackage.VideoInfo vInfo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createRenderJob", true);
                $out.write_long (jobId);
                corba.variableDefinePackage.VideoInfoHelper.write ($out, vInfo);
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


  //Upload function
  public boolean createUploadTimer (String cHomeId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createUploadTimer", true);
                $out.write_wstring (cHomeId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createUploadTimer (cHomeId        );
            } finally {
                _releaseReply ($in);
            }
  } // createUploadTimer

  public boolean deleteUploadTimer (String cHomeId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteUploadTimer", true);
                $out.write_wstring (cHomeId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteUploadTimer (cHomeId        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteUploadTimer

  public boolean createUploadJob (int jobId, corba.variableDefinePackage.VideoInfo vInfo, String cHomeId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createUploadJob", true);
                $out.write_long (jobId);
                corba.variableDefinePackage.VideoInfoHelper.write ($out, vInfo);
                $out.write_wstring (cHomeId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createUploadJob (jobId, vInfo, cHomeId        );
            } finally {
                _releaseReply ($in);
            }
  } // createUploadJob

  public boolean deleteUploadJob (int jobId, String cHomeId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteUploadJob", true);
                $out.write_long (jobId);
                $out.write_wstring (cHomeId);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteUploadJob (jobId, cHomeId        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteUploadJob

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corba/SpiderBootSide:1.0", 
    "IDL:corba/variableDefine:1.0"};

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
} // class _SpiderBootSideStub