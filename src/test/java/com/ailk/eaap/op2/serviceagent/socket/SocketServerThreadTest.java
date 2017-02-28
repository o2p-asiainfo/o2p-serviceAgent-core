package com.ailk.eaap.op2.serviceagent.socket;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.PipedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.deal.service.DIHService;
import com.ailk.eaap.op2.serviceagent.deal.service.IDIHService;

/**
 * The class <code>SocketServerThreadTest</code> contains tests for the class <code>{@link SocketServerThread}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:11
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SocketServerThreadTest {
	/**
	 * Run the SocketServerThread() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSocketServerThread_1()
		throws Exception {

		SocketServerThread result = new SocketServerThread();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getClientSocket());
		assertEquals(null, result.getDihService());
		assertEquals(null, result.getPw());
		assertEquals(null, result.getBir());
		assertEquals("Thread[SocketServerThread,1,main]", result.toString());
		assertEquals(false, result.isInterrupted());
		assertEquals("SocketServerThread", result.getName());
		assertEquals(0, result.countStackFrames());
		assertEquals(1412L, result.getId());
		assertEquals(1, result.getPriority());
		assertEquals(false, result.isAlive());
		assertEquals(true, result.isDaemon());
	}

	/**
	 * Run the SocketServerThread(Socket) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSocketServerThread_2()
		throws Exception {
		Socket clientSocket = new Socket();

		SocketServerThread result = new SocketServerThread(clientSocket);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDihService());
		assertEquals(null, result.getPw());
		assertEquals(null, result.getBir());
		assertEquals("Thread[SocketServerThread,1,main]", result.toString());
		assertEquals(false, result.isInterrupted());
		assertEquals("SocketServerThread", result.getName());
		assertEquals(0, result.countStackFrames());
		assertEquals(1414L, result.getId());
		assertEquals(1, result.getPriority());
		assertEquals(false, result.isAlive());
		assertEquals(true, result.isDaemon());
	}

	/**
	 * Run the SocketServerThread(Socket,IDIHService) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSocketServerThread_3()
		throws Exception {
		Socket clientSocket = new Socket();
		IDIHService dihService = new DIHService();

		SocketServerThread result = new SocketServerThread(clientSocket, dihService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
		assertNotNull(result);
	}

	/**
	 * Run the BufferedReader getBir() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testGetBir_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		BufferedReader result = fixture.getBir();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
		assertNotNull(result);
	}

	/**
	 * Run the Socket getClientSocket() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testGetClientSocket_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		Socket result = fixture.getClientSocket();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.deal.service.DIHService.<clinit>(DIHService.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the IDIHService getDihService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testGetDihService_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		IDIHService result = fixture.getDihService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
		assertNotNull(result);
	}

	/**
	 * Run the PrintWriter getPw() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testGetPw_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		PrintWriter result = fixture.getPw();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
		assertNotNull(result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_2()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_3()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_4()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_5()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_6()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_7()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_8()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testRun_9()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void sendResponse(PrintWriter,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSendResponse_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));
		PrintWriter pw = new PrintWriter(new CharArrayWriter());
		String response = "";

		fixture.sendResponse(pw, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void setBir(BufferedReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSetBir_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));
		BufferedReader bir = new BufferedReader(new PipedReader());

		fixture.setBir(bir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void setClientSocket(Socket) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSetClientSocket_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));
		Socket clientSocket = new Socket();

		fixture.setClientSocket(clientSocket);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void setDihService(IDIHService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSetDihService_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));
		IDIHService dihService = new DIHService();

		fixture.setDihService(dihService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Run the void setPw(PrintWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	@Test
	public void testSetPw_1()
		throws Exception {
		SocketServerThread fixture = new SocketServerThread(new Socket(), new DIHService());
		fixture.setPw(new PrintWriter(new CharArrayWriter()));
		fixture.setBir(new BufferedReader(new PipedReader()));
		PrintWriter pw = new PrintWriter(new CharArrayWriter());

		fixture.setPw(pw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.deal.service.DIHService
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:11
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
	 * @generatedBy CodePro at 15-12-21 下午5:11
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
	 * @generatedBy CodePro at 15-12-21 下午5:11
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SocketServerThreadTest.class);
	}
}