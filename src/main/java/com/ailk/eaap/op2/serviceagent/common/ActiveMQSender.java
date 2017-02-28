package com.ailk.eaap.op2.serviceagent.common;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class ActiveMQSender {

	private JmsTemplate jmsTemplate;
	
	public void sendInfo() {
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                MapMessage message = session.createMapMessage();
                message.setString("lastName", "ppp");
                return message;
            }

        });
    }

	
    public static void main(String[] args) {
        ApplicationContext app = null; 
        app = new ClassPathXmlApplicationContext(new String[]{
				"spring/eaap-op2-common-spring.xml","spring/eaap-op2-logclient-spring.xml","spring/eaap-op2-serviceAgent-spring.xml",
				"applicationContext-adapter_common.xml","com/ailk/eaap/op2/servicebus/adapter/service/applicationContext-adapterService.xml",
				"com/ailk/eaap/op2/servicebus/adapter/common/applicationContext-adapterCommon.xml",
				"com/ailk/eaap/op2/servicebus/adapter/cache/applicationContext-adapterCache.xml"
				});
        ActiveMQSender sender = (ActiveMQSender) app.getBean("sender");
        sender.sendInfo();
    }
	
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
}
