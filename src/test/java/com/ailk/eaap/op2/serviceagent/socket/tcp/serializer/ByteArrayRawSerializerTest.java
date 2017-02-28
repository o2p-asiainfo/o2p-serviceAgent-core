package com.ailk.eaap.op2.serviceagent.socket.tcp.serializer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ByteArrayRawSerializerTest</code> contains tests for the class <code>{@link ByteArrayRawSerializer}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:14
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ByteArrayRawSerializerTest {
	/**
	 * Run the ByteArrayRawSerializer() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testByteArrayRawSerializer_1()
		throws Exception {
		ByteArrayRawSerializer result = new ByteArrayRawSerializer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the byte[] deserialize(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeserialize_1()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		InputStream inputStream = new PipedInputStream();

		byte[] result = fixture.deserialize(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] deserialize(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeserialize_2()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		InputStream inputStream = new PipedInputStream();

		byte[] result = fixture.deserialize(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] deserialize(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeserialize_3()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		InputStream inputStream = new PipedInputStream();

		byte[] result = fixture.deserialize(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] deserialize(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeserialize_4()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 0;
		InputStream inputStream = new PipedInputStream();

		byte[] result = fixture.deserialize(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] deserialize(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeserialize_5()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		InputStream inputStream = new PipedInputStream();

		byte[] result = fixture.deserialize(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] deserialize(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeserialize_6()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		InputStream inputStream = new PipedInputStream();

		byte[] result = fixture.deserialize(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] deserialize(InputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test(expected = java.io.IOException.class)
	public void testDeserialize_7()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		InputStream inputStream = new PipedInputStream();

		byte[] result = fixture.deserialize(inputStream);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void serialize(byte[],OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSerialize_1()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		byte[] bytes = new byte[] {};
		OutputStream outputStream = new ByteArrayOutputStream();

		fixture.serialize(bytes, outputStream);

		// add additional test code here
	}

	/**
	 * Run the void serialize(byte[],OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSerialize_2()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		byte[] bytes = new byte[] {};
		OutputStream outputStream = new ByteArrayOutputStream();

		fixture.serialize(bytes, outputStream);

		// add additional test code here
	}

	/**
	 * Run the void serialize(byte[],OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSerialize_3()
		throws Exception {
		ByteArrayRawSerializer fixture = new ByteArrayRawSerializer();
		fixture.maxMessageSize = 1;
		byte[] bytes = new byte[] {};
		OutputStream outputStream = new ByteArrayOutputStream();

		fixture.serialize(bytes, outputStream);

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
		new org.junit.runner.JUnitCore().run(ByteArrayRawSerializerTest.class);
	}
}