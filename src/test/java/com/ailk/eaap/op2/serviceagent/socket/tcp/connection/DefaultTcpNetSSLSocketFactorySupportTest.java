package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.io.FileNotFoundException;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultTcpNetSSLSocketFactorySupportTest</code> contains tests for the class <code>{@link DefaultTcpNetSSLSocketFactorySupport}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:12
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class DefaultTcpNetSSLSocketFactorySupportTest {
	/**
	 * Run the DefaultTcpNetSSLSocketFactorySupport(TcpSSLContextSupport) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testDefaultTcpNetSSLSocketFactorySupport_1()
		throws Exception {
		TcpSSLContextSupport sslContextSupport = new DefaultTcpSSLContextSupport("", "");

		DefaultTcpNetSSLSocketFactorySupport result = new DefaultTcpNetSSLSocketFactorySupport(sslContextSupport);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testAfterPropertiesSet_1()
		throws Exception {
		DefaultTcpNetSSLSocketFactorySupport fixture = new DefaultTcpNetSSLSocketFactorySupport(new DefaultTcpSSLContextSupport("", ""));

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testAfterPropertiesSet_2()
		throws Exception {
		DefaultTcpNetSSLSocketFactorySupport fixture = new DefaultTcpNetSSLSocketFactorySupport(new DefaultTcpSSLContextSupport("", ""));

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the void afterPropertiesSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testAfterPropertiesSet_3()
		throws Exception {
		DefaultTcpNetSSLSocketFactorySupport fixture = new DefaultTcpNetSSLSocketFactorySupport(new DefaultTcpSSLContextSupport("", ""));

		fixture.afterPropertiesSet();

		// add additional test code here
	}

	/**
	 * Run the ServerSocketFactory getServerSocketFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetServerSocketFactory_1()
		throws Exception {
		DefaultTcpNetSSLSocketFactorySupport fixture = new DefaultTcpNetSSLSocketFactorySupport(new DefaultTcpSSLContextSupport("", ""));

		ServerSocketFactory result = fixture.getServerSocketFactory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpNetSSLSocketFactorySupport.getServerSocketFactory(DefaultTcpNetSSLSocketFactorySupport.java:25)
		assertNotNull(result);
	}

	/**
	 * Run the SocketFactory getSocketFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSocketFactory_1()
		throws Exception {
		DefaultTcpNetSSLSocketFactorySupport fixture = new DefaultTcpNetSSLSocketFactorySupport(new DefaultTcpSSLContextSupport("", ""));

		SocketFactory result = fixture.getSocketFactory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpNetSSLSocketFactorySupport.getSocketFactory(DefaultTcpNetSSLSocketFactorySupport.java:29)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
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
	 * @generatedBy CodePro at 15-12-21 下午5:12
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
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultTcpNetSSLSocketFactorySupportTest.class);
	}
}