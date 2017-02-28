/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:JmsTemplateFactory.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service 
 * Date:2014年12月14日下午4:49:12 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service;  

import java.util.HashMap;
import java.util.Map;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.naming.NamingException;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.commons.lang.StringUtils;
import org.springframework.jms.connection.SingleConnectionFactory;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;
import org.springframework.jms.core.JmsTemplate;

import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;

/** 
 * ClassName:JmsTemplateFactory  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年12月14日 下午4:49:12  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class JmsTemplateFactory {
	
	private static final Logger log = Logger.getLog(JmsTemplateFactory.class);

	private JMSConnectionFactory jMSConnectionFactory;
	private Destination activeMQQueue; 
	private Destination activeMQTopic;
	private static final Map<String, JmsTemplate> jmsTemplateMap = new HashMap<String, JmsTemplate>();
	private long jmsreceiveTimeOut=5;
	
	public void setjMSConnectionFactory(JMSConnectionFactory jMSConnectionFactory) {
		this.jMSConnectionFactory = jMSConnectionFactory;
	}
	

	public JmsTemplate getJmsTemplate(TechImpl tech) {
		JmsTemplate jmsTemplate = jmsTemplateMap.get(tech.toString()+tech.getTechImplId());
		if(jmsTemplate == null) {
			jmsTemplate = new JmsTemplate();
			
			try{
				applyConfiguration(tech, jmsTemplate);
			}catch(Exception e){
				log.error("get jms template error!", e);
				throw new BusinessException(9999, e.getCause());
			}
			
			jmsTemplateMap.put(tech.toString()+tech.getTechImplId(), jmsTemplate);
		}
		
		return jmsTemplate;
	}

	public void setActiveMQQueue(Destination activeMQQueue) {
		this.activeMQQueue = activeMQQueue;
	}

	public void setActiveMQTopic(Destination activeMQTopic) {
		this.activeMQTopic = activeMQTopic;
	}

	private void applyConfiguration(TechImpl tech, JmsTemplate jmsTemplate) throws NamingException, JMSException {
		Object receiveTimeoutObject = tech.getAttrMap().get(EndpointAttr.TIMEOUT);
		
		if (receiveTimeoutObject != null && !StringUtils.isEmpty(receiveTimeoutObject.toString())) {
			jmsTemplate.setReceiveTimeout((Long.parseLong(receiveTimeoutObject.toString()))*1000);
		}else{
			jmsTemplate.setReceiveTimeout(jmsreceiveTimeOut*1000);
		}
		
		//JMS服务厂商
		String mqType=EndpointAttr.DEFAULT_MQ;
		Object mqTypeObject = tech.getAttrMap().get(EndpointAttr.MQ_TYPE);
		if(mqTypeObject != null && !StringUtils.isEmpty(mqTypeObject.toString())){
			mqType = mqTypeObject.toString();
		}
		
		//目的地队列名称
		String destinationName = null;
		Object destinationNameObject = tech.getAttrMap().get(EndpointAttr.DESTINATIONNAME);
		if (destinationNameObject != null && !StringUtils.isEmpty(destinationNameObject.toString())) {
			destinationName = destinationNameObject.toString();
		}
		
		Destination destination = null;
		if(EndpointAttr.ACTIVEMQ.equals(mqType)) {
			Object destinationTypeObject = tech.getAttrMap().get(EndpointAttr.DESTINATIONTYPE);
			if(destinationTypeObject != null && destinationTypeObject.toString().equals(EndpointAttr.DESTINATIONTYPE_TOPIC)) {
				ActiveMQTopic activeMQT = (ActiveMQTopic)activeMQTopic;
				if(destinationName != null) {
					activeMQT.setPhysicalName(destinationName);
				}
				destination = activeMQT;
			} else {
				ActiveMQQueue activeMqQ = (ActiveMQQueue)activeMQQueue;
				if(destinationName != null) {
					activeMqQ.setPhysicalName(destinationName);
				}
				destination = activeMqQ;
			}
		}else if(EndpointAttr.TIBCOJMS.equals(mqType)){
			Connection connection = null;
			try {
				ConnectionFactory connectionFactory = jMSConnectionFactory.getJMSConnection(tech, mqType);
				// create the connection
				if(StringUtils.isEmpty(tech.getAttrMap().get(EndpointAttr.USER_NAME))){
					connection = connectionFactory.createConnection();
				}else{
					connection = connectionFactory.createConnection(tech.getAttrMap().get(EndpointAttr.USER_NAME),  tech.getAttrMap().get(EndpointAttr.PASSWORD));
				}
				//create the session 
				Session session = connection.createSession(false, javax.jms.Session.AUTO_ACKNOWLEDGE);
				//set destination
				destination = session.createQueue(tech.getAttrMap().get(EndpointAttr.QUEUE_NAME));
				
				UserCredentialsConnectionFactoryAdapter fact =  new UserCredentialsConnectionFactoryAdapter();
			    fact.setTargetConnectionFactory(connectionFactory);
				if(!StringUtils.isEmpty(tech.getAttrMap().get(EndpointAttr.USER_NAME))){
					fact.setUsername(tech.getAttrMap().get(EndpointAttr.USER_NAME));
					fact.setPassword(tech.getAttrMap().get(EndpointAttr.PASSWORD));
				}
				jmsTemplate.setConnectionFactory(fact);
				
			} catch (Exception e) {
				log.error("apply configuration error!", e);
				throw new BusinessException(9999, e.getCause());
			}finally{
				if(connection!=null){
					connection.close();
				}
			}
		}
		jmsTemplate.setDefaultDestination(destination);
		
		if(jmsTemplate.getConnectionFactory() == null) {
			ConnectionFactory connectionFactory = jMSConnectionFactory.getJMSConnection(tech, mqType);
			SingleConnectionFactory singleConnectionFactory = new SingleConnectionFactory(connectionFactory);
			jmsTemplate.setConnectionFactory(singleConnectionFactory);
		}
	}

}
