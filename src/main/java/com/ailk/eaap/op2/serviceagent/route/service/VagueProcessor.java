package com.ailk.eaap.op2.serviceagent.route.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.mortbay.log.Log;

import com.ailk.eaap.op2.common.CommonUtil;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.alibaba.fastjson.JSONPath;
import com.jayway.jsonpath.JsonPath;

import net.sf.json.JSONObject;

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
public class VagueProcessor {

	//模糊
	private static final String ObscureParm = "A";
	//区间模糊
	private static final String RangeObscureParm = "B";
	//授权
	private static final String AUTHParm = "C";
	//过滤
	private static final String filterParm = "D";
	public static final String REQ = "REQ";
	public static final String RSP = "RSP";
	private static final String PATH = "A";
	private static final String VALUE = "B";
	private static final Logger LOG = Logger.getLogger(VagueProcessor.class);
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	private static void  buildStr(int length,String charact,String str){
	
		if(str.length()<length){
			
			str += charact;
			
			buildStr(length,charact,str);
		}
		
	}
	public static void obscure(String reqOrRsp, MessageBO msg,Auth auth){
		
		
		
		Object range = auth.getAttrMap().get(EndpointAttr.subLength);
		Object character = auth.getAttrMap().get(EndpointAttr.character);
		LOG.debug(auth.getAttrMap());
		LOG.debug(reqOrRsp);
		LOG.debug(range);
		LOG.debug(character);
		LOG.debug(msg.getMsgBody() instanceof Document);
		LOG.debug(msg.getMsgBody() instanceof String);
		if((msg.getMsgBody() instanceof Document) || ((msg.getMsgBody() instanceof String) && msg.getMsgBody().toString().startsWith("<")) ){
			
			Document xmldoc = null;
			if(msg.getMsgBody() instanceof Document){
				xmldoc = (Document) msg.getMsgBody();
			}else{
				try{
					xmldoc = DocumentHelper.parseText(msg.getMsgBody().toString());
				}catch(DocumentException e){
					
				}
				
			}
			
			List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
			if(nodes!=null){
				for (Node node : nodes) {
					
					String value = node.getText();
					LOG.debug("value::"+value);
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
								StringBuffer stb = new StringBuffer();
								for(int i =0 ;i<subStr.length();i++){
									stb.append(charact);
								}
								charact = stb.toString();
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
			
			LOG.debug("msg::"+msg.getMsgBody());
			
		}else if(msg.getMsgBody()==null
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
				
		}else if(msg.getMsgBody() instanceof JSONObject){
			
			//TODO
		}
		
	}
	
	public static void rangeObscure(String reqOrRsp, MessageBO msg,Auth auth){

		
		
		Object range = auth.getAttrMap().get(EndpointAttr.range);
		Object subLength = auth.getAttrMap().get(EndpointAttr.subLength);

		if((msg.getMsgBody() instanceof Document) || ((msg.getMsgBody() instanceof String) && msg.getMsgBody().toString().startsWith("<")) ){
			
			
			LOG.debug("authpath"+auth.getAuthObj().getAuthPath());
			
			Document xmldoc = null;
			if(msg.getMsgBody() instanceof Document){
				xmldoc = (Document) msg.getMsgBody();
			}else{
				try {
					xmldoc = DocumentHelper.parseText(msg.getMsgBody().toString());
				} catch (DocumentException e) {
					// TODO Auto-generated catch block
					
				}
			}
			
			List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
			if(nodes!=null){
				for (Node node : nodes) {
					String value = node.getText();
					LOG.debug("nodeValue"+value);
					
					if(value!=null){
						/*if(subLength!=null){
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
						}*/
						
						Integer iValue = Integer.parseInt(value);
						String first = value.charAt(0)+"";
						int downFirstInt = new Integer(first).intValue()+1;
						String downFirst = downFirstInt+"";
						for(int i =0;i<value.length()-1;i++){
							first = first+"0";
							downFirst = downFirst+"0";
						}
						
						
						String newValue = "["+(first)+"-"+(downFirst)+"]";
						node.setText(newValue);
						
					}
					
				}
			}
			msg.setMsgBody(xmldoc);
			
		}else if(msg.getMsgBody()==null
				&& msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
			
			if(msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
				String value = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
				String oldvalue = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
				if(value!=null){
					String subStr = null;
					if(subLength!=null){
						String ranges[] = subLength.toString().split(",");
						subStr = value.substring(Integer.valueOf(ranges[0]), Integer.valueOf(ranges[1]));
					}else{
						subStr = value;
					}
						Integer su = Integer.parseInt(subStr);
						Float per = new Float(range.toString());
						per = per/100;
						int sub = (int)(su*per);
						String newValue = "["+(su-sub)+"-"+(su+sub)+"]";
						value = value.replace(subStr, newValue);
						
							
				}
				msg.getMessageMap().put(auth.getAuthObj().getAuthPath(),value);
				msg.setMsgBody(msg.toString().replaceAll(auth.getAuthObj().getAuthPath()+"="+oldvalue, 
						auth.getAuthObj().getAuthPath()+"="+value));
				
			}
			
		}else if(msg.getMsgBody() instanceof JSONObject){
			
			//TODO
		}
		
	
	}
	
	public static String getrang(String num){
		int leng = num.length();
		StringBuilder st = new StringBuilder();
		st.append("1");
		for (int i = 0; i < leng-1; i++) {
			st.append("0");
		}
		int count = Integer.parseInt(st.toString());
		int sub = Integer.parseInt(num)/count;
		
		
		StringBuilder stb = new StringBuilder();
		stb.append(sub);
		for (int i = 0; i < leng-1; i++) {
			stb.append("0");
		}
		int down = Integer.parseInt(stb.toString());
		int up = down+count;
		return "["+down+","+up+"]";
	}

	
	
	
	
	
	public static void filter(String reqOrRsp, MessageBO msg,Auth auth){
		
		
		
		if(msg.getMsgBody() instanceof Document){
			Document xmldoc = (Document) msg.getMsgBody();
			List<Node> nodes = xmldoc.selectNodes(auth.getAuthObj().getAuthPath());
			if(nodes!=null){
				for (Node node : nodes) {
					node.getParent().remove(node);
				}
			}
			msg.setMsgBody(xmldoc);
			
		}else if(msg.getMsgBody()==null
				&& msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
			
			if(msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
				String value = msg.getMessageMap().get(auth.getAuthObj().getAuthPath()).toString();
				msg.getMessageMap().remove(auth.getAuthObj().getAuthPath());
				msg.setMsgBody(msg.toString().replaceAll("&"+auth.getAuthObj().getAuthPath()+"="+value, ""));
			}
			
		}else if(msg.getMsgBody() instanceof JSONObject){
			
			//TODO
		}
	
	}
	
	
	
	public static void auth(String reqOrRsp, MessageBO msg,Auth auth){


		if(msg.getMsgBody() instanceof Document){
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
			
		}else if(msg.getMsgBody()==null
				&& msg.getMessageMap().get(auth.getAuthObj().getAuthPath())!=null){
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
			
		}else if(msg.getMsgBody() instanceof JSONObject){
			
			//TODO
		}

	
	}
	
	public static MessageBO process(String resorrep, MessageBO msg)
			 {
		// TODO Auto-generated method stub
		try{
			List<Auth> auths = msg.getSerInvokeIns().getAuths();
			
			LOG.debug("auth::::"+auths);
			if(auths!=null && auths.size()>0){
				for (Auth auth : auths) {
					LOG.debug("status:"+auth.getState());
					LOG.debug("op:"+auth.getAuthObjOp());
					
					if(!auth.getReqOrRsp().equals(resorrep)){
						continue;
					}
					if(auth.getState().equals(EOPDomain.NORMAL)){
						if(auth.getAuthObjOp().equals(filterParm)){
							
							filter(resorrep,msg,auth);
						}
						if(auth.getAuthObjOp().equals(AUTHParm)){
							auth(resorrep,msg,auth);
						}
						if(auth.getAuthObjOp().equals(ObscureParm)){
							obscure(resorrep,msg,auth);
						}
						if(auth.getAuthObjOp().equals(RangeObscureParm)){
							
							rangeObscure(resorrep,msg,auth);
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
	
	public static void main(String[] args) {
		String value = "32";
		Integer iValue = Integer.parseInt(value);
		String first = value.charAt(0)+"";
		int downFirstInt = new Integer(first).intValue()+1;
		String downFirst = downFirstInt+"";
		for(int i =0;i<value.length()-1;i++){
			first = first+"0";
			downFirst = downFirst+"0";
		}
		
		
		String newValue = "["+(first)+"-"+(downFirst)+"]";
		LOG.debug(newValue);
	}

}
