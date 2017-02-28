package com.ailk.eaap.op2.serviceagent.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReadPropertiesTest</code> contains tests for the class <code>{@link ReadProperties}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:32
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ReadPropertiesTest {
	/**
	 * Run the String getFileName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testGetFileName_1()
		throws Exception {

		String result = ReadProperties.getFileName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ReadProperties getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		ReadProperties result = ReadProperties.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ReadProperties getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		ReadProperties result = ReadProperties.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readValueBykey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testReadValueBykey_1()
		throws Exception {
		String key = "";

		String result = ReadProperties.readValueBykey(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setFileName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSetFileName_1()
		throws Exception {
		String fileName = "";

		ReadProperties.setFileName(fileName);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
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
	 * @generatedBy CodePro at 15-12-21 下午4:32
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
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ReadPropertiesTest.class);
	}
}