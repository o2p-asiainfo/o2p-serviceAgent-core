package com.ailk.eaap.op2.serviceagent.route.service;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.jms.topic.service.RocketTopicConsumer;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;

public class JMSTopicProcessorTest {

	
	@Test
	public void testtopic(){
		
		JMSTopicProcessor po = new JMSTopicProcessor();
		CacheServiceImpl ca = new CacheServiceImpl();
		CacheFactory cf = new CacheFactory();
		cf.setLocalCacheMode("java");
		cf.setCacheMode("java");
		ca.setCacheFactory(cf);
		
		Endpoint endpoint = new Endpoint();
		Map map = new HashMap();
		endpoint.setAttrMap(map);
		MessageBO m = new MessageBO();
		Tenant t = new Tenant();
		t.setTenantId(1);
		m.setTenant(t);
		TechImpl te = new TechImpl();
		te.getAttrMap().put(EndpointAttr.MQ_TYPE, "rocketmq");
		te.getAttrMap().put(EndpointAttr.ADDRESS, "10.1.236.69:9876");
		te.getAttrMap().put(EndpointAttr.ConsumerGroupName, "O2PConsumerGroup");
		te.getAttrMap().put(EndpointAttr.TopicName, "DataControl2UnitouchTopic");
		te.getAttrMap().put(EndpointAttr.ConsumerInstanceName, "O2PConsumerInstance");
		
		endpoint.getAttrMap().put(EndpointAttr.ServiceTechId, "1");
		
		//ca.getCacheFactory().getCacheClient().put(CacheKey.techImpl+"1"+"1", te);
		
		
		RocketTopicConsumer rpc = new RocketTopicConsumer();
		rpc.getMessageFromTopic(te, m);
		System.out.println("=========="+m.getMsgBody());
		
	}
}
