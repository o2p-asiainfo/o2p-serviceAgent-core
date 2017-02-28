package com.ailk.eaap.op2.serviceagent.auto;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * 对相关方法进行过滤,如果没有权限则不让调用,有权限则放行
 * @author MAWL
 *
 * @param <T>
 */
public class AutoInvocationHandler<T> implements InvocationHandler {
	private T obj;
	//放行方法
	private String pass_method;
	private static Log log = LogFactory.getLog(AutoInvocationHandler.class);
	public AutoInvocationHandler(T obj,String pass_method){
		this.obj = obj;
		this.pass_method = pass_method;
	}
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if(null != pass_method && !"".equals(pass_method)){
			String[] array_method = pass_method.split(",");
			List<String> list_method = new ArrayList<String>();
			for(String methods : array_method){
				list_method.add(methods);
			}
			if(list_method.contains("all")){
				//如果有配置全部放行,则全部放行。
				return method.invoke(obj, args);
				//如果没有，则针对有配置的方法放行
			}else{
				for(String compare_method : list_method){
					if(methodName.startsWith(compare_method.trim())){
						return method.invoke(obj, args);
					}
				}
			}
		}
		if (log.isDebugEnabled()) {
			log.debug("No permission to read method:" + methodName);
		}
		return null;
	}

}
