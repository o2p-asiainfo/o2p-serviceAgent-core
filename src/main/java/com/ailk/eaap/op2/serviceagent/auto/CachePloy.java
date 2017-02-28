package com.ailk.eaap.op2.serviceagent.auto;
/**
 * 缓存策略
 * @author MAWL
 *
 */
public enum CachePloy {

	/**
	 * java缓存
	 */
	JAVA_CACHE("java"),
	/**
	 * memcache缓存
	 */
	MEMCACHE("memcache"),
	/**
	 * ehcache缓存
	 */
	EH_CACHE("ehcache");
	private String type;
	private CachePloy(String type){
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString(){
		return this.getType();
	}
}
