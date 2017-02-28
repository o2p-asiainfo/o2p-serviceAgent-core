package com.ailk.eaap.op2.serviceagent.common;

import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SSLProtocolSocketFactoryTest</code> contains tests for the class <code>{@link SSLProtocolSocketFactory}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:33
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SSLProtocolSocketFactoryTest {
	/**
	 * Run the SSLProtocolSocketFactory() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testSSLProtocolSocketFactory_1()
		throws Exception {
		SSLProtocolSocketFactory result = new SSLProtocolSocketFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Socket createSocket(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_1()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;

		Socket result = fixture.createSocket(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_2()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;

		Socket result = fixture.createSocket(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_3()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;

		Socket result = fixture.createSocket(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_4()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress clientHost = InetAddress.getLocalHost();
		int clientPort = 1;

		Socket result = fixture.createSocket(host, port, clientHost, clientPort);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_5()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress clientHost = InetAddress.getLocalHost();
		int clientPort = 1;

		Socket result = fixture.createSocket(host, port, clientHost, clientPort);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_6()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress clientHost = InetAddress.getLocalHost();
		int clientPort = 1;

		Socket result = fixture.createSocket(host, port, clientHost, clientPort);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(Socket,String,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.SocketException.class)
	public void testCreateSocket_7()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		Socket socket = new Socket();
		String host = "";
		int port = 1;
		boolean autoClose = true;

		Socket result = fixture.createSocket(socket, host, port, autoClose);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(Socket,String,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.SocketException.class)
	public void testCreateSocket_8()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		Socket socket = new Socket();
		String host = "";
		int port = 1;
		boolean autoClose = true;

		Socket result = fixture.createSocket(socket, host, port, autoClose);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSocket_9()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = null;

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_10()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = new HttpConnectionParams();

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_11()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = new HttpConnectionParams();

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_12()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = new HttpConnectionParams();

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_13()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = new HttpConnectionParams();

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_14()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = new HttpConnectionParams();

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_15()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = new HttpConnectionParams();

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int,InetAddress,int,HttpConnectionParams) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_16()
		throws Exception {
		SSLProtocolSocketFactory fixture = new SSLProtocolSocketFactory();
		String host = "";
		int port = 1;
		InetAddress localAddress = InetAddress.getLocalHost();
		int localPort = 1;
		HttpConnectionParams params = new HttpConnectionParams();

		Socket result = fixture.createSocket(host, port, localAddress, localPort, params);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
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
	 * @generatedBy CodePro at 15-12-21 下午4:33
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
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SSLProtocolSocketFactoryTest.class);
	}
}