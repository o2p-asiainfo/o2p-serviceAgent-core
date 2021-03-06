package com.ailk.eaap.op2.serviceagent.route.jdbc.extend;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MysqlSqlParserTest</code> contains tests for the class <code>{@link MysqlSqlParser}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:40
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MysqlSqlParserTest {
	/**
	 * Run the String formatToPage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:40
	 */
	@Test
	public void testFormatToPage_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		String sql = "";

		String result = fixture.formatToPage(sql);

		// add additional test code here
		assertEquals(" limit {start}, {limit}", result);
	}

	/**
	 * Run the String formatToPage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:40
	 */
	@Test
	public void testFormatToPage_2()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		String sql = "";

		String result = fixture.formatToPage(sql);

		// add additional test code here
		assertEquals(" limit {start}, {limit}", result);
	}

	/**
	 * Run the void initPage(int,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:40
	 */
	@Test
	public void testInitPage_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		int start = 1;
		int limit = 1;
		String sql = "";

		fixture.initPage(start, limit, sql);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:40
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
	 * @generatedBy CodePro at 15-11-12 下午7:40
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
	 * @generatedBy CodePro at 15-11-12 下午7:40
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MysqlSqlParserTest.class);
	}
}