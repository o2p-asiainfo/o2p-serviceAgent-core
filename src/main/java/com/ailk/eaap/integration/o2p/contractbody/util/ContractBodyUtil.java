/** 
 * Project Name:serviceAgent-core 
 * File Name:ContractBodyUtil.java 
 * Package Name:com.ailk.eaap.integration.o2p.contractbody.util 
 * Date:2014年11月26日下午6:03:48 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.contractbody.util;

import java.util.List;

import net.sf.json.JSONObject;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.ailk.eaap.integration.o2p.parsing.MsgParseFactory;
import com.ailk.eaap.o2p.common.parse.IMsgParse;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.foundation.util.ExceptionUtils;
import com.ailk.eaap.op2.bo.NodeDesc;

/**
 * ClassName:ContractBodyUtil 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年11月26日 下午6:03:48 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public final class ContractBodyUtil
{
    private static final Logger LOG = Logger.getLog(ContractBodyUtil.class);

    private ContractBodyUtil()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * getNodeValBySrcSource:(BO对象，根据path路径获取信息). 
     * @author zhongming
     * @param messageBO
     * @param path
     * @return
     * @since JDK 1.6
     */
    @SuppressWarnings("rawtypes")
    public static Object getNodeValBySrcSource(MessageBO messageBO, String path)
    {
        if (StringUtils.hasText(path))
        {
            IMsgParse msgParse = MsgParseFactory.getInstance().getMsgParse(
                    messageBO);
            if (null != msgParse)
            {
                return msgParse.parsing(messageBO.getMsgBody(), path);
            }

        }

        return null;
    }

    /**
     * getNodeValBySrcSource:(BO对象，根据path路径获对象信息). 
     * 
     * @author zhongming
     * @param messageBO
     * @param path
     * @return
     * @since JDK 1.6
     */
    @SuppressWarnings("rawtypes")
    public static Object getParsingValToObject(MessageBO messageBO, String path)
    {
        if (StringUtils.hasText(path))
        {
            IMsgParse msgParse = MsgParseFactory.getInstance().getMsgParse(
                    messageBO);
            return msgParse.parsingValToObject(messageBO.getMsgBody(), path);
        }
        return null;
    }

    /**
     * 
     * getExprVal:(bo对象根据OGNL表达式解析). 
     * 
     * @author zhongming
     * @param messageBO
     * @param expr
     * @return
     * @since JDK 1.6
     */
    @SuppressWarnings(
    { "rawtypes" })
    public static Object getExprVal(MessageBO messageBO, String expr)
    {
        if (StringUtils.hasText(expr))
        {
            OgnlContext context = new OgnlContext();
            context.put("messageBO", messageBO);
            try
            {
                return Ognl.getValue(expr, messageBO);
            }
            catch (OgnlException e)
            {
            	LOG.error("serviceAgent- core Ognl expr err {0}", expr);
            }
        }

        return null;
    }

    public static Object getValue(int nodeDescId, String express, Object o)
    {
        Assert.notNull(express);
        Object val = null;
        try
        {
            val = Ognl.getValue(express, o);
        }
        catch (OgnlException e)
        {
            String strError = ExceptionUtils.populateExecption(e, 500);
            LOG.error("getvalue id {0} value exception {1}", nodeDescId,
                    strError);
        }
        return val;
    }

    public static Object getValueByContext(int nodeDescId, String express,
            OgnlContext context)
    {
        Assert.notNull(express);
        Object val = null;
        try
        {
            val = Ognl.getValue(express, context, context.getRoot());
        }
        catch (OgnlException e)
        {
            String strError = ExceptionUtils.populateExecption(e, 500);
            LOG.error("getValueByContext id {0} value exception {1}",
                    nodeDescId, strError);
        }
        return val;
    }

    /**
     * getNodeValByNodeDesc:(BO对象，根据NodeDesc获取信息). 
     * 
     * @author zhongming
     * @param messageBO
     * @param nodeDesc
     * @return
     * @since JDK 1.6
     */
    @SuppressWarnings(
    { "rawtypes", "unchecked" })
    public static Object getNodeValByNodeDesc(MessageBO messageBO,
            NodeDesc nodeDesc)
    {

        if ("1".equals(nodeDesc.getNodeType().trim()))
        {
            return messageBO.getMsgHead().get(nodeDesc.getNodeCode().trim());
        }
        if (nodeDesc.getNodeType().trim().equals("4"))
        {
            return messageBO.getMessageMap().get(nodeDesc.getNodeCode().trim());
        }

        Object obj = getNodeValBySrcSource(messageBO, nodeDesc.getNodePath());

        if (obj == null)
        {
            return null;
        }
        if (messageBO.getMsgBody() instanceof JSONObject)
        {
            return obj;
        }

        if (obj instanceof List)
        {
            Element e = ((List<Element>) obj).get(0);

            if (nodeDesc.getNodeType().trim().equals("2"))
            {
                if (messageBO.getMsgBody() instanceof Document)
                {

                    if ((nodeDesc.getNodeNumberCons().trim().equals("") || nodeDesc
                            .getNodeNumberCons().trim() == null)
                            && (nodeDesc.getNevlConsType().trim().equals("") || nodeDesc
                                    .getNevlConsType().trim() == null))
                    {
                        return e.getTextTrim();
                    }
                    else
                    {
                        return (List) obj;
                    }
                }
            }

            if (nodeDesc.getNodeType().trim().equals("7"))
            {
                for (int i = 0; i < e.attributes().size(); i++)
                {
                    Attribute attr = (Attribute) e.attributes().get(i);
                    String[] strs = attr.getPath().split("@");
                    if (strs[1].equals(nodeDesc.getNodeCode()))
                    {
                        return attr.getText().trim();
                    }
                }
            }
            return e;
        }

        return obj;
    }

}
