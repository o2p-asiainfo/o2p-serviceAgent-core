package com.asiainfo.integretion.o2p.serviceagent.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import net.rubyeye.xmemcached.MemcachedClient;

import com.ailk.eaap.o2p.common.cache.CacheCommon;
import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.op2.bo.Tenant;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.TransformerRule;

@Service
public class CacheServiceImpl implements IMemcacheManageServ, Serializable {

	private static final long serialVersionUID = 1L;

	public static Map<String, TransformerRule> reCompliJavaAssitMap = new HashMap<String, TransformerRule>();
	
	public static final int TRANSFORMER_TYPE_JAVASSIST = 16;
	public static final int TRANSFORMER_TYPE_JAVASSISTCLASS = 17;
	
	private transient ICacheFactory<String, Object> cacheFactory;
	private int transactionIdCacheTime = 1*3600;
	private static final Logger log = Logger.getLog(CacheServiceImpl.class);
	private static final String[] LIST_MODULE_ARRAY;
	private static final String[] OBJECT_MODULE_ARRAY = {
		CacheKey.MODULE_REST,
		CacheKey.MODULE_LOG_LEVEL,CacheKey.MODULE_AUTH_API,CacheKey.MODULE_CONF_PROPERTIES
	};
	
	static {
		List<String> tmpList = Arrays.asList(CacheKey.MODULE_LIST_LEVEL2);
		List<String> tempList = new ArrayList<String>(tmpList);
		tempList.removeAll(Arrays.asList(OBJECT_MODULE_ARRAY));
		LIST_MODULE_ARRAY = tempList.toArray(new String[tempList.size()]);
		Arrays.sort(LIST_MODULE_ARRAY);
		Arrays.sort(OBJECT_MODULE_ARRAY);
	}

	public void addByModuleName(String moduleName, Integer tenantId){
		if(Arrays.binarySearch(LIST_MODULE_ARRAY, moduleName) >= 0) {
			loadObjectsByKeyListName(moduleName,tenantId);
		} else if (Arrays.binarySearch(OBJECT_MODULE_ARRAY, moduleName) >= 0) {
			addObject(moduleName,tenantId);
		}
	}
	
	public void addAll(Integer tenantId) {
		try{
			log.debug("-----------------------load data from remote cache to local cache start, tenantId {0}-----------------------", tenantId);
			for(String moduleName : CacheKey.MODULE_LIST_LEVEL2){
				if(isNeedReload(moduleName,tenantId)){
					addByModuleName(moduleName,tenantId);
				}
			}
			//加载数据版本信息 add by linwf
			addVersions();
			log.debug("-----------------------load data from remote cache to local cache end-----------------------");
			log.info("load data into level-2 cache finished!");
		}catch(Exception e){
			log.error("cache load failed!", e);
		}

	}

	@SuppressWarnings("unchecked")
	public List<Tenant> getAllTenant() {
		return (List<Tenant>)this.getObjByKey(CacheKey.TENANT_ALL);
	}

	public boolean isTransExist(String transid) {
		try{
			return (cacheFactory.getCacheClient().get(transid)!=null);
		}catch(Exception e){
			log.error("get transid:" + transid + "from cache error!",e);
			return false;
		}
	}

	public void removeKey(String key){
		try{
			cacheFactory.getCacheClient().remove(key);
		}catch(Exception e ){
			log.error("remove key with " + key + "from cache error!", e);
		}
	}

	public void replace(String key, int time, Object obj){
		try{
			cacheFactory.getCacheClient().remove(key);
			cacheFactory.getCacheClient().put(key, obj);
		}catch(Exception e ){
			log.error("replace value error!key:" + key + ", value:" + obj, e);
		}
	}

	public int getTransactionIdCacheTime() {
		return transactionIdCacheTime;
	}

	public void setTransactionIdCacheTime(int transactionIdCacheTime) {
		this.transactionIdCacheTime = transactionIdCacheTime;
	}

	
	public ICacheFactory<String, Object> getCacheFactory() {
		return cacheFactory;
	}

	public void setCacheFactory(ICacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}
	
	public void addObject(String moduleName, Integer tenantId){
		String key = getKeyByModule(moduleName);
		String level1version = (String) cacheFactory.getCacheClient().get(tenantId+moduleName);
		if(level1version!=null && level1version.equals(CacheKey.MODULE_RELOAD_EXCEPTION)){
			cacheFactory.getLocalCacheClient().put(tenantId+CacheCommon.prefixReplace(moduleName, 3), "There is error in level1 cache loading!");
		}else{
			cacheFactory.getLocalCacheClient().put(tenantId+key, cacheFactory.getCacheClient().get(tenantId+key));
		}
		cacheFactory.getLocalCacheClient().put(tenantId+moduleName, cacheFactory.getCacheClient().get(tenantId+moduleName));
	}

