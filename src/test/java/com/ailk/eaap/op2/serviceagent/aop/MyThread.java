package com.ailk.eaap.op2.serviceagent.aop;

import java.util.Map;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;

class MyThread extends Thread {
		private String name;

		public MyThread(String name) {
			super();
			this.name = name;
		}

		public void run() {
			IMessageBoHisService ms1 = new MessageBoHisServiceImpl();
			MessageBO m = new MessageBO();
			ms1.addMessageBo(1, m, "REQ");
			IMessageBoHisService ms2 = new MessageBoHisServiceImpl();
//			Map map1 = ms1.getMessageBoMap();
//			Map map2 = ms2.getMessageBoMap();
//			System.out.println(Thread.currentThread().getName() + map1.toString());
//			System.out.println(Thread.currentThread().getName() + map2.toString());
		}
	}