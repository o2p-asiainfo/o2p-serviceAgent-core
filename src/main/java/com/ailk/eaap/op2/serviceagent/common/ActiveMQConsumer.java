package com.ailk.eaap.op2.serviceagent.common;

import javax.jms.JMSException;
import javax.jms.MapMessage;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.JmsUtils;

public class ActiveMQConsumer {

	private JmsTemplate jmsTemplate;
    public String receiveMessage() {
        String my = "";
        MapMessage message = (MapMessage) jmsTemplate.receive();
        try {
            my = message.getString("lastName");
        } catch (JMSException e) {
            throw JmsUtils.convertJmsAccessException(e);
        }
        return my;
    }

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(new String[]{
				"spring/eaap-op2-common-spring.xml","spring/eaap-op2-logclient-spring.xml","spring/eaap-op2-serviceAgent-spring.xml",
				"applicationContext-adapter_common.xml","com/ailk/eaap/op2/servicebus/adapter/service/applicationContext-adapterService.xml",
				"com/ailk/eaap/op2/servicebus/adapter/common/applicationContext-adapterCommon.xml",
				"com/ailk/eaap/op2/servicebus/adapter/cache/applicationContext-adapterCache.xml"
				});
    }

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

}
