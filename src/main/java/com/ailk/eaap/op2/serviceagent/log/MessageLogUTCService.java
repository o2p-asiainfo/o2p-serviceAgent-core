package com.ailk.eaap.op2.serviceagent.log;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.ailk.eaap.o2p.common.util.date.UTCTimeUtil;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.CtgLogs;
import com.ailk.eaap.op2.bo.EndpointInteraction;
import com.ailk.eaap.op2.bo.ExceptionLogs;
import com.ailk.eaap.op2.bo.LogMessageObject;
import com.ailk.eaap.op2.bo.OriLogClob;

public class MessageLogUTCService {
		//UTC开关控制
		private String ctrUTCTime;
		//引入bo实体
		private ContractInteraction contractInteraction;
		private EndpointInteraction endpointInteraction;
		private OriLogClob oriLogClob;
		private ExceptionLogs exceptionLogs;
		private CtgLogs ctgLogs;
	  
		/**
	    * 将logObject时间转换成UTCTime
	    * @param logObject
	    * @return
	    */
	   public Object ConvertTimeToUTC(LogMessageObject logObject){	   
		   if(getCtrUTCTime().equals("true")){
			//调用相应的方法遍历对应的list
			   getObjectList(logObject,contractInteraction);
			   getObjectList(logObject,endpointInteraction);
			   getObjectList(logObject,oriLogClob);
			   getObjectList(logObject,exceptionLogs);
			   getObjectList(logObject,ctgLogs);			
		   }
		return logObject;
	   }

	

	public void getObjectList(LogMessageObject logObject,Object object){
		if(object instanceof ContractInteraction){
			setContractInteractionObjectList(logObject);
		}
		else if(object instanceof EndpointInteraction){
			setEndpointInteractionObjectList(logObject);
		}
		else if(object instanceof OriLogClob){
			setOriLogClobObjectList(logObject);
		}
		else if(object instanceof ExceptionLogs){
			setExceptionLogsObjectList(logObject);
		}
		else{
			setCtgLogsObjectList(logObject);
		}
	}
	
