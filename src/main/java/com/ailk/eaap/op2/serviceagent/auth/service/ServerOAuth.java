package com.ailk.eaap.op2.serviceagent.auth.service;

import java.util.HashMap;
import java.util.Map;
import com.ailk.eaap.op2.serviceagent.auth.bo.JsonObject;
import com.linkage.rainbow.util.StringUtil;



public class ServerOAuth {
	private static String access_token;
	private static String expires_in;
	private static JsonObject json = new JsonObject();
	public static JsonObject getJson() {
		return json;
	}
	public static void setJson(JsonObject json) {
		ServerOAuth.json = json;
	}

	public static boolean isPermitted() {
		if (json == null) {
			return false;
		} else if (!(json.getOauthMap().get("client_id").equals("shansj")
				&& json.getOauthMap().get("client_secret").equals("ssjian2512") && json
				.getOauthMap().get("redirect_uri") != null)) {
			return false;
		}
		return true;
	}

	public static void genericAccessToken() {
		access_token = System.currentTimeMillis()
				+ json.getOauthMap().get("client_id")
				+ json.getOauthMap().get("client_secret");
		expires_in = "3600";
		json.getOauthMap().put("access_token", access_token);
		json.getOauthMap().put("expires_in",expires_in);
	}
	
	public static String genericCode(String client_id){
		return StringUtil.Md5(client_id+"code"+System.currentTimeMillis()+StringUtil.makeAwardNo(9999));
		
	}
	
	public static String generalAccessToken(String client_id,String key){

		return StringUtil.Md5(client_id+key+System.currentTimeMillis()+StringUtil.makeAwardNo(9999));
		
	}
}
