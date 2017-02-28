package com.ailk.eaap.op2.serviceagent.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JdbcParamTest</code> contains tests for the class <code>{@link JdbcParam}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:46
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class JdbcParamTest {
	/**
	 * Run the String getParamName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetParamName_1()
		throws Exception {
		JdbcParam fixture = new JdbcParam();
		fixture.setParamType("");
		fixture.setParamValue("");
		fixture.setParamName("");

		String result = fixture.getParamName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getParamType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetParamType_1()
		throws Exception {
		JdbcParam fixture = new JdbcParam();
		fixture.setParamType("");
		fixture.setParamValue("");
		fixture.setParamName("");

		String result = fixture.getParamType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getParamValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetParamValue_1()
		throws Exception {
		JdbcParam fixture = new JdbcParam();
		fixture.setParamType("");
		fixture.setParamValue("");
		fixture.setParamName("");

		String result = fixture.getParamValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setParamName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetParamName_1()
		throws Exception {
		JdbcParam fixture = new JdbcParam();
		fixture.setParamType("");
		fixture.setParamValue("");
		fixture.setParamName("");
		String paramName = "";

		fixture.setParamName(paramName);

		// add additional test code here
	}

	/**
	 * Run the void setParamType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetParamType_1()
		throws Exception {
		JdbcParam fixture = new JdbcParam();
		fixture.setParamType("");
		fixture.setParamValue("");
		fixture.setParamName("");
		String paramType = "";

		fixture.setParamType(paramType);

		// add additional test code here
	}

	/**
	 * Run the void setParamValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetParamValue_1()
		throws Exception {
		JdbcParam fixture = new JdbcParam();
		fixture.setParamType("");
		fixture.setParamValue("");
		fixture.setParamName("");
		String paramValue = "";

		fixture.setParamValue(paramValue);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
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
	 * @generatedBy CodePro at 15-12-21 下午4:46
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
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JdbcParamTest.class);
	}
}