package com.ailk.eaap.op2.serviceagent.route.jdbc;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ailk.eaap.op2.bo.JdbcDataSource;

/**
 * The class <code>JdbcTemplateFactoryTest</code> contains tests for the class <code>{@link JdbcTemplateFactory}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:55
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class JdbcTemplateFactoryTest {
	/**
	 * Run the JdbcTemplateFactory() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testJdbcTemplateFactory_1()
		throws Exception {
		JdbcTemplateFactory result = new JdbcTemplateFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the JdbcTemplate createJdbcTemplate(JdbcDataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testCreateJdbcTemplate_1()
		throws Exception {
		JdbcTemplateFactory fixture = new JdbcTemplateFactory();
		JdbcDataSource jdbcDataSource = new JdbcDataSource();
		jdbcDataSource.setDataSourceId(1);
		jdbcDataSource.setJndiName("");

		JdbcTemplate result = fixture.createJdbcTemplate(jdbcDataSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory.<clinit>(JdbcTemplateFactory.java:15)
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplate createJdbcTemplate(JdbcDataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testCreateJdbcTemplate_2()
		throws Exception {
		JdbcTemplateFactory fixture = new JdbcTemplateFactory();
		JdbcDataSource jdbcDataSource = new JdbcDataSource();
		jdbcDataSource.setJndiName("");

		JdbcTemplate result = fixture.createJdbcTemplate(jdbcDataSource);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(JdbcTemplateFactoryTest.class);
	}
}