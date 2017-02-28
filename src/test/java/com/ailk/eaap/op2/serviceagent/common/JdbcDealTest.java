package com.ailk.eaap.op2.serviceagent.common;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ailk.eaap.op2.bo.Endpoint;

/**
 * The class <code>JdbcDealTest</code> contains tests for the class <code>{@link JdbcDeal}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:32
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class JdbcDealTest {
	/**
	 * Run the JdbcDeal() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testJdbcDeal_1()
		throws Exception {
		JdbcDeal result = new JdbcDeal();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Map<String, Object> callProcedure(String,List<JdbcParam>,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testCallProcedure_1()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = new Vector();
		List<JdbcParam> outs = new Vector();

		Map<String, Object> result = fixture.callProcedure(sql, ins, outs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> callProcedure(String,List<JdbcParam>,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testCallProcedure_2()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = new Vector();
		List<JdbcParam> outs = new Vector();

		Map<String, Object> result = fixture.callProcedure(sql, ins, outs);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the JdbcTemplate getJdbcTemplate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testGetJdbcTemplate_1()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());

		JdbcTemplate result = fixture.getJdbcTemplate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_1()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setInDataTypeCode("XML");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_2()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setInDataTypeCode("");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_3()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_4()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setInDataTypeCode("UrlGet");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_5()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setInDataTypeCode("");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_6()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		endpoint.setInDataTypeCode("XML");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_7()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		endpoint.setInDataTypeCode("XML");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_8()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		endpoint.setInDataTypeCode("XML");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_9()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setAttrMap(new IdentityHashMap());
		endpoint.setInDataTypeCode("XML");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_10()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();
		endpoint.setInDataTypeCode("XML");

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_11()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_12()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_13()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_14()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_15()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the List<JdbcParam> parseParam(String,MessageBO,Endpoint) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testParseParam_16()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String params = "";
		MessageBO msg = new MessageBO();
		Endpoint endpoint = new Endpoint();

		List<JdbcParam> result = fixture.parseParam(params, msg, endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> querySQL(String,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testQuerySQL_1()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = new Vector();

		Map<String, Object> result = fixture.querySQL(sql, ins);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.common.JdbcDeal.<clinit>(JdbcDeal.java:44)
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> querySQL(String,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testQuerySQL_2()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = new Vector();

		Map<String, Object> result = fixture.querySQL(sql, ins);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> querySQL(String,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testQuerySQL_3()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = new Vector();

		Map<String, Object> result = fixture.querySQL(sql, ins);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> querySQL(String,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testQuerySQL_4()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = null;

		Map<String, Object> result = fixture.querySQL(sql, ins);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> querySQL(String,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testQuerySQL_5()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = new Vector();

		Map<String, Object> result = fixture.querySQL(sql, ins);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Object> querySQL(String,List<JdbcParam>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testQuerySQL_6()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		String sql = "";
		List<JdbcParam> ins = new Vector();

		Map<String, Object> result = fixture.querySQL(sql, ins);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
		assertNotNull(result);
	}

	/**
	 * Run the void setJdbcTemplate(JdbcTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:32
	 */
	@Test
	public void testSetJdbcTemplate_1()
		throws Exception {
		JdbcDeal fixture = new JdbcDeal();
		fixture.setJdbcTemplate(new JdbcTemplate());
		JdbcTemplate jdbcTemplate = new JdbcTemplate();

		fixture.setJdbcTemplate(jdbcTemplate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.common.JdbcDeal
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
		new org.junit.runner.JUnitCore().run(JdbcDealTest.class);
	}
}