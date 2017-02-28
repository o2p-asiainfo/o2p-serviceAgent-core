package com.ailk.eaap.op2.serviceagent.validate.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.o2p.common.util.DateUtils;
import com.ailk.eaap.op2.common.EAAPException;
import com.ailk.eaap.op2.common.EAAPTags;
import com.ailk.eaap.op2.serviceagent.common.EOPDomain;
import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.ContractVersion;
import com.ailk.eaap.op2.bo.MainData;
import com.ailk.eaap.op2.bo.NodeDesc;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;
import com.jayway.jsonpath.JsonPath;

/**
 * 
 * <p>
 * 
 * @version 1.0
 * @author litieyang Feb 18, 2013
 *         <hr>
 *         <hr>
 *         <hr>
 */
public class ValidateServ implements IValidateServ {

	private IMemcacheManageServ cacheService;

	public IMemcacheManageServ getCacheService() {
		return cacheService;
	}

	public void setCacheService(IMemcacheManageServ cacheService) {
		this.cacheService = cacheService;
	}

	private static final Logger log = Logger.getLogger(ValidateServ.class);

	public ValidateServ() {
	}

	@SuppressWarnings("rawtypes")
	public void mapValidate(Map map, List<NodeDesc> nodeDescs, MessageBO messageBO)
			throws EAAPException {
		if (nodeDescs != null && nodeDescs.size() > 0) {
			for (NodeDesc nodeDesc : nodeDescs) {
				if (nodeDesc.getIsNeedCheck() != null
						&& nodeDesc.getIsNeedCheck().equals(EOPDomain.YES)) {
					if (nodeDesc.getNodeNumberCons().equals(EOPDomain.mustOne)) {
						Object obj = map.get(nodeDesc.getNodePath());
						if (obj == null) {
							throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
									ErrorDomain.ERROR_CODE_9002, "("
											+ nodeDesc.getNodePath()
											+ ")  node not exist");
						} else {
							valueValidate(nodeDesc, obj.toString(),messageBO);
						}
					}
				}
			}
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void xmlValidate(MessageBO messageBO, String xml,
			List<NodeDesc> nodeDescs) throws EAAPException {
		Document xmldoc = (Document) messageBO.getMsgBody();

		if (nodeDescs != null && nodeDescs.size() > 0) {
			for (NodeDesc nodeDesc : nodeDescs) {
				if (nodeDesc.getIsNeedCheck() != null
						&& nodeDesc.getIsNeedCheck().equals(EOPDomain.YES)) {
					if (nodeDesc.getNodeNumberCons().equals(EOPDomain.mustOne)
							|| nodeDesc.getNodeNumberCons().equals(
									EOPDomain.mustmulti)) {
						List<Node> nodes = xmldoc.selectNodes(nodeDesc
								.getNodePath());
						if (nodes == null || nodes.size() < 1) {
							throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
									ErrorDomain.ERROR_CODE_9002, "("
											+ nodeDesc.getNodePath()
											+ ")  Node does not exist.");
						}
						if (nodeDesc.getNodeNumberCons().equals(
								EOPDomain.mustOne)) {
							if (nodes.size() > 1) {
								throw new EAAPException(
										EAAPTags.SEG_DRAVER_SIGN,
										ErrorDomain.ERROR_CODE_9002,
										"("
												+ nodeDesc.getNodePath()
												+ ") Node number exceeds the limit.");
							}
						}
						for (Node node : nodes) {
							String nodeValue = node.getText();
							valueValidate(nodeDesc, nodeValue,messageBO);
						}
					}

				}
			}
		}
	}

