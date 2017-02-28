package com.ailk.eaap.op2.serviceagent.common;

import java.io.File;
import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class FileMessageBO extends MessageBO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File[] file;
    private Map<String, File> files;
    private String tempFileDirName;
    //true :订阅分发类型 false:点对点搬迁类型
    private boolean sub = false;

	public File[] getFile() {
		
		if(!ArrayUtils.isEmpty(file)){
			return (File[]) ArrayUtils.clone(file);
		}
		return null;
	}

	public void setFile(File[] file) {
		if(!ArrayUtils.isEmpty(file)){
			this.file = (File[]) ArrayUtils.clone(file);
		}
	}

    public Map<String, File> getFiles() {
        return files;
    }

    public void setFiles(Map<String, File> files) {
        this.files = files;
    }

	public String getTempFileDirName() {
		return tempFileDirName;
	}

	public void setTempFileDirName(String tempFileDirName) {
		this.tempFileDirName = tempFileDirName;
	}

	public boolean isSub() {
		return sub;
	}

	public void setSub(boolean sub) {
		this.sub = sub;
	}
    
}
