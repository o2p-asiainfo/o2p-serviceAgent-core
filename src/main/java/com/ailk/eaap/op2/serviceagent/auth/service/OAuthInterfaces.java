package com.ailk.eaap.op2.serviceagent.auth.service;
import java.util.Map;
public interface OAuthInterfaces {
	void authorizationRequest(String client_id,String client_secret,String redirect_uri);
	void authorizationGrant();
	Map<String,Map<String,String>> authorizationGrant(String client_id,String client_secret,String redirect_uri);
	String getAccessTokenByCode();
}
