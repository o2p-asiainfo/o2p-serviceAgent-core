package com.ailk.eaap.op2.serviceagent.common;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.jms.core.JmsTemplate;

/**
 * The class <code>ActiveMQConsumerTest</code> contains tests for the class <code>{@link ActiveMQConsumer}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:46
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ActiveMQConsumerTest {
	/**
	 * Run the JmsTemplate getJmsTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetJmsTemplate_1()
		throws Exception {
		ActiveMQConsumer fixture = new ActiveMQConsumer();
		fixture.setJmsTemplate(new JmsTemplate());

		JmsTemplate result = fixture.getJmsTemplate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getPriority());
		assertEquals(0L, result.getTimeToLive());
		assertEquals(null, result.getDefaultDestination());
		assertEquals(null, result.getDefaultDestinationName());
		assertEquals(true, result.isMessageIdEnabled());
		assertEquals(true, result.isMessageTimestampEnabled());
		assertEquals(false, result.isPubSubNoLocal());
		assertEquals(0L, result.getReceiveTimeout());
		assertEquals(-1L, result.getDeliveryDelay());
		assertEquals(false, result.isExplicitQosEnabled());
		assertEquals(2, result.getDeliveryMode());
		assertEquals(false, result.isPubSubDomain());
		assertEquals(null, result.getConnectionFactory());
		assertEquals(false, result.isSessionTransacted());
		assertEquals(1, result.getSessionAcknowledgeMode());
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		ActiveMQConsumer.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from class path resource [spring/eaap-op2-serviceAgent-spring.xml]; nested exception is java.io.FileNotFoundException: class path resource [spring/eaap-op2-serviceAgent-spring.xml] cannot be opened because it does not exist
		//       at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:344)
		//       at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:304)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:181)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:217)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:188)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:252)
		//       at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:127)
		//       at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:93)
		//       at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:129)
		//       at org.springframework.context.support.AbstractApplicationContext.obtainFreshBeanFactory(AbstractApplicationContext.java:537)
		//       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:452)
		//       at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:139)
		//       at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:93)
		//       at com.ailk.eaap.op2.serviceagent.common.ActiveMQConsumer.main(ActiveMQConsumer.java:25)
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {};

		ActiveMQConsumer.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from class path resource [spring/eaap-op2-serviceAgent-spring.xml]; nested exception is java.io.FileNotFoundException: class path resource [spring/eaap-op2-serviceAgent-spring.xml] cannot be opened because it does not exist
		//       at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:344)
		//       at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:304)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:181)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:217)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:188)
		//       at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:252)
		//       at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:127)
		//       at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:93)
		//       at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:129)
		//       at org.springframework.context.support.AbstractApplicationContext.obtainFreshBeanFactory(AbstractApplicationContext.java:537)
		//       at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:452)
		//       at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:139)
		//       at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:93)
		//       at com.ailk.eaap.op2.serviceagent.common.ActiveMQConsumer.main(ActiveMQConsumer.java:25)
	}

	/**
	 * Run the String receiveMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testReceiveMessage_1()
		throws Exception {
		ActiveMQConsumer fixture = new ActiveMQConsumer();
		fixture.setJmsTemplate(new JmsTemplate());

		String result = fixture.receiveMessage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No 'defaultDestination' or 'defaultDestinationName' specified. Check configuration of JmsTemplate.
		//       at org.springframework.jms.core.JmsTemplate.getRequiredDefaultDestinationName(JmsTemplate.java:228)
		//       at org.springframework.jms.core.JmsTemplate.receive(JmsTemplate.java:727)
		//       at com.ailk.eaap.op2.serviceagent.common.ActiveMQConsumer.receiveMessage(ActiveMQConsumer.java:15)
		assertNotNull(result);
	}

	/**
	 * Run the String receiveMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testReceiveMessage_2()
		throws Exception {
		ActiveMQConsumer fixture = new ActiveMQConsumer();
		fixture.setJmsTemplate(new JmsTemplate());

		String result = fixture.receiveMessage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No 'defaultDestination' or 'defaultDestinationName' specified. Check configuration of JmsTemplate.
		//       at org.springframework.jms.core.JmsTemplate.getRequiredDefaultDestinationName(JmsTemplate.java:228)
		//       at org.springframework.jms.core.JmsTemplate.receive(JmsTemplate.java:727)
		//       at com.ailk.eaap.op2.serviceagent.common.ActiveMQConsumer.receiveMessage(ActiveMQConsumer.java:15)
		assertNotNull(result);
	}

	/**
	 * Run the String receiveMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testReceiveMessage_3()
		throws Exception {
		ActiveMQConsumer fixture = new ActiveMQConsumer();
		fixture.setJmsTemplate(new JmsTemplate());

		String result = fixture.receiveMessage();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No 'defaultDestination' or 'defaultDestinationName' specified. Check configuration of JmsTemplate.
		//       at org.springframework.jms.core.JmsTemplate.getRequiredDefaultDestinationName(JmsTemplate.java:228)
		//       at org.springframework.jms.core.JmsTemplate.receive(JmsTemplate.java:727)
		//       at com.ailk.eaap.op2.serviceagent.common.ActiveMQConsumer.receiveMessage(ActiveMQConsumer.java:15)
		assertNotNull(result);
	}

	/**
	 * Run the void setJmsTemplate(JmsTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetJmsTemplate_1()
		throws Exception {
		ActiveMQConsumer fixture = new ActiveMQConsumer();
		fixture.setJmsTemplate(new JmsTemplate());
		JmsTemplate jmsTemplate = new JmsTemplate();

		fixture.setJmsTemplate(jmsTemplate);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ActiveMQConsumerTest.class);
	}
}