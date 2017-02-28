package com.ailk.eaap.op2.serviceagent.route.jdbc.extend;
import com.ailk.eaap.op2.serviceagent.route.jdbc.SqlParser;
public class MysqlSqlParser extends SqlParser{

	@Override
	public String formatToPage(String sql) {
		//是否已经有分页
		if((sql.indexOf("limit")) < 0) {
			sql += " limit {start}, {limit}";
		} else {
			sql = "select * from (" + sql + ") sb limit {start}, {limit}";
		}
		this.sql = sql;
		return this.sql;
	}

	@Override
	public void initPage(int start, int limit, String sql) {
		this.start = start;
		this.limit = limit;
		this.sql = sql;
	}
}
