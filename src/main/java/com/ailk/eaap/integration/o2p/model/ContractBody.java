/** 
 * Project Name:serviceAgent-core 
 * File Name:ContractBody.java 
 * Package Name:com.ailk.eaap.integration.o2p.model 
 * Date:2014年11月17日上午9:49:45 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.MessageNode;

/**
 * ClassName:ContractBody 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年11月17日 上午9:49:45 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class ContractBody implements Serializable{
	private static final long serialVersionUID = 1L;

	private ContractFormat srcContarctFormat;
	private List<MessageNode> srcMessageNodes;
	private Object nodeValByExpress;
	private Map<Integer, Object> srcMapVals;
	private Object exprVal;

	public ContractFormat getContarctFormat() {
		return srcContarctFormat;
	}

	public void setContarctFormat(ContractFormat contarctFormat) {
		this.srcContarctFormat = contarctFormat;
	}

	public List<MessageNode> getSrcMessageNodes() {
		return srcMessageNodes;
	}

	public void setSrcMessageNodes(List<MessageNode> srcMessageNodes) {
		this.srcMessageNodes = srcMessageNodes;
	}

	public Object getNodeValByExpress() {
		return nodeValByExpress;
	}

	public void setNodeValByExpress(Object nodeValByExpress) {
		this.nodeValByExpress = nodeValByExpress;
	}

	public Map<Integer, Object> getSrcMapVals() {
		return srcMapVals;
	}

	public void setSrcMapVals(Map<Integer, Object> srcMapVals) {
		this.srcMapVals = srcMapVals;
	}

	/**
	 * getNodeValByNodeDescId:(根据nodeDecsId获取值信息). 
	 * TODO(这里描述这个方法适用条件 – 可选).
	 * TODO(这里描述这个方法的执行流程 – 可选).
	 * TODO(这里描述这个方法的使用方法 – 可选).
	 * TODO(这里描述这个方法的注意事项 – 可选).
	 * 
	 * @author zhongming
	 * @param nodeDescId
	 * @return
	 * @since JDK 1.6
	 */
	public Object getNodeValByNodeDescId(int nodeDescId) {
		Map<Integer, Object> map = getSrcMapVals();
		if (map != null && nodeDescId != 0) {
			if (map.get(nodeDescId) != null && !map.get(nodeDescId).equals("")) {
				return map.get(nodeDescId);
			}
		}

		return null;
	}


	public Object getExprVal() {
		return exprVal;
	}

	public void setExprVal(Object exprVal) {
		this.exprVal = exprVal;
	}

}
