package com.ailk.eaap.op2.serviceagent.common;

import java.io.StringReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.xml.sax.InputSource;

import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.GetValueExpr;
/**
 * 
 * XPATH解析机制<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author litieyang Mar 25, 2013
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */
public class XPATHEvaluator implements Evaluator{

	private static final  Logger logger = Logger.getLogger(XPATHEvaluator.class);
	private final Map<String, XPathExpression> pool = new ConcurrentHashMap<String, XPathExpression>();
    private XPathFactory xpathFactory;    
    private QName resultQName = XPathConstants.STRING;
       
    
	public Object evaluate(GetValueExpr getValueExpr, MessageBO messageBo) {
		String expr = getValueExpr.getExpr();
		
		Object result = evaluateAs(getValueExpr.getNameSpaceMap() ,expr, messageBo ,resultQName);		
		logger.trace("xpath evaluate result:" + result.getClass().getName());

		return result;
	}
	
	
	
	protected Object evaluateAs(Map<String, String> nameSpaces, String exprText, MessageBO msg, QName resultQName){
		// pool a pre compiled expression from pool
        XPathExpression xpathExpression = pool.get(exprText);
        if (xpathExpression == null) {
        	logger.trace("Creating new XPathExpression as none was available from pool");            
            try {
                xpathExpression = createXPathExpression(nameSpaces, exprText);
                pool.put(exprText, xpathExpression);
            } catch (XPathExpressionException e) {
            	throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{"Invalid xpath: " + exprText+e.getMessage()}, e);
            } catch (Exception e) {
            	logger.error("Cannot create xpath expression", e);
            	throw new BusinessException(9999, "o2p-serviceagent-core.9999",  new String[]{"Cannot create xpath expression"+e.getMessage()}, e);
            }
        } else {
        	logger.trace("Acquired XPathExpression from pool");
        }        
        Document msgXml = (Document)msg.getMsgBody();
        return doInEvaluateAs(xpathExpression, exprText, msgXml.asXML(), resultQName);
        
	}
	
	protected Object doInEvaluateAs(XPathExpression xpathExpression,String exprText, String msg, QName resultQName) {
        if (logger.isTraceEnabled()) {
        	logger.trace("Evaluating : " + msg + " as: " + resultQName);
        }

        Object answer;

        try {
            Object document = new InputSource(new StringReader(msg.trim()));
            InputSource inputSource = (InputSource) document;
            if (resultQName != null) {
                
                answer = xpathExpression.evaluate(inputSource, resultQName);
            } else {
                answer = xpathExpression.evaluate(inputSource);
            }
        } catch (XPathExpressionException e) {
            
        	  throw new BusinessException(9999, "o2p-serviceagent-core.9999", new String[]{"Invalid xpath: " + exprText+e.getMessage()}, e);
        }

        if (logger.isTraceEnabled()) {
        	logger.trace("Done evaluating : " + msg + " as: " + resultQName + " with result: " + answer);
        }
        return answer;
    }
	
	protected XPathExpression createXPathExpression(Map<String, String> nameSpaces, String exprText) throws XPathExpressionException, XPathFactoryConfigurationException {
        XPath xPath = getXPathFactory().newXPath();        
        xPath.setNamespaceContext(new DefaultNamespaceContext(nameSpaces));
        return xPath.compile(exprText);
    }
	
	 public XPathFactory getXPathFactory() throws XPathFactoryConfigurationException {
        if (xpathFactory == null) {           
            xpathFactory = XPathFactory.newInstance();
        }
        return xpathFactory;
	 }



}
