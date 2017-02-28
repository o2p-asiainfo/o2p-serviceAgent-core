package com.ailk.eaap.op2.serviceagent.route.service;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import net.sf.json.JSONObject;
import ognl.Ognl;
import ognl.OgnlContext;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.o2p.common.security.SecurityUtil;
import com.ailk.eaap.o2p.security.SecurityType;
import com.ailk.eaap.op2.bo.CacheObj;
import com.ailk.eaap.op2.bo.CacheStrategy;
import com.ailk.eaap.op2.bo.Component;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.EndpointSpec;
import com.ailk.eaap.op2.bo.OriLogClob;
import com.ailk.eaap.op2.bo.TechImpl;
import com.ailk.eaap.op2.bo.TechImplNode;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.InType;
import com.ailk.eaap.op2.common.JsonUtil;
import com.ailk.eaap.op2.serviceagent.common.CallParamter;
import com.ailk.eaap.op2.serviceagent.common.EAAPAxisClient;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.HttpClientUtil;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.common.RestClient;
import com.ailk.eaap.op2.serviceagent.common.TuxedoClient;
import com.ailk.eaap.op2.serviceagent.saml.SAMLEntry;
import com.ailk.eaap.op2.serviceagent.saml.SAMLEntryOutgoing;
import com.ailk.eaap.op2.serviceagent.validate.service.IDstAuthenticationService;
import com.ailk.eaap.op2.serviceagent.validate.service.IDstFlowControlServ;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.TokenCache;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.jayway.jsonpath.JsonPath;
public class CallEndpointProcessor implements EndpointProcessor{

	private static final Logger logger = Logger.getLog(CallEndpointProcessor.class);
	private int  defaultTime ; 
	private IMemcacheManageServ cacheService;
	private IDstFlowControlServ dstFlowControlServ;
	private ITimeOutControlServ timeOutControlServ;
	@Resource(name="dstAuthenticationService")
	private IDstAuthenticationService dstAuthenticationService;
	private ICacheFactory<String, Object> cacheFactory;
	public ICacheFactory<String, Object> getCacheFactory() {
		return cacheFactory;
	}

	public void setCacheFactory(ICacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}


	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	public MessageBO process(Endpoint endpoint, MessageBO msg)
			throws BusinessException {
		// TODO Auto-generated method stub
		String address = "";
		int timeout = defaultTime;
		String returnStr = "";
		TechImpl tech = null;
		boolean ignoreException = false;
		
		try{
			Object obj = endpoint.getAttrMap().get(EndpointAttr.ServiceTechId);
			
			if(obj==null){
				throw new BusinessException(9066, "o2p-serviceagent-core.9066", new String[]{"EndpointAttr="+EndpointAttr.ServiceTechId}, null);
			}else{
				String serTechId = obj.toString();
				tech = (TechImpl) cacheService.getKey(CacheKey.techImpl+serTechId, msg.getTenant().getTenantId());
				
				if(logger.isDebugEnabled()) {
					logger.debug("serTechId="+serTechId);
				}
				
				if(tech==null){
					throw new BusinessException(9067, "o2p-serviceagent-core.9067", new String[]{"serTechId="+serTechId}, null);
				}
				
				if(!tech.getSerTechStatus().equals(EOPDomain.ONLINE)){
					throw new BusinessException(9069,"o2p-serviceagent-core.9069", new String[]{"techImplId="+tech.getTechImplId()+", online state="+EOPDomain.ONLINE}, null);
				}
				
				dstAuthenticationService.authen(tech, msg);
				
				if(endpoint.getEndpointSpecCode().equals(EndpointSpec.CALL)){
					Component comp = (Component)cacheService.getKey(CacheKey.Component+tech.getComponentCode(), msg.getTenant().getTenantId());
					msg.setDstComponent(comp);
					msg.setRegServiceCode(tech.getServiceCode());
					msg.setRegServiceVersion(tech.getServiceVersion());
					msg.setDstOrgID(comp.getOrg().getOrgCode());
					msg.setDstSyscode(comp.getCode());
				}
				
				
				Map urlMap = tech.getAttrMap();
				if(urlMap == null || urlMap.get(EndpointAttr.ADDRESS) == null){
					
					throw new BusinessException(9070, "o2p-serviceagent-core.9070", new String[]{"techImplId="+tech.getTechImplId()}, null);
				}else{
					
					address = (String)urlMap.get(EndpointAttr.ADDRESS);
					if(logger.isDebugEnabled()) {
						
						logger.debug("no encode address is:"+address);
					}
					//对参数进行转码
					address = enCode(address);
				}
				
				List<TechImplNode> tcps = tech.getTechImplNode();
				
				if(tcps!=null){
					for (TechImplNode techImplNode : tcps) {
						String exprStr = techImplNode.getRouteExpr();
						
						
						if(exprStr!=null){
							OgnlContext context = new OgnlContext();
							context.put("messageBO", msg);
							Object resultObj = Ognl.getValue(exprStr, msg);
							if(resultObj!=null && "true".equals(resultObj.toString())){
								String matchurl=this.regexAddress(address);
								address=address.replaceFirst(matchurl, techImplNode.getNodeIp()+":"+techImplNode.getNodePort());
							}
						}
						
					}
				}
								

								
				Object timeObj = tech.getAttrMap().get(EndpointAttr.TIMEOUT);
				
				if(timeObj!=null){
					if(!StringUtils.isEmpty(timeObj.toString())) {
						timeout = Integer.valueOf(timeObj.toString());
					}
				}
				
				String username = null;
				String password = null;
				String ContentType=null;
				if(msg.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()) != null) {
					
					ContentType = msg.getMsgHead().get(EOPDomain.CONTENT_TYPE.toLowerCase()).toString();
				}
				if(msg.getMsgHead().get(EOPDomain.CONTENT_TYPE) != null) {
					
					ContentType = msg.getMsgHead().get(EOPDomain.CONTENT_TYPE).toString();
				}

				if(StringUtils.isEmpty(ContentType)) {
					
					if(tech.getAttrMap().get(EndpointAttr.Content_type)!=null){
						ContentType = tech.getAttrMap().get(EndpointAttr.Content_type).toString();
					}
					ContentType = (ContentType==null?getContentType(endpoint.getInDataTypeCode()):ContentType);
				}
				if(tech.getAttrMap().get(EndpointAttr.USER_NAME)!=null){
					username = tech.getAttrMap().get(EndpointAttr.USER_NAME).toString();
				}
				if(tech.getAttrMap().get(EndpointAttr.PASSWORD)!=null){
					password = tech.getAttrMap().get(EndpointAttr.PASSWORD).toString();
					password = SecurityUtil.getInstance().decryMsg(password);
				}
				
				if(tech.getAttrMap().get(EndpointAttr.Ignore_Exception)!=null){
					String ignore = tech.getAttrMap().get(EndpointAttr.Ignore_Exception).toString();
					if("Y".equalsIgnoreCase(ignore.trim())){
						ignoreException=true;
					}
				}
				
				
				String keyStorePassword=null;
				String keyStore =null;
				
				String trustStorePassword=null;
				String trustStore =null;
				
				int port = 443;
							
				if(address.startsWith("https")){
					
					if(tech.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD)!=null&&!"".equals(tech.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD))){
						keyStorePassword = tech.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD).toString();
						//密码先解密
						keyStorePassword = SecurityUtil.getInstance().decryMsg(keyStorePassword);
					}
					
