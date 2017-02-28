package com.ailk.eaap.op2.serviceagent.auto;

import java.sql.ResultSet;
import javax.sql.DataSource;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.bo.JdbcDataSource;

/**
 * The class <code>EndPointDataSourceTest</code> contains tests for the class <code>{@link EndPointDataSource}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:31
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class EndPointDataSourceTest {
	/**
	 * Run the EndPointDataSource(DataSource) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testEndPointDataSource_1()
		throws Exception {
		DataSource dataSource = new JdbcDataSource();

		EndPointDataSource result = new EndPointDataSource(dataSource);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void closeConn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testCloseConn_1()
		throws Exception {
		EndPointDataSource fixture = new EndPointDataSource(new JdbcDataSource());

		fixture.closeConn();

		// add additional test code here
	}

	/**
	 * Run the void closeConn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testCloseConn_2()
		throws Exception {
		EndPointDataSource fixture = new EndPointDataSource(new JdbcDataSource());

		fixture.closeConn();

		// add additional test code here
	}

	/**
	 * Run the void closeConn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testCloseConn_3()
		throws Exception {
		EndPointDataSource fixture = new EndPointDataSource(new JdbcDataSource());

		fixture.closeConn();

		// add additional test code here
	}

	/**
	 * Run the ResultSet getDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetDate_1()
		throws Exception {
		EndPointDataSource fixture = new EndPointDataSource(new JdbcDataSource());
		String sql = "";

		ResultSet result = fixture.getDate(sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auto.EndPointDataSource.getDate(EndPointDataSource.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the ResultSet getDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testGetDate_2()
		throws Exception {
		EndPointDataSource fixture = new EndPointDataSource(new JdbcDataSource());
		String sql = "";

		ResultSet result = fixture.getDate(sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auto.EndPointDataSource.getDate(EndPointDataSource.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the int setDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetDate_1()
		throws Exception {
		EndPointDataSource fixture = new EndPointDataSource(new JdbcDataSource());
		String sql = "";

		int result = fixture.setDate(sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auto.EndPointDataSource.setDate(EndPointDataSource.java:73)
		assertEquals(0, result);
	}

	/**
	 * Run the int setDate(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:31
	 */
	@Test
	public void testSetDate_2()
		throws Exception {
		EndPointDataSource fixture = new EndPointDataSource(new JdbcDataSource());
		String sql = "";

		int result = fixture.setDate(sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.auto.EndPointDataSource.setDate(EndPointDataSource.java:73)
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(EndPointDataSourceTest.class);
	}
}