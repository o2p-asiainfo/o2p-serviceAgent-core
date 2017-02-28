package com.ailk.eaap.op2.serviceagent.taskflag;


public interface ITaskCacheService {
	
	void updateMemcache(String taskStyle,String[] taskCacheFlag,final Integer status);
	
	public boolean currentTaskAllowExcute(String[] taskKeys, String taskStyle, int parallelismDegree);
	
	public boolean isConcurrencyTask(String taskStyle);

	boolean isErrorExcutor(String taskStyle, String[] taskCacheFlag);

	boolean regAndUpdateMemcache(String taskStyle, String[] taskKeys, Integer parallelismDegree, Integer taskStatusRunning, Integer tenantId);

	boolean changeRunningTaskNum(String[] taskKeys, final int changeType, final int changeCount, final int parallelismDegree);
	
	void setServerIdentifyUUID(String serverIdentifyUUID);
}
