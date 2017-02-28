package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Api;
import com.ailk.eaap.op2.bo.App;
import com.ailk.eaap.op2.bo.AppAccToken;
import com.ailk.eaap.op2.bo.AppApiList;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.UserInfo;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Jul 17, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class GenerateTokenProcessor implements EndpointProcessor{

	private IMemcacheManageServ cacheService;
	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	private static final Logger LOG = Logger.getLogger(GenerateTokenProcessor.class);
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		try{
			Object reqorrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
			Object pathObj = endpoint.getAttrMap().get(EndpointAttr.Path);
			Object tokenPathObj = endpoint.getAttrMap().get(EndpointAttr.tokenpath);
			if(pathObj==null || reqorrspObj==null ||tokenPathObj == null){
				throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.never_config_userinfo_path);
			}
			String reqorrsp = reqorrspObj.toString();
			String pathstr = pathObj.toString();
			String productNbr = null;
			Document xmldoc = (Document) msg.getMsgBody();
			if(reqorrsp.equals(EOPDomain.REQ_FLAG)){
				if(endpoint.getInDataTypeCode().equals(DataType.UrlGet)){
					Object productNbrObj = msg.getMessageMap().get(pathstr);
					if(productNbrObj==null){
						throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9003,ErrorDomain.req_xml_lost_userinfo_error+":"+pathstr);
					}else{
						productNbr = productNbrObj.toString();
					}
				}
				
				if(endpoint.getInDataTypeCode().equals(DataType.XML)){
					Node productNbrObj = xmldoc.selectSingleNode(pathstr);
					
					if(productNbrObj==null){
						throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9003,ErrorDomain.req_xml_lost_userinfo_error+":"+pathstr);
					}else{
						productNbr = productNbrObj.getText();
					}
				}
			}else{
				if(endpoint.getOutDataTypeCode().equals(DataType.XML)){
					Node productNbrObj = xmldoc.selectSingleNode(pathstr);
					if(productNbrObj==null){
						throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9003,ErrorDomain.req_xml_lost_userinfo_error+":"+pathstr);
					}else{
						productNbr = productNbrObj.getText();
					}
				}
			}
			App app = (App)cacheService.getKey(CacheKey.AppComp+msg.getSrcsyscode(), msg.getTenant().getTenantId());
			
			
			
			AppAccToken aat = new AppAccToken();
			String accessToken = CommonUtil.generalAccessToken(app.getComponentCode(),"access_token");
			
			UserInfo userInfo = new UserInfo();
			userInfo.setProductNbr(productNbr);
			
			aat.setAccToken(accessToken);
			String oauthApiIds = "";
			aat.setAppId(app.getAppId());
			aat.setApp(app);
			List<AppApiList> apis = app.getAppApiList();
			List<Api> apiList = new ArrayList<Api>();
			if(apis!=null){
				for (int j = 0; j < apis.size(); j++) {
					AppApiList appApi = apis.get(j);
					oauthApiIds += appApi.getApiId();
					if(j!=apis.size()-1){
						oauthApiIds += ",";
					}
					
					Api api = (Api)cacheService.getKey(CacheKey.Api+appApi.getApiMethod(), msg.getTenant().getTenantId());
					apiList.add(api);
				}
			}
			aat.setOauthApiList(oauthApiIds);
			aat.setUserInfo(userInfo);
			aat.setApis(apiList);
			
			String tokenpath = tokenPathObj.toString();
			String paths[] = tokenpath.split("/");
			String nodeStr = paths[paths.length-1];
			String parentPath = tokenpath.substring(0, tokenpath.length()-nodeStr.length()-1);
			
			Document doc = xmldoc;
			Element node = (Element)doc.getRootElement().selectNodes(parentPath).get(0);
			
			Element itemElement = DocumentHelper.createElement(nodeStr);
			itemElement.setText(accessToken);
			node.add(itemElement);
			
			cacheService.addToken();
			
			return msg;
		}catch(EAAPException e){
			throw e;
		}catch(Exception e){
			LOG.error("generateTokenprocessor",e);
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.system_error,e);
		}
		
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

}
