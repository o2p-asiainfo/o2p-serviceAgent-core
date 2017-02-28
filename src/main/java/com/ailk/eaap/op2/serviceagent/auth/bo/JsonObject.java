package com.ailk.eaap.op2.serviceagent.auth.bo;

import java.util.HashMap;
import java.util.Map;

import com.ailk.eaap.op2.serviceagent.auth.service.OAuthInterfaces;



public class JsonObject implements OAuthInterfaces{
	private Map<String,String> oauthMap = new HashMap<String,String>();
	public Map<String, String> getOauthMap() {
		return oauthMap;
	}
	public void setOauthMap(Map<String, String> oauthMap) {
		this.oauthMap = oauthMap;
	}
	
	public void authorizationRequest(String client_id, String client_secret,
			String redirect_uri) {
		oauthMap.put("client_id",client_id);
		oauthMap.put("redirect_uri",redirect_uri);
		
	}
	
	public void authorizationGrant() {
		
	}
	
	public Map<String, Map<String, String>> authorizationGrant(String client_id, String client_secret, String redirect_uri) {
		return null;
	}
	
	public String getAccessTokenByCode() {
		return null;
	}
}
