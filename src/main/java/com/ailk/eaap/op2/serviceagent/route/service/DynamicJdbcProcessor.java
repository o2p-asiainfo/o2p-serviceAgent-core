package com.ailk.eaap.op2.serviceagent.route.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.jdbc.JdbcTemplateCache;
import com.ailk.eaap.op2.serviceagent.route.jdbc.SqlExcutorService;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.linkage.rainbow.util.StringUtil;

public class DynamicJdbcProcessor implements EndpointProcessor {

	private static final Logger LOG = Logger.getLogger(DynamicJdbcProcessor.class);
	private SqlExcutorService sqlExcutorService;
	private JdbcTemplateCache jdbcTemplateCache;
	private String downloadTempDir;
	
	@Override
	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		try {
			Map<String, Object> attrMap = endpoint.getAttrMap();
			JdbcTemplate jdbcTemplate = jdbcTemplateCache
					.getJdbcTemplate(Integer.valueOf(attrMap.get(EndpointAttr.DATASOURCE_ID).toString()), msg.getTenant().getTenantId());
			if (jdbcTemplate != null) {
				String jdbcSQL = (String)attrMap.get(EndpointAttr.JDBC_SQL);
				if(jdbcSQL != null) {
					String userPath = FileUtils.getUserDirectoryPath()+File.separator+"tempfile";
					if(!StringUtil.isBlank(downloadTempDir)){
						userPath = downloadTempDir+File.separator+"tempfile";
					}
					int serInvokeId = msg.getSerInvokeIns().getSerInvokeInsId();
			        String tempPath = userPath+File.separator+serInvokeId+File.separator+"upload"+File.separator;
			        List<File> disFile = new ArrayList<File>();
					List<Map<String, Object>> resultSet = sqlExcutorService
							.excuteSQL(tempPath, jdbcTemplate, attrMap,disFile,msg);
					if (LOG.isDebugEnabled() && resultSet != null) {
						LOG.debug("jdbc resultset count = " + resultSet.size());
					}
					String exportCsv = (String)attrMap.get(EndpointAttr.EXPORT_CSV);
					if("N".equalsIgnoreCase(exportCsv)) {
						if(msg.getMsgBody() != null && msg.getMsgBody() instanceof List){
							((List)msg.getMsgBody()).addAll(resultSet);
						}
							
						else {
							msg.setMsgBody(resultSet);
						}
							
					} else {
						if(msg.getMsgBody() != null && msg.getMsgBody() instanceof File[]) {
							File[] files = (File[])msg.getMsgBody();
							disFile.addAll(Arrays.asList(files));
						}
						msg.setMsgBody(disFile.toArray(new File[disFile.size()]));
						msg.setTempFileDirName(tempPath);
					}
				}
			} else {
				throw new BusinessException(9081, "o2p-serviceagent-core.9081",
					null, null);
			}
			return msg;
		} catch (BusinessException e) {
			throw e;
		} catch (Exception e) {
			LOG.error("DynamicJdbcProcessor", e);
			throw new BusinessException(9999, "o2p-serviceagent-core.9999",
					null, e);
		}
	}

	@Override
	public void clear() {

	}

	@Override
	public void subtraThreadNum(String servId)  {

	}

	public SqlExcutorService getSqlExcutorService() {
		return sqlExcutorService;
	}

	public void setSqlExcutorService(SqlExcutorService sqlExcutorService) {
		this.sqlExcutorService = sqlExcutorService;
	}

	public JdbcTemplateCache getJdbcTemplateCache() {
		return jdbcTemplateCache;
	}

	public void setJdbcTemplateCache(JdbcTemplateCache jdbcTemplateCache) {
		this.jdbcTemplateCache = jdbcTemplateCache;
	}

	public String getDownloadTempDir() {
		return downloadTempDir;
	}

	public void setDownloadTempDir(String downloadTempDir) {
		this.downloadTempDir = downloadTempDir;
	}
}
