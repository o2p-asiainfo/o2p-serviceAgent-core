package com.ailk.eaap.op2.serviceagent.route.jms.topic.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;
import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.consumer.PullResult;
import com.alibaba.rocketmq.client.consumer.store.OffsetStore;
import com.alibaba.rocketmq.client.consumer.store.ReadOffsetType;
import com.alibaba.rocketmq.client.consumer.store.RemoteBrokerOffsetStore;
import com.alibaba.rocketmq.client.impl.MQClientManager;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.alibaba.rocketmq.common.message.MessageQueue;
import com.alibaba.rocketmq.common.protocol.heartbeat.MessageModel;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

public class RocketTopicConsumer implements ITopicConsumer{

	private static final Logger LOG = Logger.getLog(RocketTopicConsumer.class);
	
	
	@Override
	public void getMessageFromTopic(TechImpl tech,MessageBO messageBO) {
		// TODO Auto-generated method stub
		DefaultMQPullConsumer consumer = null;
		boolean ishave = false;
		try{
			String groupName = tech.getAttrMap().get(EndpointAttr.ConsumerGroupName);
			String address = tech.getAttrMap().get(EndpointAttr.ADDRESS);
			String topicName = tech.getAttrMap().get(EndpointAttr.TopicName);
			String consumerInstanceName = tech.getAttrMap().get(EndpointAttr.ConsumerInstanceName)==null?"":tech.getAttrMap().get(EndpointAttr.ConsumerInstanceName).toString();
			
			String subExpression = tech.getAttrMap().get(EndpointAttr.subExpression)==null?null:tech.getAttrMap().get(EndpointAttr.subExpression).toString();
			
			
			consumer = new DefaultMQPullConsumer(groupName);
	        consumer.setNamesrvAddr(address);
	        consumer.setInstanceName(consumerInstanceName+System.nanoTime());
	        consumer.setMessageModel(MessageModel.CLUSTERING);
	        OffsetStore s =new RemoteBrokerOffsetStore(MQClientManager.getInstance().getAndCreateMQClientInstance(consumer),consumer.getConsumerGroup());
	        
	        consumer.setOffsetStore(s);
	        consumer.start();
	        Set<MessageQueue> mqs = consumer.fetchSubscribeMessageQueues(topicName);
	        
	        for (MessageQueue mq : mqs) {
	        	
	        	try {
	            	long offset = consumer.getOffsetStore().readOffset(mq, ReadOffsetType.READ_FROM_STORE);
	            	LOG.debug("mq:"+mq+","+"offset:"+offset);
	            	
	                if(offset<0){
	                	offset = 0;
	                }
	                PullResult pullResult =
	                        consumer.pullBlockIfNotFound(mq, subExpression, offset, 1);
	                
	                LOG.debug(pullResult.toString());
	                consumer.getOffsetStore().updateOffset(mq,pullResult.getNextBeginOffset(),false);
	             	consumer.getOffsetStore().persist(mq);
	                switch (pullResult.getPullStatus()) {
	                case FOUND:
	                	List<MessageExt> msgs = pullResult.getMsgFoundList();
	                	MessageExt msg = msgs.get(0);
	                	Map<String,String> map = msg.getProperties();
	                	if(map!=null){
	                		for(String key: map.keySet()){
	                			String value = map.get(key);
	                			messageBO.getMsgHead().put(key, value);
	                		}
	                	}
	                	ishave = true;
	                	messageBO.setMsgBody(new String(msg.getBody()));
	                    break;
	                case NO_MATCHED_MSG:
	                    break;
	                case NO_NEW_MSG:
	                    break;
	                case OFFSET_ILLEGAL:
	                    break;
	                default:
	                    break;
	                }
	        	}catch(Exception e){
	        		LOG.error("get message from topic error ", e);
					throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "address=" +  address+" topic="+topicName+" get message from topic error !" }, e);
	        	}
	        }
	        
	        consumer.shutdown();
	        if(!ishave){
				throw new BusinessException(9067,   "No message in queue error !" );
			}
		}catch(BusinessException e){
			throw e;
		}catch(Exception e){
			LOG.error("get message from topic error ", e);
			throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[] { "get message from topic error !" }, e);
		}finally{
			
			if(consumer!=null){
				try{
					consumer.shutdown();
				}catch(Exception e){
					
				}
				
			}
			
		}
		
        
	}

	
}
