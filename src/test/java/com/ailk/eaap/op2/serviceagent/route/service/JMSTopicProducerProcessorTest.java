package com.ailk.eaap.op2.serviceagent.route.service;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.jms.topic.service.RocketTopicProducer;

public class JMSTopicProducerProcessorTest {

	
	@Test
	public void testSendMsg()
		throws Exception {
		Endpoint endpoint = new Endpoint();
		Map map = new HashMap();
		endpoint.setAttrMap(map);
		MessageBO m = new MessageBO();
		String str = "{activityCode:'1',"+
"channelValue:'1',"+
"sendContent:'1',"+
"userNum:'53432',"+
"custNo:'1',"+
"tenantId:'1'}";
		m.setMsgBody(str);
		Tenant t = new Tenant();
		t.setTenantId(1);
		m.setTenant(t);
		TechImpl te = new TechImpl();
		te.getAttrMap().put(EndpointAttr.MQ_TYPE, "rocketmq");
		te.getAttrMap().put(EndpointAttr.ADDRESS, "10.1.236.69:9876");
		te.getAttrMap().put(EndpointAttr.ConsumerGroupName, "O2PConsumerGroup");
		te.getAttrMap().put(EndpointAttr.TopicName, "DataControl2UnitouchTopic");
		te.getAttrMap().put(EndpointAttr.ConsumerInstanceName, "abc");
		te.getAttrMap().put(EndpointAttr.subExpression, "1113");
		endpoint.getAttrMap().put(EndpointAttr.ServiceTechId, "1");
		
		RocketTopicProducer rp = new RocketTopicProducer();
		rp.sendMessageToTopic(te, m);
	}
}
