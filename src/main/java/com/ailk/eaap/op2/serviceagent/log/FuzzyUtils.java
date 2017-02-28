

package com.ailk.eaap.op2.serviceagent.log;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.ezmorph.bean.MorphDynaBean;
import net.sf.json.JSONObject;

import org.apache.axis.utils.StringUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.ArrayUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.util.Assert;

import com.ailk.eaap.o2p.common.security.SecurityUtil;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.log.Logger;
import com.ailk.eaap.op2.bo.FuzzyEncryption;
import com.ailk.eaap.op2.bo.NodeDesc;

/**
 * ClassName:FuzzyUtils 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年3月17日 下午3:04:11 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class FuzzyUtils {
	public static final String fuzzyTypeOne = "1";
	public static final String fuzzyTypeTwo = "2";
	public static final String fuzzyTypeThree = "3";

	private static final Logger LOG = Logger.getLog(FuzzyUtils.class);

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void fuzzyXml(MessageBO bo, Map<Integer, NodeDesc> nodeDescs,
			Map<Integer, FuzzyEncryption> fuzzyEns) {
		Assert.notNull(bo.getMsgBody(),"Fuzzy xml body is null endpoint id "+bo.getCurrryRouteEndpoint().getCurrentEndpoint().getEndpointId());
		//判断XML
		if (!(bo.getMsgBody() instanceof Document)) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("fuzzy type is not XML : {0}", bo.getMsgBody().toString());
				return;
			}
		}
		
		Document doc = null;
		try {
			doc = DocumentHelper.parseText(((Document)bo.getMsgBody()).asXML());
		} catch (DocumentException e) {
			LOG.error("DocumentException", e);
			return;
		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("start fuzzy xml : {0}", doc.asXML());
		}
		try {
			for (int i : nodeDescs.keySet()) {
				NodeDesc nodeDesc = nodeDescs.get(i);
				FuzzyEncryption fuzzy = fuzzyEns.get(i);
				String text = null;
				if (LOG.isDebugEnabled()) {
					LOG.debug(fuzzy.toString());
				}
				// header
				if (nodeDesc.getNodeType().equals(fuzzyTypeOne)) {
					text = bo.getMsgHead().get(nodeDesc.getNodeCode()).toString();
					text = selectFuzzy(fuzzy, text);
					bo.getMsgHead().put(nodeDesc.getNodeCode(), text);
				}
				// body
				else if (nodeDesc.getNodeType().equals(fuzzyTypeTwo)) {
					if(LOG.isDebugEnabled()) {
						LOG.debug("xml path : {0}", nodeDescs.get(i)
							.getNodePath());
					}
					List<Element> elements = doc.selectNodes(nodeDescs.get(i)
							.getNodePath());
					for (Element e : elements) {
						text = e.getText();

						text = selectFuzzy(fuzzy, text);
						e.setText(text);
					}
				}

			}
		} catch (BusinessException e) {
			LOG.error("Fuzzy XML BusinessException", e.getCause());
			return;
		}
		
		if (LOG.isDebugEnabled()) {
			LOG.debug("end fuzzy xml : {0}", doc.asXML());
		}
		bo.setMsgBody(doc);

	}

	private static String concreteEncryption(String text) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Encryption start : {0}", text);
		}
		text = SecurityUtil.getInstance().encryMsg(text);
		if (LOG.isDebugEnabled()) {
			LOG.debug("Encryption end : {0}", text);
		}
		return text;
	}

	private static String concreteFuzzy(FuzzyEncryption fuzzy, String text) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Fuzzy start : {0}", text);
		}
		String alternative = fuzzy.getFuzzyAlternative();
		int start = fuzzy.getFuzzyStart();
		int end = fuzzy.getFuzzyEnd();
		if (start > 0 && end > 0 && end > start && text.length() > start) {
			String fuzzyAlt = "";
			if (end < text.length()) {
				fuzzyAlt = getAlternative(alternative, end - start);
				text = text.substring(0, start) + fuzzyAlt
						+ text.substring(end);
			} else if (end == text.length()) {
				fuzzyAlt = getAlternative(alternative, end);
				text = text.substring(0, start) + fuzzyAlt;
			} else if (end > text.length()) {
				fuzzyAlt = getAlternative(alternative, text.length());
				text = text.substring(0, start) + fuzzyAlt;
			}
		}
		if (LOG.isDebugEnabled()) {
			LOG.debug("Fuzzy end : {0}", text);
		}
		return text;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void fuzzyJson(MessageBO bo,
			Map<Integer, NodeDesc> nodeDescs,
			Map<Integer, FuzzyEncryption> fuzzyEns) {
		Assert.notNull(bo.getMsgBody(),"Fuzzy json body is null endpoint id "+bo.getCurrryRouteEndpoint().getCurrentEndpoint().getEndpointId());
		String body = bo.toString();
		//判断JSON
		if (!(bo.getMsgBody() instanceof JSONObject)) {
			if (LOG.isDebugEnabled()) {
				LOG.debug("fuzzy type is not JSON : ", body);
				return;
			}
		}
		
		JSONObject json = (JSONObject) bo.getMsgBody();
		if (LOG.isDebugEnabled()) {
			LOG.debug("start fuzzy json {0}", json.toString());
		}
		Object bean = JSONObject.toBean(json);
		
		try {
			for (int i : nodeDescs.keySet()) {
				NodeDesc nodeDesc = nodeDescs.get(i);
				String nodePath = nodeDesc.getNodePath();
				if (nodePath.startsWith("$..")) {
					LOG.error("fuzzy json node_desc_id {0} node_path {1}",
							nodeDesc.getNodeDescId(), nodePath);
					continue;
				}
				FuzzyEncryption fuzzy = fuzzyEns.get(i);
				if (LOG.isDebugEnabled()) {
					LOG.debug(fuzzy.toString());
				}
				String[] hierarchys = nodePath.replace("$.", "").split("\\.");
				Object beanHie = bean;
				beanHie = againFuzzyJson(fuzzy, hierarchys,
						beanHie, 0);

			}
		} catch (BusinessException e) {
			LOG.error("Fuzzy JSON BusinessException", e.getCause());
			return;
		}
		
		bo.setMsgBody(JSONObject.fromObject(bean));
		if (LOG.isDebugEnabled()) {
			LOG.debug("end fuzzy json {0}", JSONObject.fromObject(bean)
					.toString());
		}
	}

	@SuppressWarnings("unchecked")
	private static Object againFuzzyJson(FuzzyEncryption fuzzy, String[] hierarchys, Object beanHie, int i) {
		String text;
		MorphDynaBean mdb = null;
		for (int j = i; j < hierarchys.length; j++) {
			try {
				if (beanHie instanceof List) {
					List<MorphDynaBean> hieList = (List<MorphDynaBean>) beanHie;
					if (j == hierarchys.length - 1) {
						for (int k = 0; k < hieList.size(); k++) {
							mdb = hieList.get(k);
							text = mdb.get(hierarchys[j]).toString();
							text = selectFuzzy(fuzzy, text);
						
							PropertyUtils.setProperty(mdb, hierarchys[j],
									text);
						}
						break;
					} else {
						for (int k =0; k < hieList.size() -1; k++) {
							mdb = hieList.get(k);
							againFuzzyJson(fuzzy, hierarchys, mdb, j+1);
						}
						break;
					}
				}
				if (beanHie instanceof MorphDynaBean) {
					MorphDynaBean mb = ((MorphDynaBean) beanHie);
					if (j == hierarchys.length - 1) {
						//判断当前动态属性不为空
						if (null != mb.getDynaClass().getDynaProperty(hierarchys[j])) {
							text = mb.get(hierarchys[j]).toString();
							text = selectFuzzy(fuzzy, text);
						
							PropertyUtils.setProperty(beanHie, hierarchys[j],
									text);
							continue;
						}
					}
					if (null != mb.getDynaClass().getDynaProperty(hierarchys[j])) {
						beanHie = PropertyUtils.getProperty(mb, hierarchys[j]);
					}
				}
			} catch (IllegalAccessException e) {
				LOG.error("fuzzyJson IllegalAccessException", e.getCause());
				throw new BusinessException(9310,
						"o2p-serviceagent-core.9310", e.getCause());
			} catch (InvocationTargetException e) {
				LOG.error("fuzzyJson InvocationTargetException",
						e.getCause());
				throw new BusinessException(9310,
						"o2p-serviceagent-core.9310", e.getCause());
			} catch (NoSuchMethodException e) {
				LOG.error("fuzzyJson NoSuchMethodException", e.getCause());
				throw new BusinessException(9310,
						"o2p-serviceagent-core.9310", e.getCause());
			}

		}
		return beanHie;
	}

	private static String selectFuzzy(FuzzyEncryption fuzzy, String text) {
		// 模糊化
		if (!StringUtils.isEmpty(text)
				&& fuzzy.getFuzzyEncryptionType()
						.equals(fuzzyTypeOne)) {
			text = concreteFuzzy(fuzzy, text);
		}
		// 加密
		else if (!StringUtils.isEmpty(text)
				&& fuzzy.getFuzzyEncryptionType()
						.equals(fuzzyTypeTwo)) {
			text = concreteEncryption(text);
		}
		// 模糊加密
		else if (!StringUtils.isEmpty(text)
				&& fuzzy.getFuzzyEncryptionType()
						.equals(fuzzyTypeThree)) {
			text = concreteFuzzy(fuzzy, text);

			text = concreteEncryption(text);
		}
		return text;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void fuzzyFile(MessageBO bo,
			Map<Integer, NodeDesc> nodeDescs,
			Map<Integer, FuzzyEncryption> fuzzyEns) {
		Assert.notNull(bo.getMsgBody(),"Fuzzy file body is null endpoint id "+bo.getCurrryRouteEndpoint().getCurrentEndpoint().getEndpointId());
		//判断File
		if (bo.getMsgBody() instanceof File || bo.getMsgBody() instanceof File[]) {
			
			File[] files = (File[]) bo.getMsgBody();
			List<File> fList = new ArrayList<File>();
			if (LOG.isDebugEnabled()) {
				LOG.debug("start fuzzy files : ", ArrayUtils.toString(files));
			}
			for (int i : fuzzyEns.keySet()) {
				for (File file : files) {
					String text = file.getPath();
					FuzzyEncryption fuzzy = fuzzyEns.get(i);
					if (LOG.isDebugEnabled()) {
						LOG.debug(fuzzy.toString());
					}
					// 模糊
					if (text != null
							&& fuzzy.getFuzzyEncryptionType().equals(fuzzyTypeOne)) {
						text = concreteFuzzy(fuzzy, text);
					}
					// 加密
					else if (text != null
							&& fuzzy.getFuzzyEncryptionType().equals(fuzzyTypeTwo)) {
						text = concreteEncryption(text);
					}
					// 模糊加密
					else if (text != null
							&& fuzzy.getFuzzyEncryptionType()
									.equals(fuzzyTypeThree)) {
						text = concreteFuzzy(fuzzy, text);

						text = concreteEncryption(text);
					}
					if(!StringUtils.isEmpty(text)){
						fList.add(new File(text));
					}
				}

			}
			if (LOG.isDebugEnabled()) {
				LOG.debug("end fuzzy files : ",
						( ArrayUtils.toString(fList)));
				
			}
			bo.setMsgBody(fList.toArray());
			
		}
		else {
			if (LOG.isDebugEnabled()) {
				LOG.debug("fuzzy type is not File : ", bo.toString());
			}
		}
		
		
	}

	public static String getAlternative(String alternative, int length) {
		if (StringUtils.isEmpty(alternative)) {
			alternative = "*";
		}
		StringBuffer sbu = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sbu.append(alternative);
		}

		return sbu.toString();
	}

}
