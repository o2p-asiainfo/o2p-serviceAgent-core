package com.ailk.eaap.op2.serviceagent.route.service;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;


public interface EndpointProcessor {

	MessageBO process(Endpoint endpoint, MessageBO msg) ;
	void clear();
	void subtraThreadNum(String servId) ;
}