					if(tech.getAttrMap().get(EndpointAttr.KEY_STORE)!=null&&!"".equals(tech.getAttrMap().get(EndpointAttr.KEY_STORE))){
						keyStore = tech.getAttrMap().get(EndpointAttr.KEY_STORE).toString();
					}
					
					
					if(tech.getAttrMap().get(EndpointAttr.TRUST_STORE_PASSWORD)!=null&&!"".equals(tech.getAttrMap().get(EndpointAttr.TRUST_STORE_PASSWORD))){
						trustStorePassword = tech.getAttrMap().get(EndpointAttr.TRUST_STORE_PASSWORD).toString();
						//密码先解密
						trustStorePassword = SecurityUtil.getInstance().decryMsg(trustStorePassword);
					}
					
					if(tech.getAttrMap().get(EndpointAttr.TRUST_STORE)!=null&&!"".equals(tech.getAttrMap().get(EndpointAttr.TRUST_STORE))){
						trustStore = tech.getAttrMap().get(EndpointAttr.TRUST_STORE).toString();
					}
					
					if(tech.getAttrMap().get(EndpointAttr.PORT)!=null){
						String portStr = tech.getAttrMap().get(EndpointAttr.PORT).toString();
						if(!StringUtils.isEmpty(portStr)) {
							try {
								port = Integer.parseInt(portStr);
							} catch(Exception e) {
								logger.error(LogModel.EVENT_APP_EXCPT, e);
								port = 443;
							}
						}
					}
					
