/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:BatchTest.java 
 * Package Name:com.ailk.eaap.o2p.agent.endpoint 
 * Date:2015年1月27日下午5:04:00 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.agent.endpoint;  

import java.io.File;
import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.ailk.eaap.op2.serviceagent.common.BatchStatus;
import com.ailk.eaap.op2.serviceagent.common.ExecutionContext;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.FlatFileReaderEndpoint;
import com.ailk.eaap.op2.serviceagent.route.service.batch.IBatchService;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointSpec;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;

/** 
 * ClassName:BatchTest  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年1月27日 下午5:04:00  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class BatchTest {

	private ApplicationContext ctx;
	private IBatchService batchService =  null;
	
	public void setUp(){
		ctx = new ClassPathXmlApplicationContext(new String[]{"o2p-serviceAgent-core-batch.xml"});
	}
	
	public void test() throws Exception{
		batchService =  (IBatchService)ctx.getBean("batchService");
		ThreadPoolTaskExecutor taskExecutor =  (ThreadPoolTaskExecutor)ctx.getBean("taskExecutor");
		FlatFileReaderEndpoint flatFileReaderEndpoint =  (FlatFileReaderEndpoint)ctx.getBean("flatFileReaderEndpoint");
		
		final RouteEndpoint re = new RouteEndpoint();
		Endpoint e = new Endpoint();
		e.setAttrMap(new HashMap());
		e.setEndpointSpecCode(EndpointSpec.FLAT_FILE_READER);
		re.setCurrentEndpoint(e);
		final MessageBO mb = new MessageBO();
		mb.setMsgBody(new File("d:/users.txt"));
		final ToRouteEndpoint tre = new ToRouteEndpoint();
		
		//任务已完成则直接返回
		ExecutionContext ec = batchService.getExecutionContext(mb);
		if(BatchStatus.COMPLETED.equals(ec.getStatus())) {
			
			return;
		}
		
		taskExecutor.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread--"+Thread.currentThread().getName());
				try {
					mb.setCurrryRouteEndpoint(re);//设置当前端点
//					batchService.execute(re, mb);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		System.out.println("Thread--"+Thread.currentThread().getName());
	}
	
	public static void main(String[] str) throws Exception {
		BatchTest bt = new BatchTest();
		bt.setUp();
		bt.test();
	}

}
