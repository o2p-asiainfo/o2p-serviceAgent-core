package com.ailk.eaap.op2.serviceagent.validate.service;

import java.util.List;
import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.exception.MemcachedException;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Node;
import org.wltea.expression.ExpressionEvaluator;

import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.security.SecurityUtil;
import com.ailk.eaap.o2p.common.util.CacheUtil;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.AppAccToken;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.ProofEffect;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.ailk.eaap.op2.bo.Service;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.jayway.jsonpath.JsonPath;

@org.springframework.stereotype.Service
public class ProofServ implements IProofService {

	private static final Logger log = Logger.getLogger(ProofServ.class);
	private IMemcacheManageServ cacheService;
	private CacheFactory<String, Object> cacheFactory;
	private static final String PASSWORD="password";
	private static final String IPBLACK="ipBlack";
	private static final String IPWHITE="ipWhite";
	private static final String PSDSIGN="psdSign";
	private static final String TOKEN="token";
	private static final String AND="&&";
	
	private boolean isContain(Service service,List<Api> apis){
		boolean isContain = false;
		
		for (Api api : apis) {

			if(api.getServiceId()==(service.getServiceId())){
				isContain = true;
			}
		}
		return isContain;
	}

	
	@Override
	public void authen (MessageBO<?> messageBo) throws TimeoutException, InterruptedException, MemcachedException{
			StringBuffer sb = new StringBuffer("");
			
			SerInvokeIns si = messageBo.getSerInvokeIns();
			log.debug("SerInvokeIns id is: "+si.getSerInvokeInsId());
			String press = si.getAuthExpress();
			log.debug("authExpress is: "+press);
			Object password = cacheService.getKey(CacheKey.ProofValues+PASSWORD+messageBo.getSerInvokeIns().getSerInvokeInsId(), messageBo.getTenant().getTenantId());
			Object ipBlack = cacheService.getKey(CacheKey.ProofValues+IPBLACK+messageBo.getSerInvokeIns().getSerInvokeInsId(), messageBo.getTenant().getTenantId());
			Object ipWhite = cacheService.getKey(CacheKey.ProofValues+IPWHITE+messageBo.getSerInvokeIns().getSerInvokeInsId(), messageBo.getTenant().getTenantId());
			Object psdSign = cacheService.getKey(CacheKey.ProofValues+PSDSIGN+messageBo.getSerInvokeIns().getSerInvokeInsId(), messageBo.getTenant().getTenantId());
			Object token = cacheService.getKey(CacheKey.ProofValues+TOKEN+messageBo.getSerInvokeIns().getSerInvokeInsId(), messageBo.getTenant().getTenantId());
			
			if(password == null && ipBlack ==null && ipWhite ==null && psdSign == null && token == null) {
				log.debug("password, ipBlack, ipWhite, psdSign, token auth all not configed! please check the key is the same cache mode?");
				return;
			}
			
			boolean flag = false;
			//表达式为空，则全部验证
			if(StringUtils.isEmpty(press)){
				press = "";
				if(password != null) {
					press+=PASSWORD;
				}
				if(ipBlack != null) {
					press+=AND+IPBLACK;
				}
				if(ipWhite != null) {
					press+=AND+IPWHITE;
				}
				if(psdSign != null) {
					press+=AND+PSDSIGN;
				}
				if(token != null) {
					press+=AND+TOKEN;
				}
				if(press.startsWith(AND)) {
					press = press.replaceFirst(AND, "");
				}
			}
			if(press.contains(PASSWORD)){
				press = press.replaceFirst(PASSWORD, String.valueOf(this.passwordCheck(password,messageBo,sb)));
			}
			if(press.contains(IPBLACK)){
				press = press.replaceFirst(IPBLACK, String.valueOf(this.ipBlackCheck(ipBlack,messageBo,sb)));
			}
			if(press.contains(IPWHITE)){
				press = press.replaceFirst(IPWHITE, String.valueOf(this.ipWhiteCheck(ipWhite,messageBo,sb)));
			}
			if(press.contains(PSDSIGN)){
				press = press.replaceFirst(PSDSIGN, String.valueOf(this.psdSignCheck(psdSign,messageBo,sb)));
			}
			if(press.contains(TOKEN)){
				press = press.replaceFirst(TOKEN, String.valueOf(this.tokenCheck(token,messageBo,sb)));
			}
			
			log.debug("the express is:"+press);
			
			Object result=ExpressionEvaluator.evaluate(press, null);  
			
			log.debug("the evaluate result is:"+result);
			
			flag = Boolean.valueOf(String.valueOf(result));
			sb.append(" Authentication failed, please confirm whether O2P have the authority to corresponding [password, IP, ipBlack ipWhite, psdSignpsdSign]");
			if(!flag){
				throw new BusinessException(9001,"o2p-serviceagent-core.9001",new String[]{sb.toString()}, null);
			}
	}
	public boolean passwordCheck(Object password,MessageBO<?> messageBo, StringBuffer sb)  {
		if(password!=null){
			ProofEffect pfs = (ProofEffect)password;
			if(EOPDomain.NORMAL.equals(pfs.getStatus())){
				String srcpsd = messageBo.getSign();
				Object passwordObj = pfs.getAtts().get(EndpointAttr.PASSWORD);
				if(passwordObj==null){
					log.debug("Component authentication not configured");
					return false;
				}
				//密码先解密
				passwordObj = SecurityUtil.getInstance().decryMsg(passwordObj.toString());
				if(StringUtils.isEmpty(srcpsd) || !passwordObj.toString().equals(srcpsd)){
					log.debug("Component pd error, request pd is:"+srcpsd+", configed pd is :"+passwordObj.toString());
					return false;
				}
			}
		}else{
			log.debug("Component authentication not configured,return false");
			return false;
		}
		log.debug("password,return true");
		return true;
	}
 	public boolean ipBlackCheck(Object ipBlack,MessageBO<?> messageBo, StringBuffer sb)  {
 		if(ipBlack!=null){
			ProofEffect pfs = (ProofEffect)ipBlack;
			if(EOPDomain.NORMAL.equals(pfs.getStatus())){
				Object ipadressObj = pfs.getAtts().get(EndpointAttr.IP_ADDRESS);
				if(ipadressObj==null){
					sb.append("IP list not configured");
					return false;
				}
				String ipStr = ipadressObj.toString();
				String ips[] = ipStr.split(";");
				if(ips!=null){
					for (int i = 0; i < ips.length; i++) {
						String ip = ips[i];
						if(ip.contains(messageBo.getIp())){
							sb.append("Initiating IP "+messageBo.getIp()+" no access right");
							return false;
						}
					}
				}
			}
		}else{
			log.debug("ipBlack,return false");
			return false;
		}
 		log.debug("ipBlack,return true");
		return true;
	}
	public boolean ipWhiteCheck(Object ipWhite,MessageBO<?> messageBo, StringBuffer sb)  {
		if(ipWhite!=null){
			ProofEffect pfs = (ProofEffect)ipWhite;
			if(EOPDomain.NORMAL.equals(pfs.getStatus())){
				Object ipadressObj = pfs.getAtts().get(EndpointAttr.IP_ADDRESS);
				if(ipadressObj==null){
					sb.append("IP list not configured");
					return false;
				}
				
				String ipStr = ipadressObj.toString();
				String ips[] = ipStr.split(";");
				boolean iswhite = false;
				if(ips!=null){
					for (int i = 0; i < ips.length; i++) {
						String ip = ips[i];
						if(ip.contains(messageBo.getIp())){
							iswhite = true;
						}
					}
				}
				if(!iswhite){	
					sb.append("Initiating IP "+messageBo.getIp()+" no access right");
					return false;
				}
			}
		}else{
			return false;
		}
		log.debug("ipWhite,return true");
		return true;
	}
	public boolean psdSignCheck(Object psdSign,MessageBO<?> messageBo, StringBuffer sb)  {
		if(psdSign!=null){
			ProofEffect pfs = (ProofEffect)psdSign;
			if(EOPDomain.NORMAL.equals(pfs.getStatus())){
				Object encryptTypeObj = pfs.getAtts().get(EndpointAttr.encrtyptType);
				//生成摘要的报文节点
				Object expressObj = pfs.getAtts().get(EndpointAttr.express);
				String express = expressObj == null ? "" : expressObj.toString();
				String encryptType = null;
				String charSet = null;
				String key = null;
				if(encryptTypeObj!=null){
					encryptType = encryptTypeObj.toString();
					
				}
				Object  charSetObj = pfs.getAtts().get(EndpointAttr.charset);
				if(charSetObj!=null){
					charSet = charSetObj.toString();
				}
				Object keyObj = pfs.getAtts().get(EndpointAttr.encryptkey);
				if(keyObj!=null){
					key = keyObj.toString();
				}
				String encryptCode = EncryptSign.encrypt(encryptType, charSet, key, messageBo, express);
				if(log.isDebugEnabled()) {
					log.debug("encryptCode:"+encryptCode);
					log.debug("sign:"+messageBo.getSign());
				}
				if(messageBo.getSign() == null ||
						!encryptCode.equalsIgnoreCase(messageBo.getSign())){
					sb.append("Digital signature authentication error");
					return false;
				}
			}
		}else{
			return false;
		}
		log.debug("psdSign,return true");
		return true;
	}
	public boolean tokenCheck(Object token, MessageBO<?> messageBo, StringBuffer sb) throws TimeoutException, InterruptedException, MemcachedException {
		   Document xmldoc = null;
		   JSONObject jsonObject = null;
		   if( messageBo.getMsgBody() instanceof Document) {
				xmldoc = (Document) messageBo.getMsgBody();
		   }
		   if( messageBo.getMsgBody() instanceof JSONObject) {
			   jsonObject = (JSONObject)messageBo.getMsgBody();
		   }
        if(token!=null){
			ProofEffect pfs = (ProofEffect)token;
			if(EOPDomain.NORMAL.equals(pfs.getStatus())){
				Object tokenpathObj = pfs.getAtts().get(EndpointAttr.tokenpath);
				Object usernamepathObj = pfs.getAtts().get(EndpointAttr.Path);
				Object tokenValueObj= null;
				String tokenValue = null;
				Object usernameObj = null;
			    String username = null;
				if(xmldoc != null){
					if(tokenpathObj!=null){
						tokenValueObj = xmldoc.selectSingleNode(tokenpathObj.toString());
					}else{
						tokenValueObj = xmldoc.selectSingleNode(MessageBO.Default_XML_Token);
					}
					if(tokenValueObj==null){
						sb.append("lost token info ");
						return false;
					}
					Node node = (Node)tokenValueObj;
					tokenValue = node.getText();
					
					if (usernamepathObj != null)
			            usernameObj = xmldoc.selectSingleNode(usernamepathObj.toString());
			          else {
			            usernameObj = xmldoc.selectSingleNode("/ContractRoot/TcpCont/Username");
			          }
			          if (usernameObj == null) {
			            sb.append("lost username info ");
			            return false;
			          }
			          node = (Node)usernameObj;
			          username = node.getText();
				}else if(jsonObject != null){
					if(tokenpathObj!=null){
						tokenValueObj = JsonPath.read(jsonObject.toString(), tokenpathObj.toString());
					}else{
						tokenValueObj = JsonPath.read(jsonObject.toString(), MessageBO.Default_JSON_Token);
					}
					if(tokenValueObj==null){
						sb.append("lost token info ");
						return false;
					}else{
						tokenValue = tokenValueObj.toString();
					}
					
					if (usernamepathObj != null)
			            usernameObj = JsonPath.read(jsonObject.toString(), usernamepathObj.toString());
			          else {
			            usernameObj = JsonPath.read(jsonObject.toString(), MessageBO.Default_JSON_Username);
			          }
			          if (usernameObj == null) {
			            sb.append("lost username info ");
			            return false;
			          }
			          username = usernameObj.toString();
				} else {
					if(tokenpathObj!=null){
						tokenValueObj = messageBo.getMessageMap().get(tokenpathObj.toString());
					}else{
						tokenValueObj = messageBo.getMessageMap().get("AccessToken");
					}
	
					if(tokenValueObj==null){
						sb.append("lost token info ");
						return false;
					}else{
						tokenValue = tokenValueObj.toString();
					}
				}
			
				Object tokObj = this.cacheFactory.getCacheClient().get(CacheUtil.getTokenKey(messageBo.getSerInvokeIns(), messageBo.getTenant().getTenantId().toString(), username));
		        if ((tokObj == null) || (!(tokObj.equals(tokenValue)))) {
		          sb.append("Access token verification error ");
		          return false;
		        }
				//Object tokObj = cacheService.getKey(CacheKey.token+tokenValue); 2015/4/30 java读取不到，改为从memcache读取
//				Object tokObj = cacheFactory.getCacheClient().get(CacheKey.token+tokenValue);
//				App app = (App)cacheService.getKey(CacheKey.AppComp+messageBo.getSrcsyscode(), messageBo.getTenant().getTenantId());
//				if(messageBo.getApp()==null &&app!=null){
//					messageBo.setApp(app);
//				}
//				if(tokObj==null){
//					sb.append("Access token verification error ");
//					return false;
//				}else{
//
//					AppAccToken aat = (AppAccToken)tokObj;
//					
//					if(!aat.getApp().getComponentCode().equals(app.getComponentCode())){
//						sb.append("Access token verification error ");
//						return false;
//					}
//					
//					List<Api> apis = aat.getApis();
//					if(!isContain(messageBo.getService(),apis)){
//						sb.append("Access token not authorized to access the API ");
//						return false;
//					}else if(messageBo.getApp().getAppOauthType().equals(EOPDomain.user_auth)){
//							
//						Object pathObj = pfs.getAtts().get(EndpointAttr.Path);
//						if(pathObj==null){
//							sb.append("User information not configured ");
//							return false;
//						}
//					}
//				}
			}
		}else {
			return false;
		}
     log.debug("token,return true");
		return true;
	}

	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}
	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}
	public CacheFactory<String, Object> getCacheFactory() {
		return cacheFactory;
	}
	public void setCacheFactory(CacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}

}
