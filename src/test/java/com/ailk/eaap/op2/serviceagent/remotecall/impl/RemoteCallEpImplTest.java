package com.ailk.eaap.op2.serviceagent.remotecall.impl;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.op2.serviceagent.route.service.IServiceExchangeService;
import com.ailk.eaap.op2.serviceagent.route.service.ServiceExchangeService;

/**
 * The class <code>RemoteCallEpImplTest</code> contains tests for the class <code>{@link RemoteCallEpImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:39
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class RemoteCallEpImplTest {
	/**
	 * Run the RemoteCallEpImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:39
	 */
	@Test
	public void testRemoteCallEpImpl_1()
		throws Exception {
		RemoteCallEpImpl result = new RemoteCallEpImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the IServiceExchangeService getServiceExchangeService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:39
	 */
	@Test
	public void testGetServiceExchangeService_1()
		throws Exception {
		RemoteCallEpImpl fixture = new RemoteCallEpImpl();
		fixture.setServiceExchangeService(new ServiceExchangeService());

		IServiceExchangeService result = fixture.getServiceExchangeService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ServiceExchangeService
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO remoteCall(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:39
	 */

	/**
	 * Run the void setServiceExchangeService(IServiceExchangeService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:39
	 */
	@Test
	public void testSetServiceExchangeService_1()
		throws Exception {
		RemoteCallEpImpl fixture = new RemoteCallEpImpl();
		fixture.setServiceExchangeService(new ServiceExchangeService());
		IServiceExchangeService serviceExchangeService = new ServiceExchangeService();

		fixture.setServiceExchangeService(serviceExchangeService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.service.ServiceExchangeService
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:39
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
	 * @generatedBy CodePro at 15-11-12 下午7:39
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
	 * @generatedBy CodePro at 15-11-12 下午7:39
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RemoteCallEpImplTest.class);
	}
}