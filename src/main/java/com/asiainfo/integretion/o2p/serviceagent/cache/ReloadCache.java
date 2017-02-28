package com.asiainfo.integretion.o2p.serviceagent.cache;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ailk.eaap.o2p.common.cache.IReloadCache;
import com.ailk.eaap.op2.bo.Tenant;
import com.ailk.eaap.op2.common.IQueueIHelper;
import com.ailk.eaap.op2.common.StatisticData;

public class ReloadCache implements  IReloadCache{
	private static Log log = LogFactory.getLog(ReloadCache.class);
	private IMemcacheManageServ cacheService;
	private String serviceAgentMode;
	private IQueueIHelper javaQueueHelper;
	private String deapth;
	
	public void setDeapth(String deapth) {
		this.deapth = deapth;
	}

	public void setJavaQueueHelper(IQueueIHelper javaQueueHelper) {
		this.javaQueueHelper = javaQueueHelper;
	}

	public void setServiceAgentMode(String serviceAgentMode) {
		this.serviceAgentMode = serviceAgentMode;
	}

	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	public void reloadCache() {
		cacheService.addTenant();
		List<Tenant> tenants = cacheService.getAllTenant();
		if(tenants != null && !tenants.isEmpty()) {
			for(Tenant tenant: tenants) {
				cacheService.addAll(tenant.getTenantId());
			}
		}
		//print out statistic data
		if(log.isInfoEnabled()){
			if("server".equals(serviceAgentMode)){
				log.info("total http receive count is " + StatisticData.httpReceivecount);
				log.info("total webservice receive count is " +StatisticData.webserviceReceivecount);
				log.info("current queue deep:  " + javaQueueHelper.getDeap() + " queue capacity: " + deapth);
			}
			if("client".equals(serviceAgentMode)){
				log.info("total http send count is " +StatisticData.httpSendcount);
				log.info("total webservice send count is " +StatisticData.webserviceSendcount);
			}
			
		}
	}

	@Override
	public void synCacheToDb(int type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(String tenantId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cacheRefreshService(String tenantId, String moduleName, String serviceType) {
		// TODO Auto-generated method stub
		return false;
	}
}
