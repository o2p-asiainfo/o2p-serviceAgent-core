///** 
// * Project Name:o2p-serviceAgent-core 
// * File Name:XmlReaderTest.java 
// * Package Name:com.ailk.eaap.o2p.agent.endpoint 
// * Date:2015年2月3日下午8:25:15 
// * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
// * 
//*/  
//  
//package com.ailk.eaap.o2p.agent.endpoint;  
//
//import javax.xml.parsers.FactoryConfigurationError;
//
//import com.ailk.eaap.op2.serviceagent.route.service.XmlFileReaderEndpoint;
//
///** 
// * ClassName:XmlReaderTest  
// * Function: TODO ADD FUNCTION.  
// * Reason:   TODO ADD REASON.  
// * Date:     2015年2月3日 下午8:25:15  
// * @author   wuwz 
// * @version   
// * @since    JDK 1.6 
// *    
// */
//public class XmlReaderTest {
//
//	public static void main(String[] args) throws FactoryConfigurationError, Exception {
//
//		XmlFileReaderEndpoint reader = new XmlFileReaderEndpoint();
//		reader.setFragmentRootElementName("trade");
//		reader.doOpen();
//		String r1 = reader.doRead();
//		String r2 = reader.doRead();
//		String r3 = reader.doRead();
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
//	}
//	
////		@Test
////	 public void testXMLEventReader(){
////	    try {
//////	    	File file = new File("d:/xml.txt");
//////			InputStream inputStream = new FileInputStream(file);
//////			XMLEventReader reader = XMLInputFactory.newInstance().createXMLEventReader(inputStream);
////		
////	    	XMLInputFactory factory = XMLInputFactory.newInstance();
////	        InputStream in = XmlReaderTest.class.getClassLoader().getResourceAsStream("xml.txt");
////	        XMLEventReader reader = factory.createXMLEventReader(in);
////
////	      while(reader.hasNext()){
////	        XMLEvent event = reader.nextEvent();
////	       if(event instanceof WstxEventReader) {
////	    	   System.out.println(((WstxEventReader)event).getElementText());
////	       }
////	        if(event.isStartElement()){
////	          String name = event.asStartElement().getName().toString();
////	          System.out.println(name);
////	          if("Title".equals(name)){
////	            System.out.println(reader.getElementText());
////	          }
////	        }
////	      }
////	    }catch (Exception e) {
////	      e.printStackTrace();
////	    }
////	  }
//
//
//}
