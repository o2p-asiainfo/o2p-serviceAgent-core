package com.ailk.eaap.op2.serviceagent.route.jms.topic.service;

public class TopicFactory {

	
	
	public static ITopicConsumer getTopicConsumer(String mqType){
		
		if(mqType.equals("rocketmq")){
			return new RocketTopicConsumer();
		}
		return null;
		
	}
	
	public static ITopicProducer getTopicProducter(String mqType){
		
		if(mqType.equals("rocketmq")){
			return new RocketTopicProducer();
		}
		return null;
		
	}

	
}
