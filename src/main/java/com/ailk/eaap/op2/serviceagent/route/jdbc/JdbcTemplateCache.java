package com.ailk.eaap.op2.serviceagent.route.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ailk.eaap.op2.serviceagent.route.jdbc.dao.DynamicJdbcDao;
import com.ailk.eaap.op2.bo.JdbcDataSource;

public class JdbcTemplateCache {
	private DynamicJdbcDao dynamicJdbcDao;
	private JdbcTemplateFactory jdbcTemplateFactory;

	public void initJdbcTemplateCache() {
	}
	
	public JdbcTemplate getJdbcTemplate(Integer dataSourceId, Integer tenantId) {
		JdbcTemplate jdbcTemplate = null;
		JdbcDataSource jdbcDataSource = null;
		jdbcTemplate = dynamicJdbcDao.getJdbcTemplate(dataSourceId,tenantId);
		if(jdbcTemplate == null) {
			jdbcDataSource = dynamicJdbcDao.getDataSourceById(dataSourceId,tenantId);
			if(jdbcDataSource != null) {
				jdbcTemplate = jdbcTemplateFactory.createJdbcTemplate(jdbcDataSource);
				dynamicJdbcDao.addJdbcTemplate(jdbcDataSource.getDataSourceId(), jdbcTemplate,tenantId);
			}
		}
		return jdbcTemplate;
	}

	public DynamicJdbcDao getDynamicJdbcDao() {
		return dynamicJdbcDao;
	}

	public void setDynamicJdbcDao(DynamicJdbcDao dynamicJdbcDao) {
		this.dynamicJdbcDao = dynamicJdbcDao;
	}

	public DynamicJdbcDao getdynamicJdbcDao() {
		return dynamicJdbcDao;
	}

	public void setdynamicJdbcDao(DynamicJdbcDao dynamicJdbcDao) {
		this.dynamicJdbcDao = dynamicJdbcDao;
	}

	public JdbcTemplateFactory getJdbcTemplateFactory() {
		return jdbcTemplateFactory;
	}

	public void setJdbcTemplateFactory(JdbcTemplateFactory jdbcTemplateFactory) {
		this.jdbcTemplateFactory = jdbcTemplateFactory;
	}
}
