package com.ailk.eaap.op2.serviceagent.auth.service;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.auth.bo.JsonObject;

/**
 * The class <code>ServerOAuthTest</code> contains tests for the class <code>{@link ServerOAuth}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:31
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ServerOAuthTest {
	/**
	 * Run the ServerOAuth() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testServerOAuth_1()
		throws Exception {
		ServerOAuth result = new ServerOAuth();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String generalAccessToken(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGeneralAccessToken_1()
		throws Exception {
		String client_id = "";
		String key = "";

		String result = ServerOAuth.generalAccessToken(client_id, key);

		// add additional test code here
		assertEquals("65859e0ede8c865c7754464a89163b80", result);
	}

	/**
	 * Run the void genericAccessToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGenericAccessToken_1()
		throws Exception {

		ServerOAuth.genericAccessToken();

		// add additional test code here
	}

	/**
	 * Run the String genericCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGenericCode_1()
		throws Exception {
		String client_id = "";

		String result = ServerOAuth.genericCode(client_id);

		// add additional test code here
		assertEquals("d0c0e1654bc9a941c8e9be38bab83605", result);
	}

	/**
	 * Run the JsonObject getJson() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetJson_1()
		throws Exception {

		JsonObject result = ServerOAuth.getJson();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getAccessTokenByCode());
	}

	/**
	 * Run the boolean isPermitted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testIsPermitted_1()
		throws Exception {

		boolean result = ServerOAuth.isPermitted();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auth.service.ServerOAuth.isPermitted(ServerOAuth.java:24)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testIsPermitted_2()
		throws Exception {

		boolean result = ServerOAuth.isPermitted();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auth.service.ServerOAuth.isPermitted(ServerOAuth.java:24)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testIsPermitted_3()
		throws Exception {

		boolean result = ServerOAuth.isPermitted();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auth.service.ServerOAuth.isPermitted(ServerOAuth.java:24)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testIsPermitted_4()
		throws Exception {

		boolean result = ServerOAuth.isPermitted();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auth.service.ServerOAuth.isPermitted(ServerOAuth.java:24)
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testIsPermitted_5()
		throws Exception {

		boolean result = ServerOAuth.isPermitted();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auth.service.ServerOAuth.isPermitted(ServerOAuth.java:24)
		assertTrue(result);
	}

	/**
	 * Run the void setJson(JsonObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetJson_1()
		throws Exception {
		JsonObject json = new JsonObject();

		ServerOAuth.setJson(json);

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
		new org.junit.runner.JUnitCore().run(ServerOAuthTest.class);
	}
}