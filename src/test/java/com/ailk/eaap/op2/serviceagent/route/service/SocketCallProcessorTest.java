package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.IdentityHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.socket.tcp.connection.TcpConnectionFactoryBean;
import com.ailk.eaap.op2.bo.Endpoint;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>SocketCallProcessorTest</code> contains tests for the class <code>{@link SocketCallProcessor}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:02
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SocketCallProcessorTest {
	/**
	 * Run the SocketCallProcessor() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testSocketCallProcessor_1()
		throws Exception {
		SocketCallProcessor result = new SocketCallProcessor();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testClear_1()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getRunTimeMemcachedClient());
		assertEquals(null, result.getAllTenant());
	}

	/**
	 * Run the TcpConnectionFactoryBean getTcpFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testGetTcpFactory_1()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());

		TcpConnectionFactoryBean result = fixture.getTcpFactory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getHost());
		assertEquals(0, result.getPort());
		assertEquals(0, result.getSoTimeout());
		assertEquals(-1, result.getSoLinger());
		assertEquals(0, result.getSoSendBufferSize());
		assertEquals(0, result.getSoReceiveBufferSize());
		assertEquals(true, result.isLookupHost());
		assertEquals(false, result.isUsingDirectBuffers());
		assertEquals(null, result.getSslContextSupport());
		assertEquals(false, result.isSoTcpNoDelay());
		assertEquals(0, result.getSoTrafficClass());
		assertEquals(false, result.isSoKeepAlive());
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testProcess_1()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    <exception><code>9999</code><msg>segmentSign:13.null</msg><exceptionTrace>com.ailk.eaap.op2.common.EAAPException: segmentSign:13.null
		//       at com.ailk.eaap.op2.serviceagent.route.service.SocketCallProcessor.process(SocketCallProcessor.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testProcess_2()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    <exception><code>9999</code><msg>segmentSign:13.null</msg><exceptionTrace>com.ailk.eaap.op2.common.EAAPException: segmentSign:13.null
		//       at com.ailk.eaap.op2.serviceagent.route.service.SocketCallProcessor.process(SocketCallProcessor.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testProcess_3()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    <exception><code>9999</code><msg>segmentSign:13.null</msg><exceptionTrace>com.ailk.eaap.op2.common.EAAPException: segmentSign:13.null
		//       at com.ailk.eaap.op2.serviceagent.route.service.SocketCallProcessor.process(SocketCallProcessor.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testProcess_4()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    <exception><code>9999</code><msg>segmentSign:13.null</msg><exceptionTrace>com.ailk.eaap.op2.common.EAAPException: segmentSign:13.null
		//       at com.ailk.eaap.op2.serviceagent.route.service.SocketCallProcessor.process(SocketCallProcessor.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testProcess_5()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testProcess_6()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageBO process(Endpoint,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test(expected = com.ailk.eaap.op2.common.EAAPException.class)
	public void testProcess_7()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		MessageBO msg = new MessageBO();

		MessageBO result = fixture.process(endpoint, msg);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
	}

	/**
	 * Run the void setTcpFactory(TcpConnectionFactoryBean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testSetTcpFactory_1()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		TcpConnectionFactoryBean tcpFactory = new TcpConnectionFactoryBean();

		fixture.setTcpFactory(tcpFactory);

		// add additional test code here
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	@Test
	public void testSubtraThreadNum_1()
		throws Exception {
		SocketCallProcessor fixture = new SocketCallProcessor();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setTcpFactory(new TcpConnectionFactoryBean());
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:02
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
	 * @generatedBy CodePro at 15-12-21 下午5:02
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
	 * @generatedBy CodePro at 15-12-21 下午5:02
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SocketCallProcessorTest.class);
	}
}