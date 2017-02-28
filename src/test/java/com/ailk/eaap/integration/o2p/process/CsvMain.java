/** 
 * Project Name:o2p-serviceAgent-transformer 
 * File Name:CsvMain.java 
 * Package Name:com.ailk.eaap.integration.o2p.process 
 * Date:2015年8月20日下午5:14:29 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.integration.o2p.process;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * <p>
 * ClassName:CsvMain <br>
 * <p>
 * Function: TODO ADD FUNCTION. <br>
 * <p>
 * Reason: TODO ADD REASON. <br>
 * <p>
 * Date: 2015年8月20日 下午5:14:29 <br>
 * 
 * @author zhongming
 * @since JDK 1.6
 */
public class CsvMain
{

    public static void main(String[] args) throws IOException
    {
        File file = new File("d:/1.txt");
        List<String> srcList = FileUtils.readLines(file, "GBK");
        for (int i = 0; i < srcList.size(); i++)
        {
            String str = srcList.get(i);
            System.out.println(str);
        }

    }

}
