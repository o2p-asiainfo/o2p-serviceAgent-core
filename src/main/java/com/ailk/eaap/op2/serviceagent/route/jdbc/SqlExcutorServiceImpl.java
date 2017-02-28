package com.ailk.eaap.op2.serviceagent.route.jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;

import com.ailk.eaap.op2.serviceagent.common.CsvUtil;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.jdbc.dao.DynamicJdbcDao;
import com.ailk.eaap.op2.serviceagent.route.jdbc.extend.MysqlSqlParser;
import com.ailk.eaap.op2.serviceagent.route.jdbc.extend.OracleSqlParser;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.foundation.util.ExceptionUtils;
import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.JdbcDataSource;

public class SqlExcutorServiceImpl implements SqlExcutorService {
	private static final Logger log = Logger.getLog(SqlExcutorServiceImpl.class);
	DynamicJdbcDao dynamicJdbcDao;

	@Override
	public List<Map<String, Object>> excuteSQL(String tempPath, JdbcTemplate jdbcTemplate, Map<String, Object> attrMap, List<File> disFile, MessageBO msg) {
		String exportCsv = (String)attrMap.get(EndpointAttr.EXPORT_CSV);
		String startLine = (String)attrMap.get(EndpointAttr.START_LINE_INDEX);
		String limit = (String)attrMap.get(EndpointAttr.LIMIT);
		String jdbcSql = (String)attrMap.get(EndpointAttr.JDBC_SQL);
		String csvTemplateId = (String)attrMap.get(EndpointAttr.CSV_TEMPLATE_ID);
		boolean isExportCsv = "N".equalsIgnoreCase(exportCsv) ? false : true;
		
		if(log.isDebugEnabled()) {
			log.debug("exportCsv=" + exportCsv + " startLine="+startLine + " limit="+limit + " jdbcSql="+jdbcSql + " csvTemplateId="+csvTemplateId + " isExportCsv="+isExportCsv);
		}
		CsvTemplate csvTemplate = null;
		if(csvTemplateId != null && isExportCsv) {
			csvTemplate = dynamicJdbcDao.getCsvTemplateById(Integer.parseInt(csvTemplateId), msg.getTenant().getTenantId());
			if(csvTemplate == null) {
				throw new BusinessException(9084, "o2p-serviceagent-core.9084", null, null);
			}
		}
		
		if(startLine != null && limit != null){
			return excutePageSQL(tempPath, jdbcTemplate, jdbcSql, Integer.parseInt(startLine), Integer.parseInt(limit), isExportCsv,csvTemplate,disFile);
		}
		else {
			return excuteNoPageSQL(tempPath, jdbcTemplate, jdbcSql, isExportCsv, csvTemplate,disFile);
		}
	}

	public List<Map<String, Object>> excuteNoPageSQL(String tempPath,
			JdbcTemplate jdbcTemplate, String jdbcSql, boolean isExportCsv,
			CsvTemplate csvTemplate, List<File> disFile) {
		List<Map<String, Object>> result = null;
		try {
			result = doExcuteSql(jdbcTemplate, jdbcSql);
			if(isExportCsv && csvTemplate != null) {
				if(log.isDebugEnabled()) {
					log.debug("begin export to csv file");
				}
				CsvUtil.exportCsv(result, csvTemplate, tempPath, new Date(),disFile);
				return null;
			}
		} catch(BusinessException e) {
			throw e;
		} catch (Exception e) {
			log.error("jdbcTemplate excute sql throw Exception, cause:{0}", ExceptionUtils.populateExecption(e, 500));
			throw new BusinessException(9082, "o2p-serviceagent-core.9082",
					null, e.getCause());
		}
		return result;
	}

	public List<Map<String, Object>> excutePageSQL(String tempPath,
			JdbcTemplate jdbcTemplate, String jdbcSql, int startLine,
			int limit, boolean isExportCsv, CsvTemplate csvTemplate, List<File> disFile) {
		List<Map<String, Object>> result = new ArrayList<Map<String,Object>>();
		String productName = null;
		SqlParser sqlParser = null;
		try {
			productName = getProductName(jdbcTemplate.getDataSource());
			if(productName.toLowerCase().contains("mysql")){
				sqlParser = new MysqlSqlParser();
			}
			else if(productName.toLowerCase().contains("oracle")){
				sqlParser = new OracleSqlParser();
			}
			
			if(sqlParser != null) {
				sqlParser.initPage(startLine, limit, jdbcSql);
				jdbcSql = sqlParser.parseSqlToPage();
			}
			
			List<Map<String, Object>> tempResult = null;
			
			//生成文件时间，防止生成时间过久，而导致创建多个文件
			Date currentTime = new Date();
			if(log.isDebugEnabled() && isExportCsv) {
				log.debug("begin export to csv file");
			}
			if(sqlParser!=null){
				while((tempResult = doExcuteSql(jdbcTemplate, jdbcSql)).size() != 0) {
					if(isExportCsv) {
						if(csvTemplate != null) {
							//如果文件加锁了，则代表已经有任务在进行搬迁了，此任务将不再进行
							boolean isLock = CsvUtil.exportCsv(tempResult, csvTemplate, tempPath, currentTime,disFile);
							if(isLock){
								break;
							}
						}
					} else {
						result.addAll(tempResult);
					}
					sqlParser.nextPage();
					jdbcSql = sqlParser.parseSqlToPage();
				}				
			}
		} catch(BusinessException e) {
			throw e;
		} catch (Exception e) {
			log.error("jdbcTemplate excute sql throw Exception, cause:{0}", ExceptionUtils.populateExecption(e, 500));
			throw new BusinessException(9082, "o2p-serviceagent-core.9082",
					null, e.getCause());
		}
		return result;
	}
	
	public String getProductName(DataSource dataSource) throws SQLException {
		if(dataSource == null) {
			return null;
		}
		if(dataSource instanceof JdbcDataSource) {
			return ((JdbcDataSource)dataSource).getDriverClassName();
		}
		else if(dataSource instanceof BasicDataSource) {
			return ((BasicDataSource)dataSource).getDriverClassName();
		}
		else {
			Connection connection = dataSource.getConnection();
			String productName = connection.getMetaData().getDatabaseProductName();
			DataSourceUtils.releaseConnection(connection, dataSource);
			connection.close();
			return productName;
		}
	}

	public List<Map<String, Object>> doExcuteSql(JdbcTemplate jdbcTemplate, String sql) {
		return jdbcTemplate.queryForList(sql);
	}

	public DynamicJdbcDao getDynamicJdbcDao() {
		return dynamicJdbcDao;
	}

	public void setDynamicJdbcDao(DynamicJdbcDao dynamicJdbcDao) {
		this.dynamicJdbcDao = dynamicJdbcDao;
	}
}
