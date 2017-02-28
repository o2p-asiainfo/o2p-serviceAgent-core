package com.ailk.eaap.op2.serviceagent.route.jdbc;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ailk.eaap.op2.serviceagent.route.jdbc.dao.DynamicJdbcDao;
import com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl;

/**
 * The class <code>JdbcTemplateCacheTest</code> contains tests for the class <code>{@link JdbcTemplateCache}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:55
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class JdbcTemplateCacheTest {
	/**
	 * Run the DynamicJdbcDao getDynamicJdbcDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetDynamicJdbcDao_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());

		DynamicJdbcDao result = fixture.getDynamicJdbcDao();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplate getJdbcTemplate(Integer,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetJdbcTemplate_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());
		Integer dataSourceId = new Integer(1);
		Integer tenantId = new Integer(1);

		JdbcTemplate result = fixture.getJdbcTemplate(dataSourceId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplate getJdbcTemplate(Integer,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetJdbcTemplate_2()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());
		Integer dataSourceId = new Integer(1);
		Integer tenantId = new Integer(1);

		JdbcTemplate result = fixture.getJdbcTemplate(dataSourceId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplate getJdbcTemplate(Integer,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetJdbcTemplate_3()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());
		Integer dataSourceId = new Integer(1);
		Integer tenantId = new Integer(1);

		JdbcTemplate result = fixture.getJdbcTemplate(dataSourceId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplateFactory getJdbcTemplateFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetJdbcTemplateFactory_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());

		JdbcTemplateFactory result = fixture.getJdbcTemplateFactory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
		assertNotNull(result);
	}

	/**
	 * Run the DynamicJdbcDao getdynamicJdbcDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testGetdynamicJdbcDao_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());

		DynamicJdbcDao result = fixture.getdynamicJdbcDao();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
		assertNotNull(result);
	}

	/**
	 * Run the void initJdbcTemplateCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testInitJdbcTemplateCache_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());

		fixture.initJdbcTemplateCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory.<clinit>(JdbcTemplateFactory.java:15)
	}

	/**
	 * Run the void setDynamicJdbcDao(DynamicJdbcDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testSetDynamicJdbcDao_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());
		DynamicJdbcDao dynamicJdbcDao = new DynamicJdbcDaoImpl();

		fixture.setDynamicJdbcDao(dynamicJdbcDao);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
	}

	/**
	 * Run the void setJdbcTemplateFactory(JdbcTemplateFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testSetJdbcTemplateFactory_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());
		JdbcTemplateFactory jdbcTemplateFactory = new JdbcTemplateFactory();

		fixture.setJdbcTemplateFactory(jdbcTemplateFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
	}

	/**
	 * Run the void setdynamicJdbcDao(DynamicJdbcDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:55
	 */
	@Test
	public void testSetdynamicJdbcDao_1()
		throws Exception {
		JdbcTemplateCache fixture = new JdbcTemplateCache();
		fixture.setdynamicJdbcDao(new DynamicJdbcDaoImpl());
		fixture.setJdbcTemplateFactory(new JdbcTemplateFactory());
		DynamicJdbcDao dynamicJdbcDao = new DynamicJdbcDaoImpl();

		fixture.setdynamicJdbcDao(dynamicJdbcDao);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateFactory
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
		new org.junit.runner.JUnitCore().run(JdbcTemplateCacheTest.class);
	}
}