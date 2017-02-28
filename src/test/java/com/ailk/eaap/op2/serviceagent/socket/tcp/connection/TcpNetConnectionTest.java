package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.net.Socket;
import java.net.SocketException;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.ByteArrayCrLfSerializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Deserializer;
import com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.Serializer;

/**
 * The class <code>TcpNetConnectionTest</code> contains tests for the class <code>{@link TcpNetConnection}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:13
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class TcpNetConnectionTest {
	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_1()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = false;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:ec0e3509-75f5-4093-8404-61f314999a80", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_2()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:07137cb1-3334-4cc9-a1f3-d93c7d121496", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_3()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:cbe65970-01c1-4f7d-9f4d-619f56197c74", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_4()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = false;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:5d15fc08-192b-4888-90fc-c01b31cfe437", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_5()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:1a5742ba-8d9b-4c54-863c-1d44a9833cb0", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_6()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:e2f85b4d-26fb-485e-b57b-559b262689de", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_7()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = false;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:a490d224-e678-4d80-b802-1f8497b9c0da", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_8()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:50b120aa-ea40-40f3-9ee5-f98e84fef27e", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_9()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:9949bf57-a9ae-4e6d-adfc-bd8a6f5fed77", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_10()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = false;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:2cff806b-c922-40e9-abaa-c60e1d100361", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_11()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:70d8088c-990c-40a5-a2ca-28820f496eb1", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the TcpNetConnection(Socket,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testTcpNetConnection_12()
		throws Exception {
		Socket socket = new Socket();
		boolean server = true;
		boolean lookupHost = true;

		TcpNetConnection result = new TcpNetConnection(socket, server, lookupHost);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isOpen());
		assertEquals(0, result.getPort());
		assertEquals(-1, result.getSoLinger());
		assertEquals("unknown:0:-1:fa95ecd3-8f58-4f11-a1ac-bb0ade1c3c4f", result.getConnectionId());
		assertEquals(null, result.getSerializer());
		assertEquals(null, result.getDeserializer());
		assertEquals(null, result.getDeserializerStateKey());
		assertEquals(false, result.isNoReadErrorOnClose());
		assertEquals(true, result.isServer());
		assertEquals(false, result.isSingleUse());
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testClose_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testClose_2()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the String getConnectionId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetConnectionId_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		String result = fixture.getConnectionId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Deserializer<Object> getDeserializer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Deserializer<?> result = fixture.getDeserializer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getDeserializerStateKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetDeserializerStateKey_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Object result = fixture.getDeserializerStateKey();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getDeserializerStateKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetDeserializerStateKey_2()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Object result = fixture.getDeserializerStateKey();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getPayload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.SocketException.class)
	public void testGetPayload_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Object result = fixture.getPayload();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getPayload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.SocketException.class)
	public void testGetPayload_2()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Object result = fixture.getPayload();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getPayload() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.SocketException.class)
	public void testGetPayload_3()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Object result = fixture.getPayload();

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
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		int result = fixture.getPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Serializer<Object> getSerializer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		Serializer<?> result = fixture.getSerializer();

		// add additional test code here
		assertNotNull(result);
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
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		int result = fixture.getSoLinger();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isNoReadErrorOnClose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsNoReadErrorOnClose_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isNoReadErrorOnClose();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNoReadErrorOnClose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsNoReadErrorOnClose_2()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(false);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isNoReadErrorOnClose();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOpen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsOpen_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isOpen();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isOpen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsOpen_2()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isOpen();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsServer_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isServer();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsServer_2()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), false, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isServer();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSingleUse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsSingleUse_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
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
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testIsSingleUse_2()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(false);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());

		boolean result = fixture.isSingleUse();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void send(MessageBO<byte[]>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test(expected = java.net.SocketException.class)
	public void testSend_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		MessageBO<byte[]> message = new MessageBO();

		fixture.send(message);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetConnectionId_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		String connectionId = "";

		fixture.setConnectionId(connectionId);

		// add additional test code here
	}

	/**
	 * Run the void setDeserializer(Deserializer<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetDeserializer_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		Deserializer<?> deserializer = new ByteArrayCrLfSerializer();

		fixture.setDeserializer(deserializer);

		// add additional test code here
	}

	/**
	 * Run the void setNoReadErrorOnClose(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetNoReadErrorOnClose_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		boolean noReadErrorOnClose = true;

		fixture.setNoReadErrorOnClose(noReadErrorOnClose);

		// add additional test code here
	}

	/**
	 * Run the void setSerializer(Serializer<?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSerializer_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
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
	 * @generatedBy CodePro at 15-12-21 下午5:13
	 */
	@Test
	public void testSetSingleUse_1()
		throws Exception {
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		boolean singleUse = true;

		fixture.setSingleUse(singleUse);

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
		TcpNetConnection fixture = new TcpNetConnection(new Socket(), true, true);
		fixture.setSingleUse(true);
		fixture.setSoLinger(1);
		fixture.setConnectionId("");
		fixture.setNoReadErrorOnClose(true);
		fixture.setDeserializer(new ByteArrayCrLfSerializer());
		fixture.setSerializer(new ByteArrayCrLfSerializer());
		int soLinger = 1;

		fixture.setSoLinger(soLinger);

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
		new org.junit.runner.JUnitCore().run(TcpNetConnectionTest.class);
	}
}