package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.net.ConnectException;
import java.net.Socket;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TcpConnectionFactoryBeanTest</code> contains tests for the class <code>{@link TcpConnectionFactoryBean}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:13
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class TcpConnectionFactoryBeanTest {
	/**
	 * Run the TcpConnectionFactoryBean() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpConnectionFactoryBean_1()
		throws Exception {
		TcpConnectionFactoryBean result = new TcpConnectionFactoryBean();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetHost_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		String result = fixture.getHost();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Socket getObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetObject_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int hashCode = 1;

		Socket result = fixture.getObject(hashCode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket getObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetObject_2()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int hashCode = 1;

		Socket result = fixture.getObject(hashCode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket getObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetObject_3()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int hashCode = 1;

		Socket result = fixture.getObject(hashCode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket getObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testGetObject_4()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport((TcpSSLContextSupport) null);
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int hashCode = 1;

		Socket result = fixture.getObject(hashCode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket getObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testGetObject_5()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport((TcpSSLContextSupport) null);
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int hashCode = 1;

		Socket result = fixture.getObject(hashCode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket getObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testGetObject_6()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport((TcpSSLContextSupport) null);
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int hashCode = 1;

		Socket result = fixture.getObject(hashCode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket getObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testGetObject_7()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport((TcpSSLContextSupport) null);
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int hashCode = 1;

		Socket result = fixture.getObject(hashCode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		int result = fixture.getPort();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSoLinger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetSoLinger_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		int result = fixture.getSoLinger();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSoReceiveBufferSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetSoReceiveBufferSize_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		int result = fixture.getSoReceiveBufferSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSoSendBufferSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetSoSendBufferSize_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		int result = fixture.getSoSendBufferSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSoTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetSoTimeout_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		int result = fixture.getSoTimeout();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSoTrafficClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetSoTrafficClass_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		int result = fixture.getSoTrafficClass();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the TcpSSLContextSupport getSslContextSupport() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetSslContextSupport_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		TcpSSLContextSupport result = fixture.getSslContextSupport();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isLookupHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsLookupHost_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isLookupHost();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLookupHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsLookupHost_2()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(false);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isLookupHost();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSoKeepAlive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsSoKeepAlive_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isSoKeepAlive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSoKeepAlive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsSoKeepAlive_2()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(false);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isSoKeepAlive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSoTcpNoDelay() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsSoTcpNoDelay_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isSoTcpNoDelay();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSoTcpNoDelay() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsSoTcpNoDelay_2()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(false);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isSoTcpNoDelay();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isUsingDirectBuffers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsUsingDirectBuffers_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isUsingDirectBuffers();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isUsingDirectBuffers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsUsingDirectBuffers_2()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(false);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);

		boolean result = fixture.isUsingDirectBuffers();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setHost(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetHost_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		String host = "";

		fixture.setHost(host);

		// add additional test code here
	}

	/**
	 * Run the void setLookupHost(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetLookupHost_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		boolean lookupHost = true;

		fixture.setLookupHost(lookupHost);

		// add additional test code here
	}

	/**
	 * Run the void setPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetPort_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int port = 1;

		fixture.setPort(port);

		// add additional test code here
	}

	/**
	 * Run the void setSoKeepAlive(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSoKeepAlive_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		boolean soKeepAlive = true;

		fixture.setSoKeepAlive(soKeepAlive);

		// add additional test code here
	}

	/**
	 * Run the void setSoLinger(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSoLinger_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int soLinger = 1;

		fixture.setSoLinger(soLinger);

		// add additional test code here
	}

	/**
	 * Run the void setSoReceiveBufferSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSoReceiveBufferSize_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int soReceiveBufferSize = 1;

		fixture.setSoReceiveBufferSize(soReceiveBufferSize);

		// add additional test code here
	}

	/**
	 * Run the void setSoSendBufferSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSoSendBufferSize_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int soSendBufferSize = 1;

		fixture.setSoSendBufferSize(soSendBufferSize);

		// add additional test code here
	}

	/**
	 * Run the void setSoTcpNoDelay(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSoTcpNoDelay_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		boolean soTcpNoDelay = true;

		fixture.setSoTcpNoDelay(soTcpNoDelay);

		// add additional test code here
	}

	/**
	 * Run the void setSoTimeout(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSoTimeout_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int soTimeout = 1;

		fixture.setSoTimeout(soTimeout);

		// add additional test code here
	}

	/**
	 * Run the void setSoTrafficClass(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSoTrafficClass_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		int soTrafficClass = 1;

		fixture.setSoTrafficClass(soTrafficClass);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(-1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(0);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_2()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_3()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_4()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(-1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_5()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(0);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_6()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_7()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_8()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(-1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(0);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_9()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_10()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_11()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(-1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(0);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_12()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_13()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(-1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(0);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_14()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(-1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_15()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(0);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSocketAttributes_16()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(-1);
		fixture.setHost("");
		fixture.setSoTimeout(-1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(-1);
		fixture.setSoSendBufferSize(0);
		fixture.setSoReceiveBufferSize(0);
		fixture.setPort(1);
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSslContextSupport(TcpSSLContextSupport) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSslContextSupport_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		TcpSSLContextSupport sslContextSupport = new DefaultTcpSSLContextSupport("", "");

		fixture.setSslContextSupport(sslContextSupport);

		// add additional test code here
	}

	/**
	 * Run the void setUsingDirectBuffers(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetUsingDirectBuffers_1()
		throws Exception {
		TcpConnectionFactoryBean fixture = new TcpConnectionFactoryBean();
		fixture.setSslContextSupport(new DefaultTcpSSLContextSupport("", ""));
		fixture.setSoKeepAlive(true);
		fixture.setLookupHost(true);
		fixture.setSoLinger(1);
		fixture.setHost("");
		fixture.setSoTimeout(1);
		fixture.setUsingDirectBuffers(true);
		fixture.setSoTcpNoDelay(true);
		fixture.setSoTrafficClass(1);
		fixture.setSoSendBufferSize(1);
		fixture.setSoReceiveBufferSize(1);
		fixture.setPort(1);
		boolean usingDirectBuffers = true;

		fixture.setUsingDirectBuffers(usingDirectBuffers);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
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
	 * @generatedBy CodePro at 15-12-21 下午5:13
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
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TcpConnectionFactoryBeanTest.class);
	}
}