package SpiderCorba;


/**
* SpiderCorba/_DownloadSideStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Saturday, June 16, 2018 10:22:14 PM ICT
*/

public class _DownloadSideStub extends org.omg.CORBA.portable.ObjectImpl implements SpiderCorba.DownloadSide
{

  public boolean createDownloadTimer (int timerId, int timerType, SpiderCorba.SpiderDefinePackage.DownloadConfig downloadCfg)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createDownloadTimer", true);
                $out.write_long (timerId);
                $out.write_long (timerType);
                SpiderCorba.SpiderDefinePackage.DownloadConfigHelper.write ($out, downloadCfg);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createDownloadTimer (timerId, timerType, downloadCfg        );
            } finally {
                _releaseReply ($in);
            }
  } // createDownloadTimer

  public boolean modifyDownloadTimer (int timerId, int timerType, SpiderCorba.SpiderDefinePackage.DownloadConfig downloadCfg)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modifyDownloadTimer", true);
                $out.write_long (timerId);
                $out.write_long (timerType);
                SpiderCorba.SpiderDefinePackage.DownloadConfigHelper.write ($out, downloadCfg);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return modifyDownloadTimer (timerId, timerType, downloadCfg        );
            } finally {
                _releaseReply ($in);
            }
  } // modifyDownloadTimer

  public boolean deleteDowloadTimer (int timerId, int timerType)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteDowloadTimer", true);
                $out.write_long (timerId);
                $out.write_long (timerType);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteDowloadTimer (timerId, timerType        );
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

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SpiderCorba/DownloadSide:1.0", 
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
} // class _DownloadSideStub
