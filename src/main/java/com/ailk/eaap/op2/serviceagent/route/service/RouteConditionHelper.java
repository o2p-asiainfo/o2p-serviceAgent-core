package com.ailk.eaap.op2.serviceagent.route.service;

import ognl.Ognl;
import ognl.OgnlContext;

import org.apache.log4j.Logger;

import com.ailk.eaap.integration.o2p.contractbody.util.ContractBodyUtil;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.GetValueExpr;
import com.ailk.eaap.op2.bo.RouteCondition;



public final class RouteConditionHelper {

	private static final  Logger LOG = Logger.getLogger(RouteConditionHelper.class);
	private static final String NULL = "NULL";
	
	private RouteConditionHelper() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * leftValue:
	 * rightValue
	 * @param leftValue
	 * @param rightValue
	 * @param operatorCode
	 * @return
	 */
	public static boolean compare(String leftValue, String rightValue, String operatorCode){
		if(leftValue==null ){
			if ("=".equals(operatorCode)){
				if(rightValue.equalsIgnoreCase(NULL)){
					return true;
				}
			}
			return false;
		}
		if ("in".equals(operatorCode)) {
			String[] strIns = rightValue.replace("(", "").replace(")", "").split(",");
			for (String in : strIns) {
				if (in.trim().equals(leftValue)) {
					return true;
				}
			}
		} else if("not in".equals(operatorCode)){			
			String[] strIns = rightValue.replace("(", "").replace(")", "").split(",");
			for (String in : strIns) {
				if (in.trim().equals(leftValue)) {
					return true;				
				}
			}	
		}
		else if ("like".equals(operatorCode)){
			if(leftValue.contains(rightValue.trim())){
				return true;			
			}
		}		    
		else if ("=".equals(operatorCode)){
			if(leftValue.equals(rightValue.trim())) {
				return true;
			}
		}			
		else if ("!=".equals(operatorCode) ){
			if(rightValue.equalsIgnoreCase(NULL)){
				return true;
			}else if(!leftValue.equals(rightValue.trim())) {
				return true;
			}
		}			
		else if(">".equals(operatorCode)){
			if(isDouble(leftValue) || isDouble(rightValue)){
				if(Double.parseDouble(leftValue) > Double.parseDouble(rightValue)) {
					return true;
				}
				else {
					return false;	
				}
			}else{
				if(Integer.parseInt(leftValue) > Integer.parseInt(rightValue)) {
					return true;
				}
				else {
					return false;
				}
			}
		}			
		else if(">=".equals(operatorCode) ){
			if(isDouble(leftValue) || isDouble(rightValue)){
				if(Double.parseDouble(leftValue) >= Double.parseDouble(rightValue)) {
					return true;				
				}
			}else{
				if(Integer.parseInt(leftValue) >= Integer.parseInt(rightValue)){
					return true;				
				}
			}
		}
			
		else if("<=".equals(operatorCode)){
			if(isDouble(leftValue) || isDouble(rightValue)){
				if(Double.parseDouble(leftValue) <= Double.parseDouble(rightValue)) {
					return true;				
				}
			}else{
				if(Integer.parseInt(leftValue) <= Integer.parseInt(rightValue)) {
					return true;				
				}
			}
		}				
		else if ("<>".equals(operatorCode)){
			if(!leftValue.equals(rightValue.trim())) {
				return true;
			}
		}
			
		return false;
	}
	
	private static boolean isDouble(String value){
		if(value.indexOf('.') >0){
			return true;
		}
		else {
			return false;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean evalRouteCondition(EvaluatorFactory evaluatorFactory, RouteCondition routeCond , MessageBO messageBo) {
		boolean isPass = false;
		if(RouteCondition.AND.equals(routeCond.getCondRelation())){				
			for(RouteCondition cond : routeCond.getChildRouteConditions()){
				isPass = evalRouteCondition(evaluatorFactory, cond , messageBo);
				if(!isPass) {
					break;
				}
			}
		}else if(RouteCondition.OR.equals(routeCond.getCondRelation())){
			for(RouteCondition cond : routeCond.getChildRouteConditions()){
				isPass = evalRouteCondition(evaluatorFactory, cond , messageBo);
				if(isPass) {
					break;
				}
			}
		}else{
			
			Object value = evalValue(evaluatorFactory, routeCond.getGetValueExpr(), messageBo);
			LOG.debug(value);
			LOG.debug(routeCond.getMatchValue());
			LOG.debug(routeCond.getOperatorCode());
			return compare(
					value!=null? value.toString() : null,
					routeCond.getMatchValue(), routeCond.getOperatorCode());
		}
		
		return isPass;
	}
	
	@SuppressWarnings("rawtypes")
	private static Object evalValue(EvaluatorFactory evaluatorFactory, GetValueExpr expr, MessageBO messageBo)  {
		Object value = null;
		
		value = getValueByExpr(expr, messageBo, value);
		
		if(expr.getChildExpr() != null){
			value = evalValue(evaluatorFactory, expr.getChildExpr(), messageBo);
		}
		
		return value;
	}

	@SuppressWarnings("rawtypes")
	private static Object getValueByExpr(GetValueExpr expr,
			MessageBO messageBo, Object value) {
		if (null != expr) {
			LOG.debug(expr.getExprId());
			LOG.debug(expr.getExpr());
			LOG.debug(expr.getExprType());
			// 获取表达式
			String exprStr = expr.getExpr();
			// 获取exprType : 1 XML、JSON解析； 2 OGNL表达式
			String exprType = expr.getExprType();

			try {
				// 普通方式
				if ("1".equals(exprType)) {
					value = ContractBodyUtil.getNodeValBySrcSource(messageBo,
							exprStr);
				}
				// OGNL
				else if ("2".equals(exprType)) {
					OgnlContext context = new OgnlContext();
					context.put("messageBO", messageBo);
					value = Ognl.getValue(exprStr, messageBo);
				}

			} catch (Exception e) {
				LOG.debug("Abnormal route resolution, type " + exprType + ", expr " + exprStr + ", msgBody " +
						messageBo.getMsgBody().toString());
				throw new BusinessException(9091, "o2p-serviceagent-core.9091",
						new String[] { "getRouteCondition " + e.getMessage() },
						e.getCause());

			}
		}
		return value;
	}

}
