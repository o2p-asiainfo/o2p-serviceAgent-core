package com.ailk.eaap.op2.serviceagent.taskflag.impl;

import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.util.CacheUtil;
import com.ailk.eaap.o2p.common.util.LocalUtils;
import com.ailk.eaap.o2p.common.util.zookeeperUtil.DistributedConsistencyHelper;
import com.ailk.eaap.o2p.common.util.zookeeperUtil.ZooKeeperCodeCallBack;
import com.ailk.eaap.o2p.common.util.zookeeperUtil.ZooKeeperReentrantLock;
import com.ailk.eaap.o2p.task.model.TaskContentBean;
import com.ailk.eaap.op2.bo.CacheFlagCommon;
import com.ailk.eaap.op2.bo.TaskCacheFlag;
import com.ailk.eaap.op2.serviceagent.taskflag.ITaskCacheService;
import com.asiainfo.foundation.log.LogModel;
import com.asiainfo.foundation.log.Logger;

public class TaskCacheService implements ITaskCacheService {

	private static final Logger log = Logger.getLog(TaskCacheService.class);
	public static final int CHANGE_TYPE_ADD = 1;
	public static final int CHANGE_TYPE_MINUS = 2; 
	private String serverIdentifyUUID = null;
	private CacheFactory<String, Object> cacheFactory;
	
	/**
	 * 更新任务标示在缓存中的状态为完成
	 */
	public void updateMemcache(String taskStyle,String[] taskCacheFlag, final Integer status) {
		if (taskStyle!=null && !isConcurrencyTask(taskStyle)) {
			for (int i = 0; i < taskCacheFlag.length; i++) {
				String key = null;
				try {
					key = taskCacheFlag[i];
					TaskCacheFlag cacheKeyStatusObject = (TaskCacheFlag)cacheFactory.getCacheClient().get(key);
					
					if(cacheKeyStatusObject==null){
						cacheKeyStatusObject = new TaskCacheFlag();
						cacheKeyStatusObject.setTaskCode(key);
						cacheKeyStatusObject.setTaskStatus(status);
						if(status == CacheFlagCommon.TASK_STATUS_RUNNING){
							cacheKeyStatusObject.setReceiveDate(new Timestamp(System.currentTimeMillis()));
						}else{
							cacheKeyStatusObject.setModifyDate(new Timestamp(System.currentTimeMillis()));
						}
						cacheFactory.getCacheClient().put(key, cacheKeyStatusObject);
					}else{
						if (log.isDebugEnabled()) {
							log.debug("-------- before  key {0} keyStatus {1} --------",key, cacheKeyStatusObject.getTaskStatus());
						}
						cacheKeyStatusObject.setTaskStatus(status);
						if(status.equals(CacheFlagCommon.TASK_STATUS_RUNNING)){
							cacheKeyStatusObject.setReceiveDate(new Timestamp(System.currentTimeMillis()));
						}else{
							cacheKeyStatusObject.setModifyDate(new Timestamp(System.currentTimeMillis()));
						}
						cacheFactory.getCacheClient().put(key, cacheKeyStatusObject);
					}
					if (log.isDebugEnabled()) {
						log.debug("-------- after  key {0} keyStatus {1} --------",key, status);
					}
				} catch (Exception e) {
					log.error(LogModel.EVENT_APP_EXCPT, e);
				}
			}
		}
	}
	
	@Override
	public boolean regAndUpdateMemcache(String taskStyle, String[] taskKeys, Integer parallelismDegree, 
			Integer taskStatus, Integer tenantId) {
		boolean needMinus = false;
		if(!isConcurrencyTask(taskStyle) || parallelismDegree >= 0) {
			if(taskKeys.length > 0) {
				try {
					if(!isConcurrencyTask(taskStyle)) {
						this.updateMemcache(taskStyle, taskKeys, taskStatus);
					} else {
						needMinus = this.changeRunningTaskNum(taskKeys, CHANGE_TYPE_ADD, 1, parallelismDegree);
					}
					String regHost = LocalUtils.getLocalRealIp() + DistributedConsistencyHelper.DEFAULT_SPLIT + CacheUtil.getPort();
					@SuppressWarnings("unchecked")
					Map<String, String> taskMap = (Map<String,String>) cacheFactory.getCacheClient().get(tenantId+CacheFlagCommon.TASK_MAP_FLAG);
					if(taskMap == null) {
						taskMap = new LinkedHashMap<String, String>();
						cacheFactory.getCacheClient().put(tenantId+CacheFlagCommon.TASK_MAP_FLAG, taskMap);
					}
					if(taskKeys.length > 0 && !regHost.equals(taskMap.get(taskKeys[0]))) {
						doRegTaskMap(taskKeys, taskStyle, regHost,tenantId);
					}
				} catch(Exception e1) {
					log.error(LogModel.EVENT_APP_EXCPT, e1);
				}
			}
		}
		return needMinus;
	}
	
