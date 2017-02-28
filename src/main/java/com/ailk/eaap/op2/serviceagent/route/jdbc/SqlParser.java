package com.ailk.eaap.op2.serviceagent.route.jdbc;

public abstract class SqlParser {
	protected int start;
	protected int limit;
	protected int end;
	protected String  sql;
	private boolean isFirstPage = true;;

	public String parseSqlToPage() {
		if(isFirstPage) {
			formatToPage(sql);
			isFirstPage = false;
		}
		return sql.replace("{start}", ""+start).replace("{limit}", ""+limit).replace("{end}", ""+end);
	}
	
	protected abstract String formatToPage(String sql);

	protected abstract void initPage(int start, int limit, String sql);

	public void nextPage() {
		start = start + limit;
		end = end + limit;
		isFirstPage = false;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
}
