package com.ailk.eaap.op2.serviceagent.socket.tcp.connection;

import java.net.ServerSocket;
import java.net.Socket;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultTcpSocketSupportTest</code> contains tests for the class <code>{@link DefaultTcpSocketSupport}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:12
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class DefaultTcpSocketSupportTest {
	/**
	 * Run the void postProcessServerSocket(ServerSocket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testPostProcessServerSocket_1()
		throws Exception {
		DefaultTcpSocketSupport fixture = new DefaultTcpSocketSupport();
		ServerSocket serverSocket = new ServerSocket();

		fixture.postProcessServerSocket(serverSocket);

		// add additional test code here
	}

	/**
	 * Run the void postProcessSocket(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:12
	 */
	@Test
	public void testPostProcessSocket_1()
		throws Exception {
		DefaultTcpSocketSupport fixture = new DefaultTcpSocketSupport();
		Socket socket = new Socket();

		fixture.postProcessSocket(socket);

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
		new org.junit.runner.JUnitCore().run(DefaultTcpSocketSupportTest.class);
	}
}