	@SuppressWarnings({ "rawtypes" })
	public void jsonValidate(MessageBO messageBO, List<NodeDesc> nodeDescs)
			throws EAAPException {
		JSONObject json = (JSONObject) messageBO.getMsgBody();

		if (nodeDescs != null && nodeDescs.size() > 0) {
			for (NodeDesc nodeDesc : nodeDescs) {
				if (nodeDesc.getIsNeedCheck() != null
						&& nodeDesc.getIsNeedCheck().equals(EOPDomain.YES)) {
					if (nodeDesc.getNodeNumberCons().equals(EOPDomain.mustOne)
							|| nodeDesc.getNodeNumberCons().equals(
									EOPDomain.mustmulti)) {
						log.debug(json.toString());
						log.debug("****************************"+nodeDesc.getNodePath());
						Object o = JsonPath.read(json, nodeDesc.getNodePath());

						if (o == null ||o.toString().equals("")) {
							throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
									ErrorDomain.ERROR_CODE_9002, "("
											+ nodeDesc.getNodePath()
											+ ")  Node does not exist.");
						}

						valueValidate(nodeDesc, o.toString(),messageBO);
					}

				}
			}
		}
	}

	@SuppressWarnings({ "rawtypes" })
	public void csvValidate(MessageBO messageBO, List<NodeDesc> nodeDescs,
			ContractFormat contractFormat) throws EAAPException {
		final String fileUrl = messageBO.toString();
		File file = new File(fileUrl);
		BufferedReader bufReader = null;

		if (nodeDescs != null && nodeDescs.size() > 0) {
			List<NodeDesc> nodeDescHeaders = new ArrayList<NodeDesc>();
			List<NodeDesc> nodeDescBodys = new ArrayList<NodeDesc>();
			csvNeatNodeDesc(nodeDescs, nodeDescHeaders, nodeDescBodys);
			try {
				bufReader = new BufferedReader(new FileReader(file));
				String line = bufReader.readLine();
				// 是否第一次加载内存
				int memory = 0;
				// 计算从文件加载到内存行数
				int i = 0;
				// 文件行数
				int j = 0;
				int rowNumber = 0;
				// 分隔的列数
				int column = 0;
				// header校验
				boolean headerBoolean = false;
				List<String> list = new ArrayList<String>();
				Map<Integer, String[]> oldMap = new HashMap<Integer, String[]>();
				while (line != null) {
					list.add(line);
					i++;
					// 判断内存加载行数符合，先处理一部分
					if (i == 100) {
						// 按行按列分隔的数组，只保存100行记录
						Map<Integer, String[]> rowMap = new HashMap<Integer, String[]>();
						for (String row : list) {
							String[] columns = row.split(",");
							column = csvValidateLine(column, row, columns);
							rowMap.put(j, columns);
							j++;
						}
						
						if (memory < 1 && nodeDescHeaders != null
								&& nodeDescHeaders.size() > 0) {
							headerBoolean = true;
							rowNumber = csvValidateHeader(nodeDescHeaders,
									rowNumber, rowMap,messageBO);
						}
						csvValidateHeaderRemove(memory, rowNumber,
								headerBoolean, rowMap);
						// body
						if (nodeDescBodys != null && nodeDescBodys.size() > 0) {
							csvValidateBody(nodeDescBodys, rowMap,messageBO);

						}

						memory++;
						oldMap = rowMap;
						list.clear();
						i = 0;
						rowMap.clear();
					}

					line = bufReader.readLine();
				}
				// 判断
				if (list.size() > 0) {
					Map<Integer, String[]> rowMap = new HashMap<Integer, String[]>();
					for (String row : list) {
						String[] columns = row.split(",");
						column = csvValidateLine(column, row, columns);
						rowMap.put(j, columns);
						j++;
					}
					
					if (memory == 0 && nodeDescHeaders != null
							&& nodeDescHeaders.size() > 0) {
						headerBoolean = true;
						rowNumber = csvValidateHeader(nodeDescHeaders,
								rowNumber, rowMap,messageBO);
					}
					csvValidateHeaderRemove(memory, rowNumber, headerBoolean,
							rowMap);

					csvValidateEndBody(nodeDescBodys, j, oldMap, rowMap,messageBO);
					list.clear();
				}

				oldMap.clear();

			} catch (FileNotFoundException e) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "("
								+ messageBO.getMsgBody().toString()
								+ ")  FileNotFoundException path error.");
			} catch (IOException e) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "("
								+ messageBO.getMsgBody().toString()
								+ ")  IOException path error.");
			} finally {
				if (bufReader != null) {
					try {
						bufReader.close();
					} catch (IOException e) {
						throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
								ErrorDomain.ERROR_CODE_9002,
								"Reader IOException path error.");
					}
				}
			}

		}
	}

	private void csvValidateHeaderRemove(int memory, int rowNumber,
			boolean headerBoolean, Map<Integer, String[]> rowMap) {
		// 判断是否有列名
		if (memory == 0 && headerBoolean) {
			rowMap.remove(rowNumber);
		}
	}

	private void csvValidateEndBody(List<NodeDesc> nodeDescBodys, int j,
			Map<Integer, String[]> oldMap, Map<Integer, String[]> rowMap, MessageBO messageBo) {
		for (NodeDesc nodeDesc : nodeDescBodys) {
			if (nodeDesc.getNodePath() == null
					|| nodeDesc.getNodePath().equals("")) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "("
								+ nodeDesc.getNodeDescId()
								+ ")  Node body path is null.");
			}
			String[] paths = nodeDesc.getNodePath().toString()
					.split("]");
			if (paths.length != 2) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "("
								+ nodeDesc.getNodePath()
								+ ")  Node body path error.");
			}
			String rowStr = paths[0]
					.substring(1, paths[0].length());
			int rowLength = 0;
			if (!"".equals(rowStr)) {
				rowLength = Integer.valueOf(rowStr);
			}
			int columnLength = Integer.valueOf(paths[1].substring(
					1, paths[1].length()));

			// 行不为空
			if (rowLength > 0) {
				String[] columns = rowMap.get(rowLength);
				if (columns.length > 0) {
					valueValidate(nodeDesc,
							csvPattern(columns[columnLength]),messageBo);
				}
			}
			// 行为空
			else if (rowLength == 0) {
				List<String> valueList = new ArrayList<String>();
				for (int k : rowMap.keySet()) {
					String[] columns = rowMap.get(k);
					valueList.add(columns[columnLength]);
				}
				for (String value : valueList) {
					valueValidate(nodeDesc, csvPattern(value),messageBo);
				}
			}
			// 行小于0即取倒数10行以内的信息
			else if (rowLength < 0) {
				String[] columns = null;
				if (rowMap.get(j + 1 + rowLength) != null) {
					columns = rowMap.get(j + 1 + rowLength);
				} else if (oldMap.get(j + 1 + rowLength) != null) {
					columns = oldMap.get(j + 1 + rowLength);
				}
				if (columns != null) {
					valueValidate(nodeDesc,
							csvPattern(columns[columnLength]),messageBo);
				}

			}

		}
	}

	private int csvValidateLine(int column, String row, String[] columns) {
		// 判断列数是否一致
		if (column == 0) {
			column = columns.length;
		} else {
			if (column != columns.length) {
				throw new EAAPException(
						EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002,
						"("
								+ row
								+ ")  Error line dividing the number of columns.");
			}
		}
		return column;
	}

	private void csvNeatNodeDesc(List<NodeDesc> nodeDescs,
			List<NodeDesc> nodeDescHeaders, List<NodeDesc> nodeDescBodys) {
		// 规整header、body
		for (NodeDesc nodeDesc : nodeDescs) {
			if (nodeDesc.getNodeType().equals(EOPDomain.body)) {
				nodeDescBodys.add(nodeDesc);
			} else if (nodeDesc.getNodeType().equals(EOPDomain.header)) {
				nodeDescHeaders.add(nodeDesc);
			}

		}
	}

	private int csvValidateHeader(List<NodeDesc> nodeDescHeaders,
			int rowNumber, Map<Integer, String[]> rowMap, MessageBO messageBo) {
		for (NodeDesc nodeDesc : nodeDescHeaders) {
			if (nodeDesc.getNodePath() == null
					|| nodeDesc.getNodePath().equals("")) {
				throw new EAAPException(
						EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002,
						"("
								+ nodeDesc.getNodeDescId()
								+ ")  Node header path is null.");
			}

			String[] paths = nodeDesc.getNodePath()
					.toString().split("]");
			if (paths.length == 2) {
				// 列名称校验，默认是第一行
				String rowLength = paths[0].substring(1,
						paths[0].length());
				String columnLength = paths[1].substring(1,
						paths[1].length());
				String[] columns = null;
				if (!"".equals(rowLength)) {
					columns = rowMap.get(Integer
							.valueOf(rowLength));
					rowNumber = Integer.valueOf(rowLength);
				} else {
					columns = rowMap.get(0);
				}
				valueValidate(nodeDesc,
						csvPattern(columns[Integer
								.valueOf(columnLength)]),messageBo);

			} else {
				throw new EAAPException(
						EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002,
						"("
								+ nodeDesc.getNodePath()
								+ ")  Node header path error.");
			}
		}
		return rowNumber;
	}

	private void csvValidateBody(List<NodeDesc> nodeDescBodys,
			Map<Integer, String[]> rowMap, MessageBO messageBo) {
		for (NodeDesc nodeDesc : nodeDescBodys) {
			if (nodeDesc.getNodePath() == null
					|| nodeDesc.getNodePath().equals("")) {
				throw new EAAPException(
						EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002,
						"("
								+ nodeDesc.getNodeDescId()
								+ ")  Node body path is null.");
			}
			String[] paths = nodeDesc.getNodePath()
					.toString().split("]");
			if (paths.length != 2) {
				throw new EAAPException(
						EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002,
						"("
								+ nodeDesc.getNodePath()
								+ ")  Node body path error.");
			}
			String rowStr = paths[0].substring(1,
					paths[0].length());
			int rowLength = 0;
			if (!"".equals(rowStr)) {
				rowLength = Integer.valueOf(rowStr);
			}
			int columnLength = Integer.valueOf(paths[1]
					.substring(1, paths[1].length()));

			csvValidateBodyLine(rowMap, nodeDesc,
					rowLength, columnLength, messageBo);

		}
	}

	private void csvValidateBodyLine(Map<Integer, String[]> rowMap,
			NodeDesc nodeDesc, int rowLength, int columnLength, MessageBO messageBo) {
		// 行不为空
		if (rowLength > 0) {
			String[] columns = rowMap.get(rowLength);
			if (columns.length > 0) {
				valueValidate(nodeDesc,
						csvPattern(columns[columnLength]),messageBo);
			}
			
		}
		// 行为空
		else if (rowLength == 0) {
			List<String> valueList = new ArrayList<String>();
			for (int k : rowMap.keySet()) {
				String[] columns = rowMap.get(k);
				valueList.add(columns[columnLength]);
			}
			for (String value : valueList) {
				valueValidate(nodeDesc,
						csvPattern(value),messageBo);
			}
		}
	}

	public static void main(String[] args) {

	}

	@SuppressWarnings("unchecked")
	private void valueValidate(NodeDesc nodeDesc, String nodeValue, MessageBO messageBo)
			throws EAAPException {
		if (nodeValue == null || nodeValue.equals("")) {
			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
					ErrorDomain.ERROR_CODE_9002, "(" + nodeDesc.getNodePath()
							+ ") node value is empty");
		}

		if (nodeDesc.getNodeLengthCons() != null) {
			String head = nodeDesc.getNodeLengthCons().substring(0, 1);
			String length = nodeDesc.getNodeLengthCons().substring(1,
					nodeDesc.getNodeLengthCons().length());
			if (head.equals(EOPDomain.F)) {
				if (nodeValue.length() != Integer.valueOf(length)) {
					throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
							ErrorDomain.ERROR_CODE_9002, "("
									+ nodeDesc.getNodePath()
									+ ") node value length error");
				}
			} else {
				String[] lengthCons = nodeDesc.getNodeLengthCons().split("-");
				if (lengthCons.length == 1) {
					if (nodeValue.length() > Integer.valueOf(
							StringUtils.isEmpty(length) ? "0" : length)) {
						throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
								ErrorDomain.ERROR_CODE_9002, "("
										+ nodeDesc.getNodePath()
										+ ") Node value is too long");
					}
				}
				// 非固定长度大小限制
				else if (lengthCons.length == 2) {
					String mix = lengthCons[0].substring(1,
							lengthCons[0].length());
					String max = lengthCons[1].substring(1,
							lengthCons[1].length());
					if (nodeValue.length() < Integer.valueOf(mix)) {
						throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
								ErrorDomain.ERROR_CODE_9002, "("
										+ nodeDesc.getNodeDescId() + "-"
										+ nodeDesc.getNodeLengthCons()
										+ ") Node value is short");
					}
					if (nodeValue.length() > Integer.valueOf(max)) {
						throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
								ErrorDomain.ERROR_CODE_9002, "("
										+ nodeDesc.getNodeDescId() + "-"
										+ nodeDesc.getNodeLengthCons()
										+ ") Node value is too long");
					}
				}

			}
		}

		if (nodeDesc.getNevlConsType() != null
				&& nodeDesc.getNevlConsType().equals(EOPDomain.fixed)) {

			if (!nodeValue.equals(nodeDesc.getNevlConsValue())) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "("
								+ nodeDesc.getNodePath() + ") node value error");
			}
		}
		// 修改为正则表达式
		if (nodeDesc.getNevlConsType() != null
				&& nodeDesc.getNevlConsType().equals(EOPDomain.regular)) {
			if (!pattern(nodeDesc.getNevlConsValue())) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "("
								+ nodeDesc.getNevlConsValue()
								+ ")  node value pattern error");
			}
		}
		if (nodeDesc.getNevlConsType() != null
				&& nodeDesc.getNevlConsType().equals(EOPDomain.mainData)) {
			Object data = cacheService.getKey(CacheKey.MainData
					+ nodeDesc.getNevlConsValue(), messageBo.getTenant().getTenantId());
			log.debug((nodeDesc.getNevlConsValue()));
			if (data != null) {
				List<MainData> mainDatas = (List<MainData>) data;
				if (mainDatas.size() > 0) {
					boolean isRight = false;
					for (MainData mainData : mainDatas) {
						if (mainData.getCepValues().equals(nodeValue)) {
							isRight = true;
						}
					}
					if (!isRight) {
						throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
								ErrorDomain.ERROR_CODE_9002, "("
										+ nodeDesc.getNodePath()
										+ ")  node value error");
					}
				}
			}
		}
		// 添加大小值判断
		if (nodeDesc.getNevlConsType() != null
				&& nodeDesc.getNevlConsType().equals(EOPDomain.minMax)) {
			if (!determineValueSize(nodeValue, nodeDesc.getNevlConsValue())) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "("
								+ nodeDesc.getNevlConsValue()
								+ ")  node value pattern error");
			}
		}
		// Date类型
		if (nodeDesc.getNodeTypeCons() != null
				&& nodeDesc.getNodeTypeCons().equals(EOPDomain.date)) {
			Date date = DateUtils.getDate(nodeDesc.getNevlConsValue()==null?"yyyy-MM-DD":nodeDesc.getNevlConsValue(), nodeValue);
			if (date == null) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "(" + nodeValue
								+ ")  node value date type error");
			}
		}

		// DateTime
		if (nodeDesc.getNodeTypeCons() != null
				&& nodeDesc.getNodeTypeCons().equals(EOPDomain.dateTime)) {
			Date datetime = DateUtils.getDate(nodeDesc.getNevlConsValue()==null?"yyyy-MM-DD'T'hh:mm:ss":nodeDesc.getNevlConsValue(),
					nodeValue);
			if (datetime == null) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "(" + nodeValue
								+ ")  node value dateTime type error");
			}
		}

		// Time
		if (nodeDesc.getNodeTypeCons() != null
				&& nodeDesc.getNodeTypeCons().equals(EOPDomain.time)) {
			Date time = DateUtils.getDate(nodeDesc.getNevlConsValue()==null?"hh:mm:ss":nodeDesc.getNevlConsValue(), nodeValue);
			if (time == null) {
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "(" + nodeValue
								+ ")  node value time type error");
			}
		}
		
		
		
		if (nodeDesc.getNodeTypeCons() != null
				&& nodeDesc.getNodeTypeCons().equals(EOPDomain.XMLSTR)) {
			
			try{
				Document doc = DocumentHelper.parseText(nodeValue);
			}catch(Exception e){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "(" + nodeDesc.getNodePath()
								+ ")  node value xml type error");
			}
			
		}
		
		if (nodeDesc.getNodeTypeCons() != null
				&& nodeDesc.getNodeTypeCons().equals(EOPDomain.JSONSTR)) {
			
			try{
				JSONObject json = JSONObject.fromObject(nodeValue);
			}catch(Exception e){
				throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,
						ErrorDomain.ERROR_CODE_9002, "(" + nodeDesc.getNodePath()
								+ ")  node value json type error");
			}
			
		}
	}


	private boolean pattern(String regex) {
		Pattern pattern = Pattern.compile(regex);
		String[] values = pattern.split(regex);
		if (values.length > 0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean determineValueSize(String value, String nevlConsValue) {
		String[] values = nevlConsValue.split("-");
		if (values.length == 2) {
			if (Integer.valueOf(value) >= Integer.valueOf(values[0])
					&& Integer.valueOf(value) <= Integer.valueOf(values[1])) {
				return true;
			}

		} else {
			return false;
		}
		return false;
	}

	private String csvPattern(String value) {
		return Pattern.compile("\"+").matcher(value).replaceAll("");
	}

	@SuppressWarnings("rawtypes")
	public MessageBO validate(MessageBO messageBo,
			ContractVersion contractVersion, String reqorres)
			throws EAAPException {
		// TODO Auto-generated method stub
		String isNeedCheck = contractVersion.getIsNeedCheck();
		if (isNeedCheck != null && isNeedCheck.equals(EOPDomain.YES)) {
			ContractFormat contractFormat = null;
			if (reqorres.equals(EOPDomain.REQ_FLAG)) {
				contractFormat = contractVersion.getReqContractFormat();
			} else {
				contractFormat = contractVersion.getRspContractFormat();
			}

			// modify by zhuangyq
			if (contractFormat.getConType().equals(EOPDomain.XML)) {
				xmlValidate(messageBo, messageBo.toString(),
						contractFormat.getNodeDescs());
			}else if (contractFormat.getConType().equals(EOPDomain.URLGET)) {
				mapValidate(messageBo.getMessageMap(),
						contractFormat.getNodeDescs(),messageBo);
			} else if (contractFormat.getConType().equals(EOPDomain.JSON)) {
				jsonValidate(messageBo, contractFormat.getNodeDescs());
			} else if (contractFormat.getConType().equals(EOPDomain.CSV)) {
				csvValidate(messageBo, contractFormat.getNodeDescs(),
						contractFormat);
			}
		}
		return messageBo;
	}

}
