/** 
 * Project Name:serviceAgent-core 
 * File Name:ContractAdapterEndpointServiceImpl.java 
 * Package Name:com.ailk.eaap.integration.o2p.contractbody.service 
 * Date:2015年4月13日下午2:36:33 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.contractbody.service;

import java.util.List;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.deal.service.IMessageBoHisService;
import com.ailk.eaap.op2.serviceagent.deal.service.MessageBoHisServiceImpl;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.ContractAdapterEndpoint;
import com.ailk.eaap.op2.bo.ContractFormatEx;
import com.ailk.eaap.op2.bo.TransformerRule;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * <p>
 * ClassName:ContractAdapterEndpointServiceImpl <br>
 * <p>
 * Function: TODO ADD FUNCTION. <br>
 * <p>
 * Reason: TODO ADD REASON. <br>
 * <p>
 * Date: 2015年4月13日 下午2:36:33 <br>
 * 
 * @author zhongming
 * @version 1.6
 * @since JDK 1.6 ClassName:ContractAdapterEndpointServiceImpl 
 *        Function: TODO ADD FUNCTION. 
 *        Reason: TODO ADD REASON. 
 *        Date: 2015年4月13日 下午2:36:33 
 * @author zhongming
 * @version
 * @since JDK 1.6
 */
public class ContractAdapterEndpointServiceImpl implements
        IContractAdapterEndpointService
{
    private static final Logger LOG = Logger
            .getLog(ContractAdapterEndpointServiceImpl.class);
    private IMemcacheManageServ cacheService;
    private IMessageBoHisService messageBoHisSer;

    public IMemcacheManageServ getCacheService()
    {
        return cacheService;
    }

    public void setCacheService(IMemcacheManageServ cacheService)
    {
        this.cacheService = cacheService;
    }

    public IMessageBoHisService getMessageBoHisSer()
    {
        return messageBoHisSer;
    }

    public void setMessageBoHisSer(IMessageBoHisService messageBoHisSer)
    {
        this.messageBoHisSer = messageBoHisSer;
    }

    @SuppressWarnings(
    { "unchecked", "rawtypes" })
    @Override
    public MessageBO<?> replaceContractAdapterEndpoint(MessageBO<?> bo,
            TransformerRule transformerRule)
    {
        if (LOG.isDebugEnabled())
        {
        	LOG.debug(
                    "ContractAdapterEndpointService req transformerRuleId : {0} transformerRuleType : {1}",
                    transformerRule.getId(),
                    transformerRule.getTransformerType());
        }

        List<ContractAdapterEndpoint> replaceList = transformerRule
                .getTransListContractAdapterEndpoint();
        if (replaceList == null || replaceList.size() == 0)
        {
            return bo;
        }

        if (replaceList.size() > 1)
        {
        	LOG.error(
                    "There can only be a replacement records {0} transformerRuleId {1}",
                    replaceList.size(), transformerRule.getId());
            return bo;
        }
        MessageBO currentBo = null;
        ContractAdapterEndpoint cae = replaceList.get(0);
        if (null == cae)
        {
        	LOG.error("Transformation rules replace exception message {0}",
                    transformerRule.getId());
            return bo;
        }
        ContractFormatEx con = cae.getContractFormat();
        if (null == con)
        {
        	LOG.error(
                    "Transformation rules replace protocol format exception message {0}",
                    transformerRule.getId());
            return bo;
        }
        if (0 == cae.getEndpointId())
        {
        	LOG.error(
                    "Transformation rules replace message history abnormal endpoint {0}",
                    transformerRule.getId());
            return bo;
        }
        String reqRsp = replaceList.get(0).getContractFormat().getReqRsp();
        if (MessageBoHisServiceImpl.REQ.equals(reqRsp))
        {
            MessageBO<?> historyBo = messageBoHisSer
                    .getReqMessageBoByEpId(replaceList.get(0).getEndpointId(), bo);
            currentBo = (MessageBO) bo.clone();
            currentBo.setMsgBody(historyBo.getMsgBody());
        }
        else if (MessageBoHisServiceImpl.RSP.equals(reqRsp))
        {
            MessageBO<?> historyBo = messageBoHisSer
                    .getRspMessageBoByEpId(replaceList.get(0).getEndpointId(), bo);
            currentBo = (MessageBO) bo.clone();
            currentBo.setMsgBody(historyBo.getMsgBody());
        }

        if (LOG.isDebugEnabled())
        {
        	LOG.debug("replaceContractAdapterEndpoint endpointId {0} ",
                    cae.getEndpointId());
        }

        return currentBo;
    }

}
