package com.ailk.eaap.op2.serviceagent.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.remotecall.IRemoteCallEp;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.RemoteCallInfo;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.linkage.rainbow.util.StringUtil;

public class RemoteCallAspect {
	
	
	private IMemcacheManageServ cacheService;
	
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}


	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}


	public MessageBO aroundExchange(ProceedingJoinPoint pjp) throws Throwable {
				
			Object[] o = pjp.getArgs();
			Endpoint endpoint = (Endpoint)o[0];
			MessageBO messagebo = (MessageBO)o[1];
			
			String rmoteCallUrl = "";
			String endpointId= "";
			if(messagebo.getRemoteFlag().equals(MessageBO.REMOTE_CALL)){
				endpointId=	String.valueOf(endpoint.getEndpointId());
				Object remoteObject = endpoint.getAttrMap().get(EndpointAttr.REMOTE_CALL_URL_ID);
				if(remoteObject!=null && !StringUtil.isBlank(remoteObject.toString())){
					
					String remoteId = remoteObject.toString();
					RemoteCallInfo rmoteCall = (RemoteCallInfo) cacheService.getKey(CacheKey.REMOTE_CALL_INFO+remoteId, messagebo.getTenant().getTenantId());
					if(rmoteCall==null){
						throw new BusinessException(9305, "o2p-serviceagent-core.9305", new String[]{endpointId,remoteId}, null);
					}else{
						
						rmoteCallUrl = rmoteCall.getRemoteCallUrl();
						
						HttpInvokerProxyFactoryBean httpInvoker = new HttpInvokerProxyFactoryBean();
				        httpInvoker.setServiceInterface(com.ailk.eaap.op2.serviceagent.remotecall.IRemoteCallEp.class);
				        httpInvoker.setServiceUrl(rmoteCallUrl);
				        httpInvoker.afterPropertiesSet(); 
				        
						IRemoteCallEp remoteCallEpClientService = (IRemoteCallEp) httpInvoker.getObject();
						MessageBO outMsg = remoteCallEpClientService.remoteCall(endpoint, messagebo);
						outMsg.setRemoteFlag(MessageBO.REMOTE_CALL);
						return outMsg;
					}
					
				}else{
					return (MessageBO) pjp.proceed();
				}
			}else{
					return (MessageBO) pjp.proceed();
			}
	}
	
}
