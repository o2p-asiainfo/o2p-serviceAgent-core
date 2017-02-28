/** 
 * Project Name:serviceAgent-core 
 * File Name:ContractBodyServiceImpl.java 
 * Package Name:com.ailk.eaap.integration.o2p.contractbody.service 
 * Date:2014年11月17日上午10:58:44 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.contractbody.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;
import ognl.Ognl;
import ognl.OgnlContext;

import com.ailk.eaap.integration.o2p.contractbody.util.ContractBodyUtil;
import com.ailk.eaap.integration.o2p.model.ContractBody;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.validate.service.IProtocolValidateServ;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
import com.ailk.eaap.op2.bo.GetValueExpr;
import com.ailk.eaap.op2.bo.MessageNode;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.NodeDescMapper;
import com.ailk.eaap.op2.bo.RouteCondition;
import com.ailk.eaap.op2.bo.RouteEndpoint;
import com.ailk.eaap.op2.bo.RoutePolicy;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;
import com.ailk.eaap.op2.bo.TransformerRule;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * ClassName:ContractBodyServiceImpl 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年11月17日 上午10:58:44 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class ContractBodyServiceImpl implements IContractBodyService {
	private static final Logger LOG = Logger.getLog(ContractBodyServiceImpl.class);
	private IMemcacheManageServ cacheService;
	private IProtocolValidateServ protocolValidateSer;

	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void setNodeValsByContractFormat(MessageBO messageBO, Endpoint endpoint) {
		Object obj = endpoint.getAttrMap()
				.get(EndpointAttr.TRANSFORMER_RULE_ID);
		
		if (obj == null || "".equals(obj)) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("transformerRule id is null");
			}
			return;
		}

		TransformerRule transformerRule = (TransformerRule) cacheService
				.getKey("transformerRule" + obj.toString(), messageBO.getTenant().getTenantId());
		if (LOG.isDebugEnabled()) {
			LOG.debug("NodeValsByContractFormat transformerRuleId : {0} transformerRuleType : {1}",
					obj.toString(), transformerRule.getTransformerType());
		}
		String reqMsgBody = messageBO.getMsgBody() == null ? "" : messageBO
				.getMsgBody().toString();
		if (messageBO.getMsgBody() instanceof java.lang.String
				&& reqMsgBody.startsWith("<")) {
			messageBO.setMsgBody(protocolValidateSer
					.getDocument(reqMsgBody));
		} else if (messageBO.getMsgBody() instanceof java.lang.String
				&& reqMsgBody.startsWith("{")) {
			messageBO.setMsgBody(JSONObject.fromObject(reqMsgBody));
		}
		// 判断原协议格式不能为空
		if (transformerRule.getSrcContractFormat() != null
				&& transformerRule.getTransformerType() == 1) {
			ContractFormat contractFormat = transformerRule
					.getSrcContractFormat();
			Map<Integer, Object> map = new HashMap<Integer, Object>();
			List<MessageNode> list = new ArrayList<MessageNode>();
			if (LOG.isDebugEnabled()) {
				LOG.debug("srcContractFormat id {0} con_type {1}",
						contractFormat.getTcpCtrFId(),
						contractFormat.getConType());
			}
			
			// 只处理XML/JSON
			if (contractFormat.getConType().equals(EOPDomain.XML)
					|| contractFormat.getConType().equals(EOPDomain.JSON)) {
				
				List<NodeDescMapper> listNodeDescMapper = transformerRule.getNodeDescMappers();
				if (listNodeDescMapper.size() > 0) {
					for (NodeDescMapper ndm : listNodeDescMapper) {
						NodeDesc nd = ndm.getSrcNode();
						if (null != nd && !"".equals(nd.getNodePath()) && null != nd.getNodePath()) {
							Object val = ContractBodyUtil.getNodeValBySrcSource(
									messageBO, nd.getNodePath());
							if (val != null) {
								map.put(nd.getNodeDescId(), val);
								MessageNode messageNode = new MessageNode();
								messageNode.setNodeDesc(nd);
								messageNode.setNodeVal(val);
								list.add(messageNode);
							}
						}
					}
				}
				
				if (messageBO.getContractBody() == null) {
					ContractBody contractBody = new ContractBody();
					contractBody.setContarctFormat(contractFormat);
					contractBody.setSrcMapVals(map);
					contractBody.setSrcMessageNodes(list);
					messageBO.setContractBody(contractBody);
					return;
				}
				messageBO.getContractBody().setContarctFormat(contractFormat);
				messageBO.getContractBody().setSrcMapVals(map);
				messageBO.getContractBody().setSrcMessageNodes(list);
				
			}

		}

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void setRouteVal(MessageBO messageBO) {
		RouteEndpoint endpoint = messageBO.getCurrryRouteEndpoint();
		List<ToRouteEndpoint> toRouteEndpoints = endpoint.getChildEndpoints();

		if (toRouteEndpoints != null) {
			ToRouteEndpoint toRouteEndpoint = toRouteEndpoints.get(0);
			String strategy = toRouteEndpoint.getRoutePolicy()
					.getRuleStrategyCode();
			if (RoutePolicy.CONTENT_BASED.equalsIgnoreCase(strategy)) {
				setRouteCondition(toRouteEndpoint.getRoutePolicy()
						.getRouteCondition(), messageBO);
			}
		}

	}

	@SuppressWarnings({ "rawtypes" })
	private void setRouteCondition(RouteCondition routeCond, MessageBO messageBO) {
		GetValueExpr getValueExpr = routeCond.getGetValueExpr();
		if (null == getValueExpr) {
			return;
		}
		// 获取表达式
		String expr = getValueExpr.getExpr();
		// 获取exprType : 1 XML、JSON解析； 2 OGNL表达式
		String exprType = getValueExpr.getExprType();

		if (messageBO.getContractBody() == null) {
			ContractBody contractBody = new ContractBody();
			messageBO.setContractBody(contractBody);
		}
		try {
			// 普通方式
			if ("1".equals(exprType)) {
				Object val = ContractBodyUtil.getNodeValBySrcSource(messageBO,
						expr);
				messageBO.getContractBody().setExprVal(val);
			}
			// OGNL
			else if ("2".equals(exprType)) {
				OgnlContext context = new OgnlContext();
				context.put("messageBO", messageBO);
				messageBO.getContractBody().setExprVal(
						Ognl.getValue(expr, messageBO));
			}

		} catch (Exception e) {
			LOG.error("getExpr Exception",
					"Abnormal route resolution, type {0}, path {1}, msgBody {2}", exprType, expr,
					messageBO.getMsgBody().toString());
			throw new BusinessException(9091, "o2p-serviceagent-core.9091",
					new String[] { "getRouteCondition " + e.getMessage() },
					e.getCause());

		}

	}

	public void setProtocolValidateSer(IProtocolValidateServ protocolValidateSer) {
		this.protocolValidateSer = protocolValidateSer;
	}

}
