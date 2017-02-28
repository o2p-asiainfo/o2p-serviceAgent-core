package com.ailk.eaap.op2.serviceagent.auth.bo;

import com.ailk.eaap.op2.bo.App;

public class ClientObj {

	private App app;
	private String code;
	private String accessToken;
	private String refreshToken;
	private String redirectUri;
	public App getApp() {
		return app;
	}
	public void setApp(App app) {
		this.app = app;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRedirectUri() {
		return redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}
	
}
