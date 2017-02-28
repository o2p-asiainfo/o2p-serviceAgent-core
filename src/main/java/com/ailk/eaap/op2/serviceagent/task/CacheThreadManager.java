package com.ailk.eaap.op2.serviceagent.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.ailk.eaap.o2p.common.cache.CacheThread;
import com.ailk.eaap.op2.common.IThreadManagerService;

public class CacheThreadManager implements IThreadManagerService{

	private CacheThread[] cacheThreads;
	private int threadNum=1;
	private ExecutorService sendMsgService ;
	public void start() {
		sendMsgService = Executors.newFixedThreadPool(threadNum);
		for(int i = 0 ; i < threadNum ; i ++){
			cacheThreads[i].setRun(true);
			Thread thread=new Thread(cacheThreads[i]);
			thread.setDaemon(true);
		}
	}

	public void stop() {
		if(cacheThreads.length>0){
			for (int i = 0; i < cacheThreads.length; i++) {
				cacheThreads[i].setRun(false);
			}
		}
		sendMsgService.shutdown();
	}

	public int getThreadNum() {
		return threadNum;
	}

	public void setThreadNum(int threadNum) {
		this.threadNum = threadNum;
	}

	public ExecutorService getSendMsgService() {
		return sendMsgService;
	}

	public void setSendMsgService(ExecutorService sendMsgService) {
		this.sendMsgService = sendMsgService;
	}

}
