package com.ailk.eaap.op2.serviceagent.auto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * 数据源操作类.用于动态脚本
 * @author MAWL
 *
 */
public class EndPointDataSource implements IDataSource{
	private Connection conn;
	private ResultSet rs;
	private PreparedStatement ps;
	//spring注入数据源对象
	private DataSource dataSource;
	private  Log log = LogFactory.getLog(EndPointDataSource.class);
	
	public EndPointDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		getConnection();
	}
	
	private  Connection getConnection(){
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			log.error(e.getMessage(),e);
		}
		return conn;
	}
	/**
	 * 关闭数据源连接
	 */
	public  void closeConn(){
		if(null != conn){
			try {
				conn.close();
			} catch (SQLException e) {
				log.error(e.getMessage(),e);
			}
		}
	}
	/**
	 * 查询数据源数据,返回ResultSet结果集
	 * @param sql
	 * @return
	 */
	public  ResultSet getDate(String sql){
		try {
			ps = this.conn.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			log.debug("sql:"+sql);
			log.error(e.getMessage(),e);
		}
		return rs;
	}
	/**
	 * 修改数据源数据,包括添加,修改,删除等操作
	 * @param sql
	 * @return
	 */
	public  int setDate(String sql){
		int result = 0;
		try {
			ps = this.conn.prepareStatement(sql);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			log.debug("sql:"+sql);
			log.error(e.getMessage(),e);
		}
		return result;
	}
}
