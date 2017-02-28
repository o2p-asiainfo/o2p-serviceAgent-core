/** 
 * Project Name:serviceAgent-core 
 * File Name:IContractBodyService.java 
 * Package Name:com.ailk.eaap.integration.o2p.contractbody.service 
 * Date:2014年11月17日上午10:50:44 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.contractbody.service;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Endpoint;

/**
 * <p>ClassName:IContractBodyService <br>
 * <p>Function: TODO ADD FUNCTION. <br>
 * <p>Reason: TODO ADD REASON. <br>
 * <p>Date: 2014年11月17日 上午10:50:44 <br>
 * @author zhongming
 * @version	1.6
 * @since JDK 1.6
 */
public interface IContractBodyService {
	/**
	 * <p>getNodeValsByContractFormat:(根据路由端点获取解析信息). <br>
	 * <p>TODO(这里描述这个方法适用条件 – 可选).<br>
	 * <p>TODO(这里描述这个方法的执行流程 – 可选).<br>
	 * <p>TODO(这里描述这个方法的使用方法 – 可选).<br>
	 * <p>TODO(这里描述这个方法的注意事项 – 可选).<br>
	 * @author zhongming
	 * @param messageBO
	 *            消息
	 * @since JDK 1.6
	 */
	@SuppressWarnings("rawtypes")
	void setNodeValsByContractFormat(MessageBO messageBO, Endpoint endpoint);

	/**
	 * <p>getNodeValByExpress:(根据路由端点获取路由信息，将信息ContractBody.setNodeValByExpress). <br>
	 * <p>TODO(这里描述这个方法适用条件 – 可选).<br>
	 * <p>TODO(这里描述这个方法的执行流程 – 可选).<br>
	 * <p>TODO(这里描述这个方法的使用方法 – 可选).<br>
	 * <p>TODO(这里描述这个方法的注意事项 – 可选).<br>
	 * @author zhongming
	 * @param messageBO
	 *            消息对象
	 * @since JDK 1.6
	 */
	@SuppressWarnings("rawtypes")
	void setRouteVal(MessageBO messageBO);

}
