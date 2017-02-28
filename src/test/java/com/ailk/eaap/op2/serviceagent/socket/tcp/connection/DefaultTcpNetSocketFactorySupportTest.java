package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultTcpNetSocketFactorySupportTest</code> contains tests for the class <code>{@link DefaultTcpNetSocketFactorySupport}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:12
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class DefaultTcpNetSocketFactorySupportTest {
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
		DefaultTcpNetSocketFactorySupport fixture = new DefaultTcpNetSocketFactorySupport();

		ServerSocketFactory result = fixture.getServerSocketFactory();

		// add additional test code here
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
		DefaultTcpNetSocketFactorySupport fixture = new DefaultTcpNetSocketFactorySupport();

		SocketFactory result = fixture.getSocketFactory();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DefaultTcpNetSocketFactorySupportTest.class);
	}
}