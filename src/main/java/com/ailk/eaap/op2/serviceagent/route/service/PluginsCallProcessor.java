package com.ailk.eaap.op2.serviceagent.route.service;

import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.ailk.eaap.op2.serviceagent.common.IPluginsCallEp;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.foundation.util.ExceptionUtils;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

public class PluginsCallProcessor implements EndpointProcessor {
	
	private static final Logger LOG = Logger.getLog(PluginsCallProcessor.class);
	private IMemcacheManageServ cacheService;

	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	@Override
	public MessageBO process(Endpoint endpoint, MessageBO bo)
			 {
		
		if(LOG.isDebugEnabled()){
			LOG.debug("PluginsCallProcessor come in");
		}
		Object remoteUrlObject = endpoint.getAttrMap().get(EndpointAttr.PLUGINS_CALL_ENDPOINT_URL);
		if(remoteUrlObject==null){
			throw new BusinessException(9087, "o2p-serviceagent-core.9087", null, null);
		}
		
		if(LOG.isDebugEnabled()){
			LOG.debug("PLUGINS CALL URL : {0}", remoteUrlObject.toString());
		}
		try{
			HttpInvokerProxyFactoryBean httpInvoker = new HttpInvokerProxyFactoryBean();
	        httpInvoker.setServiceInterface(IPluginsCallEp.class);
	        httpInvoker.setServiceUrl(remoteUrlObject.toString());
	        httpInvoker.afterPropertiesSet(); 
	        
	        IPluginsCallEp pluginsCallEpClientService = (IPluginsCallEp) httpInvoker.getObject();
      
	        MessageBO mx = (MessageBO) pluginsCallEpClientService.remoteCall(bo);
	        bo.setMsgBody(mx.getMsgBody());
        }catch(Exception e){
        	LOG.error("Bussiness Code:9088，  PluginsProcessor  endpoint:" + endpoint.getEndpointId() + "， cause:{0}", ExceptionUtils.populateExecption(e, 500));
			throw new BusinessException(9088, "o2p-serviceagent-core.9088", new String[]{"PluginsProcessor  endpoint="+endpoint.getEndpointId(),e.getMessage()}, e);

        }
		return (MessageBO) bo;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

}
