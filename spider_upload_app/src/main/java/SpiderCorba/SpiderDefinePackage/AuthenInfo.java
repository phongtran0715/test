package SpiderCorba.SpiderDefinePackage;


/**
* SpiderCorba/SpiderDefinePackage/AuthenInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Thursday, June 21, 2018 10:14:48 AM ICT
*/

public final class AuthenInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String userName = null;
  public String apiKey = null;
  public String clientSecret = null;
  public String clientId = null;

  public AuthenInfo ()
  {
  } // ctor

  public AuthenInfo (String _userName, String _apiKey, String _clientSecret, String _clientId)
  {
    userName = _userName;
    apiKey = _apiKey;
    clientSecret = _clientSecret;
    clientId = _clientId;
  } // ctor

} // class AuthenInfo
