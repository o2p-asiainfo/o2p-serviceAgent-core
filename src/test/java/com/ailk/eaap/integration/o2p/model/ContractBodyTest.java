package com.ailk.eaap.integration.o2p.model;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.bo.ContractFormat;
import com.ailk.eaap.op2.bo.MessageNode;

/**
 * The class <code>ContractBodyTest</code> contains tests for the class <code>{@link ContractBody}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:27
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ContractBodyTest {
	/**
	 * Run the ContractBody() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testContractBody_1()
		throws Exception {
		ContractBody result = new ContractBody();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ContractFormat getContarctFormat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetContarctFormat_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());

		ContractFormat result = fixture.getContarctFormat();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDescriptor());
		assertEquals(null, result.getState());
		assertEquals(null, result.getTcpCtrFId());
		assertEquals(null, result.getConType());
		assertEquals(null, result.getContractVersionId());
		assertEquals(null, result.getReqRsp());
		assertEquals(null, result.getNodeDescs());
		assertEquals(null, result.getXsdHeaderFor());
		assertEquals(null, result.getXsdFormat());
		assertEquals(null, result.getXsdDemo());
		assertEquals(null, result.getCreateTime());
		assertEquals(null, result.getLastestTime());
		assertEquals(null, result.getContract2AttrSpecs());
		assertEquals(null, result.getXsdException());
	}

	/**
	 * Run the Object getExprVal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetExprVal_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());

		Object result = fixture.getExprVal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getNodeValByExpress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetNodeValByExpress_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());

		Object result = fixture.getNodeValByExpress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getNodeValByNodeDescId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetNodeValByNodeDescId_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		int nodeDescId = 1;

		Object result = fixture.getNodeValByNodeDescId(nodeDescId);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getNodeValByNodeDescId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetNodeValByNodeDescId_2()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		int nodeDescId = 1;

		Object result = fixture.getNodeValByNodeDescId(nodeDescId);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getNodeValByNodeDescId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetNodeValByNodeDescId_3()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		int nodeDescId = 1;

		Object result = fixture.getNodeValByNodeDescId(nodeDescId);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getNodeValByNodeDescId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetNodeValByNodeDescId_4()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(null);
		fixture.setExprVal(new Object());
		int nodeDescId = 1;

		Object result = fixture.getNodeValByNodeDescId(nodeDescId);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getNodeValByNodeDescId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetNodeValByNodeDescId_5()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		int nodeDescId = 0;

		Object result = fixture.getNodeValByNodeDescId(nodeDescId);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<Integer, Object> getSrcMapVals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetSrcMapVals_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());

		Map<Integer, Object> result = fixture.getSrcMapVals();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<MessageNode> getSrcMessageNodes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testGetSrcMessageNodes_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());

		List<MessageNode> result = fixture.getSrcMessageNodes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setContarctFormat(ContractFormat) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testSetContarctFormat_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		ContractFormat contarctFormat = new ContractFormat();

		fixture.setContarctFormat(contarctFormat);

		// add additional test code here
	}

	/**
	 * Run the void setExprVal(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testSetExprVal_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		Object exprVal = new Object();

		fixture.setExprVal(exprVal);

		// add additional test code here
	}

	/**
	 * Run the void setNodeValByExpress(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testSetNodeValByExpress_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		Object nodeValByExpress = new Object();

		fixture.setNodeValByExpress(nodeValByExpress);

		// add additional test code here
	}

	/**
	 * Run the void setSrcMapVals(Map<Integer,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testSetSrcMapVals_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		Map<Integer, Object> srcMapVals = new IdentityHashMap();

		fixture.setSrcMapVals(srcMapVals);

		// add additional test code here
	}

	/**
	 * Run the void setSrcMessageNodes(List<MessageNode>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	@Test
	public void testSetSrcMessageNodes_1()
		throws Exception {
		ContractBody fixture = new ContractBody();
		fixture.setContarctFormat(new ContractFormat());
		fixture.setNodeValByExpress(new Object());
		fixture.setSrcMessageNodes(new Vector());
		fixture.setSrcMapVals(new IdentityHashMap());
		fixture.setExprVal(new Object());
		List<MessageNode> srcMessageNodes = new Vector();

		fixture.setSrcMessageNodes(srcMessageNodes);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:27
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
	 * @generatedBy CodePro at 15-12-21 下午4:27
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
	 * @generatedBy CodePro at 15-12-21 下午4:27
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ContractBodyTest.class);
	}
}