package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Node;

import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.Auth;
import com.ailk.eaap.op2.bo.DataType;
import com.ailk.eaap.op2.bo.Endpoint;
import com.ailk.eaap.op2.bo.EndpointAttr;
/**
 * 
 * 授权过滤，模糊化<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author litieyang May 18, 2013
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */
public class AuthProcessor implements EndpointProcessor{

	//模糊
	private static final String ObscureParm = "A";
	//区间模糊
	private static final String RangeObscureParm = "B";
	//授权
	private static final String AUTHParm = "C";
	//过滤
	private static final String filterParm = "D";
	private static final String REQ = "REQ";
	private static final String RSP = "RSP";
	private static final String PATH = "A";
	private static final String VALUE = "B";
	private static final Logger LOG = Logger.getLogger(AuthProcessor.class);
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	private static void  buildStr(int length,String charact,String str){
	
		if(str.length()<length){
			
			str += charact;
			
			buildStr(length,charact,str);
		}
		
	}
	public void obscure(Endpoint endpoint, MessageBO msg,Auth auth){
		
		Object reqorrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
		String reqOrRsp = null;
		if(reqorrspObj==null){
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.never_config_auth_req_or_rsp);
		}
		reqOrRsp = reqorrspObj.toString();
		
		Object range = auth.getAttrMap().get(EndpointAttr.subLength);
		Object character = auth.getAttrMap().get(EndpointAttr.character);
		
