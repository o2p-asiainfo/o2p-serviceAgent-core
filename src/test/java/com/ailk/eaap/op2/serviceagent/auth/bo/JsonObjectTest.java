package com.ailk.eaap.op2.serviceagent.auth.bo;

import java.util.IdentityHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JsonObjectTest</code> contains tests for the class <code>{@link JsonObject}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:31
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class JsonObjectTest {
	/**
	 * Run the JsonObject() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testJsonObject_1()
		throws Exception {
		JsonObject result = new JsonObject();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void authorizationGrant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testAuthorizationGrant_1()
		throws Exception {
		JsonObject fixture = new JsonObject();
		fixture.setOauthMap(new IdentityHashMap());

		fixture.authorizationGrant();

		// add additional test code here
	}

	/**
	 * Run the Map<String, Map<String, String>> authorizationGrant(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testAuthorizationGrant_2()
		throws Exception {
		JsonObject fixture = new JsonObject();
		fixture.setOauthMap(new IdentityHashMap());
		String client_id = "";
		String client_secret = "";
		String redirect_uri = "";

		Map<String, Map<String, String>> result = fixture.authorizationGrant(client_id, client_secret, redirect_uri);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void authorizationRequest(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testAuthorizationRequest_1()
		throws Exception {
		JsonObject fixture = new JsonObject();
		fixture.setOauthMap(new IdentityHashMap());
		String client_id = "";
		String client_secret = "";
		String redirect_uri = "";

		fixture.authorizationRequest(client_id, client_secret, redirect_uri);

		// add additional test code here
	}

	/**
	 * Run the String getAccessTokenByCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetAccessTokenByCode_1()
		throws Exception {
		JsonObject fixture = new JsonObject();
		fixture.setOauthMap(new IdentityHashMap());

		String result = fixture.getAccessTokenByCode();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<String, String> getOauthMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetOauthMap_1()
		throws Exception {
		JsonObject fixture = new JsonObject();
		fixture.setOauthMap(new IdentityHashMap());

		Map<String, String> result = fixture.getOauthMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setOauthMap(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetOauthMap_1()
		throws Exception {
		JsonObject fixture = new JsonObject();
		fixture.setOauthMap(new IdentityHashMap());
		Map<String, String> oauthMap = new IdentityHashMap();

		fixture.setOauthMap(oauthMap);

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
		new org.junit.runner.JUnitCore().run(JsonObjectTest.class);
	}
}