package com.ailk.eaap.op2.serviceagent.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bea.jolt.JoltMessage;
import bea.jolt.JoltRemoteService;
import bea.jolt.JoltSession;
import bea.jolt.JoltSessionAttributes;

import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.DataType;

/**
 * 
 * tuxdo客户端<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author litieyang Sep 12, 2013
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */
public final class TuxedoClient {

	private static final Logger LOG = Logger.getLog(TuxedoClient.class);
	private static final String CHARSET = "bea.jolt.encoding";
	
	private TuxedoClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public static void tuxedocall(String address,int timeout,String charset, String username,String password,String sessionname,List<CallParamter> callParamters,List<CallParamter> returnParamters,Map<String,Object> map) {
		JoltSessionAttributes sattr = null;
		JoltRemoteService toupper = null;
		 // 角色
		String userRole = "";
		sattr = new JoltSessionAttributes();
		// 设置jolt编码，与tuxedo环境的字符编码一样
		System.setProperty(CHARSET, charset);
		// 设置tuxedo地址
		sattr.setString(JoltSessionAttributes.APPADDRESS,address); 
		// TIMEOUT时间
		sattr.setInt(JoltSessionAttributes.IDLETIMEOUT, timeout);
		JoltSession session = null;
		
		try{
			session = new JoltSession(sattr, username, userRole, password, "");
			// 设置总控
			toupper = new JoltRemoteService(sessionname, session); 
			if(callParamters!=null && callParamters.size()>0){
				
				for (CallParamter callParamter : callParamters) {
					if(callParamter.getType().equals(DataType.INT)){
						//设置参数
						toupper.setInt(callParamter.getKey(),Integer.parseInt((String) callParamter.getValue()));
					}else if(callParamter.getType().equals(DataType.STRING)){
						//设置参数
						toupper.setString(callParamter.getKey(), (String) callParamter.getValue());
					}else if(callParamter.getType().equals(DataType.LIST_INTEGER)){
						List<Integer> list = (List<Integer>) callParamter.getValue();
						for(int i = 0 ; i < list.size() ; i ++){
							toupper.setIntItem(callParamter.getKey(), i, list.get(i));
						}
					}else if(callParamter.getType().equals(DataType.LIST_STRING)){
						List<String> list = (List<String>) callParamter.getValue();
						for(int i = 0 ; i < list.size() ; i ++){
							toupper.setStringItem(callParamter.getKey(), i,(String) list.get(i));
						}
					}
				}
				if(LOG.isDebugEnabled()) {
					LOG.debug("Call Texdo：" + toupper.getInputs());
				}
				// 调用，并返回结果
				toupper.call(null); 
				JoltMessage jm = toupper.getOutputs();
				if(LOG.isDebugEnabled()) {
					LOG.debug("Texdo return：" + jm);
				}
				
				if(returnParamters!=null && returnParamters.size()>0){
					for (CallParamter returnParamter : returnParamters) {
						if(returnParamter.getType().equals(DataType.INT)){
							int def = jm.getIntDef(returnParamter.getKey(),-1);
							map.put(returnParamter.getKey(), def+"");
						}else if (returnParamter.getType().equals(DataType.STRING)){
							String  def = jm.getStringDef(returnParamter.getKey(),"");
							map.put(returnParamter.getKey(), def);
						}else if(returnParamter.getType().equals(DataType.LIST_INTEGER)){
							List<Integer> list = new ArrayList<Integer>();
							int size = jm.getOccurrenceCount(returnParamter.getKey());
							for(int i = 0 ; i < size ; i ++){
								int value = jm.getIntItemDef(returnParamter.getKey(), i, -1);
								list.add(Integer.valueOf(value));
							}
							map.put(returnParamter.getKey(), list);
						}else if(returnParamter.getType().equals(DataType.LIST_STRING)){
							List<String> list = new ArrayList<String>();
							int size = jm.getOccurrenceCount(returnParamter.getKey()); 
							for(int i = 0 ; i < size ; i ++){
								String value = jm.getStringItemDef(returnParamter.getKey(), i, "");
								list.add(value);
							}
							map.put(returnParamter.getKey(), list);
						}
					}
				}
				
			}
			

			
		}catch (Exception e) {
			LOG.error(LogModel.EVENT_APP_EXCPT, "call tuxedoclient error",e);
			throw new BusinessException(9999,"o2p-serviceagent-core.9999", new String[]{"call tuxedoclient error"+e.getMessage()}, e);
		} finally {
			if(toupper != null){
				// 清除信息，清除后将不能获得返回的信息
				toupper.clear();
			}
			if(session != null){
				// 释放连接
				session.endSession();
			}
		}
		
		
	}
}
