/** 
 * Project Name:serviceAgent-core 
 * File Name:ValidateNodeDesc.java 
 * Package Name:com.asiainfo.eaap.o2p.validate 
 * Date:2015年1月25日上午9:58:31 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.eaap.o2p.validate;  


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.validate.service.ValidateServ;
import com.ailk.eaap.op2.bo.NodeDesc;

/** 
 * ClassName:ValidateNodeDesc  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月25日 上午9:58:31  
 * @author   zhongming 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class ValidateNodeDesc {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws IOException {
		MessageBO<String> bo = new MessageBO<String>();
		String srcDataPath = "com/asiainfo/eaap/o2p/validate/11.csv";
		Resource srcDataResource = new ClassPathResource(srcDataPath);
		bo.setMsgBody(srcDataResource.getFile().toString());
		List<NodeDesc> list =new ArrayList<NodeDesc>();
		NodeDesc nodeHeader = new NodeDesc();
		nodeHeader.setNodeType("1");
		nodeHeader.setNodePath("[][1]");
		nodeHeader.setNodeLengthCons("F12");
		list.add(nodeHeader);
		NodeDesc nodeHeader2 = new NodeDesc();
		nodeHeader2.setNodeType("1");
		nodeHeader2.setNodePath("[][2]");
		nodeHeader2.setNodeLengthCons("V12-V18");
		list.add(nodeHeader2);
		NodeDesc nodeBody = new NodeDesc();
		nodeBody.setNodeType("2");
		nodeBody.setNodePath("[][1]");
		nodeBody.setNevlConsType("5");
		nodeBody.setNevlConsValue("54200-55470");
		list.add(nodeBody);
		
		ValidateServ v = new ValidateServ();
		v.csvValidate(bo, list, null);
	}

}
