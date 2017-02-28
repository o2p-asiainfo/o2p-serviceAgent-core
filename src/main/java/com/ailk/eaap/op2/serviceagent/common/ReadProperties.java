package com.ailk.eaap.op2.serviceagent.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;
/**
 * 
 * @author litieyang
 *
 */
public final class ReadProperties {
	private static final Log log = LogFactory.getLog(ReadProperties.class);
	private static ReadProperties readProperties = null;
	private static Properties dbProps = new Properties();
	private static String fileName;
	
	private ReadProperties(){
		
		InputStream is=null;
		
		try{
			
			if(!StringUtils.hasText(this.fileName)){
				is = this.getClass().getClassLoader().getResourceAsStream("messages/internation_en_US.properties");
			} else {
				final String fn = this.fileName;
				is = this.getClass().getClassLoader().getResourceAsStream(fn);
			}
		}catch(Exception e){
			log.error(e.getStackTrace());
	    }finally{
	    	if(is!=null){
	    		
	    		try {
					is.close();
				} catch (IOException e) {
					log.error("release resource stream exception:", e);
				}
	    	}
				
	    }
	    dbProps = new Properties();
        try {
            dbProps.load(is);
            if(is != null) {
            	is.close();
            }
        }catch (Exception e) {
        	log.error(e.getStackTrace());
        }
	    
	}
	
	public static synchronized  ReadProperties getInstance(){
		if(readProperties==null){
			readProperties = new ReadProperties();
		}
		return readProperties;
	}

	
	
	public static String getFileName() {
		return fileName;
	}

	public static void setFileName(String fileName) {
		ReadProperties.fileName = fileName;
	}

	public static String readValueBykey(String key){
		try {
			
			String value = dbProps.getProperty(key);
			
			return value;
		} catch (Exception e) {
			return "error"+e ;
		}
		 
	}
	
}
