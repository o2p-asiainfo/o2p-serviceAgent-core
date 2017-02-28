package com.ailk.eaap.op2.serviceagent.route.jdbc;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ailk.eaap.o2p.common.security.SecurityUtil;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.JdbcDataSource;

public class JdbcTemplateFactory {
	private static final Logger log = Logger.getLogger(JdbcTemplateFactory.class);

	public JdbcTemplate createJdbcTemplate(JdbcDataSource jdbcDataSource) {
		if(log.isDebugEnabled()) {
			log.debug("datasource_id = " + jdbcDataSource.getDataSourceId());
		}
		DataSource dataSource = null;
		JdbcTemplate jdbcTemplate = null;
		try {
			String jndiName = jdbcDataSource.getJndiName();
			if (jndiName != null && !jndiName.equals("")) {
				Context context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/"+jndiName);
				jdbcTemplate = new JdbcTemplate(dataSource);
			} else {
				jdbcDataSource.setPassword(SecurityUtil.getInstance().decryMsg(jdbcDataSource.getPassword()));
				jdbcTemplate = new JdbcTemplate(jdbcDataSource);
			}
			return jdbcTemplate;
		} catch(Exception e) {
			throw new BusinessException(9080, "o2p-serviceagent-core.9080", new String[]{String.valueOf(jdbcDataSource.getDataSourceId())}, e.getCause());
		}
	}
}
