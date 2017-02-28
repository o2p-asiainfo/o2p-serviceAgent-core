/** 
 * Project Name:serviceAgent-core 
 * File Name:ognlJunit.java 
 * Package Name:com.ailk.eaap.o2p.ognl 
 * Date:2014年11月27日下午2:34:08 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.ognl;  

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.junit.Before;
import org.junit.Test;

import com.ailk.eaap.integration.o2p.model.ContractBody;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/** 
 * ClassName:ognlJunit  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2014年11月27日 下午2:34:08  
 * @author   zhongming 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class ognlJunit {

	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void test() throws OgnlException {
		Map<String, String> map = new HashMap<String, String>();
		map.put("12", "111");
		map.put("a2", "222");
		
		MessageBO bo = new MessageBO();
		bo.setMessageMap(map);
		bo.setIp("1.2.3.4");
		
		ContractBody body = new ContractBody();
		Map<Integer, Object> min = new HashMap<Integer, Object>();
		min.put(112, "value");
		body.setSrcMapVals(min);
		bo.setContractBody(body);
		
		OgnlContext context = new OgnlContext();  
		context.put(" ", bo);

		bo.getMsgHead().put("IP", "1.2.3.5");
		System.out.println(Ognl.getValue("ip", bo));
		System.out.println(Ognl.getValue("msgHead['IP']", bo));
		System.out.println(Ognl.getValue("messageMap['12']", bo));
		System.out.println(Ognl.getValue("contractBody.srcMapVals[112]", bo));
	}

}
