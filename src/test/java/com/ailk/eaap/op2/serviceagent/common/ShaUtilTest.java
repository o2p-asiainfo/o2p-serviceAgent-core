package com.ailk.eaap.op2.serviceagent.common;

import java.security.NoSuchAlgorithmException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ShaUtilTest</code> contains tests for the class <code>{@link ShaUtil}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:32
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ShaUtilTest {
	/**
	 * Run the String sha224(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testSha224_1()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha224(reqStr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String sha224(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test(expected = java.security.NoSuchAlgorithmException.class)
	public void testSha224_2()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha224(reqStr);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String sha256(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSha256_1()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha256(reqStr);

		// add additional test code here
		assertEquals("E3B0C44298FC1C149AFBF4C8996FB92427AE41E4649B934CA495991B7852B855", result);
	}

	/**
	 * Run the String sha256(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSha256_2()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha256(reqStr);

		// add additional test code here
		assertEquals("E3B0C44298FC1C149AFBF4C8996FB92427AE41E4649B934CA495991B7852B855", result);
	}

	/**
	 * Run the String sha384(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSha384_1()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha384(reqStr);

		// add additional test code here
		assertEquals("38B060A751AC96384CD9327EB1B1E36A21FDB71114BE07434C0CC7BF63F6E1DA274EDEBFE76F65FBD51AD2F14898B95B", result);
	}

	/**
	 * Run the String sha384(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSha384_2()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha384(reqStr);

		// add additional test code here
		assertEquals("38B060A751AC96384CD9327EB1B1E36A21FDB71114BE07434C0CC7BF63F6E1DA274EDEBFE76F65FBD51AD2F14898B95B", result);
	}

	/**
	 * Run the String sha512(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSha512_1()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha512(reqStr);

		// add additional test code here
		assertEquals("CF83E1357EEFB8BDF1542850D66D8007D620E4050B5715DC83F4A921D36CE9CE47D0D13C5D85F2B0FF8318D2877EEC2F63B931BD47417A81A538327AF927DA3E", result);
	}

	/**
	 * Run the String sha512(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSha512_2()
		throws Exception {
		String reqStr = "";

		String result = ShaUtil.sha512(reqStr);

		// add additional test code here
		assertEquals("CF83E1357EEFB8BDF1542850D66D8007D620E4050B5715DC83F4A921D36CE9CE47D0D13C5D85F2B0FF8318D2877EEC2F63B931BD47417A81A538327AF927DA3E", result);
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
		new org.junit.runner.JUnitCore().run(ShaUtilTest.class);
	}
}