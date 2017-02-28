package com.ailk.eaap.op2.serviceagent.route.jdbc;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;

public interface SqlExcutorService {
	
	List<Map<String, Object>> excuteSQL(String tempPath, JdbcTemplate jdbcTemplate, Map<String, Object> attrMap, List<File> disFile, MessageBO msg);
}
