package com.ailk.eaap.op2.serviceagent.task;

import org.apache.log4j.Logger;
/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Sep 4, 2013
 * <hr>
 * <hr>
 * <hr>
 */
public class TaskListener extends Thread{

	private static final Logger logger = Logger.getLogger(TaskListener.class);
	
	private boolean runParm = false;
	private ITaskJobService taskJobService;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(runParm){
			try{
				taskJobService.triggerJob();
				this.sleep(5*60*1000);
			}catch(Exception e){
				logger.error("listener task error",e);
			}
			
		}
	}
	public boolean isRun() {
		return runParm;
	}
	public void setRun(boolean runParm) {
		this.runParm = runParm;
	}
	public ITaskJobService getTaskJobService() {
		return taskJobService;
	}
	public void setTaskJobService(ITaskJobService taskJobService) {
		this.taskJobService = taskJobService;
	}
	
	
}
