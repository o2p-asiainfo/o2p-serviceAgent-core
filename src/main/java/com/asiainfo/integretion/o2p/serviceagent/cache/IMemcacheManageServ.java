package com.asiainfo.integretion.o2p.serviceagent.cache;

import java.util.List;

import com.ailk.eaap.op2.bo.Tenant;

import net.rubyeye.xmemcached.MemcachedClient;

public interface IMemcacheManageServ {
	Object getKey(String key, Integer tenantId);
	Object getObjByKey(String key);
	boolean isTransExist(String transid);
	MemcachedClient getRunTimeMemcachedClient();
	void removeKey(String key);
	//加载版本信息到缓存 add by linwf
	void addVersions();
	void addObj(String key, int time, Object obj) ;
	void reflushAll() ;
	void reflushMemcache() ;
	boolean cacheService(String moduleName, Integer tenantId);
	
	List<Tenant> getAllTenant();

	
	void addTrans(String id);
	void addToken();
	/**void addAttrValue();*/
	void addAll(Integer tenantId);
	void addByModuleName(String moduleTechImpl, Integer tenantId);
	void addTenant();
	Object getKey(String string);
}
