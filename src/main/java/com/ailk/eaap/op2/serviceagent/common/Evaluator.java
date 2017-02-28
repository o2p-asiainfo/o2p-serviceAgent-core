package com.ailk.eaap.op2.serviceagent.common;

import com.ailk.eaap.op2.bo.GetValueExpr;


/**
 * 
 * 取值表达式类型<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author litieyang Aug 1, 2013
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */
public interface Evaluator {
	String EVALUATOR_SIMPLE = "SIMPLE";
	String EVALUATOR_XPATH = "XPATH";
	String EVALUATOR_JDBC = "JDBC";
	Object evaluate(GetValueExpr expr, MessageBO messageBo) ;
}
