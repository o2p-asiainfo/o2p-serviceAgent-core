package com.ailk.eaap.op2.serviceagent.route.jdbc.extend;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.route.jdbc.SqlParser;

public class OracleSqlParser extends SqlParser{

	@Override
	public String formatToPage(String sql) {
		sql = "select * from (select f$_table.*, rownum "+EOPDomain.ROWNUM_FIELD_NAME+" from ("+sql+") f$_table) where "+EOPDomain.ROWNUM_FIELD_NAME+" >={start} and "+EOPDomain.ROWNUM_FIELD_NAME+" <={end}";
		this.sql = sql;
		return this.sql;
	}

	@Override
	public void initPage(int start, int limit, String sql) {
		this.start = start+1;
		this.limit = limit;
		this.end = start + limit;
		this.sql = sql;
	}
}
