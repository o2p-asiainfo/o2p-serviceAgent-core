/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:a.java 
 * Package Name:com.ailk.eaap.o2p.agent.endpoint 
 * Date:2015年2月5日下午5:18:45 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.o2p.agent.endpoint;  

import java.io.IOException;
import java.io.InputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import org.junit.Test;

/** 
 * ClassName:a  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月5日 下午5:18:45  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
public class XmlEventTest {
	
	@Test
	public  void test04() {
		  XMLInputFactory factory = XMLInputFactory.newInstance();
		  InputStream is = null;
		  try {
		   is = XmlEventTest.class.getClassLoader().getResourceAsStream("xml.txt");
		   //基于迭代模型的操作方式
		   XMLEventReader reader = factory.createXMLEventReader(is);
		   int num = 0;
		   while(reader.hasNext()) {
		    //通过XMLEvent来获取是否是某种节点类型
		    XMLEvent event = reader.nextEvent();
		    if(event.isStartElement()) {
		     //通过event.asxxx转换节点
		     String name = event.asStartElement().getName().toString();
		     if(name.equals("title")) {
		      System.out.print(reader.getElementText()+":");
		     }
		     if(name.equals("price")) {
		      System.out.print(reader.getElementText()+"\n");
		     }
		    }
		    num++;
		   }
		   System.out.println(num);
		  } catch (XMLStreamException e) {
		   e.printStackTrace();
		  } finally {
		   try {
		    if(is!=null) is.close();
		   } catch (IOException e) {
		    e.printStackTrace();
		   }
		  }
		 } 
	
	/**
	   * XML事件读取
	   */
	  @Test
	  public void testXMLEventReader(){
	    try {
	      XMLInputFactory factory = XMLInputFactory.newInstance();
	      InputStream in = XmlEventTest.class.getClassLoader().getResourceAsStream("xml.xml");
	      XMLEventReader reader = factory.createXMLEventReader(in);
	      while(reader.hasNext()){
	        XMLEvent event = reader.nextEvent();
	        if(event.isStartElement()){
	          String name = event.asStartElement().getName().toString();
	          if("Title".equals(name)){
	            System.out.println(reader.getElementText());
	          }
	        }
	      }
	    }catch (Exception e) {
	      e.printStackTrace();
	    }
	  }

}
