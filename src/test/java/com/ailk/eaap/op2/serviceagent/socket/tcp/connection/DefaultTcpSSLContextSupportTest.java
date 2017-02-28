package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.io.FileNotFoundException;
import javax.net.ssl.SSLContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultTcpSSLContextSupportTest</code> contains tests for the class <code>{@link DefaultTcpSSLContextSupport}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:12
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class DefaultTcpSSLContextSupportTest {
	/**
	 * Run the DefaultTcpSSLContextSupport(String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testDefaultTcpSSLContextSupport_1()
		throws Exception {
		String trustStore = "";
		String trustStorePassword = "";

		DefaultTcpSSLContextSupport result = new DefaultTcpSSLContextSupport(trustStore, trustStorePassword);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultTcpSSLContextSupport(String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testDefaultTcpSSLContextSupport_2()
		throws Exception {
		String keyStore = "";
		String trustStore = "";
		String keyStorePassword = "";
		String trustStorePassword = "";

		DefaultTcpSSLContextSupport result = new DefaultTcpSSLContextSupport(keyStore, trustStore, keyStorePassword, trustStorePassword);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_1()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_2()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_3()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_4()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_5()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_6()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_7()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_8()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_9()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_10()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");

		SSLContext result = fixture.getSSLContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSSLContext_11()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = false;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpSSLContextSupport.getSSLContext(DefaultTcpSSLContextSupport.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSSLContext_12()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = false;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpSSLContextSupport.getSSLContext(DefaultTcpSSLContextSupport.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSSLContext_13()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = false;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpSSLContextSupport.getSSLContext(DefaultTcpSSLContextSupport.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSSLContext_14()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = false;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpSSLContextSupport.getSSLContext(DefaultTcpSSLContextSupport.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSSLContext_15()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = false;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpSSLContextSupport.getSSLContext(DefaultTcpSSLContextSupport.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSSLContext_16()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = false;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.connection.DefaultTcpSSLContextSupport.getSSLContext(DefaultTcpSSLContextSupport.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_17()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_18()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_19()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_20()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_21()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_22()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_23()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_24()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_25()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SSLContext getSSLContext(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetSSLContext_26()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		boolean isClient = true;

		SSLContext result = fixture.getSSLContext(isClient);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setProtocol(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetProtocol_1()
		throws Exception {
		DefaultTcpSSLContextSupport fixture = new DefaultTcpSSLContextSupport("", "");
		fixture.setProtocol("");
		String protocol = "";

		fixture.setProtocol(protocol);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DefaultTcpSSLContextSupportTest.class);
	}
}