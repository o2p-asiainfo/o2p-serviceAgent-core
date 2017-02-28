package com.ailk.eaap.op2.serviceagent.route.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.JdbcDataSource;


public interface DynamicJdbcDao {

	List<JdbcDataSource> getAllDataSource();

	JdbcDataSource getDataSourceById(int dataSourceId, Integer tenantId);
	
	CsvTemplate getCsvTemplateById(int csvTemplateId,Integer tenantId);

	void addJdbcTemplate(int dataSourceId, JdbcTemplate jdbcTemplate, Integer tenantId);

	JdbcTemplate getJdbcTemplate(int dataSourceId, Integer tenantId);
}