	public boolean changeRunningTaskNum(String[] taskKeys, final int changeType, final int changeCount, final int parallelismDegree) {
		final String key = taskKeys[0];
		boolean needMinus = false;
		try {
			 boolean successModify = new ZooKeeperReentrantLock(key).lockCode(3, TimeUnit.MINUTES, new ZooKeeperCodeCallBack() {
				 @Override
				 public boolean callBack() {
					if(cacheFactory.getCacheClient().get(key)==null){
						TaskCacheFlag cacheKeyStatusObject = new TaskCacheFlag();
						cacheKeyStatusObject.setTaskCode(key);
						cacheKeyStatusObject.setTaskRunningCount(0);
						cacheKeyStatusObject.getRunCountDetail().put(serverIdentifyUUID, 0);
						cacheFactory.getCacheClient().put(key, cacheKeyStatusObject);
						return false;
					}else{
						TaskCacheFlag cacheKeyStatusObject = (TaskCacheFlag)cacheFactory.getCacheClient().get(key);
						if (log.isDebugEnabled()) {
							log.debug("-------- before  key {0}, parallelismDegree {1}, serverIdentifyUUID {2}",key, cacheKeyStatusObject.getTaskRunningCount(),serverIdentifyUUID);
						}
						Integer num = cacheKeyStatusObject.getRunCountDetail().get(serverIdentifyUUID);
						if(num == null) {num = 0;}
						if(changeType == TaskCacheService.CHANGE_TYPE_ADD) {
							cacheKeyStatusObject.setTaskRunningCount(cacheKeyStatusObject.getTaskRunningCount()+changeCount);
							cacheKeyStatusObject.getRunCountDetail().put(serverIdentifyUUID, num+changeCount);
						} else if(changeType == TaskCacheService.CHANGE_TYPE_MINUS) {
							int minusCount = changeCount;
							if(num - changeCount < 0) {
								minusCount = num;
							} else {
								minusCount = changeCount;
							}
							cacheKeyStatusObject.setTaskRunningCount(cacheKeyStatusObject.getTaskRunningCount()-minusCount);
							cacheKeyStatusObject.getRunCountDetail().put(serverIdentifyUUID, num-minusCount);
						}
						cacheKeyStatusObject.setModifyDate(new Timestamp(System.currentTimeMillis()));
						boolean successModify = cacheFactory.getCacheClient().put(key, cacheKeyStatusObject);
						if (log.isDebugEnabled()) {
							log.debug("-------- after  key {0} taskRunningNum {1}, serverIdentifyUUID {2} --------",key, cacheKeyStatusObject.getTaskRunningCount()+1,serverIdentifyUUID);
						}
						if(changeType == TaskCacheService.CHANGE_TYPE_ADD && successModify) {
							return true;
						}
						return false;
					}
				}
			});
			if(changeType == TaskCacheService.CHANGE_TYPE_ADD && successModify) {
				needMinus = true;
			}
		} catch (Exception e) {
			log.error(LogModel.EVENT_APP_EXCPT, e);
		}
		return needMinus;
	}


	@SuppressWarnings("unchecked")
	public void doRegTaskMap(final String[] taskKeys, String taskStyle, final String regHost, Integer tenantId) {
		final Integer tenId = tenantId;
		new ZooKeeperReentrantLock(tenId+CacheFlagCommon.TASK_MAP_FLAG).lockCode(3, TimeUnit.MINUTES, new ZooKeeperCodeCallBack() {
			@Override
			public boolean callBack() {
				Map<String, String> taskMap = (Map<String, String>) cacheFactory.getCacheClient().get(tenId+CacheFlagCommon.TASK_MAP_FLAG);
				if(taskMap == null) {
					taskMap = new LinkedHashMap<String, String>();
				}
				for(String key: taskKeys) {
					taskMap.put(key, regHost);
				}
				return cacheFactory.getCacheClient().put(tenId+CacheFlagCommon.TASK_MAP_FLAG, taskMap);
			}
		});
	}
	
	public boolean isConcurrencyTask(String taskStyle) {
		return TaskContentBean.CONCURRENCY_TASK.equals(taskStyle);
	}
	
	@Override
	public boolean currentTaskAllowExcute(String[] taskKeys, String taskStyle, int parallelismDegree) {
		TaskCacheFlag cacheKeyStatusObject = (TaskCacheFlag)cacheFactory.getCacheClient().get(taskKeys[0]);
		if(!taskStyle.equals(cacheKeyStatusObject.getTaskStyle())) {
			return false;
		}
		if(isConcurrencyTask(taskStyle)) {
			if(parallelismDegree >= 0) {
				return !isTaskParallelismDegreeExceed(taskKeys, parallelismDegree);
			}else {
				return false;
			}
		} else {
			return isTaskReadyStatus(taskKeys);
		}
	}
	
	private boolean isTaskParallelismDegreeExceed(String[] taskKeys, int parallelismDegree) {
		TaskCacheFlag cacheKeyStatusObject = (TaskCacheFlag)cacheFactory.getCacheClient().get(taskKeys[0]);
		if(cacheKeyStatusObject != null) {
			if(cacheKeyStatusObject.getTaskRunningCount() < parallelismDegree) {
				return false;
			}
		}
		return true;
	}

	private synchronized boolean isTaskReadyStatus(String[] taskKeys) {
		for(int i=0; i<taskKeys.length; i++) {
			TaskCacheFlag cacheKeyStatusObject = (TaskCacheFlag)cacheFactory.getCacheClient().get(taskKeys[i]);
			if(cacheKeyStatusObject != null) {
				if(CacheFlagCommon.TASK_STATUS_READY.equals(cacheKeyStatusObject.getTaskStatus())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean isErrorExcutor(String taskStyle, String[] taskCacheFlag) {
		if(!isConcurrencyTask(taskStyle) && taskCacheFlag != null) {
			for(String key: taskCacheFlag) {
				TaskCacheFlag cacheKeyStatusObject = (TaskCacheFlag)cacheFactory.getCacheClient().get(key);
				if(cacheKeyStatusObject != null) {
					return CacheFlagCommon.TASK_STATUS_EXCEPTION.equals(cacheKeyStatusObject.getTaskStatus());
				}
			}
		}
		return false;
	}
	
	public CacheFactory<String, Object> getCacheFactory() {
		return cacheFactory;
	}

	public void setCacheFactory(CacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}

	public void setServerIdentifyUUID(String serverIdentifyUUID) {
		this.serverIdentifyUUID = serverIdentifyUUID;
	}
}