					if(logger.isDebugEnabled()) {
						logger.debug("keyStore="+keyStore+" keyStorePassword="+keyStorePassword+" trustStore="+trustStore+" trustStorePassword="+trustStorePassword);
					}
										
				}
										
				String proxyIp = null;
				String proxyPort = null;
				
				if(tech.getAttrMap().get(EndpointAttr.PROXY_IP)!=null){
					proxyIp = tech.getAttrMap().get(EndpointAttr.PROXY_IP).toString();				
				}
				if(tech.getAttrMap().get(EndpointAttr.PROXY_PORT)!=null){
					proxyPort = tech.getAttrMap().get(EndpointAttr.PROXY_PORT).toString();
										
				}
												
				dstFlowControlServ.flowControl(tech, msg);
				
				String reqStr = msg.toString();

				Object jksFileNameObj = endpoint.getAttrMap().get(EndpointAttr.KEY_STORE);
				if(jksFileNameObj!=null){
					String jksFileName = jksFileNameObj.toString(); 
					if(!jksFileName.equals("")){
						String storepass = endpoint.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD) ==null?"":endpoint.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD).toString();
						
						String alias = endpoint.getAttrMap().get(EndpointAttr.alias) ==null?"":endpoint.getAttrMap().get(EndpointAttr.alias).toString();
						
						String aliaspassword = endpoint.getAttrMap().get(EndpointAttr.keyPass) ==null?"":endpoint.getAttrMap().get(EndpointAttr.keyPass).toString();
						
						String subjectname = endpoint.getAttrMap().get(EndpointAttr.subjectName) ==null?"":endpoint.getAttrMap().get(EndpointAttr.subjectName).toString();
						
						SAMLEntry se  = new SAMLEntry(jksFileName, storepass, alias, aliaspassword,subjectname);
						
						reqStr = SAMLEntryOutgoing.processOutgoing(reqStr,se);
					}
					
				}

				Map<String,String> httpHead = new HashMap<String,String>();
				//添加协议头信息
				Map<String, Object> msgHead = msg.getMsgHead();
				if(msgHead != null){
					Set<Entry<String, Object>> set = msgHead.entrySet();
					for(Entry<String, Object> entry : set){
						httpHead.put(entry.getKey(), (String)entry.getValue());
					}
				}
				
				//请求落地方时间
				if(msg.getSourceContractInteraction().getCenterFwd2DstTime() == null) {
					msg.getSourceContractInteraction().setCenterFwd2DstTime(new Timestamp(System.currentTimeMillis()));
					msg.getSourceContractInteraction().setDstRecTime(new Timestamp(System.currentTimeMillis()));
				}
				
				
				Object statusOgnl = endpoint.getAttrMap().get(EndpointAttr.statusCodeNotThrowOgnl);
				Object needBreakOgnl = endpoint.getAttrMap().get(EndpointAttr.needBreakOgnl);
				

				// 1.如果cacheStrategy不为空，则意味着是获取token的端点；2.如果token未过期，则返回，不继续发送请求获取token
				Object cacheStrategyId = endpoint.getAttrMap().get("CACHE_STRATEGY");
				if (cacheStrategyId != null && StringUtils.isNotBlank(cacheStrategyId.toString())) {
					CacheStrategy cacheStrategy = (CacheStrategy) cacheService
							.getKey(CacheKey.CacheStrategy + cacheStrategyId,msg.getTenant().getTenantId());
					
					
					if ("2".equals(cacheStrategy.getForceRefresh())) {
						List<CacheObj> cacheObjs = cacheStrategy.getCacheObjs();
						for (CacheObj cacheObj : cacheObjs) {
							// 拆分+分割的key
							//String[] keySplit = cacheObj.getKeyRule().split("\\+");
							//String keyUserByPath = "";
							//String keyConstant = "";
							//keyUserByPath = keySplit[0];
							//if (keySplit.length == 2) {
							//	keyConstant = keySplit[1];
							//}
							String key = cacheObj.getKeyRule();
							//boolean isJsonReqStr=isJson(reqStr);
							//if(isJsonReqStr){
							//	JSONObject jb = JSONObject.fromObject(reqStr);
							//	key=JsonPath.read(jb, keyUserByPath)+ keyConstant;
							//}else{
							//	key = DocumentHelper.parseText(reqStr).selectSingleNode(keyUserByPath).getText()
							//			+ keyConstant;
							//}
							Object tokenCache = cacheFactory.getCacheClient().get(key);
							// 未过期
							if (tokenCache != null) {
								return msg;
							}
						}
					}
				}

				// 发送请求
								
				
				
				if(tech.getCommProCd().toString().equalsIgnoreCase(EOPDomain.HTTP_POST_PROTOCOL)){//http post
					if(!msg.getMessageMap().isEmpty()) {
						//address = address + "?"  + HttpClientUtil.getQueryString(msg.getMessageMap(), false);
						
						if(address.contains("?")){
							address = address + "&" + HttpClientUtil.getQueryString(msg.getMessageMap(), false);
						}else{
							address = address + "?" + HttpClientUtil.getQueryString(msg.getMessageMap(), false);
						}
						
					}
					if(logger.isDebugEnabled()){
						logger.debug("post method req url="+address+" reqStr"+reqStr);
					}
															
					returnStr = HttpClientUtil.sendRequest(msg, address, httpHead, reqStr, 
							ContentType, InType.post, 
							timeout,msg.getService().getServiceCnName(),username,password,
							proxyIp,proxyPort,trustStore,trustStorePassword,keyStore,keyStorePassword, port,statusOgnl,needBreakOgnl);
						
					
				}else if(tech.getCommProCd().toString().equalsIgnoreCase(EOPDomain.HTTP_GET_PROTOCOL)){// http get call
						if(!msg.getMessageMap().isEmpty()) {
							//address = address + "?"  + HttpClientUtil.getQueryString(msg.getMessageMap(), false);
							if(address.contains("?")){
								address = address + "&" + HttpClientUtil.getQueryString(msg.getMessageMap(), false);
							}else{
								address = address + "?" + HttpClientUtil.getQueryString(msg.getMessageMap(), false);
							}
						}
						if(logger.isDebugEnabled()){
							logger.debug("get method req url="+address+" reqStr"+reqStr);
						}
							
						returnStr = HttpClientUtil.sendRequest(msg, address, httpHead, reqStr, 
								ContentType, InType.get, timeout,
								msg.getService().getServiceCnName(),username,password,proxyIp,proxyPort,
								trustStore,trustStorePassword,keyStore,keyStorePassword, port,statusOgnl,needBreakOgnl);
				}
				else if(tech.getCommProCd().toString().equals(EOPDomain.WEBSERVICE)){//soap call
					returnStr = webServiceCall(msg, address, timeout, tech,
							username, password, proxyIp, proxyPort, reqStr);
					
					msg.setRequestURL(address);
					
				}else if(tech.getCommProCd().toString().equals(EOPDomain.WEBSERVICE_POST_PROTOCOL)){//soap-post,webservice call
					returnStr = webServicePostCall(msg, address, tech,
							username, password, proxyIp, proxyPort, reqStr,
							httpHead);
					
					msg.setRequestURL(address);
				}else if(tech.getCommProCd().toString().equals(EOPDomain.SOAP)){//soap-post,webservice call
					returnStr = soapCall(msg, address, tech, username,
							password, proxyIp, proxyPort, reqStr, httpHead);
					
					msg.setRequestURL(address);
				}
				
				else if(tech.getCommProCd().toString().equals(EOPDomain.TUXDO)){
					
					String returnparam = tech.getAttrMap().get(EndpointAttr.returnparam);
					String inparamname = tech.getAttrMap().get(EndpointAttr.inparamname);
					List<CallParamter> inparam = buildParamter(inparamname, msg);
					
					String charset = tech.getAttrMap().get(EndpointAttr.charset);
					String tuxedosessionname = tech.getAttrMap().get(EndpointAttr.tuxedosessionname);
					
					List<CallParamter> outparam = buildParamter(returnparam, msg);
					TuxedoClient.tuxedocall(address, timeout, charset, username, password, tuxedosessionname, inparam, outparam,msg.getMsgHead());
					
					msg.setRequestURL(address);
				}else if(tech.getCommProCd().toString().equals(EOPDomain.rest)){
					String restResource = tech.getAttrMap().get(EndpointAttr.restResource);
					String restAction = tech.getAttrMap().get(EndpointAttr.restAction);
					returnStr = RestClient.restCall(httpHead, restResource, restAction, address, msg,
							timeout,msg.getService().getServiceCnName(), 
							username,password,proxyIp,proxyPort,trustStore,trustStorePassword,keyStore,keyStorePassword, port,statusOgnl,needBreakOgnl);
				}
				
				

				// 更新缓存
				if (cacheStrategyId != null && StringUtils.isNotBlank(cacheStrategyId.toString())) {
					CacheStrategy cacheStrategy = (CacheStrategy) cacheService
							.getKey(CacheKey.CacheStrategy + cacheStrategyId,msg.getTenant().getTenantId());
					List<CacheObj> cacheObjs = cacheStrategy.getCacheObjs();
					for (CacheObj cacheObj : cacheObjs) {
						// 拆分+分割的key
						logger.debug("key rule:" + cacheObj.getKeyRule());
						//String[] keySplit = cacheObj.getKeyRule().split("\\+");
						//String keyUserByPath = ""; // 从xml或json中取值的路径
						//String keyConstant = ""; // key中定义的常量
						Object remoteExpireTime = 3600*24;
						//keyUserByPath = keySplit[0];
						//if (keySplit.length == 2) {
						//	keyConstant = keySplit[1];
						//}
						String key = cacheObj.getKeyRule();
						
						String tokenPath = cacheObj.getValuePath();
						String token = null;
						boolean isJson = isJson(returnStr);
						if (isJson) {
							JSONObject jb = JSONObject.fromObject(returnStr);
							token = JsonPath.read(jb, tokenPath);
							if(cacheStrategy.getExpireTimePath()!=null){
								try{
									remoteExpireTime = JsonPath.read(jb, cacheStrategy.getExpireTimePath());
								}catch(Exception e){
									remoteExpireTime = cacheStrategy.getExpireTime();
								}
								
							}else{
								remoteExpireTime = cacheStrategy.getExpireTime();
							}
						} else {
							Document doc = DocumentHelper.parseText(returnStr);
							if(tokenPath!=null){
								if(doc.selectSingleNode(tokenPath)!=null){
									token = doc.selectSingleNode(tokenPath).getText();
								}
							}
							
							
							if(token==null || token.equals("")){
								
								throw new BusinessException(9066, "o2p-serviceagent-core.9092", new String[]{"tokenPath="+tokenPath}, null);
							}
							if(cacheStrategy.getExpireTimePath()!=null){
								if(doc.selectSingleNode(cacheStrategy.getExpireTimePath())!=null){
									remoteExpireTime = doc.selectSingleNode(cacheStrategy.getExpireTimePath()).getText();
								}
							}
							
						}
						
						if (cacheFactory == null) {
							logger.info("cacheFactory is null", new Exception());
						} else {
							logger.info("cacheFactory not null", new Exception());
							if (cacheFactory.getCacheClient() == null) {
								logger.debug("cacheFactory.getCacheClient() is null");
							} else {
								logger.debug("cacheFactory.getCacheClient() not null");
							}
						}
						
						try {
							//this.getCacheFactory().getCacheClient().put("05221011", 10, "05221011msg");
							//logger.debug("key :05221011"+";expireTime:"+10+";msg:"+this.getCacheFactory().getCacheClient().get("05221011"));
							if (remoteExpireTime != null&&!"".equals(remoteExpireTime)) {
								logger.debug("remoteExpireTime:"+remoteExpireTime);
								Boolean flag= this.getCacheFactory().getCacheClient().put(key,Integer.parseInt(remoteExpireTime.toString()), token);
//								Boolean flag= this.getCacheFactory().getCacheClient().put(key, token);
								logger.debug("flag:"+flag+"key :"+key+";expireTime:"+remoteExpireTime.toString()+";token:"+token);
							} else {
								if (cacheStrategy.getExpireTime() != null&&!"".equals(cacheStrategy.getExpireTime())) {
									logger.debug("cacheStrategy.getExpireTime():"+cacheStrategy.getExpireTime());
									Boolean flag= this.getCacheFactory().getCacheClient().put(key, cacheStrategy.getExpireTime(),token);
//									Boolean flag= this.getCacheFactory().getCacheClient().put(key,token);
									logger.debug("flag:"+flag+"key :"+key+";expireTime:"+cacheStrategy.getExpireTime()+";token:"+token);
								} else {
									Boolean flag= this.getCacheFactory().getCacheClient().put(key, 3600 * 24, token);
//									Boolean flag= this.getCacheFactory().getCacheClient().put(key,  token);
									logger.debug("flag:"+flag+"key :"+key+";expireTime:"+3600*24+";token:"+token);
								}
							}
						} catch (Exception e) {
							logger.debug(e.getMessage(),e);
							logger.error(e.getMessage(),e);
							this.getCacheFactory().getCacheClient().put(key, 3600 * 24, token);
							logger.debug("key :"+key+";expireTime:"+3600*24+";token:"+token);
						}
						

					}

				}
				
				
				msg.setReqorrsp(EOPDomain.RSP_FLAG);
				
				Object pathObj = tech.getAttrMap().get(EndpointAttr.Path);
				String path = null;
				
				if(pathObj!=null){
					path = pathObj.toString();
					returnStr = CommonUtil.cutSoapMessage(path,returnStr);
					
				}

				if(endpoint.getOutDataTypeCode().equals(DataType.XML) ){
					
					if(endpoint.getOutDataTypeCode().equals(DataType.JSON)){
						try{
							returnStr = JsonUtil.json2xml(returnStr);
							OriLogClob jsontoXmlOrg = new OriLogClob();
							jsontoXmlOrg.setMsg(returnStr);
							jsontoXmlOrg.setReqOrRes(EOPDomain.RSP_FLAG);
							
							jsontoXmlOrg.setSrcTranId(msg.getTransactionID());
							msg.getLogMessageObject().getOriLogClobList().add(jsontoXmlOrg);
						}catch(Exception e){
							
							throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{e.getMessage()}, null);
						}
					}
					
				}
				
				if(logger.isDebugEnabled()) {
					logger.debug("return str"+returnStr);
				}
				
				if(logger.isDebugEnabled()) {
					logger.debug("call endpoint success!");
				}
			}
			
			Object businessExcepCodeExpr = endpoint.getAttrMap().get(EndpointAttr.BusinessExceptionCode);
			Object businessExcepDescExpr = endpoint.getAttrMap().get(EndpointAttr.BusinessExceptionDesc);
			
			logger.debug("businessExcepCodeExpr"+businessExcepCodeExpr);
			logger.debug("businessExcepDescExpr"+businessExcepDescExpr);
			buildBusinessException(returnStr, businessExcepCodeExpr, businessExcepDescExpr);
			
			
		}catch(BusinessException e){
			if(ignoreException){ // 2015/09/09 Ingnore Exception ,continue messageFlow 
				logger.error("CallEndptiont Exception ,but Ingore Exception value is true.so continue messageflow Business. "+e.toString());
				return msg;
			}
			if(tech!=null){
				dstFlowControlServ.subtraThreadNum(tech);
			}
			if(e.getResult().getCode().equals("9016") && timeOutControlServ != null){
				timeOutControlServ.timeOutControl(tech);
			}
			logger.error(LogModel.EVENT_APP_EXCPT, e);
			throw e;
		}catch(Exception e){
			logger.error(LogModel.EVENT_APP_EXCPT, e);
			throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{"callEndpointProcessor error "}, e);
		} finally {
			//接收落地方时间
			msg.getSourceContractInteraction().setDstReplyTime(new Timestamp(System.currentTimeMillis()));
			msg.getSourceContractInteraction().setCenterRecDstTime(new Timestamp(System.currentTimeMillis()));
			
			msg.setMsgBody(returnStr);
			if(tech != null && tech.getService() != null && tech.getService().getContractVersion() != null) {
				msg.getRspVersionMsg().put(tech.getService().getContractVersion().getVersion(), msg.toString());
			}
		}
		return msg;
	}

	
	private static void  buildBusinessException(String returnStr,Object codePath,Object msgPath) throws BusinessException{
		
		if(codePath==null){
			return ;
		}
		try{
			String code = null;
			String msg = null;
			if(returnStr.startsWith("<")){
				Document doc = DocumentHelper.parseText(returnStr);
				
				Node codeNode = doc.selectSingleNode(codePath.toString());
				code = codeNode==null?null:codeNode.getText();
				
				if(msgPath!=null){
					Node msgNode = doc.selectSingleNode(msgPath.toString());
					msg = msgNode==null?null:msgNode.getText();
				}
				if(code!=null){
					throw new BusinessException(code, msg);
				}
				
				
			}else  if(returnStr.startsWith("{")){
				
				code = JsonPath.read(returnStr, codePath.toString());
				
				if(msgPath!=null){
					code = JsonPath.read(returnStr, msgPath.toString());
				}
				if(code!=null){
					throw new BusinessException(code, msg);
				}
				
				
			}
		}catch(BusinessException e){
			throw e;
		}
		catch(Exception e){
			logger.error("build business exception error",e);
		}
		
		return ;
		
		
	}

	private String webServicePostCall(MessageBO msg, String address,
			TechImpl tech, String username, String password, String proxyIp,
			String proxyPort, String reqStr, Map<String, String> httpHead)
			throws BusinessException {
		String returnStr;
		if(logger.isDebugEnabled()) {
			logger.debug(address);
			logger.debug(msg.toString());
		}
		
		String returnparam = null;
		if(tech.getAttrMap().get(EndpointAttr.returnparam)!=null){
			
			returnparam = tech.getAttrMap().get(EndpointAttr.returnparam);
		}
		if(logger.isDebugEnabled()) {
			logger.debug(returnparam);
		}
		
		
		
		String keyStorePassword=null;
		String keyStore =null;
		String trustStorePassword=null;
		String trustStore =null;
					
		if(address.startsWith("https")){
							
			
			if(tech.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD)!=null){
				keyStorePassword = tech.getAttrMap().get(EndpointAttr.KEY_STORE_PASSWORD).toString();
			}
			
			if(tech.getAttrMap().get(EndpointAttr.KEY_STORE)!=null){
				keyStore = tech.getAttrMap().get(EndpointAttr.KEY_STORE).toString();
			}
			
			if(tech.getAttrMap().get(EndpointAttr.TRUST_STORE_PASSWORD)!=null){
				trustStorePassword = tech.getAttrMap().get(EndpointAttr.TRUST_STORE_PASSWORD).toString();
			}
			
			if(tech.getAttrMap().get(EndpointAttr.TRUST_STORE)!=null){
				trustStore = tech.getAttrMap().get(EndpointAttr.TRUST_STORE).toString();
			}
			
			if(logger.isDebugEnabled()) {
				logger.debug("keyStore="+keyStore+" keyStorePassword="+keyStorePassword+" trustStore="+trustStore+" trustStorePassword="+trustStorePassword);
			}
								
		}
		
		String returnMsg = null;
		
		if((trustStorePassword!=null&&trustStore!=null)||(keyStorePassword!=null&keyStore!=null)){
			
			if(logger.isDebugEnabled()) {
				logger.debug("call webService https...");
			}
			HttpClientUtil.webserviceSend(address, httpHead, reqStr, 10, msg.getService().getServiceCnName(), returnparam,username,password,proxyIp,proxyPort,trustStore,trustStorePassword,keyStore,keyStorePassword);
			
		}else{
			
			returnMsg = HttpClientUtil.webserviceSend(address, httpHead, reqStr, 10, msg.getService().getServiceCnName(), returnparam,username,password,proxyIp,proxyPort);
			
		}
		if(logger.isDebugEnabled()) {
			logger.debug("first msg"+returnMsg);
		}

		if(returnparam!=null){
			returnMsg = CommonUtil.cutSoapMessage(returnparam, returnMsg) ;
			if(logger.isDebugEnabled()) {
				logger.debug("after translate msg"+returnMsg);
			}
		}
		returnStr = returnMsg;
		return returnStr;
	}

	private static String regexAddress(String address){
		 
		 String regex="//(.*?)/(.*)";
		 Pattern p=Pattern.compile(regex);
		 Matcher m=p.matcher(address);
		 while(m.find()){
			return m.group(1);
		 }
		 return null;
	}

	private String webServiceCall(MessageBO msg, String address, int timeout,
			TechImpl tech, String username, String password, String proxyIp,
			String proxyPort, String reqStr) throws BusinessException {
		String returnStr;
		String methodName = EAAPAxisClient.defaultMethodName;
		
		if(tech.getAttrMap().get(EndpointAttr.METHOD_NAME) != null){
			methodName = tech.getAttrMap().get(EndpointAttr.METHOD_NAME);
		}
		
		String nameSpace = EAAPAxisClient.defaultNameSpace;
		if(tech.getAttrMap().get(EndpointAttr.namespace) != null){
			nameSpace = tech.getAttrMap().get(EndpointAttr.namespace);
		}
		
		String inparamname = EAAPAxisClient.defaultInparamname;
		if(tech.getAttrMap().get(EndpointAttr.inparamname)!= null){
			inparamname = tech.getAttrMap().get(EndpointAttr.inparamname);
		}
		
		String inparamnamespace = EAAPAxisClient.defaultInparamnamespace;
		if(tech.getAttrMap().get(EndpointAttr.inparamnamespace) != null){
			inparamnamespace = tech.getAttrMap().get(EndpointAttr.inparamnamespace);
		}
		StringBuffer reqmsg = new StringBuffer();
		if(tech.getAttrMap().get(EndpointAttr.inMsg) != null){//HEAD:transid;PATH:/contract/tcpcont/srcorgcode;BODY;FIXED:1;MIX:|:PATH?A,BODY,FIXED?12
			
			String inMsg = tech.getAttrMap().get(EndpointAttr.inMsg);
			String inMsgs[] = inMsg.split("#!");
			
			for (int i = 0; i < inMsgs.length; i++) {
				String getMsgStr = inMsgs[i];
				
				String[] getMsgStrs = getMsgStr.split(":");
			
				if(i!=0 && i!=inMsgs.length){
					
					reqmsg.append("#!");
				}
				if(!getMsgStrs[0].equals("MIX")){
					reqmsg.append(getValue(msg, getMsgStrs[0], getMsgStrs[1]));
				}else if(getMsgStrs[0].equals("MIX")){
					String operator = getMsgStrs[1];
					String mixKeys[] = getMsgStrs[2].split(",");
					
					StringBuffer value = new StringBuffer();
					for (int j = 0; j < mixKeys.length; j++) {
						String mixKey[] = mixKeys[j].split("\\?");
						
						Object subValue = getValue(msg, mixKey[0], mixKey[1]);
						
						if(j!=0 && j!=mixKeys.length){
							
							value.append(operator);
						}
						value.append(subValue);
						
					}
				
					reqmsg.append(value);
				
				}
				
				
			}
		}else{
			reqmsg.append(reqStr);
		}
		if(logger.isDebugEnabled()) {
			logger.debug("REQ:"+reqmsg);
		}
		returnStr = EAAPAxisClient.sendWebServiceReq(methodName,nameSpace,inparamname,inparamnamespace,reqmsg.toString(),address,timeout,username,password,proxyIp,proxyPort);
		return returnStr;
	}


	private String soapCall(MessageBO msg, String address, TechImpl tech,
			String username, String password, String proxyIp, String proxyPort,
			String reqStr, Map<String, String> httpHead) throws BusinessException {
		String returnStr;
		
		String nameSpace = null;
		if(tech.getAttrMap().get(EndpointAttr.namespace)!=null){
			nameSpace = tech.getAttrMap().get(EndpointAttr.namespace);
		}
		String header = null;
		if(tech.getAttrMap().get(EndpointAttr.header)!=null){
			header = tech.getAttrMap().get(EndpointAttr.header);
		}
		
		String methodName = null;
		if(tech.getAttrMap().get(EndpointAttr.METHOD_NAME)!=null){
			methodName = tech.getAttrMap().get(EndpointAttr.METHOD_NAME);
		}
		
		String methodSpace = null;
		if(tech.getAttrMap().get(EndpointAttr.methodnamespace)!=null){
			methodSpace = tech.getAttrMap().get(EndpointAttr.methodnamespace);
		}
		
		String paramName = null;
		if(tech.getAttrMap().get(EndpointAttr.inparamname)!=null){
			paramName = tech.getAttrMap().get(EndpointAttr.inparamname);
		}
		String paramNameSpace = null;
		if(tech.getAttrMap().get(EndpointAttr.inparamnamespace)!=null){
			paramName = tech.getAttrMap().get(EndpointAttr.inparamnamespace);
		}
		String needCDATA = null;
		if(tech.getAttrMap().get(EndpointAttr.needCDATA)!=null){
			paramName = tech.getAttrMap().get(EndpointAttr.needCDATA);
		}
		if(logger.isDebugEnabled()) {
			logger.debug("beforebuildsoap"+reqStr);
		}
		
		reqStr = buildSoap(nameSpace, header, methodName, methodSpace, paramName, paramNameSpace, needCDATA, reqStr);
		if(logger.isDebugEnabled()) {
			logger.debug("afterbuildsoap"+reqStr);
		}
		
		String returnparam = null;
		if(tech.getAttrMap().get(EndpointAttr.returnparam)!=null){
			
			returnparam = tech.getAttrMap().get(EndpointAttr.returnparam);
		}
		if(logger.isDebugEnabled()) {
			logger.debug(returnparam);
		}
		
		
		String returnMsg = HttpClientUtil.webserviceSend(address, httpHead, reqStr, 10, msg.getService().getServiceCnName(), returnparam,username,password,proxyIp,proxyPort);
		if(logger.isDebugEnabled()) {
			logger.debug("first msg"+returnMsg);
		}
		

		if(returnparam!=null){
			returnMsg = CommonUtil.cutSoapMessage(returnparam, returnMsg) ;
			if(logger.isDebugEnabled()) {
				logger.debug("after translate msg"+returnMsg);
			}
			
		}
		
		
		
		returnStr = returnMsg;
		return returnStr;
	}
	
	
	public static String buildSoap(String namespace,String header,String methodName,String methodSpace,String paramName,String paramNameSpace,String needCDATA,String msg){
		StringBuffer sb = new StringBuffer();
		sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"");
		
		if(namespace!=null){
			sb.append(" ");
			sb.append(namespace);
		}
		sb.append(">");
		sb.append("<soapenv:Header>");
		if(header!=null){
			sb.append(header);
		}
		sb.append("</soapenv:Header>");
		sb.append("<soapenv:Body>");
		
		if(methodName!=null){
			sb.append("<");
			sb.append(methodName);
			if(methodSpace!=null){
				sb.append(" ");
				sb.append(methodSpace);
			}
			sb.append(">");
			
		}
		
		if(paramName!=null){
			sb.append("<");
			sb.append(paramName);
			if(paramNameSpace!=null){
				sb.append(" ");
				sb.append(paramNameSpace);
			}
			sb.append(">");
		}
		
		
		if(needCDATA==null || needCDATA.equalsIgnoreCase("FALSE") ){
			sb.append("<![CDATA[");
			
		}
		sb.append(msg);
		if(needCDATA==null || needCDATA.equalsIgnoreCase("FALSE")){
			sb.append("]]>");
		}
		
		if(paramName!=null ){
			sb.append("</");
			sb.append(paramName);
			sb.append(">");
			
		}
		if(methodName!=null){
			sb.append("</");
			sb.append(methodName);
			sb.append(">");
		}
		sb.append("</soapenv:Body>");
		sb.append("</soapenv:Envelope>");
		return sb.toString();
	}
	
	private String getContentType(String dataType){
		if(DataType.XML.equals(dataType) || DataType.SOAP.equals(dataType)){
			return InType.CONTENT_TYPE_XML_UTF8;
		} else if(DataType.JSON.equals(dataType)){
			return InType.CONTENT_TYPE_PLAIN_UTF8;
		}else{
			return InType.CONTENT_TYPE_PLAIN_UTF8;
		}
	}

	

	private String getValue(MessageBO msg,String sign,String key){//  HEAD:transid,PATH:/contract/tcpcont/srcorgcode,BODY,FIXED:1
		if("HEAD".equals(sign)){
			return msg.getMsgHead().get(key) == null ? null : msg.getMsgHead().get(key).toString();
		}
		else if("BODY".equals(sign)){
			return msg.toString() ;
		}
		else if("FIXED".equals(sign)){
			return key;
		}
		else if("PATH".equals(sign)){
			Document xmldoc = (Document) msg.getMsgBody();
			List<Node> nodes = xmldoc.selectNodes(key);
			
			if(nodes!=null && nodes.size()>0){
				return nodes.get(0).getText();
			}else{
				return null;
			}
		}else{
			return null;
		}
		
	}
	
	
	
	public void subtraThreadNum(String servId) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	public IDstFlowControlServ getDstFlowControlServ() {
		return dstFlowControlServ;
	}

	public void setDstFlowControlServ(IDstFlowControlServ dstFlowControlServ) {
		this.dstFlowControlServ = dstFlowControlServ;
	}

	public ITimeOutControlServ getTimeOutControlServ() {
		return timeOutControlServ;
	}

	public int getDefaultTime() {
		return defaultTime;
	}

	public void setDefaultTime(int defaultTime) {
		this.defaultTime = defaultTime;
	}

	public void setTimeOutControlServ(ITimeOutControlServ timeOutControlServ) {
		this.timeOutControlServ = timeOutControlServ;
	}

	public static List<CallParamter> buildParamter(String paramters ,MessageBO msg){
		String ins[] = paramters.split(",");
		if(ins!=null && ins.length>0){
			List<CallParamter> callparams = new ArrayList<CallParamter>();
			for (int i = 0; i < ins.length; i++) {
				String sub[] = ins[i].split(":");
				CallParamter call = new CallParamter();
				call.setKey(sub[1]);
				call.setType(sub[0]);
				call.setValue(msg.getMsgHead().get(sub[1]));
				callparams.add(call);
			}
			return callparams;
		}else{
			return null;
		}
	}
	private Date getExpireTime(Integer expireTime) {
		Calendar rightNow = Calendar.getInstance();
		try {
			rightNow.add(Calendar.MINUTE, expireTime);
		} catch (Exception e) {
			rightNow.add(Calendar.MINUTE, 60*12);
		}
		return rightNow.getTime();
	}

	private boolean isHead(String valuePath) {
		if (valuePath.trim().toLowerCase().indexOf("$head:") != -1) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isJson(String returnStr) {
		if ("{".equals(returnStr.trim().substring(0, 1))) {
			return true;
		} else {
			return false;
		}
	}

	private static String enCode(String uri) throws UnsupportedEncodingException {

		String[] uris = uri.split("\\?");
		
		if(uris!=null && uris.length == 2) {
			StringBuilder sb = new StringBuilder();
			sb.append(uris[0]);
			sb.append("?");
			String params[] = uris[1].split("&");
			if(params!=null){
				for (int i = 0; i < params.length; i++) {
					String kv[] = params[i].split("=");
					if(kv!=null){
						String key = kv[0];
						String value = "";
						if(kv.length==2){
							value = kv[1];
							if(value!=null){
								value = HttpClientUtil.encodeURL(value, false);
							}
						}
						if(i!=0){
							sb.append("&");
						}
						sb.append(key);
						sb.append("=");
						sb.append(value);
					}
					
				}
			}
			
			uri = sb.toString();
		}
		return uri;
	}
}
