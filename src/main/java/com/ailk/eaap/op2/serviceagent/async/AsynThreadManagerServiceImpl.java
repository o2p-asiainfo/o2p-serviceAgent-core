package com.ailk.eaap.op2.serviceagent.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.common.IThreadManagerService;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;

public class AsynThreadManagerServiceImpl implements IThreadManagerService{

	private String threadNum;
	private IQueueIHelper queueIHelper;
	private IRouteServ routeServ;
	private ExecutorService sendMsgService ;
	private AsynThread[] asynThreads ;
	private String defalutHead;
	public void start() {
		// TODO Auto-generated method stub
		asynThreads = new AsynThread[Integer.parseInt(threadNum)];
		sendMsgService = Executors.newFixedThreadPool(Integer.parseInt(threadNum));
		for(int i = 0 ; i < Integer.parseInt(threadNum) ; i ++){
			asynThreads[i] = new AsynThread(queueIHelper,routeServ,defalutHead);
			asynThreads[i].setRunflag(true);
		}
	}
	public void stop() {
		// TODO Auto-generated method stub
		if(asynThreads.length>0){
			for (int i = 0; i < asynThreads.length; i++) {
				asynThreads[i].setRunflag(false);
			}
		}
		sendMsgService.shutdown();
	}
	public String getThreadNum() {
		return threadNum;
	}
	public void setThreadNum(String threadNum) {
		this.threadNum = threadNum;
	}
	public IQueueIHelper getQueueIHelper() {
		return queueIHelper;
	}
	public void setQueueIHelper(IQueueIHelper queueIHelper) {
		this.queueIHelper = queueIHelper;
	}
	public IRouteServ getRouteServ() {
		return routeServ;
	}
	public void setRouteServ(IRouteServ routeServ) {
		this.routeServ = routeServ;
	}
	public ExecutorService getSendMsgService() {
		return sendMsgService;
	}
	public void setSendMsgService(ExecutorService sendMsgService) {
		this.sendMsgService = sendMsgService;
	}
	public String getDefalutHead() {
		return defalutHead;
	}
	public void setDefalutHead(String defalutHead) {
		this.defalutHead = defalutHead;
	}
	
	
	
	
}
