package com.ailk.eaap.op2.serviceagent.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.lang.ArrayUtils;

import com.ailk.eaap.op2.common.IThreadManagerService;

public class TaskThreadManager implements IThreadManagerService{

	private TaskListener[] taskListeners;
	private int threadNum;
	private ExecutorService sendMsgService ;
	public void start() {
		// TODO Auto-generated method stub
		sendMsgService = Executors.newFixedThreadPool(threadNum);
		for(int i = 0 ; i < threadNum ; i ++){
			taskListeners[i].setRun(true);
		}
	}

	public void stop() {
		// TODO Auto-generated method stub
		if(taskListeners.length>0){
			for (int i = 0; i < taskListeners.length; i++) {
				taskListeners[i].setRun(false);
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

	public void setTaskListeners(TaskListener[] taskListeners) {
		if(!ArrayUtils.isEmpty(taskListeners)){
			this.taskListeners = (TaskListener[]) ArrayUtils.clone(taskListeners);
		}
	}
}
