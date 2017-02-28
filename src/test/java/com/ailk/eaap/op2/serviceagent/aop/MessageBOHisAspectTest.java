package com.ailk.eaap.op2.serviceagent.aop;

import org.aspectj.lang.JoinPoint;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.aop.ProxyMethodInvocation;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import com.ailk.eaap.integration.o2p.contractbody.service.ContractBodyServiceImpl;
import com.ailk.eaap.integration.o2p.contractbody.service.IContractBodyService;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;

/**
 * The class <code>MessageBOHisAspectTest</code> contains tests for the class <code>{@link MessageBOHisAspect}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:30
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MessageBOHisAspectTest {
	/**
	 * Run the MessageBOHisAspect() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testMessageBOHisAspect_1()
		throws Exception {
		MessageBOHisAspect result = new MessageBOHisAspect();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void afterExchange(JoinPoint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testAfterExchange_1()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinPoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);
		Object retValue = new MessageBO();

		fixture.afterExchange(joinPoint, retValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void afterExchange(JoinPoint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testAfterExchange_2()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinPoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);
		Object retValue = new MessageBO();

		fixture.afterExchange(joinPoint, retValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void afterExchange(JoinPoint,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testAfterExchange_3()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinPoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);
		Object retValue = new MessageBO();

		fixture.afterExchange(joinPoint, retValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void afterRoute(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testAfterRoute_1()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.afterRoute(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_1()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_2()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_3()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_4()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_5()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_6()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_7()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_8()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_9()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_10()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_11()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_12()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_13()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_14()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void beforeExchange(JoinPoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testBeforeExchange_15()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		JoinPoint joinpoint = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		fixture.beforeExchange(joinpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: MethodInvocation must not be null
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint.<init>(MethodInvocationProceedingJoinPoint.java:74)
	}

	/**
	 * Run the void setContractBodySer(IContractBodyService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testSetContractBodySer_1()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		IContractBodyService contractBodySer = new ContractBodyServiceImpl();

		fixture.setContractBodySer(contractBodySer);

		// add additional test code here
	}

	/**
	 * Run the void setMessageBoHisSer(IMessageBoHisService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	@Test
	public void testSetMessageBoHisSer_1()
		throws Exception {
		MessageBOHisAspect fixture = new MessageBOHisAspect();
		fixture.setContractBodySer(new ContractBodyServiceImpl());
		fixture.setMessageBoHisSer(new MessageBoHisServiceImpl());
		IMessageBoHisService messageBoHisSer = new MessageBoHisServiceImpl();

		fixture.setMessageBoHisSer(messageBoHisSer);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:30
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
	 * @generatedBy CodePro at 15-12-21 下午4:30
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
	 * @generatedBy CodePro at 15-12-21 下午4:30
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageBOHisAspectTest.class);
	}
}