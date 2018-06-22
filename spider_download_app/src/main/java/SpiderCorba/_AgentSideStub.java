package SpiderCorba;


/**
* SpiderCorba/_AgentSideStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Friday, June 22, 2018 2:54:03 PM ICT
*/

public class _AgentSideStub extends org.omg.CORBA.portable.ObjectImpl implements SpiderCorba.AgentSide
{


  //Download app function
  public void onDownloadStartup (String downloadClusterId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("onDownloadStartup", true);
                $out.write_wstring (downloadClusterId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                onDownloadStartup (downloadClusterId        );
            } finally {
                _releaseReply ($in);
            }
  } // onDownloadStartup

  public long getLastSyncTime (int mappingId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLastSyncTime", true);
                $out.write_long (mappingId);
                $in = _invoke ($out);
                long $result = $in.read_longlong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLastSyncTime (mappingId        );
            } finally {
                _releaseReply ($in);
            }
  } // getLastSyncTime

  public void updateLastSyntime (int mappingId, long lastSyncTime)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("updateLastSyntime", true);
                $out.write_long (mappingId);
                $out.write_longlong (lastSyncTime);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                updateLastSyntime (mappingId, lastSyncTime        );
            } finally {
                _releaseReply ($in);
            }
  } // updateLastSyntime

  public void updateDownloadedVideo (SpiderCorba.SpiderDefinePackage.VideoInfo vInfo)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("updateDownloadedVideo", true);
                SpiderCorba.SpiderDefinePackage.VideoInfoHelper.write ($out, vInfo);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                updateDownloadedVideo (vInfo        );
            } finally {
                _releaseReply ($in);
            }
  } // updateDownloadedVideo

  public SpiderCorba.SpiderDefinePackage.DownloadConfig getDownloadConfig (int mappingId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getDownloadConfig", true);
                $out.write_long (mappingId);
                $in = _invoke ($out);
                SpiderCorba.SpiderDefinePackage.DownloadConfig $result = SpiderCorba.SpiderDefinePackage.DownloadConfigHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getDownloadConfig (mappingId        );
            } finally {
                _releaseReply ($in);
            }
  } // getDownloadConfig

  public SpiderCorba.SpiderDefinePackage.CustomVideoInfor getCustomVideo (String downloadClusterId)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getCustomVideo", true);
                $out.write_wstring (downloadClusterId);
                $in = _invoke ($out);
                SpiderCorba.SpiderDefinePackage.CustomVideoInfor $result = SpiderCorba.SpiderDefinePackage.CustomVideoInforHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getCustomVideo (downloadClusterId        );
            } finally {
                _releaseReply ($in);
            }
  } // getCustomVideo

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SpiderCorba/AgentSide:1.0", 
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
} // class _AgentSideStub
