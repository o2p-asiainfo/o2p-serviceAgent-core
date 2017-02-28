//package rest;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import net.sf.json.JSONObject;
//
//import org.dom4j.Document;
//import org.dom4j.DocumentHelper;
//import org.junit.Test;
//
//import com.ailk.eaap.op2.common.EAAPException;
//import com.ailk.eaap.op2.common.EAAPTags;
//import com.ailk.eaap.op2.serviceagent.common.ErrorDomain;
//import com.ailk.eaap.op2.serviceagent.common.MessageBO;
//import com.ailk.eaap.op2.serviceagent.common.RestClient;
//
//public class TestRest {
//	
//	static Map<String, String> httpHead = new HashMap<String, String>();
//
//	static{
//		httpHead.put("appkey", "123");
//	}
//	
//	public static void main(String[] args)  {
//		MessageBO messageBo = new MessageBO();
////		String address = "http://192.168.1.52:8090/TestRest/rest";
//		String address = "http://127.0.0.1:8080/servlet/ser";
//		Map<String, Object> msgHead = new HashMap<String, Object>();
//		msgHead.put("id", "1");
//		messageBo.setMsgHead(msgHead);
//		String result = RestClient.restCall(httpHead, "/student/{id}","get",address, messageBo, 5);
//		System.out.println(result);
//	}
//	@Test
//	public void doget()  {
//		MessageBO messageBo = new MessageBO();
////		String address = "http://192.168.1.52:8090/TestRest/rest";
//		String address = "http://www.baidu.com";
//		Map<String, Object> msgHead = new HashMap<String, Object>();
//		msgHead.put("id", "1");
//		messageBo.setMsgHead(msgHead);
//		String result = RestClient.restCall(httpHead, "/student/{id}","get",address, messageBo, 5);
//		System.out.println(result);
//	}
//	
//	@Test
//	public void doDelete()  {
//		MessageBO messageBo = new MessageBO();
//		String address = "http://localhost:9999/servletTest/myServlet";
//		Map<String, Object> msgHead = new HashMap<String, Object>();
//		msgHead.put("id", "1");
//		messageBo.setMsgHead(msgHead);
//		String result = RestClient.restCall(httpHead,"/student/{id}","delete",address, messageBo,0);
//		System.out.println(result);
//	}
//	
//	@Test
//	public void doPost()  {
//		MessageBO messageBo = new MessageBO();
//		String address = "http://localhost:9999/servletTest/myServlet";
//		Map<String, Object> msgHead = new HashMap<String, Object>();
//		msgHead.put("id", "1");
//		messageBo.setMsgHead(msgHead);
//		messageBo.setMsgBody("name=%E6%9D%A8%E7%88%B1%E5%8F%8B&clsId=201002&sex=2&age=12");
//		String result = RestClient.restCall(httpHead,"/student","post",address, messageBo,0);
//		System.out.println(result);
//	}
//	
//	@Test
//	public void doPostDoc()  {
//		MessageBO<Document> messageBo = new MessageBO<Document>();
//		String address = "http://192.168.1.52:8090/TestRest/rest";
//		Map<String, Object> msgHead = new HashMap<String, Object>();
//		msgHead.put("id", "1");
//		messageBo.setMsgHead(msgHead);
//		Document doc = getDocument("<username>zhangsan</username>");
//		messageBo.setMsgBody(doc);
//		String result = RestClient.restCall(httpHead,"/student","post",address, messageBo,0);
//		System.out.println(result);
//	}
//	
//	@Test
//	public void doPostJson()  {
//		MessageBO<JSONObject> messageBo = new MessageBO<JSONObject>();
////		String address = "http://192.168.1.52:8090/TestRest/rest";
//		String address = "http://localhost:9999/servletTest/myServlet";
//		Map<String, Object> msgHead = new HashMap<String, Object>();
//		msgHead.put("id", "1");
//		messageBo.setMsgHead(msgHead);
//		messageBo.setMsgBody(JSONObject.fromObject("{\"class123\":1, \"students\":[{\"name\":\"jack\", \"age\":21},{\"name\":\"kaka\", \"age\":21},{\"name\":\"lucy\", \"age\":21}]}"));
//		String result = RestClient.restCall(httpHead,"/student","post",address, messageBo,0);
//		System.out.println(result);
//	}
//	
//	@Test
//	public void doPutJson()  {
//		MessageBO<JSONObject> messageBo = new MessageBO<JSONObject>();
////		String address = "http://192.168.1.52:8090/TestRest/rest";
//		String address = "http://localhost:9999/servletTest/myServlet";
//		Map<String, Object> msgHead = new HashMap<String, Object>();
//		msgHead.put("id", "1");
//		messageBo.setMsgHead(msgHead);
//		messageBo.setMsgBody(JSONObject.fromObject("{\"class123\":1, \"students\":[{\"name\":\"jack\", \"age\":21},{\"name\":\"kaka\", \"age\":21},{\"name\":\"lucy\", \"age\":21}]}"));
//		String result = RestClient.restCall(httpHead,"/student","put",address, messageBo,0);
//		System.out.println(result);
//	}
//	
//	public Document getDocument(String reqXml)  {
//		Document xmldoc = null;
//		try{
//			
//			xmldoc = DocumentHelper.parseText(reqXml);
//		}catch(Exception e){
//			
//			throw new EAAPException(EAAPTags.SEG_DRAVER_SIGN,ErrorDomain.ERROR_CODE_9006,ErrorDomain.error_xml_msg);
//		}
//		
//		return xmldoc;
//	}
//}