		if( reqOrRsp.equals(EOPDomain.REQ_FLAG) && auth.getReqOrRsp().equals(REQ)){
			if(endpoint.getInDataTypeCode().equals(DataType.XML)){
				Document xmldoc = (Document) msg.getMsgBody();
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				if(nodes!=null){
					for (Node node : nodes) {
						
						String value = node.getText();
						
						if(value!=null){
							String charact = "******";
							if(range!=null){
								String ranges[] = range.toString().split(",");
								String subStr = null;
								if(value.length()<Integer.valueOf(ranges[1])){
									subStr = value.substring(Integer.valueOf(ranges[0]), value.length()-1);
								}else{
									subStr = value.substring(Integer.valueOf(ranges[0]), Integer.valueOf(ranges[1]));
								}
								
								
								
								if(character!=null){
									charact =  character.toString();
								}
								value = value.replace(subStr, charact);
								node.setText(value);
							}else{
								node.setText(charact);
							}
							
						}
						
					}
				}
				msg.setMsgBody(xmldoc);
				
			}else if(endpoint.getInDataTypeCode().equals(DataType.UrlGet)
					&& msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
				
					String value = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
					String oldvalue = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
					if(value!=null){
						String charact = "******";
						if(range!=null){
							String ranges[] = range.toString().split(",");
							String subStr = value.substring(Integer.valueOf(ranges[0]), Integer.valueOf(ranges[1]));
							
							if(character!=null){
								charact =  character.toString();
							}
							value = value.replace(subStr, charact);
						}else{
							value = charact;
						}
					}
					msg.getMessageMap().put(auth.getAuthObj().getAuthPath(),value);
					msg.setMsgBody(msg.toString().replaceAll(auth.getAuthObj().getAuthPath()+"="+oldvalue, 
							auth.getAuthObj().getAuthPath()+"="+value));
					
			}
			
		}else if( reqOrRsp.equals(EOPDomain.RSP_FLAG) && auth.getReqOrRsp().equals(RSP)){
			
			if(endpoint.getOutDataTypeCode().equals(DataType.XML)){
				Document xmldoc = (Document) msg.getMsgBody();
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				if(nodes!=null){
					for (Node node : nodes) {
						String value = node.getText();
						if(value!=null){
							String charact = "******";
							if(range!=null){
								String ranges[] = range.toString().split(",");
								String subStr = value.substring(Integer.valueOf(ranges[0]), Integer.valueOf(ranges[1]));
								
								if(character!=null){
									charact =  character.toString();
								}
								value = value.replace(subStr, charact);
								node.setText(value);
							}else{
								node.setText(charact);
							}
							
						}
					}
				}
				msg.setMsgBody(xmldoc);
			}
			
		}

	}
	
	public void rangeObscure(Endpoint endpoint, MessageBO msg,Auth auth){

		Object reqorrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
		String reqOrRsp = null;
		if(reqorrspObj==null){
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.never_config_auth_req_or_rsp);
		}
		reqOrRsp = reqorrspObj.toString();
		
		Object range = auth.getAttrMap().get(EndpointAttr.range);
		Object subLength = auth.getAttrMap().get(EndpointAttr.subLength);
		if(range==null){
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.range_config_error);
		}
		if(reqOrRsp.equals(EOPDomain.REQ_FLAG) && auth.getReqOrRsp().equals(REQ)){
			if(endpoint.getInDataTypeCode().equals(DataType.XML)){
				LOG.debug("authpath"+auth.getAuthObj().getAuthPath());
				Document xmldoc = (Document) msg.getMsgBody();
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				if(nodes!=null){
					for (Node node : nodes) {
						String value = node.getText();
						LOG.debug("nodeValue"+value);
						
						if(value!=null){
							if(subLength!=null){
								String subLengths[] = subLength.toString().split(",");
								String subStr = value.substring(Integer.valueOf(subLengths[0]), Integer.valueOf(subLengths[1]));
								
								LOG.debug("subStr"+subStr);
								Integer su = Integer.parseInt(subStr);
								Float per = new Float(range.toString());
								per = per/100;
								int sub = (int)(su*per);
								String newValue = "["+(su-sub)+"-"+(su+sub)+"]";
								value = value.replace(subStr, newValue);
								node.setText(value);
							}else{
								Float per = new Float(range.toString());
								per = per/100;
								Integer iValue = Integer.parseInt(value);
								int sub = (int)(iValue*per);
								String newValue = "["+(iValue-sub)+"-"+(iValue+sub)+"]";
								node.setText(newValue);
							}
							
							
						}
						
					}
				}
				msg.setMsgBody(xmldoc);
				
			}else if(endpoint.getInDataTypeCode().equals(DataType.UrlGet)){
				
				if(msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
					String value = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
					String oldvalue = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
					if(value!=null){
						if(subLength!=null){
							String ranges[] = subLength.toString().split(",");
							String subStr = value.substring(Integer.valueOf(ranges[0]), Integer.valueOf(ranges[1]));
							Integer su = Integer.parseInt(subStr);
							Float per = new Float(range.toString());
							per = per/100;
							int sub = (int)(su*per);
							String newValue = "["+(su-sub)+"-"+(su+sub)+"]";
							value = value.replace(subStr, newValue);
							
						}		
					}
					msg.getMessageMap().put(auth.getAuthObj().getAuthPath(),value);
					msg.setMsgBody(msg.toString().replaceAll(auth.getAuthObj().getAuthPath()+"="+oldvalue, 
							auth.getAuthObj().getAuthPath()+"="+value));
					
				}
				
			}
			
		}else if(reqOrRsp.equals(EOPDomain.RSP_FLAG) && auth.getReqOrRsp().equals(RSP)){
			
			if(endpoint.getOutDataTypeCode().equals(DataType.XML)){
				Document xmldoc = (Document) msg.getMsgBody();
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				if(nodes!=null){
					for (Node node : nodes) {
						String value = node.getText();
						if(value!=null){
							if(subLength!=null){
								String ranges[] = subLength.toString().split(",");
								String subStr = value.substring(Integer.valueOf(ranges[0]), Integer.valueOf(ranges[1]));
								Integer su = Integer.parseInt(subStr);
								Float per = new Float(range.toString());
								per = per/100;
								int sub = (int)(su*per);
								String newValue = "["+(su-sub)+"-"+(su+sub)+"]";
								value = value.replace(subStr, newValue);
								
							}
							node.setText(value);
						}
					}
				}
				msg.setMsgBody(xmldoc);
			}
			
		}
	}
	public void filter(Endpoint endpoint, MessageBO msg,Auth auth){
		Object reqorrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
		String reqOrRsp = null;
		if(reqorrspObj==null){
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.never_config_auth_req_or_rsp);
		}
		reqOrRsp = reqorrspObj.toString();
		
		if(reqOrRsp.equals(EOPDomain.REQ_FLAG) && auth.getReqOrRsp().equals(REQ)){
			if(endpoint.getInDataTypeCode().equals(DataType.XML)){
				Document xmldoc = (Document) msg.getMsgBody();
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				if(nodes!=null){
					for (Node node : nodes) {
						node.getParent().remove(node);
					}
				}
				msg.setMsgBody(xmldoc);
				
			}else if(endpoint.getInDataTypeCode().equals(DataType.UrlGet)){
				
				if(msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
					String value = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
					msg.getMessageMap().remove(auth.getAuthObj().getAuthPath());
					msg.setMsgBody(msg.toString().replaceAll("&"+auth.getAuthObj().getAuthPath()+"="+value, ""));
				}
				
			}
			
		}else if(reqOrRsp.equals(EOPDomain.RSP_FLAG) && auth.getReqOrRsp().equals(RSP)){
			Document xmldoc = (Document) msg.getMsgBody();
			if(endpoint.getOutDataTypeCode().equals(DataType.XML)){
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				if(nodes!=null){
					for (Node node : nodes) {
						node.getParent().remove(node);
					}
				}
				msg.setMsgBody(xmldoc);
			}
			
		}
	
	}
	
	
	
	public void auth(Endpoint endpoint, MessageBO msg,Auth auth){

		Object reqorrspObj = endpoint.getAttrMap().get(EndpointAttr.reqorrsp);
		String reqOrRsp = null;
		if(reqorrspObj==null){
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.never_config_auth_req_or_rsp);
		}
		reqOrRsp = reqorrspObj.toString();
		
		if(reqOrRsp.equals(EOPDomain.REQ_FLAG) && auth.getReqOrRsp().equals(REQ)){
			if(endpoint.getInDataTypeCode().equals(DataType.XML)){
				Document xmldoc = (Document) msg.getMsgBody();
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				
				if(nodes!=null){
					if(auth.getAuthObjType().equals(PATH)){
						throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9040,ErrorDomain.req_no_auth_error);
					}else if(auth.getAuthObjType().equals(VALUE)){
						for (Node node : nodes) {
							String value = node.getText();
							boolean iscontrain = CommonUtil.iscontainValue(auth.getAuthFormula(), value);
							if(iscontrain){
								throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9040,ErrorDomain.req_no_auth_error);
							}
						}
					}
					
				}
				
			}else if(endpoint.getInDataTypeCode().equals(DataType.UrlGet)){
				if(auth.getAuthObjType().equals(PATH)){
					if(msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
						throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9040,ErrorDomain.req_no_auth_error);
					}
				}else if(auth.getAuthObjType().equals(VALUE)){
					
					if(msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null ){
						String value = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();

						boolean iscontrain = CommonUtil.iscontainValue(auth.getAuthFormula(), value);
						if(iscontrain){
							throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9040,ErrorDomain.req_no_auth_error);
						}
						
					}
							
					
				}
				
			}
			
		}else if(reqOrRsp.equals(EOPDomain.RSP_FLAG) && auth.getReqOrRsp().equals(RSP)){
			
			if(endpoint.getOutDataTypeCode().equals(DataType.XML)){
				Document xmldoc = (Document) msg.getMsgBody();
				List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
				if(nodes!=null){
					
					if(auth.getAuthObjType().equals(PATH)){
						throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9041,ErrorDomain.rsp_no_auth_error);
					}else if(auth.getAuthObjType().equals(VALUE)){
						for (Node node : nodes) {
							String value = node.getText();
							boolean iscontrain = CommonUtil.iscontainValue(auth.getAuthFormula(), value);
							
							if(iscontrain){
								throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9041,ErrorDomain.rsp_no_auth_error);
							}
						}
					}
					
				}
				
			}
		}
	
	}
	
	public MessageBO process(Endpoint endpoint, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		try{
			List<Auth> auths = msg.getSerInvokeIns().getAuths();
			
			
			if(auths!=null && auths.size()>0){
				for (Auth auth : auths) {
					
					if(auth.getState().equals(EOPDomain.NORMAL)){
						if(auth.getAuthObjOp().equals(filterParm)){
							
							filter(endpoint,msg,auth);
						}else if(auth.getAuthObjOp().equals(AUTHParm)){
							auth(endpoint,msg,auth);
						}else if(auth.getAuthObjOp().equals(ObscureParm)){
							obscure(endpoint,msg,auth);
						}else if(auth.getAuthObjOp().equals(RangeObscureParm)){
							
							rangeObscure(endpoint,msg,auth);
						}
						
					}
				}
			}
		}catch(EAAPException e){
			throw e;
		}catch(Exception e){
			LOG.error("authprocessor system error",e);
			throw new EAAPException( EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9999,ErrorDomain.system_error,e);
		}
		
	
		return msg;
	}

	public void subtraThreadNum(String servId)  {
		// TODO Auto-generated method stub
		
	}

}