	//遍历contractInteractionList将每个对象的时间转为UTC时间
	public Object setContractInteractionObjectList(LogMessageObject logObject){
		   List contractInteractionList=logObject.getContractInteractionList();
		   for(int i=0;i<contractInteractionList.size();i++){
				   ContractInteraction contractInteraction=(ContractInteraction) contractInteractionList.get(i);
				   Date centerFwd2DstTime,centerFwd2SrcTime,centerRecDstTime,centerRecReqTime;
				   if(contractInteraction.getCenterFwd2DstTime()!=null){
					   centerFwd2DstTime = UTCTimeUtil.getUTCTimestamp(new Date(contractInteraction.getCenterFwd2DstTime().getTime()));				  
				   }
				   else{
					   centerFwd2DstTime = UTCTimeUtil.getUTCTimestamp();
				   }
				   contractInteraction.setCenterFwd2DstTime(new Timestamp(centerFwd2DstTime.getTime()));
				   
				   if(contractInteraction.getCenterFwd2SrcTime()!=null){
					   centerFwd2SrcTime= UTCTimeUtil.getUTCTimestamp(new Date(contractInteraction.getCenterFwd2SrcTime().getTime()));				   
				   }
				   else{
					   centerFwd2SrcTime=UTCTimeUtil.getUTCTimestamp();
				   }
				   contractInteraction.setCenterFwd2SrcTime(new Timestamp(centerFwd2SrcTime.getTime()));
				   
				  if(contractInteraction.getCenterRecDstTime()!=null){
					   centerRecDstTime= UTCTimeUtil.getUTCTimestamp(new Date(contractInteraction.getCenterRecDstTime().getTime()));				   
				  }
				  else{
					  centerRecDstTime=UTCTimeUtil.getUTCTimestamp();
				  }
				  contractInteraction.setCenterRecDstTime(new Timestamp(centerRecDstTime.getTime()));
				  
				  if(contractInteraction.getCenterRecReqTime()!=null){
					   centerRecReqTime= UTCTimeUtil.getUTCTimestamp(new Date(contractInteraction.getCenterRecReqTime().getTime()));					  
				  }
				  else{
					  centerRecReqTime=UTCTimeUtil.getUTCTimestamp();
				  }
				  contractInteraction.setCenterRecReqTime(new Timestamp(centerRecReqTime.getTime()));
				  if(contractInteraction.getSrcReqTime()!=null){
					  contractInteraction.setSrcReqTime(UTCTimeUtil.getUTCTimestamp(contractInteraction.getSrcReqTime()));
				  }
				  else{
					  contractInteraction.setSrcReqTime(UTCTimeUtil.getUTCTimestamp());
				  }
				  
				  if(contractInteraction.getDstRecTime()!=null){
					  contractInteraction.setDstRecTime(UTCTimeUtil.getUTCTimestamp(contractInteraction.getDstRecTime()));
				  }
				  else{
					  contractInteraction.setDstRecTime(UTCTimeUtil.getUTCTimestamp());
				  }
				  
				  if(contractInteraction.getDstReplyTime()!=null){
					  contractInteraction.setDstReplyTime(UTCTimeUtil.getUTCTimestamp(contractInteraction.getDstReplyTime()));
				  }
				  else{
					  contractInteraction.setDstReplyTime(UTCTimeUtil.getUTCTimestamp());
				  }
				  
				  if(contractInteraction.getSrcConfirmTime()!=null){
					  contractInteraction.setSrcConfirmTime(UTCTimeUtil.getUTCTimestamp(contractInteraction.getSrcConfirmTime()));
				  }
				  else{
					  contractInteraction.setSrcConfirmTime(UTCTimeUtil.getUTCTimestamp());
				  }
				  
				  if(contractInteraction.getSrcResponseTime()!=null){
					  contractInteraction.setSrcResponseTime(UTCTimeUtil.getUTCTimestamp(contractInteraction.getSrcResponseTime()));
				  }
				  else{
					  contractInteraction.setSrcResponseTime(UTCTimeUtil.getUTCTimestamp());
				  }
				  
				  if(contractInteraction.getCreateTime()!=null){
					  contractInteraction.setCreateTime(UTCTimeUtil.getUTCTimestamp(contractInteraction.getCreateTime()));
				  }
				  else{
					  contractInteraction.setCreateTime(UTCTimeUtil.getUTCTimestamp());
				  }
		   }
		   logObject.setContractInteractionList(contractInteractionList);
		   return logObject;
	}
	
	//遍历endpointInteractionList将每个对象的时间转为UTC时间
	public Object setEndpointInteractionObjectList(LogMessageObject logObject){
		   List endpointInteractionList=logObject.getEndpointInteractionList();
		   for(int i=0;i<endpointInteractionList.size();i++){
				   EndpointInteraction endpointInteraction=(EndpointInteraction) endpointInteractionList.get(i);
				   Date centerFwd2DstTime,dstReplyTime;
				   if(endpointInteraction.getCenterFwd2DstTime()!=null){
					   centerFwd2DstTime=UTCTimeUtil.getUTCTimestamp(new Date(endpointInteraction.getCenterFwd2DstTime().getTime()));					   
				   }
				   else{
					   centerFwd2DstTime=UTCTimeUtil.getUTCTimestamp();
				   }
				   endpointInteraction.setCenterFwd2DstTime(new Timestamp(centerFwd2DstTime.getTime()));
				   
				  if(endpointInteraction.getDstReplyTime()!=null){
					   dstReplyTime=UTCTimeUtil.getUTCTimestamp(new Date(endpointInteraction.getDstReplyTime().getTime()));					   
				  }
				  else{
					  dstReplyTime=UTCTimeUtil.getUTCTimestamp();
				  }
				  endpointInteraction.setDstReplyTime(new Timestamp(dstReplyTime.getTime())); 
				  
				 if(endpointInteraction.getCreateDate()!=null){
					 endpointInteraction.setCreateDate(UTCTimeUtil.getUTCTimestamp(endpointInteraction.getCreateDate()));
				 }
				 else{
					 endpointInteraction.setCreateDate(UTCTimeUtil.getUTCTimestamp());
				 }			   
		   }
		   logObject.setEndpointInteractionList(endpointInteractionList);
		   return logObject;
	}
	
