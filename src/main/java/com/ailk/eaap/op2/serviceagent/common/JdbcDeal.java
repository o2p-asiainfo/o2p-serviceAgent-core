package com.ailk.eaap.op2.serviceagent.common;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Node;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;

/**
 * 
 * <br>
 * 
 * <p>
 * @version 1.0
 * @author litieyang Aug 1, 2013
 * <hr>
 * 
 * <hr>
 * <br>       
 * 
 * <hr>
 */
public class JdbcDeal {

	private JdbcTemplate jdbcTemplate;
	private static final String VARCHAR = "VARCHAR";
	private static final String INTEGER = "INTEGER";
	private static final Logger LOG = Logger.getLogger(JdbcDeal.class);
	
	public Map<String,Object> querySQL(String sql,List<JdbcParam> ins){
		NamedParameterJdbcTemplate njt = new NamedParameterJdbcTemplate(
				getJdbcTemplate());
		
		Map<String, Object> inParam = new HashMap<String, Object>();
		
		if(ins!=null && ins.size()>0){
			for (JdbcParam jdbcInParam : ins) {
				if(jdbcInParam.getParamType().equalsIgnoreCase(this.VARCHAR)){
					inParam.put(jdbcInParam.getParamName(), jdbcInParam.getParamValue());
				}else if(jdbcInParam.getParamType().equalsIgnoreCase(this.INTEGER)){
					inParam.put(jdbcInParam.getParamName(), Integer.valueOf(jdbcInParam.getParamValue()));
				}
			}
		}
		
		List<Map<String,Object>> resultMap = njt.queryForList(sql, inParam);
		if(resultMap!=null && resultMap.size()>0){
			return resultMap.get(0);
		}
		return null;
	}

	
	public Map<String,Object> callProcedure(String sql,final List<JdbcParam> ins,final List<JdbcParam> outs){
		
		getJdbcTemplate().execute(sql,
				new CallableStatementCallback() {
					public Object doInCallableStatement(
							CallableStatement proc) throws SQLException,
							DataAccessException {
						if(ins!=null){
							for (JdbcParam jdbcInParam : ins) {
								proc.setObject(jdbcInParam.getParamName(), jdbcInParam.getParamValue());
							}
						}
						if(outs!=null){
							for (JdbcParam jdbcoutParam : outs) {
								if("VARCHAR".equalsIgnoreCase(jdbcoutParam.getParamType())){
									proc.registerOutParameter(jdbcoutParam.getParamName(), Types.VARCHAR);
								}
								else if("INTEGER".equalsIgnoreCase(jdbcoutParam.getParamType())){
									proc.registerOutParameter(jdbcoutParam.getParamName(), Types.INTEGER);
								}
								else if("CLOB".equalsIgnoreCase(jdbcoutParam.getParamType())){
									proc.registerOutParameter(jdbcoutParam.getParamName(), Types.CLOB);
								}
								else if("NUMBER".equalsIgnoreCase(jdbcoutParam.getParamType())){
									proc.registerOutParameter(jdbcoutParam.getParamName(), Types.NUMERIC);
								}else{
									proc.registerOutParameter(jdbcoutParam.getParamName(), Types.VARCHAR);
								}
							}
						}
						
						proc.execute();
						
						if(outs!=null){
							for (JdbcParam jdbcoutParam : outs) {
								proc.getObject(jdbcoutParam.getParamName());
								
							}
						}
						
						return null;
					}

				});
		
		return null;
	}
	//NAME:VARCHAR:HEAD?SRCORGCODE
	public List<JdbcParam> parseParam(String params,MessageBO msg,Endpoint endpoint){
		String [] paramNTs = params.split(",") ;
		if(paramNTs!=null && paramNTs.length>0){
			List<JdbcParam> jdbcParams = new ArrayList<JdbcParam>();
			for (int i = 0; i < paramNTs.length; i++) {
				String paramNT = paramNTs[i];
				LOG.debug(paramNT);
				
				String[] ps = paramNT.split(":");
				
				if(ps!=null){
					JdbcParam jdbcParam = new JdbcParam();
					jdbcParam.setParamName(ps[0]);
					jdbcParam.setParamType(ps[1]);
					

					LOG.debug(ps[0]);
					LOG.debug(ps[1]);
					LOG.debug(ps[2]);
					String heads[] = ps[2].split("\\?");
					LOG.debug(heads[0]);
					LOG.debug(heads[1]);
					if(heads[0].equals(("HEAD"))){
						jdbcParam.setParamValue(msg.getMsgHead().get(heads[1]) == null ? null : msg.getMsgHead().get(heads[1]).toString());
					}else{
						if(msg.getReqorrsp().equals(EOPDomain.REQ_FLAG)){
							if(endpoint.getInDataTypeCode().equals(DataType.XML)){
								Document msgXml = (Document)msg.getMsgBody();
								List<Node> nodes = msgXml.selectNodes(heads[1]);
								if(nodes!=null){
									String ss = nodes.get(0).getText();
									if(endpoint.getAttrMap().get(EndpointAttr.regularexpression)!=null){
										String str = (String)endpoint.getAttrMap().get(EndpointAttr.regularexpression);
										if(str!=null){
											Pattern pattern = Pattern
											.compile(
													str.toString(),
													Pattern.DOTALL);
												Matcher matcher = pattern.matcher(ss);
												if (matcher.find()) {
													ss =  matcher.group(1).trim();
												}
										}
									}
									
									jdbcParam.setParamValue(ss);
								}
								
							}else if (endpoint.getInDataTypeCode().equals(DataType.UrlGet)){
								jdbcParam.setParamValue(msg.getMessageMap().get(ps[2]).toString());
							}
							
						}else if(msg.getReqorrsp().equals(EOPDomain.RSP_FLAG)){
							
							if(endpoint.getInDataTypeCode().equals(DataType.XML)){
								Document msgXml = (Document)msg.getMsgBody();
								List<Node> nodes = msgXml.selectNodes(heads[1]);
								if(nodes!=null){
									jdbcParam.setParamValue(nodes.get(0).getText());
								}
								
							}
							
						}
					}
					
					
					jdbcParams.add(jdbcParam);
				}
			}
			return jdbcParams;
		}
		return null;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
