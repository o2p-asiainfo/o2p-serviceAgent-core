package com.ailk.eaap.op2.serviceagent.auth.bo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class OAuthConfig {
	private static Properties pros = new Properties();
	private static Log log = LogFactory.getLog(OAuthConfig.class);
	static{
		InputStream resourceAsStream = null;
		try {
			resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");
			pros.load(resourceAsStream);
		} catch (IOException e) {
			log.error(e.getStackTrace());
		}finally{
			if(resourceAsStream!=null){
				try {
					resourceAsStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					log.error("OAuth load configure error", e);
				}
			}
		}
	}
	
	private OAuthConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Properties getPros() {
		return pros;
	}
}
