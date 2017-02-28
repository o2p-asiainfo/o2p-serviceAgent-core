/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:JMSTest.java 
 * Package Name:com.ailk.eaap.o2p.agent.endpoint 
 * Date:2014年12月4日上午10:32:01 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.agent.endpoint;  

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import com.ailk.eaap.op2.serviceagent.route.service.JmsTemplateFactory;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.TechImpl;

/** 
 * ClassName:JMSTest  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年12月4日 上午10:32:01  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class JMSTest {
	static ApplicationContext ctx;
	public static void main(String[] args) {
		String[] configLocations= new String[]{"o2p-serviceAgent-core-jms.xml"};
		ctx = new ClassPathXmlApplicationContext(configLocations);
		 
		JmsTemplateFactory jmsTemplateFactory = (JmsTemplateFactory) ctx.getBean("jmsTemplateFactory");
		TechImpl tech = new TechImpl();
		String address = "tcp://localhost:61616";
		String keyStore = "D:/apache-activemq-5.9.0/conf/client.ks";
		String keySP = "password";
		String ts = "D:/apache-activemq-5.9.0/conf/client.ts";
		String tsP = "password";
		
//		String address = "ssl://10.6.0.88:61617";
//		String keyStore = "/home/httpd/html/propertity/mysql/myclient.ks";
//		String keySP = "password";
//		String ts = "/home/httpd/html/propertity/mysql/myclient.ts";
//		String tsP = "password";
		
		tech.getAttrMap().put(EndpointAttr.ADDRESS, address);
//		tech.getAttrMap().put(EndpointAttr.KEY_STORE, keyStore);
//		tech.getAttrMap().put(EndpointAttr.KEY_STORE_PASSWORD, keySP);
//		tech.getAttrMap().put(EndpointAttr.TRUST_STORE, ts);
//		tech.getAttrMap().put(EndpointAttr.TRUST_STORE_PASSWORD, tsP);
		
		tech.getAttrMap().put(EndpointAttr.USER_NAME, "system");
		tech.getAttrMap().put(EndpointAttr.PASSWORD, "manager");
		tech.getAttrMap().put(EndpointAttr.TIMEOUT, "1");
		JmsTemplate jmsTemplate = jmsTemplateFactory.getJmsTemplate(tech);

		jmsTemplate.convertAndSend("aaa");
	}

}