	//遍历oriLogClobList将每个对象的时间转为UTC时间
	public Object setOriLogClobObjectList(LogMessageObject logObject){
		  List oriLogClobList=logObject.getOriLogClobList();
		   for(int i=0;i<oriLogClobList.size();i++){
				   OriLogClob oriLogClob=(OriLogClob) oriLogClobList.get(i);
				   Date createTime;
				  if(oriLogClob.getCreateTime()!=null){
					   createTime=UTCTimeUtil.getUTCTimestamp(new Date(oriLogClob.getCreateTime().getTime()));				  
				  }		
				  else{
					  createTime=UTCTimeUtil.getUTCTimestamp();
				  }
				  oriLogClob.setCreateTime(new Timestamp(createTime.getTime()));
		   }
		   logObject.setOriLogClobList(oriLogClobList);
		   return logObject;
	}
	
	//遍历exceptionLogsList将每个对象的时间转为UTC时间
	public Object setExceptionLogsObjectList(LogMessageObject logObject){
		   List exceptionLogsList=logObject.getExceptionLogsList();
		   for(int i=0;i<exceptionLogsList.size();i++){
			   ExceptionLogs exceptionLog=(ExceptionLogs) exceptionLogsList.get(i);
			   if(exceptionLog.getCreateTime()!=null){
				   exceptionLog.setCreateTime(UTCTimeUtil.getUTCTimestamp(exceptionLog.getCreateTime()));
			   }
			   else{
				   exceptionLog.setCreateTime(UTCTimeUtil.getUTCTimestamp());
			   }
		   }
		   logObject.setExceptionLogsList(exceptionLogsList);
		   return logObject;
	}
	
	//遍历ctgLogsList将每个对象的时间转为UTC时间
	public Object setCtgLogsObjectList(LogMessageObject logObject){
		   List ctgLogsList=logObject.getCtgLogsList();
		   for(int i=0;i<ctgLogsList.size();i++){
			   CtgLogs ctgLogs=(CtgLogs) ctgLogsList.get(i);
			   Date createTime;
			   if(ctgLogs.getCreateDate()!=null){
				   createTime=UTCTimeUtil.getUTCTimestamp(new Date(ctgLogs.getCreateDate().getTime()));				   
			   }   
			   else{
				   createTime=UTCTimeUtil.getUTCTimestamp();
			   }
			   ctgLogs.setCreateDate(new Timestamp(createTime.getTime()));
		   }
		   logObject.setCtgLogsList(ctgLogsList);
		   return logObject;
	}
	
	public String getCtrUTCTime() {
		return ctrUTCTime;
	}

	public void setCtrUTCTime(String ctrUTCTime) {
		this.ctrUTCTime = ctrUTCTime;
	}
	
	public ContractInteraction getContractInteraction() {
		return contractInteraction;
	}

	public void setContractInteraction(ContractInteraction contractInteraction) {
		this.contractInteraction = contractInteraction;
	}

	public EndpointInteraction getEndpointInteraction() {
		return endpointInteraction;
	}

	public void setEndpointInteraction(EndpointInteraction endpointInteraction) {
		this.endpointInteraction = endpointInteraction;
	}

	public OriLogClob getOriLogClob() {
		return oriLogClob;
	}

	public void setOriLogClob(OriLogClob oriLogClob) {
		this.oriLogClob = oriLogClob;
	}

	public ExceptionLogs getExceptionLogs() {
		return exceptionLogs;
	}

	public void setExceptionLogs(ExceptionLogs exceptionLogs) {
		this.exceptionLogs = exceptionLogs;
	}

	public CtgLogs getCtgLogs() {
		return ctgLogs;
	}

	public void setCtgLogs(CtgLogs ctgLogs) {
		this.ctgLogs = ctgLogs;
	}
}
