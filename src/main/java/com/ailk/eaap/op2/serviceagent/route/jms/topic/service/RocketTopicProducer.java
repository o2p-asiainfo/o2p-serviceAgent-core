package com.ailk.eaap.op2.serviceagent.route.jms.topic.service;

import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.client.producer.SendStatus;
import com.alibaba.rocketmq.common.message.Message;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;

public class RocketTopicProducer implements ITopicProducer{

	private static final Logger LOG = Logger.getLog(RocketTopicProducer.class);
	
	@Override
	public void sendMessageToTopic(TechImpl tech, MessageBO msg) {
		// TODO Auto-generated method stub
		DefaultMQProducer producer = new DefaultMQProducer("O2PConsumerGroup");
		
		try{
			
			String address = tech.getAttrMap().get(EndpointAttr.ADDRESS);
			String topicName = tech.getAttrMap().get(EndpointAttr.TopicName);
			
			
			String tags = tech.getAttrMap().get(EndpointAttr.tags)==null?null:tech.getAttrMap().get(EndpointAttr.tags).toString();
			
			producer.setNamesrvAddr(address);
			producer.start();
			Message message = null;
	        if(tags!=null){
	        	message = new Message(topicName,tags,msg.getMsgBody().toString().getBytes());
	        }else{
	        	message = new Message(topicName,msg.getMsgBody().toString().getBytes());
	        }
	        SendResult sendResult = producer.send(message);
	        if(!sendResult.getSendStatus().equals(SendStatus.SEND_OK)){
	        	throw new BusinessException(9067,  "address=" +  address+" topic="+topicName+" send message to topic error !" );
	        }
	        producer.shutdown();
		}catch(BusinessException e){
			throw e;
		}catch(Exception e){
			LOG.error("send message to topic error", e);
			throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "send message to topic error !" }, e);
		}finally{
			
			if(producer!=null){
				try{
					producer.shutdown();
				}catch(Exception e){
					
				}
				
			}
		}
	}

}
