/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:TestResponse.java 
 * Package Name:com.ailk.eaap.o2p.response 
 * Date:2015年8月19日上午10:31:12 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.response;  

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/** 
 * ClassName:TestResponse  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年8月19日 上午10:31:12  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class TestResponse {

	public static void main(String[] args) {
		
		String jsonPath = "$.hub_value.code";
		String value = "im code";
		JSONObject jsonObject = JSONObject.fromObject("{\"hub_code\":\"0\",\"hub_value\":[{\"code\":\"AIHUB0013\",\"value\":\"Failed to get valid request parameters information!\"}],\"data\":{\"commonResponse\":{\"isSuccess\":\"0\",\"messageList\":{\"resultCode\":\"\",\"resultMessage\":\"FAILED\"}}}}");
//		jsonObject.remove("hub_value");
//		jsonObject.put("$.hub_value.code","我是code");
		System.out.println(jsonObject.toString());
		jsonTemplateBuild(jsonObject, jsonPath, value);
		System.out.println(jsonObject.toString());
		jsonTemplateBuild(jsonObject, "$.hub_code", "我是hubcode");
		
		System.out.println(jsonObject.toString());
		
		
		//组装最底层对象
//		if(objList.get(paths.length-1) instanceof JSONObject) {
//			JSONObject obj = (JSONObject)objList.get(paths.length-1);
//			obj.remove(paths[paths.length-1]);
//			obj.put(paths[paths.length-1], value);
//			System.out.println(obj.toString());
//		}  
		
//		for(int i=paths.length-1; i>=0; i--) {
//		
//			if(objList.get(i) instanceof JSONArray) {
//				
//				JSONArray array = (JSONArray)objList.get(i);
//				if(i==paths.length-1) {
//					array.
//				}
//				array.
//				
//			} else if ("obj".equals(objType[i])) {
//				
//				jsonObj =  new JSONObject(); 
//				jsonObj.put(paths[i], value);
//			}
//		} 
//		
//		if(jsonObject2 instanceof JSONArray) {
//			JSONArray jsonArray = (JSONArray)jsonObject2;
//			jsonArray.
//		}
//		
//		System.out.println(jsonObject2.toString());

	}

	private static void jsonTemplateBuild(JSONObject jsonObject,
			String jsonPath, String value) {

		String[] paths = jsonPath.split("\\.");
		List<Object> objList = new ArrayList<Object>();
		
		JSONObject lastObj = new JSONObject();
		String lastKey = paths[paths.length-1];
		lastObj.put(lastKey, value);
		
		getObject(objList, jsonObject, paths, 1, lastKey, value);
		
	}

	private static void getObject(List<Object> objList, Object object, String[] paths, int i,
			String lastKey, String lastValue) {
		
		if(object instanceof JSONObject) {
			
			if(((JSONObject)object).containsKey(lastKey)) {
				((JSONObject)object).remove(lastKey);
				((JSONObject)object).put(lastKey, lastValue);

				return;
			} else {
				
				getObject(objList, ((JSONObject)object).get(paths[i]),paths,i+1,lastKey, lastValue);
			}
		
		} else if (object instanceof JSONArray) {
			Iterator it = ((JSONArray)object).iterator();
			while(it.hasNext()) {
				Object subObj = it.next();
				getObject(objList, subObj,paths,i+1,lastKey, lastValue);
			}
		}
		
	}

}
