package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SoftEndOfStreamExceptionTest</code> contains tests for the class <code>{@link SoftEndOfStreamException}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:14
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SoftEndOfStreamExceptionTest {
	/**
	 * Run the SoftEndOfStreamException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSoftEndOfStreamException_1()
		throws Exception {

		SoftEndOfStreamException result = new SoftEndOfStreamException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.SoftEndOfStreamException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the SoftEndOfStreamException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSoftEndOfStreamException_2()
		throws Exception {
		String message = "";

		SoftEndOfStreamException result = new SoftEndOfStreamException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.SoftEndOfStreamException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
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
	 * @generatedBy CodePro at 15-12-21 下午5:14
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
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SoftEndOfStreamExceptionTest.class);
	}
}