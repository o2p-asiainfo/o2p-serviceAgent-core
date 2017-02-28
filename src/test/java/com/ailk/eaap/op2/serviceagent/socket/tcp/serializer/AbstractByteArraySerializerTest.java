package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import java.io.IOException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractByteArraySerializerTest</code> contains tests for the class <code>{@link AbstractByteArraySerializer}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:14
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class AbstractByteArraySerializerTest {
	/**
	 * Run the void checkClosure(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testCheckClosure_1()
		throws Exception {
		ByteArrayCrLfSerializer fixture = new ByteArrayCrLfSerializer();
		fixture.maxMessageSize = 1;
		int bite = 1;

		fixture.checkClosure(bite);

		// add additional test code here
	}

	/**
	 * Run the void checkClosure(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testCheckClosure_2()
		throws Exception {
		ByteArrayCrLfSerializer fixture = new ByteArrayCrLfSerializer();
		fixture.maxMessageSize = 1;
		int bite = -1;

		fixture.checkClosure(bite);

		// add additional test code here
	}

	/**
	 * Run the byte[] copyToSizedArray(byte[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testCopyToSizedArray_1()
		throws Exception {
		ByteArrayCrLfSerializer fixture = new ByteArrayCrLfSerializer();
		fixture.maxMessageSize = 1;
		byte[] buffer = new byte[] {};
		int size = 1;

		byte[] result = fixture.copyToSizedArray(buffer, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.System.arraycopy(Native Method)
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.AbstractByteArraySerializer.copyToSizedArray(AbstractByteArraySerializer.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the byte[] copyToSizedArray(byte[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testCopyToSizedArray_2()
		throws Exception {
		ByteArrayCrLfSerializer fixture = new ByteArrayCrLfSerializer();
		fixture.maxMessageSize = 1;
		byte[] buffer = new byte[] {};
		int size = 1;

		byte[] result = fixture.copyToSizedArray(buffer, size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException
		//       at java.lang.System.arraycopy(Native Method)
		//       at com.ailk.eaap.op2.serviceagent.socket.tcp.serializer.AbstractByteArraySerializer.copyToSizedArray(AbstractByteArraySerializer.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the int getMaxMessageSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testGetMaxMessageSize_1()
		throws Exception {
		ByteArrayCrLfSerializer fixture = new ByteArrayCrLfSerializer();
		fixture.maxMessageSize = 1;

		int result = fixture.getMaxMessageSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setMaxMessageSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetMaxMessageSize_1()
		throws Exception {
		ByteArrayCrLfSerializer fixture = new ByteArrayCrLfSerializer();
		fixture.maxMessageSize = 1;
		int maxMessageSize = 1;

		fixture.setMaxMessageSize(maxMessageSize);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AbstractByteArraySerializerTest.class);
	}
}