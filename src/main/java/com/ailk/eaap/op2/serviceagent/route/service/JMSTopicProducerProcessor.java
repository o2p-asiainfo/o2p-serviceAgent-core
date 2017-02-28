package com.ailk.eaap.op2.serviceagent.route.service;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

import com.ailk.eaap.op2.serviceagent.route.jms.topic.service.ITopicProducer;

import com.ailk.eaap.op2.serviceagent.route.jms.topic.service.TopicFactory;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

public class JMSTopicProducerProcessor implements EndpointProcessor{

	private static final Logger LOG = Logger.getLog(JMSTopicProducerProcessor.class);
	private IMemcacheManageServ cacheService;
	
	@Override
	public MessageBO process(Endpoint endpoint, MessageBO msg) {
		// TODO Auto-generated method stub
		if (LOG.isDebugEnabled()) {
			LOG.debug("jms receive begin");
			LOG.debug("message:"+msg.toString());
		}
		/*obtain techimpl object*/
		Object obj = endpoint.getAttrMap().get(EndpointAttr.ServiceTechId);
		TechImpl tech = null;
		if (obj == null) {
			throw new BusinessException(9066,"o2p-serviceagent-core.9066", new String[] { "EndpointAttr=" + EndpointAttr.ServiceTechId },null);
		} else {
			String serTechId = obj.toString();
			tech = (TechImpl) cacheService.getKey(CacheKey.techImpl+ serTechId, msg.getTenant().getTenantId());
			
			if (LOG.isDebugEnabled()) {
				LOG.debug("serTechId=" + serTechId);
			}
			if (tech == null) {
				throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "serTechId=" + serTechId }, null);
			}
		}
		
		Object mqTypeObject = tech.getAttrMap().get(EndpointAttr.MQ_TYPE);
		if(mqTypeObject == null){
			throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "mqType=" + mqTypeObject }, null);
		}
		
		Object addressObj = tech.getAttrMap().get(EndpointAttr.ADDRESS);
		if(addressObj == null){
			throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "address=" + addressObj }, null);
		}
		
		Object consumerGroupNameObj = tech.getAttrMap().get(EndpointAttr.ConsumerGroupName);
		if(consumerGroupNameObj == null){
			throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "consumerGroupName=" + consumerGroupNameObj }, null);
		}
		
		
		
		Object topicNameObj = tech.getAttrMap().get(EndpointAttr.TopicName);
		if(topicNameObj == null){
			throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "topicName=" + topicNameObj }, null);
		}
		
		ITopicProducer topicProducer = TopicFactory.getTopicProducter(mqTypeObject.toString());
		topicProducer.sendMessageToTopic(tech,msg);

		return msg;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraThreadNum(String servId) {
		// TODO Auto-generated method stub
		
	}

	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

}