	private String getKeyByModule(String moduleName) {
		if(CacheKey.MODULE_REST.equals(moduleName)) {
			return CacheKey.Rest;
		} else if(CacheKey.MODULE_LOG_LEVEL.equals(moduleName)) {
			return CacheKey.logLevelList;
		} else if(CacheKey.MODULE_AUTH_API.equals(moduleName)) {
			return CacheKey.AUTH_API_LIST;
		} else if(CacheKey.MODULE_CONF_PROPERTIES.equals(moduleName)) {
			return CacheKey.ALL_CONF_PROPERTIES;
		}
		return null;
	}

	@Override
	public void addVersions() {
		Object object = cacheFactory.getCacheClient().get(CacheKey.MODULE_VERSION_MAP);
		if(object==null){
			return;
		}
		cacheFactory.getLocalCacheClient().put(CacheKey.MODULE_VERSION_MAP, object);//缓存设置
	}
	
	
	
	public Object getKey(String key, Integer tenantId) {
		Object obj = null;
		try{
			obj = cacheFactory.getLocalCacheClient().getByTenantId(key, tenantId);
		}catch(Exception e ){
			log.error("get key from cache error",e);
		}
		return obj;
	}
	
	public Object getObjByKey(String key) {
		Object obj = null;
		try{
			obj = cacheFactory.getLocalCacheClient().get(key);
		}catch(Exception e ){
			log.error("get key from cache error",e);
		}
		return obj;
	}
	
	@Override
	public void addObj(String key, int time, Object obj)  {
		try{
			cacheFactory.getXMemcachedClient().put(key, time, obj);
		}catch(Exception e ){
			log.error("add object into cache error! key:" + key + ", value:" + obj, e);
		}
	}
	
	@Override
	public void reflushAll()  {
		try{
			cacheFactory.getXMemcachedClient().clear();
			cacheFactory.getEhCache().clear();
			cacheFactory.getCacheClient().clear();
		}catch(Exception e ){
			log.error("reflush all cache error!", e);
		}
	}
	
