package com.ailk.eaap.op2.serviceagent.common;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.Node;

import com.ailk.eaap.op2.bo.GetValueExpr;
import com.jayway.jsonpath.JsonPath;


/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Mar 25, 2013
 * <hr>
 * <hr>
 * <br>       
 * 
 * <hr>
 */
public class SimpleEvaluator implements Evaluator{

	private static Log log = LogFactory.getLog(SimpleEvaluator.class);
	@SuppressWarnings("rawtypes")
	public Object evaluate(GetValueExpr expr, MessageBO messageBo) {
		// TODO Auto-generated method stub

		String contentValueExpr = expr.getExpr();		
		Object value = null;		
		boolean isReqMsg = true;
		if(contentValueExpr!=null){
			if(contentValueExpr.indexOf("#".toCharArray()[0])>0){

				String[] expreType = contentValueExpr.split("#");
				if("REQ".equalsIgnoreCase(expreType[0])){
					isReqMsg = true;
				}else if("RSP".equalsIgnoreCase(expreType[0])){
					isReqMsg = false;
				
				contentValueExpr = expreType[1];}
			}
			String attrs[] = contentValueExpr.split(":");
			if(attrs[0].equalsIgnoreCase("MAP")){
				value = messageBo.getMessageMap().get(attrs[1]);
				
			}else if(attrs[0].equalsIgnoreCase("XML")){
				Document xmldoc = (Document) messageBo.getMsgBody();
				Node node = null;
				if(isReqMsg){
					node =  xmldoc.selectSingleNode(attrs[1]);
				}
				
				if(node==null){
					return null;
				}else{
					return node.getText();
				}
				
			}else if(attrs[0].equalsIgnoreCase("HEAD")){
				return messageBo.getMsgHead().get(attrs[1]);
			}else if(attrs[0].equalsIgnoreCase("JSON")){
				return JsonPath.read(messageBo.getMsgBody().toString(), attrs[1]);
			}
		}
		return value;
	
	}
	private Object getIgnoreKeyCase(Map<String, Object> map, String key){
		Object value = map.get(key);
		if(value==null) {
			value = map.get(key.toLowerCase());
		}
		if(value==null) {
			value = map.get(key.toUpperCase());
		}
		
		return value;
	}


	public String queryXmlValueByCode(String xmlBody, String code) {
		String codeValue = "";
		try {
			XMLParser parser = new XMLParser(new ByteArrayInputStream(xmlBody.getBytes("UTF-8")));
			codeValue = parser.getElement(code);
		} catch (Exception e) {
			log.error(e.getStackTrace());
		}
		return codeValue;
	}
	
}
