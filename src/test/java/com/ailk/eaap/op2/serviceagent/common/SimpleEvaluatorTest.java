package com.ailk.eaap.op2.serviceagent.common;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.bo.GetValueExpr;

/**
 * The class <code>SimpleEvaluatorTest</code> contains tests for the class <code>{@link SimpleEvaluator}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:45
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class SimpleEvaluatorTest {
	/**
	 * Run the SimpleEvaluator() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testSimpleEvaluator_1()
		throws Exception {
		SimpleEvaluator result = new SimpleEvaluator();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object evaluate(GetValueExpr,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testEvaluate_1()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		GetValueExpr expr = new GetValueExpr();
		expr.setExpr("");
		MessageBO messageBo = new MessageBO();

		Object result = fixture.evaluate(expr, messageBo);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object evaluate(GetValueExpr,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testEvaluate_2()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		GetValueExpr expr = new GetValueExpr();
		expr.setExpr("");
		MessageBO messageBo = new MessageBO();

		Object result = fixture.evaluate(expr, messageBo);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object evaluate(GetValueExpr,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testEvaluate_3()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		GetValueExpr expr = new GetValueExpr();
		expr.setExpr("");
		MessageBO messageBo = new MessageBO();

		Object result = fixture.evaluate(expr, messageBo);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object evaluate(GetValueExpr,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testEvaluate_4()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		GetValueExpr expr = new GetValueExpr();
		expr.setExpr("");
		MessageBO messageBo = new MessageBO();

		Object result = fixture.evaluate(expr, messageBo);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object evaluate(GetValueExpr,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testEvaluate_5()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		GetValueExpr expr = new GetValueExpr();
		expr.setExpr("");
		MessageBO messageBo = new MessageBO();

		Object result = fixture.evaluate(expr, messageBo);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object evaluate(GetValueExpr,MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testEvaluate_6()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		GetValueExpr expr = new GetValueExpr();
		expr.setExpr("");
		MessageBO messageBo = new MessageBO();

		Object result = fixture.evaluate(expr, messageBo);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String queryXmlValueByCode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testQueryXmlValueByCode_1()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		String xmlBody = "";
		String code = "";

		String result = fixture.queryXmlValueByCode(xmlBody, code);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String queryXmlValueByCode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	@Test
	public void testQueryXmlValueByCode_2()
		throws Exception {
		SimpleEvaluator fixture = new SimpleEvaluator();
		String xmlBody = "";
		String code = "";

		String result = fixture.queryXmlValueByCode(xmlBody, code);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:45
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
	 * @generatedBy CodePro at 15-12-21 下午4:45
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
	 * @generatedBy CodePro at 15-12-21 下午4:45
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleEvaluatorTest.class);
	}
}