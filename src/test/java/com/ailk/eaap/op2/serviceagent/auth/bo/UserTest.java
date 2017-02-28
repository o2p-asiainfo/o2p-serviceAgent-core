package com.ailk.eaap.op2.serviceagent.auth.bo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UserTest</code> contains tests for the class <code>{@link User}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:31
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class UserTest {
	/**
	 * Run the User() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testUser_1()
		throws Exception {
		User result = new User();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getPassword() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetPassword_1()
		throws Exception {
		User fixture = new User();
		fixture.setPhoneNumbetr("");
		fixture.setPassword("");

		String result = fixture.getPassword();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getPhoneNumbetr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetPhoneNumbetr_1()
		throws Exception {
		User fixture = new User();
		fixture.setPhoneNumbetr("");
		fixture.setPassword("");

		String result = fixture.getPhoneNumbetr();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetPassword_1()
		throws Exception {
		User fixture = new User();
		fixture.setPhoneNumbetr("");
		fixture.setPassword("");
		String password = "";

		fixture.setPassword(password);

		// add additional test code here
	}

	/**
	 * Run the void setPhoneNumbetr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetPhoneNumbetr_1()
		throws Exception {
		User fixture = new User();
		fixture.setPhoneNumbetr("");
		fixture.setPassword("");
		String phoneNumbetr = "";

		fixture.setPhoneNumbetr(phoneNumbetr);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
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
	 * @generatedBy CodePro at 15-12-21 下午4:31
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
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserTest.class);
	}
}