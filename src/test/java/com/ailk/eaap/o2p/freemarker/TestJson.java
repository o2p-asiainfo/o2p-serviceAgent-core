/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:TestJson.java 
 * Package Name:com.ailk.eaap.o2p.freemarker 
 * Date:2015年9月11日上午9:55:25 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.freemarker;  

import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/** 
 * ClassName:TestJson  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年9月11日 上午9:55:25  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class TestJson {

	public static void main(String[] args) {
		JSONArray ja = JSONArray.fromObject("[{\"transactionID\":\"${messageBO.transactionID}\",\"RspCode\":\"200\",\"RspDesc\":\"1200\"}]");
		Iterator it = ja.iterator();
		JSONObject jo = (JSONObject)it.next();
		System.out.println(jo.toString());
		
	}

}
