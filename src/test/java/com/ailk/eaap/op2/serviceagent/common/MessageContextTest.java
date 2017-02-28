package com.ailk.eaap.op2.serviceagent.common;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.tree.DefaultDocument;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MessageContextTest</code> contains tests for the class <code>{@link MessageContext}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:33
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MessageContextTest {
	/**
	 * Run the Document getAllDomDocument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetAllDomDocument_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		Document result = fixture.getAllDomDocument();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getEntityResolver());
		assertEquals(null, result.getXMLEncoding());
		assertEquals(null, result.getRootElement());
		assertEquals(null, result.getDocType());
		assertEquals(0, result.nodeCount());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(false, result.isReadOnly());
		assertEquals("/", result.getPath());
		assertEquals((short) 9, result.getNodeType());
		assertEquals("", result.getText());
		assertEquals(false, result.hasContent());
		assertEquals("", result.getStringValue());
		assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n", result.asXML());
		assertEquals(false, result.supportsParent());
		assertEquals("/", result.getUniquePath());
		assertEquals("Document", result.getNodeTypeName());
	}

	/**
	 * Run the String getCii() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetCii_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		String result = fixture.getCii();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getReqOrResFlag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetReqOrResFlag_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		String result = fixture.getReqOrResFlag();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getSvcMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetSvcMsg_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		String result = fixture.getSvcMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getSvcNode(MessageContext.java:53)
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getSvcMsg(MessageContext.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the String getSvcMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetSvcMsg_2()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		String result = fixture.getSvcMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getSvcNode(MessageContext.java:53)
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getSvcMsg(MessageContext.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the Node getSvcNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetSvcNode_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		Node result = fixture.getSvcNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getSvcNode(MessageContext.java:53)
		assertNotNull(result);
	}

	/**
	 * Run the String getTcpMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetTcpMsg_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		String result = fixture.getTcpMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getTcpNode(MessageContext.java:71)
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getTcpMsg(MessageContext.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the Node getTcpNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetTcpNode_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		Node result = fixture.getTcpNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.MessageContext.getTcpNode(MessageContext.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the String getTotalMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetTotalMsg_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		String result = fixture.getTotalMsg();

		// add additional test code here
		assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n", result);
	}

	/**
	 * Run the String getXmlStr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testGetXmlStr_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");

		String result = fixture.getXmlStr();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the MessageContext newInstance(String,Document,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testNewInstance_1()
		throws Exception {
		String cii = "";
		Document doc = new DefaultDocument();
		String reqOrRspFlag = "";
		String xmlStr = "";

		MessageContext result = MessageContext.newInstance(cii, doc, reqOrRspFlag, xmlStr);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getCii());
		assertEquals("", result.getReqOrResFlag());
		assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n", result.getTotalMsg());
		assertEquals("", result.getXmlStr());
	}

	/**
	 * Run the void setXmlStr(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Test
	public void testSetXmlStr_1()
		throws Exception {
		MessageContext fixture = MessageContext.newInstance("", new DefaultDocument(), "", "");
		fixture.setXmlStr("");
		String xmlStr = "";

		fixture.setXmlStr(xmlStr);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:33
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageContextTest.class);
	}
}