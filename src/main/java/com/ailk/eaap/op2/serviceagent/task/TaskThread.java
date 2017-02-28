package com.ailk.eaap.op2.serviceagent.task;

public class TaskThread implements Runnable{

	private ITaskJobService taskJobService;
	
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			taskJobService.triggerJob();
		}
	}

	public ITaskJobService getTaskJobService() {
		return taskJobService;
	}

	public void setTaskJobService(ITaskJobService taskJobService) {
		this.taskJobService = taskJobService;
	}

}
