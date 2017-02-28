package com.ailk.eaap.op2.serviceagent.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.aop.ProxyMethodInvocation;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>RemoteCallAspectTest</code> contains tests for the class <code>{@link RemoteCallAspect}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:25
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class RemoteCallAspectTest {
	/**
	 * Run the MessageBO aroundExchange(ProceedingJoinPoint) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAroundExchange_1()
		throws Throwable {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());
		ProceedingJoinPoint pjp = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		MessageBO result = fixture.aroundExchange(pjp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO aroundExchange(ProceedingJoinPoint) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAroundExchange_2()
		throws Throwable {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());
		ProceedingJoinPoint pjp = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		MessageBO result = fixture.aroundExchange(pjp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO aroundExchange(ProceedingJoinPoint) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAroundExchange_3()
		throws Throwable {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());
		ProceedingJoinPoint pjp = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		MessageBO result = fixture.aroundExchange(pjp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO aroundExchange(ProceedingJoinPoint) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAroundExchange_4()
		throws Throwable {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());
		ProceedingJoinPoint pjp = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		MessageBO result = fixture.aroundExchange(pjp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO aroundExchange(ProceedingJoinPoint) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAroundExchange_5()
		throws Throwable {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());
		ProceedingJoinPoint pjp = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		MessageBO result = fixture.aroundExchange(pjp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO aroundExchange(ProceedingJoinPoint) method test.
	 *
	 * @throws Throwable
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAroundExchange_6()
		throws Throwable {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());
		ProceedingJoinPoint pjp = new MethodInvocationProceedingJoinPoint((ProxyMethodInvocation) null);

		MessageBO result = fixture.aroundExchange(pjp);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRunTimeMemcachedClient());
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:25
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		RemoteCallAspect fixture = new RemoteCallAspect();
		fixture.setCacheService(new CacheServiceImpl());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

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
		new org.junit.runner.JUnitCore().run(RemoteCallAspectTest.class);
	}
}