	public boolean isNeedReload(String moduleName, Integer tenantId){
		try{
			String level1Version = (String) cacheFactory.getCacheClient().get(tenantId+moduleName);
			if(level1Version==null){
				log.warn("there is no object in level-1 cache server for moduleName:"+tenantId+moduleName +"!");
				return false;
			}
			String level2Version = (String) cacheFactory.getLocalCacheClient().get(tenantId+moduleName);
			if(level2Version==null || !level2Version.equals(level1Version)){
				return true;
			}
		}catch(Exception e){
			log.error("compare version exception!");
			log.debug("force fresh level2-cache module with moduleName " + tenantId+moduleName);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean cacheService(String moduleName, Integer tenantId) {
		try{
			if(moduleName==null){
				return false;
			}
			if(moduleName.equals(CacheKey.MODULE_ALL_FORCE)){
				@SuppressWarnings("unchecked")
				Map<String, String> level1VersionMap = (Map<String, String>) cacheFactory.getCacheClient().get(CacheKey.MODULE_VERSION_MAP);
				if(level1VersionMap==null || level1VersionMap.isEmpty()){
					return false;
				}
				for(String module : CacheKey.MODULE_LIST_LEVEL2){
					if(level1VersionMap.get(tenantId+module)!=null){
						addByModuleName(module,tenantId);
					}
				}
				addVersions();
			}else if(moduleName.equals(CacheKey.MODULE_ALL)){
				addAll(tenantId);
			}else {
				addByModuleName(moduleName,tenantId);
			}
		}catch(Exception e){
			log.error("refresh data failed for moduleName:"+moduleName, e);
		}
		return true;
	}
	
	public void addTenant() {
		String keyListName = "KEY_LIST_" + CacheKey.TENANT;
		try{
			@SuppressWarnings("unchecked")
			List<String> keyList = (List<String>) cacheFactory.getCacheClient().get(keyListName);
			boolean loadStatus = true;
			if(keyList!=null && !keyList.isEmpty()){
				for(String key : keyList){
					Object value = cacheFactory.getCacheClient().get(key);
					if(value!=null){
						if(!cacheFactory.getLocalCacheClient().put(key, value)){
							log.error("put object into cache failed! key="+key);
							if(loadStatus){
								loadStatus = false;
							}
						}
					}else{
						log.warn("There is no object in level-1 cache server with key-name:"+key);
					}
				}
				cacheFactory.getLocalCacheClient().put(keyListName, keyList);
			}
		}catch(Exception e){
			log.error("load object in keyList of "+keyListName+" failed!", e);
		}
	}
	
	public void loadObjectsByKeyListName(String moduleName, Integer tenantId){
		String keyListName = CacheCommon.prefixReplace(moduleName, 1);
		keyListName = tenantId + keyListName;
		log.debug("load object in keyList of "+keyListName+" start");
		try{
			if(CacheKey.MODULE_TRANSFORMER_RULE.equals(moduleName)){//先清空当前租户
				if(!reCompliJavaAssitMap.isEmpty()){
					Set<Map.Entry<String, TransformerRule>> entry = reCompliJavaAssitMap.entrySet();
					for(Map.Entry<String, TransformerRule> kv : entry){
						if(kv.getKey().startsWith(tenantId + CacheKey.TRANSFORMER_RULE)){
							reCompliJavaAssitMap.remove(kv.getKey());
						}
					}
				}
			}
			@SuppressWarnings("unchecked")
			List<String> keyList = (List<String>) cacheFactory.getCacheClient().get(keyListName);
			@SuppressWarnings("unchecked")
			List<String> preKeyList = (List<String>)cacheFactory.getLocalCacheClient().get(keyListName);
			boolean loadStatus = true;
			if(keyList!=null && !keyList.isEmpty()){
				for(String key : keyList){
					Object value = cacheFactory.getCacheClient().get(key);
					if(value!=null){
						//判断是否需要重新加载javassist
						if(CacheKey.MODULE_TRANSFORMER_RULE.equals(moduleName) && value instanceof TransformerRule){
							TransformerRule newTransformerRule = (TransformerRule)value;
							Object oldTransformerRuleO = cacheFactory.getLocalCacheClient().get(key);
							if(newTransformerRule.getTransformerType().equals(TRANSFORMER_TYPE_JAVASSIST) || newTransformerRule.getTransformerType().equals(TRANSFORMER_TYPE_JAVASSISTCLASS)){
								if(oldTransformerRuleO==null){//原缓存中无该片段，则为新增加的16或者17类型的片段，则需要编译
									reCompliJavaAssitMap.put(key, newTransformerRule);
								}else{
									TransformerRule oldTransformerRule = (TransformerRule)oldTransformerRuleO;
									if(!newTransformerRule.getTransformerType().equals(oldTransformerRule.getTransformerType())){//新转换类型与原转换类型不一样，则有可能为其他转换转16，17，或者16，17互转
										reCompliJavaAssitMap.put(key, newTransformerRule);
									}else{
										//如果类型一致，则判断片段是否发生变化。
										String newCode = newTransformerRule.getScriptContent();
										String oldCode = oldTransformerRule.getScriptContent();
										if(newCode!=null){
											if(oldCode==null){//原片段为空，新片段不为空，重新编译
												reCompliJavaAssitMap.put(key, newTransformerRule);
											}else{
												int newHashCode = newCode.hashCode();
												int oldHashCode = oldCode.hashCode();
												if(newHashCode!=oldHashCode){//片段发生变化，需要重新编译
													reCompliJavaAssitMap.put(key, newTransformerRule);
												}
											}
										}
									}
								}
							}
						}
						if(!cacheFactory.getLocalCacheClient().put(key, value)){
							log.error("put object into cache failed! key="+key);
							if(loadStatus){
								loadStatus = false;
							}
						}
					}else{
						log.warn("There is no object in level-1 cache server with key-name:"+key);
					}
				}
				cacheFactory.getLocalCacheClient().put(keyListName, keyList);
			}
			//put version info into lever2 cache from level1 cache
			String level1Version = (String) cacheFactory.getCacheClient().get(tenantId+moduleName);
			//There is error in level1 cache loading
			if(level1Version.equals(CacheKey.MODULE_RELOAD_EXCEPTION)){
				cacheFactory.getLocalCacheClient().put(keyListName.replace("KEY_LIST", "ERROR_CAUSE"), "There is error in level1 cache loading!");
			}
			CacheCommon.dataRemoveHandler(cacheFactory.getLocalCacheClient(), preKeyList, keyList);
			if(loadStatus){
				cacheFactory.getLocalCacheClient().put(tenantId+moduleName, level1Version);
			}
			if(CacheKey.MODULE_TRANSFORMER_RULE.equals(moduleName)){
				 cacheFactory.getLocalCacheClient().put("JAVASSIST_RELOAD_STATUS", "1");
			}
		}catch(Exception e){
			log.error("load object in keyList of "+keyListName+" failed!", e);
			cacheFactory.getLocalCacheClient().put(keyListName.replace("KEY_LIST", "MODULE"), CacheKey.MODULE_RELOAD_EXCEPTION);
		}
		log.debug("load object in keyList of "+keyListName+" end");
	}

	@Override
	public void addTrans(String id) {
		cacheFactory.getCacheClient().put(id, transactionIdCacheTime, id);
	}
	
	@Override
	public void addToken() {
//		loadObjectsByKeyListName(CacheKey.MODULE_TOKEN);
	}

	@Override
	public void reflushMemcache() {
		// TODO Auto-generated method stub
	}
	
	public MemcachedClient getRunTimeMemcachedClient() {
		return null;
	}

	@Override
	public Object getKey(String key) {
		Object obj = null;
		try{
			obj = cacheFactory.getLocalCacheClient().get(key);
		}catch(Exception e ){
			log.error("get key from cache error",e);
		}
		return obj;
	}
}