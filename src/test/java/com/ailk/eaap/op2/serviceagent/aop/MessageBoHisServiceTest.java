///** 
// * Project Name:o2p-serviceAgent-core 
// * File Name:MessageBoHisServiceTest.java 
// * Package Name:aop 
// * Date:2014年11月6日下午4:29:26 
// * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
// * 
// */
//
//package com.ailk.eaap.op2.serviceagent.aop;
//
//import java.sql.Timestamp;
//import java.util.Map;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//
//import bsh.EvalError;
//import bsh.Interpreter;
//
//import com.ailk.eaap.integration.o2p.script.jsr223.BshScriptExecutor;
//import com.ailk.eaap.op2.serviceagent.common.MessageBO;
//import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
//import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
//
///**
// * ClassName:MessageBoHisServiceTest 
// * Function: TODO ADD FUNCTION. 
// * Reason: TODO ADD REASON. 
// * Date: 2014年11月6日 下午4:29:26 
// * 
// * @author wuwz
// * @version
// * @since JDK 1.6
// * 
// */
//public class MessageBoHisServiceTest {
//	private ApplicationContext ctx;
//	private IMessageBoHisService ms = new MessageBoHisServiceImpl();
//	MessageBO messageBo = new MessageBO();
////	@Before
////	public void setUp(){
////		ctx = new ClassPathXmlApplicationContext(new String[]{
////				"eaap-op2-serviceAgent-spring.xml"});
////		ms = (MessageBoHisServiceImpl) ctx.getBean("messageBoHisSer");
////	}
////	public static void main(String[] args) {
////
////		IMessageBoHisService ms1 = new MessageBoHisServiceImpl();
////		MessageBO m = new MessageBO();
////		ms1.addMessageBo(1, m, "REQ");
////		IMessageBoHisService ms2 = new MessageBoHisServiceImpl();
//////		ms2.removeHis();
////		Map map1 = ms1.getMessageBoMap();
////		Map map2 = ms2.getMessageBoMap();
////		
////		System.out.println(Thread.currentThread().getName() + map1.toString());
////		System.out.println(Thread.currentThread().getName() + map2.toString());
////
////		MyThread mt = new MyThread("线程a"); 
////		mt.run();
////	}
//
//	@Before
//	public void addMessageBo() {
//		messageBo.setMsgBody("m1REQ");
//		ms.addMessageBo(1, messageBo, "REQ");
//		messageBo.setMsgBody("m1RSP");
//		ms.addMessageBo(1, messageBo, "RSP");
//		
//		messageBo.setMsgBody("m2REQ");
//		ms.addMessageBo(2, messageBo, "REQ");
//		messageBo.setMsgBody("m2RSP");
//		ms.addMessageBo(2, messageBo, "RSP");
//		
//		Map<String, MessageBO> map = ms.getMessageBoMap();
//		for(String key : map.keySet()) {
//			System.out.println(key+":"+map.get(key));
//		}
//	}
//
//	@Test
//	public void addTimestamp() {
//		ms.addTimestamp(1, new Timestamp(System.currentTimeMillis()), "REQ");
//		ms.addTimestamp(2, new Timestamp(System.currentTimeMillis()), "RSP");
//		Map<String, Timestamp> map = ms.getTimeMap();
//		for(String key : map.keySet()) {
//			System.out.println(key+":"+map.get(key));
//		}
//	}
//	
//	@Test
//	public void getLastReqMessageBo() {
//		MessageBO mb = ms.getLastReqMessageBo();
//		System.out.println(mb);
//	}
//	
//
//	@Test
//	public void getLastRspMessageBo() {
//		MessageBO mb = ms.getLastRspMessageBo();
//		System.out.println(mb);
//	}
//	
//	
//	@Test
//	public void getReqMessageBoByEpId() {
//		MessageBO mb = ms.getReqMessageBoByEpId(1);
//		System.out.println(mb);
//	}
//	
//	@Test
//	public void getRspMessageBoByEpId() {
//		MessageBO mb = ms.getRspMessageBoByEpId(1);
//		System.out.println(mb);
//	}
//	
//	@Test
//	public void getReqMessageBoByIndex() {
//		MessageBO mb = ms.getReqMessageBoByIndex(1);
//		System.out.println(mb);
//	}
//	
//
//	@Test
//	public void getRspMessageBoByIndex() {
//		MessageBO mb = ms.getRspMessageBoByIndex(1);
//		System.out.println(mb);
//	}
//	
//	@Test
//	public void getPreReqMessageBo() {
//		MessageBO mb = ms.getPreReqMessageBo(2);
//		System.out.println(mb);
//	}
//
//	@Test
//	public void getPreRspMessageBo() {
//		MessageBO mb = ms.getPreRspMessageBo(2);
//		System.out.println(mb);
//	}
//	
//
//	@Test
//	public void getNextReqMessageBo() {
//		MessageBO mb = ms.getNextReqMessageBo(1);
//		System.out.println(mb);
//	}
//	@Test
//	public void getNextRspMessageBo() {
//		MessageBO mb = ms.getNextRspMessageBo(1);
//		System.out.println(mb);
//	}
//	@Test
//	public void removeHis() {
//		ms.removeHis();
//		
//	}
//	
//	public static void main(String[] args) throws EvalError {
//		Interpreter interpreter = new Interpreter();
//		interpreter.eval("print(\"aa\"==\"bb\")");
//	}
//	
//}
