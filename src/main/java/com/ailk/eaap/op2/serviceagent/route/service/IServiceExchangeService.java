package com.ailk.eaap.op2.serviceagent.route.service;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;

public interface IServiceExchangeService {

	MessageBO exchange(Endpoint toEndpoint, MessageBO messageBo) ;
}
