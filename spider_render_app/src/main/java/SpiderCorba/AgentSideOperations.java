package SpiderCorba;


/**
* SpiderCorba/AgentSideOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../idl/SpiderAgentAPI.idl
* Saturday, June 16, 2018 11:03:08 PM ICT
*/

public interface AgentSideOperations  extends SpiderCorba.SpiderDefineOperations
{

  //Render app function
  void onRenderStartup (String renderClusterId);
  SpiderCorba.SpiderDefinePackage.RenderConfig getRenderConfig (int mappingId, int mappingType);
  void updateRenderedVideo (int jobId, SpiderCorba.SpiderDefinePackage.VideoInfo vInfo);
} // interface AgentSideOperations
