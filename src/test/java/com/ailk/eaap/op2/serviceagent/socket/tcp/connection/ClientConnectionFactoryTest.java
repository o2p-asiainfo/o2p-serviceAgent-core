package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.net.ConnectException;
import java.net.Socket;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.ByteArrayCrLfSerializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Deserializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Serializer;

/**
 * The class <code>ClientConnectionFactoryTest</code> contains tests for the class <code>{@link ClientConnectionFactory}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:12
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ClientConnectionFactoryTest {
	/**
	 * Run the ClientConnectionFactory(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testClientConnectionFactory_1()
		throws Exception {
		String host = "";
		int port = 1;

		ClientConnectionFactory result = new ClientConnectionFactory(host, port);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getHost());
		assertEquals(1, result.getPort());
		assertEquals(false, result.isActive());
		assertEquals(false, result.isSingleUse());
		assertEquals(false, result.isLookupHost());
	}

	/**
	 * Run the TcpConnectionSupport buildNewConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testBuildNewConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.buildNewConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TcpConnectionSupport buildNewConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testBuildNewConnection_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.buildNewConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TcpConnectionSupport buildNewConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testBuildNewConnection_3()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.buildNewConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Socket createSocket(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
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
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
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
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testCreateSocket_3()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		String host = "";
		int port = 1;

		Socket result = fixture.createSocket(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void forceClose(TcpConnectionSupport) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testForceClose_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		TcpConnectionSupport connection = new TcpNetConnection(new Socket(), true, true);

		fixture.forceClose(connection);

		// add additional test code here
	}

	/**
	 * Run the void forceClose(TcpConnectionSupport) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testForceClose_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		TcpConnectionSupport connection = new TcpNetConnection(new Socket(), true, true);

		fixture.forceClose(connection);

		// add additional test code here
	}

	/**
	 * Run the TcpConnectionSupport getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testGetConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.getConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TcpConnectionSupport getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testGetConnection_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.getConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TcpConnectionSupport getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testGetConnection_3()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.getConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer<Object> getDeserializer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Deserializer<?> result = fixture.getDeserializer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetHost_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		String result = fixture.getHost();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		int result = fixture.getPort();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Serializer<Object> getSerializer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Serializer<?> result = fixture.getSerializer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TcpConnectionSupport getTheConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testGetTheConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.getTheConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:89733b30-eb31-4470-9343-9f5b6ad23c5d", result.getConnectionId());
	}

	/**
	 * Run the void initializeConnection(TcpConnectionSupport,Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testInitializeConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		TcpConnectionSupport connection = new TcpNetConnection(new Socket(), true, true);
		Socket socket = new Socket();

		fixture.initializeConnection(connection, socket);

		// add additional test code here
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testIsActive_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testIsActive_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(false);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLookupHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testIsLookupHost_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isLookupHost();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLookupHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testIsLookupHost_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(false);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isLookupHost();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSingleUse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testIsSingleUse_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isSingleUse();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSingleUse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testIsSingleUse_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(false);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isSingleUse();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the TcpConnectionSupport obtainConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(false);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:2d60ec6f-e66b-4ec0-8697-c512741ad054", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainConnection_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(false);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:b4117996-c76b-4473-a483-94aa0bce412f", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainConnection_3()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(false);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:b76e23d6-64b3-41de-9117-3d58f55715a0", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testObtainConnection_4()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TcpConnectionSupport obtainNewConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainNewConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(false);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainNewConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:1767dc53-4a44-449f-a0a9-d95272462450", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainNewConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainNewConnection_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(false);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainNewConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:3dfcbed0-9b45-452e-9304-f241a8645bfe", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainNewConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainNewConnection_3()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(false);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainNewConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:98119ccc-7f43-4b4c-8d61-bb5a1f76d85e", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainNewConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test(expected = java.net.ConnectException.class)
	public void testObtainNewConnection_4()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainNewConnection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TcpConnectionSupport obtainSharedConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainSharedConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainSharedConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:0d077548-b716-44f4-8d82-2c678ebe234b", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainSharedConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainSharedConnection_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainSharedConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:f50b63e9-6aaf-4ddd-9288-9c81136d8599", result.getConnectionId());
	}

	/**
	 * Run the TcpConnectionSupport obtainSharedConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainSharedConnection_3()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection((TcpConnectionSupport) null);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainSharedConnection();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the TcpConnectionSupport obtainSharedConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testObtainSharedConnection_4()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		TcpConnectionSupport result = fixture.obtainSharedConnection();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(null, result.getDeserializer());
		assertEquals("unknown:0:-1:c8b36930-efa0-47b5-a92a-55481be4c1a2", result.getConnectionId());
	}

	/**
	 * Run the void setActive(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetActive_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		boolean active = true;

		fixture.setActive(active);

		// add additional test code here
	}

	/**
	 * Run the void setDeserializer(Deserializer<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetDeserializer_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Deserializer<?> deserializer = new ByteArrayCrLfSerializer();

		fixture.setDeserializer(deserializer);

		// add additional test code here
	}

	/**
	 * Run the void setHost(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetHost_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		String host = "";

		fixture.setHost(host);

		// add additional test code here
	}

	/**
	 * Run the void setLookupHost(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetLookupHost_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		boolean lookupHost = true;

		fixture.setLookupHost(lookupHost);

		// add additional test code here
	}

	/**
	 * Run the void setPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetPort_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		int port = 1;

		fixture.setPort(port);

		// add additional test code here
	}

	/**
	 * Run the void setSerializer(Serializer<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSerializer_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Serializer<?> serializer = new ByteArrayCrLfSerializer();

		fixture.setSerializer(serializer);

		// add additional test code here
	}

	/**
	 * Run the void setSingleUse(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSingleUse_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		boolean singleUse = true;

		fixture.setSingleUse(singleUse);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_3()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_4()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_5()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_6()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_7()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_8()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_9()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_10()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_11()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_12()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_13()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_14()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_15()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setSocketAttributes(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetSocketAttributes_16()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Socket socket = new Socket();

		fixture.setSocketAttributes(socket);

		// add additional test code here
	}

	/**
	 * Run the void setTheConnection(TcpConnectionSupport) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testSetTheConnection_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		TcpConnectionSupport theConnection = new TcpNetConnection(new Socket(), true, true);

		fixture.setTheConnection(theConnection);

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testStart_1()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testStart_2()
		throws Exception {
		ClientConnectionFactory fixture = new ClientConnectionFactory("", 1);
		fixture.setActive(true);
		fixture.setSingleUse(true);
		fixture.setLookupHost(true);
		fixture.setTheConnection(new TcpNetConnection(new Socket(), true, true));
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		fixture.start();

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
		new org.junit.runner.JUnitCore().run(ClientConnectionFactoryTest.class);
	}
}