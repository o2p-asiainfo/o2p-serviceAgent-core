package com.ailk.eaap.op2.serviceagent.log;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.LogLevel;
import com.ailk.eaap.op2.bo.SerInvokeIns;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

public class MessageLogLevelService {
	private static final Logger LOG = Logger.getLog(MessageLogLevelService.class);
	
	/********运行状态*******/
	public static final String RUNNING_STATUS_INNER_ERROR = "INNER_ERROR";
	public static final String RUNNING_STATUS_BUSINESS_ERROR = "BUSINESS_ERROR";
	public static final String RUNNING_STATUS_ALL_ERROR = "ALL_ERROR";
	public static final String RUNNING_STATUS_NORMAL = "NORMAL";
	public static final String RUNNING_STATUS_ALL_STATUS = "ALL_STATUS";
	
	/********日志对象类型*******/
	public static final String LOG_OBJECT_CONTRACT_INTERACTION = "CONTRACT_INTERACTION";
	public static final String LOG_OBJECT_EXCEPTION_LOG = "EXCEPTION_LOG";
	public static final String LOG_OBJECT_ENDPOINT_INTERACTION = "ENDPOINT_INTERACTION";
	public static final String LOG_OBJECT_ORI_LOG_CLOB = "ORI_LOG_CLOB";
	public static final String LOG_OBJECT_CTG_LOG = "CTG_LOG";
	
	/******默认日志级别*******/
	public static final String DEFAULT_LOG_LEVEL = "All";
	public static final String LOG_LEVEL_OFF = "Off";
	public static final String LOG_LEVEL_Fatal = "Fatal";
	public static final String LOG_LEVEL_Error = "Error";
	public static final String LOG_LEVEL_Info = "Info";
	public static final String LOG_LEVEL_All = "All";
	public static final List<String> DEFAULT_LOG_LEVEL_OUT_LIST = Arrays.asList("CONTRACT_INTERACTION","ENDPOINT_INTERACTION","ORI_LOG_CLOB,CTG_LOG","EXCEPTION_LOG");
	
	public static Map<String, String[]> statusRelationMap;
	static{
		statusRelationMap = new HashMap<String, String[]>();
		statusRelationMap.put(RUNNING_STATUS_ALL_ERROR, new String[]{RUNNING_STATUS_INNER_ERROR, RUNNING_STATUS_BUSINESS_ERROR});
		statusRelationMap.put(RUNNING_STATUS_ALL_STATUS, new String[]{RUNNING_STATUS_INNER_ERROR, RUNNING_STATUS_BUSINESS_ERROR, RUNNING_STATUS_NORMAL});
	}
	
	private IMemcacheManageServ cacheService;
	
	/**
	 * 判断当前运行状态
	 * @param bo
	 * @return
	 */
	public String getCurrentRunningStatus(@SuppressWarnings("rawtypes") MessageBO bo) {
		EAAPException ee = bo.getEAAPException();
		if(ee == null) {
			return RUNNING_STATUS_NORMAL;
		}
		else if(ee.getCode().equals(ErrorDomain.ERROR_CODE_9999)) {
			return RUNNING_STATUS_INNER_ERROR;
		}
		else {
			return RUNNING_STATUS_BUSINESS_ERROR;
		}
	}
	
	/**
	 * 判断日志对象是否输出日志
	 * @param bo
	 * @param logObjectType
	 * @return
	 */
	public boolean isLogTypeOut(@SuppressWarnings("rawtypes") MessageBO bo, String logObjectType) {
		String level = getSerLogLevel(bo.getSerInvokeIns());
		String runningStatus = getCurrentRunningStatus(bo);
		List<String> logObjects = getLogObjects(level, runningStatus,bo);
		if(logObjects != null && logObjects.contains(logObjectType)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 根据日志级别和当前的运行状态获取需要输出的日志对象
	 * @param level 服务实例日志级别
	 * @param runningStatus 运行状态
	 * @return 要输出的日志对象列表
	 */
	@SuppressWarnings("unchecked")
	private List<String> getLogObjects(String level, String runningStatus, MessageBO bo) {
		List<LogLevel> logLevelList = (List<LogLevel>) cacheService.getKey(CacheKey.logLevelList, bo.getTenant().getTenantId());
		if(logLevelList == null) {
			LOG.warn("logLevel list is not in the cache, will use the default All log object out");
			return DEFAULT_LOG_LEVEL_OUT_LIST;
		}
		if(!LOG_LEVEL_All.equals(level) && !LOG_LEVEL_Error.equals(level) && !LOG_LEVEL_Fatal.equals(level) && !LOG_LEVEL_Info.equals(level) && !LOG_LEVEL_OFF.equals(level)) {
			LOG.warn("log level is not valid(must be the Off, Fatal, Error, Info, All), will use the default All log object out");
			return DEFAULT_LOG_LEVEL_OUT_LIST;
		}
		for(LogLevel logLevel: logLevelList) {
			if(logLevel.getLogLevel().equals(level)) {
				if(logLevel.getRunningStatus().equals(runningStatus)){
					return logLevel.getLogOutObjects();
				}
				else {
					String[] statusArray = statusRelationMap.get(logLevel.getRunningStatus());
					if(statusArray == null) {
						continue;
					}
					for(String status: statusArray) {
						if(status.equals(runningStatus)) {
							return logLevel.getLogOutObjects();
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * 判断整个日志对象是否输出日志
	 * @param bo
	 * @return
	 */
	public boolean isLogOut(@SuppressWarnings("rawtypes") MessageBO bo) {
		if(bo == null) {
			LOG.warn("messageBO is null!");
			return false;
		}
		String level = getSerLogLevel(bo.getSerInvokeIns());
		if(LOG.isDebugEnabled()) {
			LOG.debug("judge log out, serInvokeIns id is {0}, and log level is {1}", 
					(bo.getSerInvokeIns()==null?"":bo.getSerInvokeIns().getSerInvokeInsId())
					, level);
		}
		String runningStatus = getCurrentRunningStatus(bo);
		List<String> logObjects = getLogObjects(level, runningStatus, bo);
		if(LOG.isDebugEnabled()) {
			LOG.debug("log out object size {0}", logObjects==null?0:logObjects.size());
		}
		if((logObjects == null || logObjects.isEmpty())) {
			return false;
		}
		return true;
	}
	
	/**
	 * 获取服务调用实例日志级别
	 * @param ins
	 * @return
	 */
	public String getSerLogLevel(SerInvokeIns ins) {
		if(ins == null){
			return DEFAULT_LOG_LEVEL;
		}
		else {
			if(StringUtils.hasText(ins.getLogLevel())) {
				return ins.getLogLevel();
			}
				
			else {
				return DEFAULT_LOG_LEVEL;
			}
		}
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}
	
}
