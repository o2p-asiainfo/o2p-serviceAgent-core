package com.ailk.eaap.op2.serviceagent.common;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import javax.net.ssl.X509TrustManager;
import org.apache.commons.net.ftp.FTPSTrustManager;
import org.junit.*;
import static org.junit.Assert.*;
import com.safenetinc.luna.LunaTokenObject;
import com.safenetinc.luna.provider.LunaCertificateX509;
import com.safenetinc.luna.provider.key.LunaPrivateKeyDh;
import com.safenetinc.luna.provider.key.LunaPublicKeyDh;

/**
 * The class <code>AuthSSLX509TrustManagerTest</code> contains tests for the class <code>{@link AuthSSLX509TrustManager}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:46
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class AuthSSLX509TrustManagerTest {
	/**
	 * Run the AuthSSLX509TrustManager(X509TrustManager) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testAuthSSLX509TrustManager_1()
		throws Exception {
		X509TrustManager defaultTrustManager = new FTPSTrustManager();

		AuthSSLX509TrustManager result = new AuthSSLX509TrustManager(defaultTrustManager);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthSSLX509TrustManager(X509TrustManager) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testAuthSSLX509TrustManager_2()
		throws Exception {
		X509TrustManager defaultTrustManager = null;

		AuthSSLX509TrustManager result = new AuthSSLX509TrustManager(defaultTrustManager);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void checkClientTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckClientTrusted_1()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {LunaCertificateX509.SelfSign(new KeyPair(new LunaPublicKeyDh(LunaTokenObject.LocateKeyByAlias("")), new LunaPrivateKeyDh(LunaTokenObject.LocateKeyByAlias(""))), "", new BigInteger("-987654321"), new Date(1591115236000L), new Date(1591115236000L))};
		String authType = "";

		fixture.checkClientTrusted(certificates, authType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at com.safenetinc.luna.LunaSlotManager.<init>(LunaSlotManager.java:62)
		//       at com.safenetinc.luna.LunaSlotManager.getInstance(LunaSlotManager.java:133)
		//       at com.safenetinc.luna.LunaTokenObject.<clinit>(LunaTokenObject.java:49)
	}

	/**
	 * Run the void checkClientTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckClientTrusted_2()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {LunaCertificateX509.SelfSign(new KeyPair(new LunaPublicKeyDh(LunaTokenObject.LocateKeyByAlias("")), new LunaPrivateKeyDh(LunaTokenObject.LocateKeyByAlias(""))), "", new BigInteger("-987654321"), new Date(1591115236000L), new Date(1591115236000L))};
		String authType = "";

		fixture.checkClientTrusted(certificates, authType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.safenetinc.luna.LunaTokenObject
	}

	/**
	 * Run the void checkClientTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckClientTrusted_3()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {};
		String authType = "";

		fixture.checkClientTrusted(certificates, authType);

		// add additional test code here
	}

	/**
	 * Run the void checkClientTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckClientTrusted_4()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {};
		String authType = "";

		fixture.checkClientTrusted(certificates, authType);

		// add additional test code here
	}

	/**
	 * Run the void checkClientTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckClientTrusted_5()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {};
		String authType = "";

		fixture.checkClientTrusted(certificates, authType);

		// add additional test code here
	}

	/**
	 * Run the void checkServerTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckServerTrusted_1()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {LunaCertificateX509.SelfSign(new KeyPair(new LunaPublicKeyDh(LunaTokenObject.LocateKeyByAlias("")), new LunaPrivateKeyDh(LunaTokenObject.LocateKeyByAlias(""))), "", new BigInteger("-987654321"), new Date(1591115236000L), new Date(1591115236000L))};
		String authType = "";

		fixture.checkServerTrusted(certificates, authType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.safenetinc.luna.LunaTokenObject
	}

	/**
	 * Run the void checkServerTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckServerTrusted_2()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {LunaCertificateX509.SelfSign(new KeyPair(new LunaPublicKeyDh(LunaTokenObject.LocateKeyByAlias("")), new LunaPrivateKeyDh(LunaTokenObject.LocateKeyByAlias(""))), "", new BigInteger("-987654321"), new Date(1591115236000L), new Date(1591115236000L))};
		String authType = "";

		fixture.checkServerTrusted(certificates, authType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.safenetinc.luna.LunaTokenObject
	}

	/**
	 * Run the void checkServerTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckServerTrusted_3()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {};
		String authType = "";

		fixture.checkServerTrusted(certificates, authType);

		// add additional test code here
	}

	/**
	 * Run the void checkServerTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckServerTrusted_4()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {};
		String authType = "";

		fixture.checkServerTrusted(certificates, authType);

		// add additional test code here
	}

	/**
	 * Run the void checkServerTrusted(X509Certificate[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testCheckServerTrusted_5()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());
		X509Certificate[] certificates = new X509Certificate[] {};
		String authType = "";

		fixture.checkServerTrusted(certificates, authType);

		// add additional test code here
	}

	/**
	 * Run the X509Certificate[] getAcceptedIssuers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetAcceptedIssuers_1()
		throws Exception {
		AuthSSLX509TrustManager fixture = new AuthSSLX509TrustManager(new FTPSTrustManager());

		X509Certificate[] result = fixture.getAcceptedIssuers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
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
		new org.junit.runner.JUnitCore().run(AuthSSLX509TrustManagerTest.class);
	}
}