package com.ailk.eaap.op2.serviceagent.route.jms.topic.service;

import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
public interface ITopicConsumer {

	
	public void getMessageFromTopic(TechImpl tech,MessageBO msg);
}
