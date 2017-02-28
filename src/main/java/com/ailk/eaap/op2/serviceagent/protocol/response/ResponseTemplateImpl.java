/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:ResponseTemplate.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.protocol.response 
 * Date:2014年12月22日下午2:56:54 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.protocol.response;  

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.stereotype.Service;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.O2pDocumentHelper;
import com.ailk.eaap.op2.common.OutType;
import com.ailk.eaap.op2.common.XmlUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.protocol.IFreeMarkerTemplate;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.Template;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/** 
 * ClassName:ResponseTemplate  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年12月22日 下午2:56:54  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
@Service
public class ResponseTemplateImpl implements IResponseTemplate{
	private static final Logger LOG = Logger.getLog(ResponseTemplateImpl.class);
	
	private IMemcacheManageServ cacheService;
	private IFreeMarkerTemplate freeMarkerTemplate;
	
	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}
	
	public void setFreeMarkerTemplate(IFreeMarkerTemplate freeMarkerTemplate) {
		this.freeMarkerTemplate = freeMarkerTemplate;
	}
	
	public void response(MessageBO<?> messageBo, String code, String msg) {
		LOG.debug("go to the exception response!");
		//清除请求的header
		messageBo.getMsgHead().clear();
		try {
			ContractVersion cv = messageBo.getContractVersion();
			if(cv != null) {
				
				ContractFormat cf = cv.getRspContractFormat();
				if(cf != null) {

					Object object = cacheService.getKey(CacheKey.template+cf.getTcpCtrFId(), messageBo.getTenant().getTenantId());
					//如果配置了freeMarker模版则优先使用
					if(object != null) {
						LOG.debug("use the configed freemarker template!");
						
						freeMarkerTemplate.buildTemplate(messageBo, (Template)object, cf.getTcpCtrFId());
						return;
					} 
						
					//使用javaField版本模版
					LOG.debug("use the javaField template!");
					if(respTemplate(messageBo,cf, CommonUtil.getDefaultTimeZoneDateString(), ErrorDomain.ERROR_TYPE_BIZ_ERROR,
							code, msg, messageBo.getTransactionID())) {
						
						return;
					}
				}
				
				//基类freemarker协议版本
				ContractVersion baseCv = cv.getBaseContractVersion();
				if(baseCv != null && baseCv.getRspContractFormat() != null) {
					Object object = cacheService.getKey(CacheKey.template+baseCv.getRspContractFormat().getTcpCtrFId(), messageBo.getTenant().getTenantId());
					if(object != null) {
						LOG.debug("use the base freemarker template!");
						
						freeMarkerTemplate.buildTemplate(messageBo, (Template)object, baseCv.getRspContractFormat().getTcpCtrFId());
						return;
					} 
				}
			} 
			
			//freeMarker全局模版
			Object globalObj = cacheService.getKey(CacheKey.template+0, messageBo.getTenant().getTenantId());
			
			if(globalObj != null) {
				LOG.debug("use the  global freemarker template!");
				
				freeMarkerTemplate.buildTemplate(messageBo, (Template)globalObj, 0);
				return;
			}
				
			LOG.warn("Contract version is null, use the default response template.");
			//默认模板
			buildResponseMsg(messageBo, CommonUtil.getDefaultTimeZoneDateString(), ErrorDomain.ERROR_TYPE_BIZ_ERROR,  code, msg, messageBo.getTransactionID());

		} catch (Exception e ){
			
			LOG.error(LogModel.EVENT_APP_EXCPT, e);
			
			try {
				//默认模板
				buildResponseMsg(messageBo, CommonUtil.getDefaultTimeZoneDateString(), ErrorDomain.ERROR_TYPE_SYS_ERROR, code, msg, messageBo.getTransactionID());
			} catch (Exception e1) {
				
				LOG.error(LogModel.EVENT_APP_EXCPT, e1);
			}
		} 
	}
	


	
	public  boolean respTemplate(MessageBO messageBo, ContractFormat cf, String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID)  throws Exception{
			
			boolean hasTemp = false;
			
			String conType = cf.getConType();
			if(EOPDomain.XML.equals(conType)) {
				
				hasTemp = xmlResponse(messageBo,cf, CommonUtil.getDefaultTimeZoneDateString(), ErrorDomain.ERROR_TYPE_BIZ_ERROR,
						rspCode, rspDesc, messageBo.getTransactionID());
				
			} else if(EOPDomain.JSON.equals(conType)) {
				LOG.debug("use the json template!");
				hasTemp  = jsonResponse(messageBo, cf, rspTime, rspType, rspCode, rspDesc, transactionID);
				
			} else if(EOPDomain.xmlOrJson.equals(conType)) {
				
				String accept = messageBo.getMsgHead().get(EOPDomain.ACCEPT) == null ? "" : messageBo.getMsgHead().get(EOPDomain.ACCEPT).toString();
				String contentType = messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()) == null ? "" : messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()).toString();
				if(accept.toLowerCase().contains("xml") || contentType.toLowerCase().contains("xml")) {
					
					hasTemp = xmlResponse(messageBo,cf, CommonUtil.getDefaultTimeZoneDateString(), ErrorDomain.ERROR_TYPE_BIZ_ERROR,
							rspCode, rspDesc, messageBo.getTransactionID());
					
				} else if (accept.toLowerCase().contains("json") || contentType.toLowerCase().contains("json")) {
					hasTemp = xmlResponse(messageBo,cf, CommonUtil.getDefaultTimeZoneDateString(), ErrorDomain.ERROR_TYPE_BIZ_ERROR,
							rspCode, rspDesc, messageBo.getTransactionID());
					
					JSONObject jsonObj = xml2Json((Document)messageBo.getMsgBody());
					messageBo.getMsgHead().put(EOPDomain.CONTENT_TYPE, CONTENT_TYPE_JSON_UTF8);
					messageBo.setMsgBody(jsonObj);
				}
				
			} else {
				hasTemp = otherResponse(messageBo,cf, CommonUtil.getDefaultTimeZoneDateString(), ErrorDomain.ERROR_TYPE_BIZ_ERROR,
						rspCode, rspDesc, messageBo.getTransactionID());
				
			}
			
			return hasTemp;
	}

	
	private boolean otherResponse(MessageBO messageBo, ContractFormat cf, String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID) {
		
		boolean hasTemp = false;
		
		String result = "";
		for(NodeDesc rspNode : cf.getNodeDescs()) {
			String javaField = rspNode.getJavaField();
			if(!StringUtils.isEmpty(javaField)) {
				
				String nodeType = rspNode.getNodeType();
				String defaultValue = rspNode.getNevlConsValue();
				
				//http header
				if("1".equals(nodeType)) {
					//如果已配置了默认值，那么优先使用默认值
					if(!"".equals(defaultValue)) {
						messageBo.getMsgHead().put(javaField, defaultValue);
					} else {
						setHttpHead(messageBo, javaField, rspCode, rspDesc, rspType, rspTime, transactionID);
					}
				} else if("2".equals(nodeType)) {
					String linsep = System.getProperty("line.separator");
					if(OutType.rspCode.equals(javaField)) {
						result +="rspCode:"+rspCode+linsep;
						hasTemp = true;
					} else if(OutType.rspTime.equals(javaField)) {
						result +="rspTime:"+rspTime+linsep;
						hasTemp = true;
					} else if(OutType.rspType.equals(javaField)) {
						result +="rspType:"+rspType+linsep;
						hasTemp = true;
					} else if(OutType.transactionID.equals(javaField)) {
						result +="transactionID:"+transactionID+linsep;
						hasTemp = true;
					} else if(OutType.rspDesc.equals(javaField)) {
						result +="rspDesc:"+rspDesc+linsep;
						hasTemp = true;
					}
				}
			}
		}
		messageBo.getMsgHead().put(EOPDomain.CONTENT_TYPE,CONTENT_TYPE_PLAIN_UTF8);
		messageBo.setMsgBody(result);
		
		return hasTemp;
	}

	public  JSONObject xml2Json(Document xmldoc) {
		JSONObject jsonObj = new JSONObject();  
		Map map = XmlUtil.Dom2Map(xmldoc);  
		jsonObj.putAll(map);

		return jsonObj;
	}

	
	private  boolean jsonResponse(MessageBO messageBo, ContractFormat cf, String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID) {
		
		boolean hasTemp = false;
		
		String xsdFormat = cf.getXsdException();
		LOG.debug("json xsd Exception "+xsdFormat);
		JSONObject jsonObject = null;
		if(!StringUtils.isEmpty(xsdFormat)){
			jsonObject = JSONObject.fromObject(xsdFormat);
		}
		for(NodeDesc rspNode : cf.getNodeDescs()) {
			String javaField = rspNode.getJavaField();
			if(!StringUtils.isEmpty(javaField)) {
				
				String nodePath = rspNode.getNodePath();
				String nodeType = rspNode.getNodeType();
				String defaultValue = rspNode.getNevlConsValue();
				
				//http header
				if("1".equals(nodeType)) {
					if(!"".equals(defaultValue)) {
						messageBo.getMsgHead().put(javaField, defaultValue);
					} else {
						setHttpHead(messageBo, javaField, rspCode, rspDesc, rspType, rspTime, transactionID);
					}
					
				} else {
					LOG.debug("building the json template!");
					if(OutType.rspCode.equals(javaField)) {
						jsonTemplateBuild(jsonObject, nodePath, rspCode);
						hasTemp = true;
					} else if(OutType.rspTime.equals(javaField)) {
						jsonTemplateBuild(jsonObject, nodePath, rspTime);
						hasTemp = true;
					} else if(OutType.rspType.equals(javaField)) {
						jsonTemplateBuild(jsonObject, nodePath, rspType);
						hasTemp = true;
					} else if(OutType.transactionID.equals(javaField)) {
						jsonTemplateBuild(jsonObject, nodePath, transactionID);
						hasTemp = true;
					} else if(OutType.rspDesc.equals(javaField)) {
						jsonTemplateBuild(jsonObject, nodePath, rspDesc);
						hasTemp = true;
					}
				}
			}
			LOG.debug("not config javaField,return the default template!");
		}
		
		messageBo.setRspType(CONTENT_TYPE_JSON_UTF8);
		messageBo.setMsgBody(jsonObject);
		
		return hasTemp;
	}

	
	private  boolean xmlResponse(MessageBO messageBo, ContractFormat cf, String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID) throws Exception {

		boolean hasTemp = false;
		
		String xsdFormat = cf.getXsdException();
		Document xmldoc = null;
		if(!StringUtils.isEmpty(xsdFormat)) {
			
			xmldoc = getDocument(xsdFormat);
		}
		
		for(NodeDesc rspNode : cf.getNodeDescs()) {
			
			String javaField = rspNode.getJavaField();
			if(!StringUtils.isEmpty(javaField)) {
				
				String nodePath = rspNode.getNodePath();
				String nodeType = rspNode.getNodeType();
				String defaultValue = rspNode.getNevlConsValue();
				
				
				//http header
				if("1".equals(nodeType)) {
					if(!StringUtils.isEmpty(defaultValue)) {
						messageBo.getMsgHead().put(javaField, defaultValue);
					} else {
						setHttpHead(messageBo, javaField, rspCode, rspDesc, rspType, rspTime, transactionID);
					}
				} 
				// body
				else if ("2".equals(nodeType)) {
					if(xmldoc != null) {
						
						String newNodePath = XmlUtil.changeNodePath(xmldoc, nodePath);
						Element element = (Element)xmldoc.selectSingleNode(newNodePath);
						if(element == null) {
							LOG.error("The element is null, the node is:"+newNodePath);
						} else {
							if(OutType.rspCode.equals(javaField) && !StringUtils.isEmpty(rspCode)) {
								element.addText(rspCode);
								hasTemp = true;
							} else if(OutType.rspDesc.equals(javaField) && !StringUtils.isEmpty(rspDesc)) {
								element.addCDATA(rspDesc);
								hasTemp = true;
							} else if(OutType.rspTime.equals(javaField) && !StringUtils.isEmpty(rspTime)) {
								element.addText(rspTime);
								hasTemp = true;
							} else if(OutType.rspType.equals(javaField) && !StringUtils.isEmpty(rspType)) {
								element.addText(rspType);
								hasTemp = true;
							} else if(OutType.transactionID.equals(javaField) && !StringUtils.isEmpty(transactionID)) {
								element.addText(transactionID);
								hasTemp = true;
							}
						}
					}
				}
			}
			
		}
		
		messageBo.getMsgHead().put(EOPDomain.CONTENT_TYPE, CONTENT_TYPE_XML_UTF8);
		messageBo.setRspType(EOPDomain.XML);
		messageBo.setMsgBody(xmldoc);
		
		return hasTemp;
	}

	private  Document getDocument(String xsdFormat) throws Exception {
		
		Document xmldoc = null;
		try{
			
			xmldoc = O2pDocumentHelper.parseText(xsdFormat);
			
		}catch(Exception e){
			LOG.error("xsdFormat parse error. xsdFormat="+xsdFormat, e);
	
		}
		return xmldoc;
	}

	/**
	 * 
	 * setHttpHead:(组装http header 响应).  
	 * TODO(这里描述这个方法适用条件 – 可选). 
	 * TODO(这里描述这个方法的执行流程 – 可选). 
	 * TODO(这里描述这个方法的使用方法 – 可选). 
	 * TODO(这里描述这个方法的注意事项 – 可选). 
	 * 
	 * @author wuwz 
	 * @param messageBo
	 * @param javaField
	 * @param rspCode
	 * @param rspDesc
	 * @param rspType
	 * @param rspTime
	 * @param transactionID 
	 * @since JDK 1.6
	 */
	private  void setHttpHead(MessageBO messageBo, String javaField, String rspCode, String rspDesc, String rspType, String rspTime, String transactionID) {

		//http code值可以是异常编码映射
		if(OutType.httpStatusCode.equals(javaField)) {
			Object httpCode = cacheService.getKey(CacheKey.Exception+rspCode, messageBo.getTenant().getTenantId());
			if(httpCode != null) {
				messageBo.getMsgHead().put(javaField, httpCode);
			}
		} else if (OutType.rspCode.equals(javaField) && !StringUtils.isEmpty(rspCode)) {
			messageBo.getMsgHead().put(javaField, rspCode);
		} else if (OutType.rspDesc.equals(javaField) && !StringUtils.isEmpty(rspDesc)) {
			messageBo.getMsgHead().put(javaField, rspDesc);
		} else if (OutType.rspType.equals(javaField) && !StringUtils.isEmpty(rspType)) {
			messageBo.getMsgHead().put(javaField, rspType);
		} else if (OutType.rspTime.equals(javaField) && !StringUtils.isEmpty(rspTime)) {
			messageBo.getMsgHead().put(javaField, rspTime);
		} else if (OutType.transactionID.equals(javaField) && !StringUtils.isEmpty(transactionID)) {
			messageBo.getMsgHead().put(javaField, transactionID);
		}
		
	}

	
	/**
	 * 默认响应模版
	 * @param rspTime
	 * @param rspType
	 * @param rspCode
	 * @param rspDesc
	 * @param transactionID
	 * @throws DocumentException 
	 */
	public  void buildResponseMsg(MessageBO messageBo, String rspTime, String rspType,
			String rspCode, String rspDesc, String transactionID) throws Exception{
		StringBuffer buffer = new StringBuffer(500);
		buffer.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">");
		buffer.append("<soapenv:Header>");
		buffer.append("<ResponseHead>");

		buffer.append("<TransactionID>");
		if (transactionID == null
				|| transactionID.equals(EOPDomain.EMPTY_STRING)) {
			buffer.append(EOPDomain.ERROR_TRASACTION_ID);
		} else{
			buffer.append(transactionID);
		}
		buffer.append("</TransactionID>");

		buffer.append("<RspTime>");
		buffer.append(rspTime);
		buffer.append("</RspTime>");

		buffer.append("<RspType>");
		buffer.append(rspType);
		buffer.append("</RspType>");

		buffer.append("<RspCode>");
		buffer.append(rspCode);
		buffer.append("</RspCode>");

		if (rspDesc!=null && rspDesc.length() > RESPONSE_DESC_LENGTH){
			rspDesc = rspDesc.substring(0,
					RESPONSE_DESC_LENGTH);
		}
		buffer.append("<RspDesc>");
		buffer.append("<![CDATA[");
		buffer.append(rspDesc);
		buffer.append("]]>");
		buffer.append("</RspDesc>");

		buffer.append("</ResponseHead>");
		buffer.append("</soapenv:Header>");
		buffer.append("<soapenv:Body/>");
		buffer.append("</soapenv:Envelope>");
		
		String accept = messageBo.getMsgHead().get(EOPDomain.ACCEPT) == null ? "" : messageBo.getMsgHead().get(EOPDomain.ACCEPT).toString();
		String contentType = messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()) == null ? "" : messageBo.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()).toString();
		if (accept.toLowerCase().contains("json")  || contentType.toLowerCase().contains("json")) {
			
			JSONObject jsonObj = xml2Json(getDocument(buffer.toString()));
			messageBo.getMsgHead().put(EOPDomain.CONTENT_TYPE, CONTENT_TYPE_JSON_UTF8);
			messageBo.setMsgBody(jsonObj);
		} else {
			
			messageBo.setMsgBody(buffer.toString());
			messageBo.getMsgHead().put(EOPDomain.CONTENT_TYPE, CONTENT_TYPE_XML_UTF8);
		}
	}
	
	
	/**
	 * 
	 * TODO过滤请求的header及落地方返回的非业务头如Content-Length. 
	 *  com.ailk.eaap.op2.serviceagent.protocol.response.IResponseTemplate#checkHeader(com.ailk.eaap.op2.serviceagent.common.MessageBO)
	 */
	@Override
	public void checkHeader(MessageBO<?> messageBo) {
		
		List<NodeDesc> list = new ArrayList<NodeDesc>();
		
		ContractVersion cv = messageBo.getContractVersion();
		
		if(cv != null) {
			
			//基类协议节点
			ContractVersion baseCv = cv.getBaseContractVersion();
			if(baseCv != null) {
				
				String baseConVersion = baseCv.getVersion();
				addNodeList(list, baseConVersion,messageBo);
			}
			
			//子协议节点
			addNodeList(list, cv.getVersion(),messageBo);
		}
		
		filterHeaderKey(messageBo, list);
	}

	
	private void addNodeList(List<NodeDesc> list, String version, MessageBO messageBo) {
		
		Object cvObj  = cacheService.getKey(CacheKey.ContractVer+version, messageBo.getTenant().getTenantId());
		
		if(cvObj != null) {
			
			ContractVersion cv = (ContractVersion)cvObj;
			ContractFormat cf = cv.getReqContractFormat();
			if(cf != null) {
				list.addAll(cf.getNodeDescs());
			}
		}
	}

	private void filterHeaderKey(MessageBO messageBo, List<NodeDesc> nodeDescList) {
		
		Map<String,String> newMap = new Hashtable<String,String>();
		newMap.putAll(messageBo.getMsgHead());
		Set<String> keySet = newMap.keySet();

		for(String key : keySet) {
			//请求的header
			for(NodeDesc rspNode : nodeDescList) {
				String nodePath = rspNode.getNodePath();
				String nodeType = rspNode.getNodeType();
				String javaField = rspNode.getJavaField();
				if(StringUtils.isEmpty(javaField)) {
					javaField = StringUtils.isEmpty(nodePath)?"":nodePath;
				}
				//http header
				if("1".equals(nodeType)) {
					
					if(key.equalsIgnoreCase(javaField) && !key.equalsIgnoreCase(InType.TRANSID)) {
						messageBo.getMsgHead().remove(key);
					}
				} 
			}
			
			//非业务header
			if(OutType.headers.contains(key.toLowerCase())) {
			    	
				messageBo.getMsgHead().remove(key);
			}
		}
		
		//body为空则设置content-type为空
		if(StringUtils.isEmpty(messageBo.toString())) {
			
			messageBo.getMsgHead().remove("content-type");
		} else if(!messageBo.getMsgHead().containsKey("content-type") ) {
					
			addDefaultHeader(messageBo, messageBo.getMsgHead());
		}
		
		LOG.debug("filterHeaderKey keys:"+messageBo.getMsgHead().toString());
	}

	private void addDefaultHeader(MessageBO messageBo, Map<String, Object> msgHead) {
		
		String contentType = EOPDomain.CONTENT_TYPE_PLAIN_UTF8;
		
		if(messageBo.toString().trim().startsWith("<")) {
			
			contentType = EOPDomain.CONTENT_TYPE_XML_UTF8;
		} else if (messageBo.toString().trim().startsWith("{")) {
			
			contentType = EOPDomain.CONTENT_TYPE_JSON_UTF8;
		}
		
		msgHead.put("Content-Type", contentType);
	}
	
	private void jsonTemplateBuild(JSONObject jsonObject,
			String jsonPath, String value) {
		if(jsonObject != null) {
			LOG.debug(jsonObject.toString());
		}
		if(!StringUtils.isEmpty(jsonPath)) {
			
			String[] paths = jsonPath.split("\\.");
			
			String lastKey = paths[paths.length-1];
			
			getObject(jsonObject, paths, 1, lastKey, value);
		}
	}
	


	private void getObject(Object object, String[] paths, int i,
			String lastKey, String lastValue) {
		
		/*if(object instanceof JSONObject) {
			
			if(((JSONObject)object).containsKey(lastKey)) {
				((JSONObject)object).remove(lastKey);
				((JSONObject)object).put(lastKey, lastValue);

				return;
			} else {
				
				getObject(((JSONObject)object).get(paths[i]),paths,i+1,lastKey, lastValue);
			}
		
		} else if (object instanceof JSONArray) {
			Iterator it = ((JSONArray)object).iterator();
			while(it.hasNext()) {
				Object subObj = it.next();
				getObject(subObj,paths,i+1,lastKey, lastValue);
			}
		}*/
		if(i==paths.length-1){
			JSONObject json = (JSONObject)object;
			json.put(lastKey, lastValue);
		}else{
			String path = paths[i];
			int seq = 0;
			if(path.contains("[")){
				String numberStr = path.substring(path.indexOf("[".toCharArray()[0])+1, path.indexOf("]".toCharArray()[0]));
				path = path.substring(0, path.indexOf("[".toCharArray()[0]));
				seq = Integer.parseInt(numberStr);
			}
			
			JSONObject json = (JSONObject)object;
			object = json.get(path);
			
			if(object instanceof JSONArray){
				JSONArray ja = (JSONArray)object;
				object = ja.get(seq);
			}
			
			getObject(object, paths, i+1,
					lastKey, lastValue) ;
		}
		
		
		
	}
		
}
