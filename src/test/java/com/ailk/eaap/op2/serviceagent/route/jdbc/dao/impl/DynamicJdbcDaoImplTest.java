package com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.JdbcDataSource;

/**
 * The class <code>DynamicJdbcDaoImplTest</code> contains tests for the class <code>{@link DynamicJdbcDaoImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:59
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class DynamicJdbcDaoImplTest {
	/**
	 * Run the DynamicJdbcDaoImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testDynamicJdbcDaoImpl_1()
		throws Exception {
		DynamicJdbcDaoImpl result = new DynamicJdbcDaoImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addJdbcTemplate(int,JdbcTemplate,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testAddJdbcTemplate_1()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		JdbcTemplate jdbcTemplate = null;
		Integer tenantId = new Integer(1);

		fixture.addJdbcTemplate(dataSourceId, jdbcTemplate, tenantId);

		// add additional test code here
	}

	/**
	 * Run the void addJdbcTemplate(int,JdbcTemplate,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testAddJdbcTemplate_2()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Integer tenantId = null;

		fixture.addJdbcTemplate(dataSourceId, jdbcTemplate, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.addJdbcTemplate(DynamicJdbcDaoImpl.java:46)
	}

	/**
	 * Run the void addJdbcTemplate(int,JdbcTemplate,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testAddJdbcTemplate_3()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Integer tenantId = null;

		fixture.addJdbcTemplate(dataSourceId, jdbcTemplate, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.addJdbcTemplate(DynamicJdbcDaoImpl.java:46)
	}

	/**
	 * Run the void addJdbcTemplate(int,JdbcTemplate,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testAddJdbcTemplate_4()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Integer tenantId = new Integer(1);

		fixture.addJdbcTemplate(dataSourceId, jdbcTemplate, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.addJdbcTemplate(DynamicJdbcDaoImpl.java:46)
	}

	/**
	 * Run the List<JdbcDataSource> getAllDataSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetAllDataSource_1()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());

		List<JdbcDataSource> result = fixture.getAllDataSource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getAllDataSource(DynamicJdbcDaoImpl.java:23)
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcDataSource> getAllDataSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetAllDataSource_2()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());

		List<JdbcDataSource> result = fixture.getAllDataSource();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getAllDataSource(DynamicJdbcDaoImpl.java:23)
		assertNotNull(result);
	}

	/**
	 * Run the CsvTemplate getCsvTemplateById(int,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetCsvTemplateById_1()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int csvTemplateId = 1;
		Integer tenantId = new Integer(1);

		CsvTemplate result = fixture.getCsvTemplateById(csvTemplateId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getCsvTemplateById(DynamicJdbcDaoImpl.java:33)
		assertNotNull(result);
	}

	/**
	 * Run the CsvTemplate getCsvTemplateById(int,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetCsvTemplateById_2()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int csvTemplateId = 1;
		Integer tenantId = new Integer(1);

		CsvTemplate result = fixture.getCsvTemplateById(csvTemplateId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getCsvTemplateById(DynamicJdbcDaoImpl.java:33)
		assertNotNull(result);
	}

	/**
	 * Run the JdbcDataSource getDataSourceById(int,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetDataSourceById_1()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		Integer tenantId = new Integer(1);

		JdbcDataSource result = fixture.getDataSourceById(dataSourceId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getDataSourceById(DynamicJdbcDaoImpl.java:28)
		assertNotNull(result);
	}

	/**
	 * Run the JdbcDataSource getDataSourceById(int,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetDataSourceById_2()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		Integer tenantId = new Integer(1);

		JdbcDataSource result = fixture.getDataSourceById(dataSourceId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getDataSourceById(DynamicJdbcDaoImpl.java:28)
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplate getJdbcTemplate(int,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetJdbcTemplate_1()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		Integer tenantId = new Integer(1);

		JdbcTemplate result = fixture.getJdbcTemplate(dataSourceId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getJdbcTemplate(DynamicJdbcDaoImpl.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplate getJdbcTemplate(int,Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testGetJdbcTemplate_2()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		int dataSourceId = 1;
		Integer tenantId = new Integer(1);

		JdbcTemplate result = fixture.getJdbcTemplate(dataSourceId, tenantId);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl.getJdbcTemplate(DynamicJdbcDaoImpl.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheFactory(ICacheFactory) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	@Test
	public void testSetCacheFactory_1()
		throws Exception {
		DynamicJdbcDaoImpl fixture = new DynamicJdbcDaoImpl();
		fixture.setCacheFactory(new CacheFactory());
		ICacheFactory cacheFactory = new CacheFactory();

		fixture.setCacheFactory(cacheFactory);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:59
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
	 * @generatedBy CodePro at 15-12-21 下午4:59
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
	 * @generatedBy CodePro at 15-12-21 下午4:59
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DynamicJdbcDaoImplTest.class);
	}
}