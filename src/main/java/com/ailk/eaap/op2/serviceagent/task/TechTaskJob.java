package com.ailk.eaap.op2.serviceagent.task;

import java.util.List;

import org.apache.log4j.Logger;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.HttpClientUtil;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.log.MessageLogService;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TaskBase;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.OriLogClob;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;


public class TechTaskJob implements ITaskJobService{

	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	private static final Logger log = Logger.getLogger(TechTaskJob.class);
	private IRouteServ routeServ;
	private MessageLogService messageLogService;
	
	
	public void triggerJob() {
		// TODO Auto-generated method stub
		try{
			log.debug("start");
			
			
			List<TaskBase> tbs = (List<TaskBase>) cacheService.getObjByKey(CacheKey.task);
			log.debug("tbs size"+tbs);
			if(tbs!=null && tbs.size()>0){
				for (TaskBase taskBase : tbs) {
					TechImpl ti =  (TechImpl)taskBase.getTaskCfg();
					String address = ti.getAttrMap().get(EndpointAttr.ADDRESS);
					
					String username = ti.getAttrMap().get(EndpointAttr.USER_NAME);
					
					String password = ti.getAttrMap().get(EndpointAttr.PASSWORD);
					
					String timeout = ti.getAttrMap().get(EndpointAttr.TIMEOUT);
					
					String port = ti.getAttrMap().get(EndpointAttr.PORT);
					
					String ip = ti.getAttrMap().get(EndpointAttr.IP_ADDRESS);
					
					String reqMsg = HttpClientUtil.sendRequest(null, address, null, null, 
							"text/xml;charset=UTF-8", InType.get, Integer.valueOf(timeout).intValue(),taskBase.getSerInvokeIns().getService().getServiceCnName(),username,password,ip,port,null,null);
					
					Component srcSys = (Component)cacheService.getObjByKey(CacheKey.Component+taskBase.getSerInvokeIns().getComponentId());
					
					log.debug("aaa"+reqMsg);
					MessageBO messageBo = new  MessageBO();
					messageBo.setReqorrsp(EOPDomain.REQ_FLAG);
					messageBo.setService(taskBase.getSerInvokeIns().getService());
					messageBo.setContractVersion(messageBo.getService().getContractVersion());
					
					messageBo.setContractVer(messageBo.getService().getContractVersion().getVersion());
					messageBo.setSrcComponent(srcSys);
					messageBo.setSrcorgcode(srcSys.getOrg().getOrgCode());
					messageBo.setSrcsyscode(srcSys.getCode());
					messageBo.setTransactionID(this.getTransId(srcSys.getCode()));
					
					
					messageBo.setSrcsyscode(taskBase.getSerInvokeIns().getComponentId());
					messageBo.setDstSyscode(messageBo.getSrcsyscode());
					routeServ.routeMsg(taskBase.getSerInvokeIns().getMessageFlow().getFirstRouteEndpoint(),messageBo);
					
					OriLogClob reqOrg = new OriLogClob();
					reqOrg.setMsg(messageBo.toAllString());
					reqOrg.setReqOrRes(EOPDomain.REQ_FLAG);
					reqOrg.setSrcIp(messageBo.getIp());
					reqOrg.setSrcTranId(messageBo.getTransactionID());
					messageBo.getLogMessageObject().getOriLogClobList().add(reqOrg);
					
					messageBo.setDstComponent(srcSys);
					messageLogService.sendMessageLog(messageBo);
				}
			}
		}catch(Exception e){
			log.error("get msg from tech error",e);
		}
		
	}
	
	private static String getTransId(String srcComp){
		return srcComp+CommonUtil.getNow()+"0000";
	}
	
	
	public IRouteServ getRouteServ() {
		return routeServ;
	}
	public void setRouteServ(IRouteServ routeServ) {
		this.routeServ = routeServ;
	}

	public MessageLogService getMessageLogService() {
		return messageLogService;
	}

	public void setMessageLogService(MessageLogService messageLogService) {
		this.messageLogService = messageLogService;
	}
	
}
