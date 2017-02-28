package com.ailk.eaap.op2.serviceagent.auto;

import java.sql.ResultSet;
/**
 * 数据源接口,主要用于对数据源方法的监控
 * @author MAWL
 *
 */
public interface IDataSource {

	/**
	 * 修改数据源数据,包括添加,修改,删除等操作
	 * @param sql
	 * @return
	 */
	 int setDate(String sql);
	/**
	 * 查询数据源数据,返回ResultSet结果集
	 * @param sql
	 * @return
	 */
	 ResultSet getDate(String sql);
	/**
	 * 关闭数据源连接
	 */
	 void closeConn();
}
