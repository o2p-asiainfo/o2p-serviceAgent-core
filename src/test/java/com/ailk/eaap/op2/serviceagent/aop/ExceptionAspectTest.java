package com.ailk.eaap.op2.serviceagent.aop;

import org.aspectj.lang.JoinPoint;
import org.junit.*;
import org.springframework.jms.core.JmsTemplate;

import static org.junit.Assert.*;

import com.ailk.eaap.op2.serviceagent.activemq.ActivemqMessageUtil;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
import com.ailk.eaap.op2.serviceagent.taskflag.ITaskCacheService;
import com.ailk.eaap.op2.serviceagent.taskflag.impl.TaskCacheService;
import com.asiainfo.foundation.exception.BusinessException;

/**
 * The class <code>ExceptionAspectTest</code> contains tests for the class <code>{@link ExceptionAspect}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:25
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ExceptionAspectTest {
	/**
	 * Run the ExceptionAspect() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testExceptionAspect_1()
		throws Exception {
		ExceptionAspect result = new ExceptionAspect();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ActivemqMessageUtil getDealExceptionMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testGetDealExceptionMessage_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());;
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());

		JmsTemplate result = fixture.getExceptionJmsTempldate();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ActivemqMessageUtil getExceptionMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testGetExceptionMessage_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());
		// add additional test code here
		assertNotNull(fixture);
		assertEquals(null, fixture.getExceptionJmsTempldate().getDefaultDestinationName());
	}

	/**
	 * Run the Integer getExceptionTryNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testGetExceptionTryNum_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());

		Integer result = fixture.getExceptionTryNum();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the IMessageBoHisService getMessageBoHisSer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testGetMessageBoHisSer_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());

		IMessageBoHisService result = fixture.getMessageBoHisSer();

		// add additional test code here
		assertNotNull(result);
//		assertEquals(null, result.getLastReqMessageBo());
//		assertEquals(null, result.getLastRspMessageBo());
	}

	/**
	 * Run the ITaskCacheService getTaskCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testGetTaskCacheService_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());

		ITaskCacheService result = fixture.getTaskCacheService();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDealExceptionMessage(ActivemqMessageUtil) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testSetDealExceptionMessage_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());
		JmsTemplate dealExceptionMessage = new JmsTemplate();

		fixture.setExceptionJmsTempldate(dealExceptionMessage);

		// add additional test code here
	}

	/**
	 * Run the void setExceptionMessage(ActivemqMessageUtil) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testSetExceptionMessage_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());
		JmsTemplate dealExceptionMessage = new JmsTemplate();

		fixture.setDealExceptionJmsTemplate(dealExceptionMessage);

		// add additional test code here
	}

	/**
	 * Run the void setExceptionTryNum(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testSetExceptionTryNum_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());
		Integer exceptionTryNum = new Integer(1);

		fixture.setExceptionTryNum(exceptionTryNum);

		// add additional test code here
	}

	/**
	 * Run the void setMessageBoHisSer(IMessageBoHisService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testSetMessageBoHisSer_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());
		IMessageBoHisService messageBoHisSer = new MessageBoHisServiceImpl();

		fixture.setMessageBoHisSer(messageBoHisSer);

		// add additional test code here
	}

	/**
	 * Run the void setTaskCacheService(ITaskCacheService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testSetTaskCacheService_1()
		throws Exception {
		ExceptionAspect fixture = new ExceptionAspect();
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		fixture.setExceptionJmsTempldate(new JmsTemplate());
		fixture.setExceptionTryNum(new Integer(1));
		fixture.setDealExceptionJmsTemplate(new JmsTemplate());
		fixture.setTaskCacheService(new TaskCacheService());
		ITaskCacheService TaskCacheService = new TaskCacheService();

		fixture.setTaskCacheService(TaskCacheService);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
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
	 * @generatedBy CodePro at 15-11-12 下午7:25
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
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExceptionAspectTest.class);
	}
}