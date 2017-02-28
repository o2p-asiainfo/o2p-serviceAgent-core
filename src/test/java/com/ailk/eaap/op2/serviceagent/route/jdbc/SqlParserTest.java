package com.ailk.eaap.op2.serviceagent.route.jdbc;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.route.jdbc.extend.MysqlSqlParser;

/**
 * The class <code>SqlParserTest</code> contains tests for the class <code>{@link SqlParser}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:55
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SqlParserTest {
	/**
	 * Run the int getEnd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetEnd_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;

		int result = fixture.getEnd();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getLimit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetLimit_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;

		int result = fixture.getLimit();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getSql() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetSql_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;

		String result = fixture.getSql();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getStart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetStart_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;

		int result = fixture.getStart();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void nextPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testNextPage_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;

		fixture.nextPage();

		// add additional test code here
	}

	/**
	 * Run the String parseSqlToPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testParseSqlToPage_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;

		String result = fixture.parseSqlToPage();

		// add additional test code here
		assertEquals(" limit 1, 1", result);
	}

	/**
	 * Run the String parseSqlToPage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testParseSqlToPage_2()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;

		String result = fixture.parseSqlToPage();

		// add additional test code here
		assertEquals(" limit 1, 1", result);
	}

	/**
	 * Run the void setEnd(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testSetEnd_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;
		int end = 1;

		fixture.setEnd(end);

		// add additional test code here
	}

	/**
	 * Run the void setLimit(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testSetLimit_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;
		int limit = 1;

		fixture.setLimit(limit);

		// add additional test code here
	}

	/**
	 * Run the void setSql(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testSetSql_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;
		String sql = "";

		fixture.setSql(sql);

		// add additional test code here
	}

	/**
	 * Run the void setStart(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testSetStart_1()
		throws Exception {
		MysqlSqlParser fixture = new MysqlSqlParser();
		fixture.initPage(1, 1, "");
		fixture.end = 1;
		int start = 1;

		fixture.setStart(start);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
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
	 * @generatedBy CodePro at 15-12-21 下午4:55
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
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SqlParserTest.class);
	}
}