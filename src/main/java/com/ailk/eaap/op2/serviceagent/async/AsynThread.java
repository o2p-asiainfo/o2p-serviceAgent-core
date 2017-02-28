package com.ailk.eaap.op2.serviceagent.async;

import org.apache.log4j.Logger;

import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.MessageContextUtil;
import com.ailk.eaap.op2.serviceagent.route.service.EndpointProcessor;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointSpec;

public class AsynThread implements Runnable{

	private static final Logger log = Logger.getLogger(AsynThread.class);
	private IQueueIHelper queueIHelper;
	private IRouteServ routeServ;
	private EndpointProcessor callEndpointProcessor;
	private boolean runflag = true;
	private String defalutHead;
	public AsynThread(IQueueIHelper queueIHelper,IRouteServ routeServ,String defalutHead){
		this.queueIHelper = queueIHelper;
		this.routeServ = routeServ;
		this.defalutHead = defalutHead;
	}
	public void run() {
		// TODO Auto-generated method stub
		while(runflag){
			MessageBO messageBo = null;
			Endpoint callBackEndpoint = null;
			try{
				
				messageBo = (MessageBO)queueIHelper.readObj();
				log.debug("curryrouteEndpoint"+messageBo.getCurrryRouteEndpoint().getCurrentEndpoint().getEndpointSpecCode());
				callBackEndpoint = routeServ.findCallBack(messageBo.getCurrryRouteEndpoint(), messageBo);
				
				routeServ.callEndpoint(messageBo.getCurrryRouteEndpoint(), messageBo);
			}catch(EAAPException e){
				log.error("asyn bussiness error ",e);
				try{
					if(!EndpointSpec.ASYNCALLBACK.equals(messageBo.getCurrryRouteEndpoint().getCurrentEndpoint().getEndpointSpecCode())){
						if(e.getCode().equals(ErrorDomain.ERROR_CODE_9999)){
							//modify by zhuangyq
							messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,e.getCode(),e.getAllDetailMsg(),messageBo.getTransactionID()));
						}else{
							messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,e.getCode(),e.getMessage(),messageBo.getTransactionID()));
						}
					}
					callEndpointProcessor.process(callBackEndpoint, messageBo);
				}catch(Exception ex){
					log.error("call  back error",ex);
				}
				
			}catch(Exception e){
				log.error("asyn system error",e);
				try{
					if(!messageBo.getCurrryRouteEndpoint().getCurrentEndpoint().getEndpointSpecCode().equals(EndpointSpec.ASYNCALLBACK)){
						messageBo.setMsgBody(MessageContextUtil.getRespHead(defalutHead,CommonUtil.getNow(), ErrorDomain.ERROR_TYPE_SYS_ERROR,ErrorDomain.ERROR_CODE_9999,e.getMessage(),messageBo.getTransactionID()));
					}
					
					callEndpointProcessor.process(callBackEndpoint, messageBo);
				}catch(Exception ex){
					log.error("call  back error",ex);
				}
				
			}
		}
		
		
	}
	public IQueueIHelper getQueueIHelper() {
		return queueIHelper;
	}
	public void setQueueIHelper(IQueueIHelper queueIHelper) {
		this.queueIHelper = queueIHelper;
	}

	public boolean isRunflag() {
		return runflag;
	}
	public void setRunflag(boolean runflag) {
		this.runflag = runflag;
	}
	public IRouteServ getRouteServ() {
		return routeServ;
	}
	public void setRouteServ(IRouteServ routeServ) {
		this.routeServ = routeServ;
	}
	public EndpointProcessor getCallEndpointProcessor() {
		return callEndpointProcessor;
	}
	public void setCallEndpointProcessor(EndpointProcessor callEndpointProcessor) {
		this.callEndpointProcessor = callEndpointProcessor;
	}

}
