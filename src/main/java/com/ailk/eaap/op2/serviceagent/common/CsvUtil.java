package com.ailk.eaap.op2.serviceagent.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.util.StringUtils;

import com.asiainfo.foundation.exception.BusinessException;
import com.ailk.eaap.op2.bo.CsvTemplate;

public final class CsvUtil {

	private CsvUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 导出csv文件
	 * @param result
	 * @param csvTemplate
	 * @param tempDownloadPath
	 * @param fileCreateDate
	 * @param disFile 
	 * @return 是否文件被其他任务加锁
	 */
	public static boolean exportCsv(List<Map<String, Object>> result,
			CsvTemplate csvTemplate, String tempDownloadPath, Date fileCreateDate, List<File> disFile) {
		FileOutputStream fos = null;
		FileChannel channel = null;
		FileLock fl = null;
		boolean isLock = false;
		try {
			String fileName = csvTemplate.getCsvFileName();
			String dateFormat = csvTemplate.getDateFormat();
			String fileNameAndDateSeparator = csvTemplate.getFileNameAndDateSeparator();
			String isFileNameAddDate = csvTemplate.getIsFileNameAddDate();
			String csvFileName = tempDownloadPath + File.separator + fileName;
			if("Y".equalsIgnoreCase(isFileNameAddDate)) {
				if(fileNameAndDateSeparator == null) fileNameAndDateSeparator = "";
				csvFileName = csvFileName + fileNameAndDateSeparator + dateFormat(fileCreateDate, dateFormat) + ".csv";
			} else{
				csvFileName = csvFileName  + ".csv";
			}
			File csvFile = new File(csvFileName);
			if(!csvFile.getParentFile().exists()) {
				FileUtils.forceMkdir(csvFile.getParentFile());
			}
			if(!csvFile.exists()) {
				csvFile.createNewFile();
				disFile.add(csvFile);
			}
			
			fos = new FileOutputStream(csvFile,true);
			channel = fos.getChannel();
			fl = channel.tryLock();
			writeToCsvFile(result, csvTemplate, channel, fl);
		} catch(BusinessException e) {
			throw e;
		} catch(OverlappingFileLockException e){
			//如果发现有加锁情况，直接返回
			isLock = true;
		} catch(Exception e) {
			throw new BusinessException(9083, "o2p-serviceagent-core.9083", null, e);
		} finally {
			try {
				if(fl != null){
					fl.release();
				}
				if(channel != null){
					channel.close();
				}
				if(fos != null) {
					fos.flush();
					fos.close();
				}
			} catch(IOException e) {
				throw new BusinessException(9999, "o2p-serviceagent-core.9999", null, e);
			}
		}
		return isLock;
	}

	public static void writeToCsvFile(List<Map<String, Object>> result,
			CsvTemplate csvTemplate, FileChannel channel, FileLock fl) throws IOException {
			String fieldSeparator = csvTemplate.getFieldSeparator();
			int firstLineType = csvTemplate.getFirstLineType();
			String newLineCharacter = csvTemplate.getNewLineCharacter();
			String isTextfieldAddQuoteMark = csvTemplate.getIsTextfieldAddQuoteMark();
			String charset = csvTemplate.getFileCharset();
			newLineCharacter = parseNewLineCharacter(newLineCharacter);
			StringBuffer stringBuffer = new StringBuffer("");
			Map<String, Object> lineMap = null;
			Object fieldObj = null;
			if(firstLineType == EOPDomain.CSV_FIRST_LINE_ALL_COUNT) {
				//第一行预留空格，以免当3行到100行，位置多了两位之后，会挤到第二行去
				if(csvTemplate.getAllCount() == 0) {
					stringBuffer.append(EOPDomain.RESERVED_SPACE+newLineCharacter);
				}
				csvTemplate.setAllCount(csvTemplate.getAllCount()+result.size());
				stringBuffer.insert(0,csvTemplate.getAllCount());
				channel.write(ByteBuffer.wrap(stringBuffer.toString().getBytes(charset)), 0);
			} else if(firstLineType == EOPDomain.CSV_FIRST_LINE_FIELD_NAME){
				if(channel.size() == 0) {
					if(result != null && !result.isEmpty()) {
						lineMap = result.get(0);
						Iterator<String> iterator = lineMap.keySet().iterator();
						while(iterator.hasNext()) {
							fieldObj = iterator.next();
							if(EOPDomain.ROWNUM_FIELD_NAME.equalsIgnoreCase((String)fieldObj)) {
								continue;
							}
							if(fieldObj instanceof String) {
								stringBuffer.append(fieldObj.toString() + fieldSeparator);
							}
							else if(fieldObj == null) {
								stringBuffer.append(fieldSeparator);
							}
							else {
								stringBuffer.append(fieldObj.toString() + fieldSeparator);
							}
						}
						stringBuffer.delete(stringBuffer.length()-fieldSeparator.length(), stringBuffer.length());
						stringBuffer.append(newLineCharacter);
						channel.write(ByteBuffer.wrap(stringBuffer.toString().getBytes(charset)));
					}
				}
			} else {
				throw new BusinessException(9083, "o2p-serviceagent-core.9083", null, null);
			}
			Collection<Object> collection = null;
			stringBuffer.setLength(0);
			for(int i=0; i<result.size(); i++) {
				lineMap = result.get(i);
				//Oracle分页会出现rownum字段，需要去除
				if(lineMap.containsKey(EOPDomain.ROWNUM_FIELD_NAME)) {
					lineMap.remove(EOPDomain.ROWNUM_FIELD_NAME);
				}
				collection = lineMap.values();
				Iterator<Object> iterator = collection.iterator();
				while(iterator.hasNext()) {
					fieldObj = iterator.next();
					if(fieldObj == null || !StringUtils.hasText(fieldObj.toString())) {
						stringBuffer.append(fieldSeparator);
					}
					else if("Y".equalsIgnoreCase(isTextfieldAddQuoteMark)) {
						stringBuffer.append("\""+fieldObj.toString()+"\"" + fieldSeparator);
					}
					else {
						stringBuffer.append(fieldObj.toString() + fieldSeparator);
					}
				}
				stringBuffer.delete(stringBuffer.length()-fieldSeparator.length(), stringBuffer.length());
				stringBuffer.append(newLineCharacter);
				
				//每2000行写一次，提高效率
				if((i+1) % 2000 == 0) {
					channel.write(ByteBuffer.wrap(stringBuffer.toString().getBytes(charset)));
					stringBuffer.setLength(0);
				}
			}
			if(stringBuffer.length() != 0) {
				channel.write(ByteBuffer.wrap(stringBuffer.toString().getBytes(charset)));
				stringBuffer.setLength(0);
			}
	}

	private static String parseNewLineCharacter(String newLineCharacter) {
		if(newLineCharacter == null || newLineCharacter.equals("")){
			return EOPDomain.DEFAULT_NEW_LINE;
		}
		return newLineCharacter.replaceAll("\\\\r", "\r").replaceAll("\\\\n", "\n");
	}

	public static String dateFormat(Date date, String dateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(date);
	}
}
