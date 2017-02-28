package com.ailk.eaap.op2.serviceagent.route.jdbc.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.op2.serviceagent.route.jdbc.dao.DynamicJdbcDao;
import com.ailk.eaap.op2.bo.CsvTemplate;
import com.ailk.eaap.op2.bo.JdbcDataSource;

public class DynamicJdbcDaoImpl implements DynamicJdbcDao {
	private ICacheFactory cacheFactory;
	private String keyPrex = "jdbcTemplate-dataSource-";

	public void setCacheFactory(ICacheFactory cacheFactory) {
		this.cacheFactory = cacheFactory;
	}

	@Override
	public List<JdbcDataSource> getAllDataSource() {
		return (List<JdbcDataSource>) cacheFactory.getCacheClient().get(CacheKey.ALL_DATA_SOURCE);
	}

	@Override
	public JdbcDataSource getDataSourceById(int dataSourceId, Integer tenantId) {
		return (JdbcDataSource) cacheFactory.getLocalCacheClient().getByTenantId(CacheKey.DATA_SOURCE + dataSourceId,tenantId);
	}

	@Override
	public CsvTemplate getCsvTemplateById(int csvTemplateId, Integer tenantId) {
		return (CsvTemplate) cacheFactory.getLocalCacheClient().getByTenantId(CacheKey.CSV_TEMPLATE + csvTemplateId,tenantId);
	}

	@Override
	public void addJdbcTemplate(int dataSourceId, JdbcTemplate jdbcTemplate, Integer tenantId) {
		if(jdbcTemplate == null) {
			return;
		}
		String key = keyPrex + dataSourceId;
		if(tenantId == null) {
			tenantId = CacheKey.defaultTenantId;
		}
		key = tenantId + key.toString();
		cacheFactory.getLocalCacheClient().put(key, jdbcTemplate);
	}
	
	public JdbcTemplate getJdbcTemplate(int dataSourceId, Integer tenantId) {
		String key = keyPrex + dataSourceId;
		return (JdbcTemplate)cacheFactory.getLocalCacheClient().getByTenantId(key,tenantId);
	}


}
