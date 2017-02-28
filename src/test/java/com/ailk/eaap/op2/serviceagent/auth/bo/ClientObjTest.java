package com.ailk.eaap.op2.serviceagent.auth.bo;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.bo.App;

/**
 * The class <code>ClientObjTest</code> contains tests for the class <code>{@link ClientObj}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:31
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ClientObjTest {
	/**
	 * Run the String getAccessToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetAccessToken_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");

		String result = fixture.getAccessToken();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the App getApp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetApp_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");

		App result = fixture.getApp();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPackageName());
		assertEquals(null, result.getAppName());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getComponentName());
		assertEquals(null, result.getFileContent());
		assertEquals(null, result.getMd5());
		assertEquals(null, result.getTenantId());
		assertEquals(null, result.getOauthApiList());
		assertEquals(null, result.getPhoneNum());
		assertEquals(null, result.getApiMethod());
		assertEquals(null, result.getAppSumma());
		assertEquals(null, result.getComponentCode());
		assertEquals(null, result.getAppDesc());
		assertEquals(null, result.getAppUrl());
		assertEquals(null, result.getAppId());
		assertEquals(null, result.getAppDeve());
		assertEquals(null, result.getComponentId());
		assertEquals(null, result.getAppType());
		assertEquals(null, result.getAppOauthType());
		assertEquals(null, result.getAppkey());
		assertEquals(null, result.getAppsecure());
		assertEquals(null, result.getAppCreateTime());
		assertEquals(null, result.getAppState());
		assertEquals(null, result.getAppCallbackUrl());
		assertEquals(null, result.getSfileId());
		assertEquals(null, result.getAudutFlowId());
		assertEquals(null, result.getAppApiList());
		assertEquals(null, result.getOauthCode());
		assertEquals(null, result.getTokenEnableTime());
	}

	/**
	 * Run the String getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetCode_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");

		String result = fixture.getCode();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getRedirectUri() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetRedirectUri_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");

		String result = fixture.getRedirectUri();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getRefreshToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetRefreshToken_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");

		String result = fixture.getRefreshToken();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setAccessToken(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetAccessToken_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");
		String accessToken = "";

		fixture.setAccessToken(accessToken);

		// add additional test code here
	}

	/**
	 * Run the void setApp(App) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetApp_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");
		App app = new App();

		fixture.setApp(app);

		// add additional test code here
	}

	/**
	 * Run the void setCode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetCode_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");
		String code = "";

		fixture.setCode(code);

		// add additional test code here
	}

	/**
	 * Run the void setRedirectUri(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetRedirectUri_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");
		String redirectUri = "";

		fixture.setRedirectUri(redirectUri);

		// add additional test code here
	}

	/**
	 * Run the void setRefreshToken(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetRefreshToken_1()
		throws Exception {
		ClientObj fixture = new ClientObj();
		fixture.setCode("");
		fixture.setRedirectUri("");
		fixture.setApp(new App());
		fixture.setAccessToken("");
		fixture.setRefreshToken("");
		String refreshToken = "";

		fixture.setRefreshToken(refreshToken);

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
		new org.junit.runner.JUnitCore().run(ClientObjTest.class);
	}
}