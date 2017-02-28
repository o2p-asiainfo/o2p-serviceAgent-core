package com.ailk.eaap.op2.serviceagent.auth.bo;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String phoneNumbetr;
	private String password;
	public String getPhoneNumbetr() {
		return phoneNumbetr;
	}
	public void setPhoneNumbetr(String phoneNumbetr) {
		this.phoneNumbetr = phoneNumbetr;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
