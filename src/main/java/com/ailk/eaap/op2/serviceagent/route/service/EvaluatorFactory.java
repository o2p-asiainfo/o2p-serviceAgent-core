package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.Evaluator;
import com.ailk.eaap.op2.serviceagent.common.SimpleEvaluator;
/**
 * 
 * <p>
 * @version 1.0
 * @author litieyang Mar 25, 2013
 * <hr>
 * <hr>
 */

public class EvaluatorFactory {

	private Map<String, Evaluator> evaluators = new ConcurrentHashMap<String, Evaluator>();
	
	public Evaluator getEvaluator(String evalName) {
		Evaluator eval = evaluators.get(evalName);
		
		if(eval == null){
			eval = createEvaluator(evalName);
			evaluators.put("evalName", eval);
		}	
		
		return eval;
	}
		
	private Evaluator createEvaluator(String evalName) {
		if(Evaluator.EVALUATOR_SIMPLE.equalsIgnoreCase(evalName)){
			return new SimpleEvaluator();
		}
		
		else {
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,evalName + " is not supported!!",ErrorDomain.ERROR_CODE_9010);
		}
			
	}

}
