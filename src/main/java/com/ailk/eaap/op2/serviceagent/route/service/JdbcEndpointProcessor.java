package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.JdbcDeal;
import com.ailk.eaap.op2.serviceagent.common.JdbcParam;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.linkage.rainbow.util.spring.SpringBeanInvoker;
/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Jul 17, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class JdbcEndpointProcessor implements EndpointProcessor {

	private static final Logger LOG = Logger.getLogger(JdbcEndpointProcessor.class);
	public void clear() {
		// TODO Auto-generated method stub

	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		try{
			Map<String , Object> attrMap = endpoint.getAttrMap() ;
			
			String  dataSource = (String) attrMap.get(EndpointAttr.JDBCTEMPLATE) ;
			
			String  inParamNameTypes = (String) attrMap.get(EndpointAttr.INPARAMNAMETYPES) ;
			
			Document xmldoc = (Document) msg.getMsgBody();
			
			String  sql = (String) attrMap.get(EndpointAttr.SQL) ;
			if(sql==null){
				throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.sql_nerver_config);
			}
			JdbcDeal jdbcDeal = new JdbcDeal();
			JdbcTemplate ds = (JdbcTemplate)SpringBeanInvoker.getBean(dataSource);
			jdbcDeal.setJdbcTemplate(ds);
			List<JdbcParam> paras = jdbcDeal.parseParam(inParamNameTypes, msg, endpoint);
			Map<String,Object> resultMap = jdbcDeal.querySQL(sql, paras);
			
			
			LOG.debug(resultMap);
			if(resultMap!=null && !resultMap.isEmpty()){
				for (Map.Entry<String, Object> m : resultMap.entrySet()) {
					String key = m.getKey();
					msg.getMsgHead().put(key, m.getValue().toString());
				}
				
				Object pathObj = endpoint.getAttrMap().get(EndpointAttr.Path);
				
				String paths = null;
				if(pathObj!=null){
				//  /ContractRoot/Svccont/bo!ORGID;ContractRoot/Svccont/bocode!ORGCODE
					paths = pathObj.toString();
					String pathsplit[] = paths.split(";");
					for (int i = 0; i < pathsplit.length; i++) {
						///ContractRoot/Svccont/bo!ORGID
						String path = pathsplit[i];
						// /ContractRoot/Svccont/bo   ORGID
						String pathandKey[] = path.split("!");
						String allpath = pathandKey[0];
						
						String pathKey = pathandKey[1];
						
						String xmlpath[] = allpath.split("/");
						String nodeStr = xmlpath[xmlpath.length-1];
						
						String parentPath = allpath.substring(0, allpath.length()-nodeStr.length()-1);

						Element node = (Element)xmldoc.getRootElement().selectNodes(parentPath).get(0);
						
						
						Element itemElement = DocumentHelper.createElement(nodeStr);
						itemElement.setText((String) msg.getMsgHead().get(pathKey));
						node.add(itemElement);
					}

				}
				
			}
			return msg;
		}catch(EAAPException e){
			throw e;
		}catch(Exception e){
			LOG.error("jdbcendpointprocessor",e);
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.system_error,e);
		}
		
	}

	
	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub

	}

}
