package com.ailk.eaap.op2.serviceagent.route.jdbc;

import java.io.File;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.jdbc.dao.DynamicJdbcDao;
import com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl.DynamicJdbcDaoImpl;
import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.JdbcDataSource;

/**
 * The class <code>SqlExcutorServiceImplTest</code> contains tests for the class <code>{@link SqlExcutorServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:56
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SqlExcutorServiceImplTest {
	/**
	 * Run the SqlExcutorServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testSqlExcutorServiceImpl_1()
		throws Exception {
		SqlExcutorServiceImpl result = new SqlExcutorServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the List<Map<String, Object>> doExcuteSql(JdbcTemplate,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testDoExcuteSql_1()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String sql = "";

		List<Map<String, Object>> result = fixture.doExcuteSql(jdbcTemplate, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No DataSource specified
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:97)
		//       at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:77)
		//       at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:391)
		//       at org.springframework.jdbc.core.JdbcTemplate.query(JdbcTemplate.java:471)
		//       at org.springframework.jdbc.core.JdbcTemplate.query(JdbcTemplate.java:481)
		//       at org.springframework.jdbc.core.JdbcTemplate.queryForList(JdbcTemplate.java:521)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.doExcuteSql(SqlExcutorServiceImpl.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> doExcuteSql(JdbcTemplate,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testDoExcuteSql_2()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String sql = "";

		List<Map<String, Object>> result = fixture.doExcuteSql(jdbcTemplate, sql);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No DataSource specified
		//       at org.springframework.util.Assert.notNull(Assert.java:112)
		//       at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:97)
		//       at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:77)
		//       at org.springframework.jdbc.core.JdbcTemplate.execute(JdbcTemplate.java:391)
		//       at org.springframework.jdbc.core.JdbcTemplate.query(JdbcTemplate.java:471)
		//       at org.springframework.jdbc.core.JdbcTemplate.query(JdbcTemplate.java:481)
		//       at org.springframework.jdbc.core.JdbcTemplate.queryForList(JdbcTemplate.java:521)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.doExcuteSql(SqlExcutorServiceImpl.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteNoPageSQL(String,JdbcTemplate,String,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteNoPageSQL_1()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		boolean isExportCsv = true;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excuteNoPageSQL(tempPath, jdbcTemplate, jdbcSql, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteNoPageSQL(String,JdbcTemplate,String,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteNoPageSQL_2()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		boolean isExportCsv = true;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excuteNoPageSQL(tempPath, jdbcTemplate, jdbcSql, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteNoPageSQL(String,JdbcTemplate,String,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteNoPageSQL_3()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		boolean isExportCsv = false;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excuteNoPageSQL(tempPath, jdbcTemplate, jdbcSql, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteNoPageSQL(String,JdbcTemplate,String,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteNoPageSQL_4()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		boolean isExportCsv = true;
		CsvTemplate csvTemplate = null;
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excuteNoPageSQL(tempPath, jdbcTemplate, jdbcSql, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excutePageSQL(String,JdbcTemplate,String,int,int,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcutePageSQL_1()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		int startLine = 1;
		int limit = 1;
		boolean isExportCsv = false;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excutePageSQL(tempPath, jdbcTemplate, jdbcSql, startLine, limit, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excutePageSQL(SqlExcutorServiceImpl.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excutePageSQL(String,JdbcTemplate,String,int,int,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcutePageSQL_2()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		int startLine = 1;
		int limit = 1;
		boolean isExportCsv = true;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excutePageSQL(tempPath, jdbcTemplate, jdbcSql, startLine, limit, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excutePageSQL(SqlExcutorServiceImpl.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excutePageSQL(String,JdbcTemplate,String,int,int,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcutePageSQL_3()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		int startLine = 1;
		int limit = 1;
		boolean isExportCsv = true;
		CsvTemplate csvTemplate = null;
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excutePageSQL(tempPath, jdbcTemplate, jdbcSql, startLine, limit, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excutePageSQL(SqlExcutorServiceImpl.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excutePageSQL(String,JdbcTemplate,String,int,int,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcutePageSQL_4()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		int startLine = 1;
		int limit = 1;
		boolean isExportCsv = false;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excutePageSQL(tempPath, jdbcTemplate, jdbcSql, startLine, limit, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excutePageSQL(SqlExcutorServiceImpl.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excutePageSQL(String,JdbcTemplate,String,int,int,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcutePageSQL_5()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		int startLine = 1;
		int limit = 1;
		boolean isExportCsv = true;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excutePageSQL(tempPath, jdbcTemplate, jdbcSql, startLine, limit, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excutePageSQL(SqlExcutorServiceImpl.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excutePageSQL(String,JdbcTemplate,String,int,int,boolean,CsvTemplate,List<File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcutePageSQL_6()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		String jdbcSql = "";
		int startLine = 1;
		int limit = 1;
		boolean isExportCsv = false;
		CsvTemplate csvTemplate = new CsvTemplate();
		List<File> disFile = new Vector();

		List<Map<String, Object>> result = fixture.excutePageSQL(tempPath, jdbcTemplate, jdbcSql, startLine, limit, isExportCsv, csvTemplate, disFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excutePageSQL(SqlExcutorServiceImpl.java:132)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteSQL(String,JdbcTemplate,Map<String,Object>,List<File>,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteSQL_1()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Map<String, Object> attrMap = new IdentityHashMap();
		List<File> disFile = new Vector();
		MessageBO msg = new MessageBO();

		List<Map<String, Object>> result = fixture.excuteSQL(tempPath, jdbcTemplate, attrMap, disFile, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteSQL(SqlExcutorServiceImpl.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteSQL(String,JdbcTemplate,Map<String,Object>,List<File>,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteSQL_2()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Map<String, Object> attrMap = new IdentityHashMap();
		List<File> disFile = new Vector();
		MessageBO msg = new MessageBO();

		List<Map<String, Object>> result = fixture.excuteSQL(tempPath, jdbcTemplate, attrMap, disFile, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteSQL(SqlExcutorServiceImpl.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteSQL(String,JdbcTemplate,Map<String,Object>,List<File>,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteSQL_3()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Map<String, Object> attrMap = new IdentityHashMap();
		List<File> disFile = new Vector();
		MessageBO msg = new MessageBO();

		List<Map<String, Object>> result = fixture.excuteSQL(tempPath, jdbcTemplate, attrMap, disFile, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteSQL(SqlExcutorServiceImpl.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteSQL(String,JdbcTemplate,Map<String,Object>,List<File>,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteSQL_4()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Map<String, Object> attrMap = new IdentityHashMap();
		List<File> disFile = new Vector();
		MessageBO msg = new MessageBO();

		List<Map<String, Object>> result = fixture.excuteSQL(tempPath, jdbcTemplate, attrMap, disFile, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteSQL(SqlExcutorServiceImpl.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteSQL(String,JdbcTemplate,Map<String,Object>,List<File>,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteSQL_5()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Map<String, Object> attrMap = new IdentityHashMap();
		List<File> disFile = new Vector();
		MessageBO msg = new MessageBO();

		List<Map<String, Object>> result = fixture.excuteSQL(tempPath, jdbcTemplate, attrMap, disFile, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteSQL(SqlExcutorServiceImpl.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteSQL(String,JdbcTemplate,Map<String,Object>,List<File>,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteSQL_6()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Map<String, Object> attrMap = new IdentityHashMap();
		List<File> disFile = new Vector();
		MessageBO msg = new MessageBO();

		List<Map<String, Object>> result = fixture.excuteSQL(tempPath, jdbcTemplate, attrMap, disFile, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteSQL(SqlExcutorServiceImpl.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the List<Map<String, Object>> excuteSQL(String,JdbcTemplate,Map<String,Object>,List<File>,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testExcuteSQL_7()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		String tempPath = "";
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		Map<String, Object> attrMap = new IdentityHashMap();
		List<File> disFile = new Vector();
		MessageBO msg = new MessageBO();

		List<Map<String, Object>> result = fixture.excuteSQL(tempPath, jdbcTemplate, attrMap, disFile, msg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p-serviceagent-core.9082' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteNoPageSQL(SqlExcutorServiceImpl.java:78)
		//       at com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorServiceImpl.excuteSQL(SqlExcutorServiceImpl.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the DynamicJdbcDao getDynamicJdbcDao() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetDynamicJdbcDao_1()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());

		DynamicJdbcDao result = fixture.getDynamicJdbcDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_1()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = null;

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_2()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = new JdbcDataSource();

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_3()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = new BasicDataSource();

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_4()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = new JdbcDataSource();

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_5()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = new JdbcDataSource();

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_6()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = new JdbcDataSource();

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_7()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = new JdbcDataSource();

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getProductName(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testGetProductName_8()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DataSource dataSource = new JdbcDataSource();

		String result = fixture.getProductName(dataSource);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setDynamicJdbcDao(DynamicJdbcDao) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	@Test
	public void testSetDynamicJdbcDao_1()
		throws Exception {
		SqlExcutorServiceImpl fixture = new SqlExcutorServiceImpl();
		fixture.setDynamicJdbcDao(new DynamicJdbcDaoImpl());
		DynamicJdbcDao dynamicJdbcDao = new DynamicJdbcDaoImpl();

		fixture.setDynamicJdbcDao(dynamicJdbcDao);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:56
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
	 * @generatedBy CodePro at 15-12-21 下午4:56
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
	 * @generatedBy CodePro at 15-12-21 下午4:56
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SqlExcutorServiceImplTest.class);
	}
}