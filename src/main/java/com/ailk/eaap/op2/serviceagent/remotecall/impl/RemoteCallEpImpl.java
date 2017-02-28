package com.ailk.eaap.op2.serviceagent.remotecall.impl;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.remotecall.IRemoteCallEp;
import com.ailk.eaap.op2.serviceagent.route.service.IServiceExchangeService;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.Endpoint;

public class RemoteCallEpImpl implements IRemoteCallEp {
	
	private static final Logger log = Logger.getLog(RemoteCallEpImpl.class);
	
	private IServiceExchangeService serviceExchangeService;

	@Override
	public MessageBO remoteCall(Endpoint remoteEndpoint, @SuppressWarnings("rawtypes") MessageBO bo) {
		log.debug("cone in remoteCall endpointId: {0} name:{1}", remoteEndpoint.getEndpointId(),remoteEndpoint.getEndpointName());
		bo.setRemoteFlag(MessageBO.LOCAL_CALL);
		MessageBO msg = serviceExchangeService.exchange(remoteEndpoint, bo);
		
		return msg;
	}

	public IServiceExchangeService getServiceExchangeService() {
		return serviceExchangeService;
	}

	public void setServiceExchangeService(
			IServiceExchangeService serviceExchangeService) {
		this.serviceExchangeService = serviceExchangeService;
	}

}
