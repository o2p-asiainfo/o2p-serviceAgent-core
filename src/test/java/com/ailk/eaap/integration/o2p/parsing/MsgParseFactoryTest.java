package com.ailk.eaap.integration.o2p.parsing;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.o2p.common.parse.IMsgParse;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;

/**
 * The class <code>MsgParseFactoryTest</code> contains tests for the class <code>{@link MsgParseFactory}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:24
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class MsgParseFactoryTest {
	/**
	 * Run the MsgParseFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		MsgParseFactory result = MsgParseFactory.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMsgParse getMsgParse(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetMsgParse_1()
		throws Exception {
		MsgParseFactory fixture = MsgParseFactory.getInstance();
		MessageBO messageBO = new MessageBO();

		IMsgParse result = fixture.getMsgParse(messageBO);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMsgParse getMsgParse(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetMsgParse_2()
		throws Exception {
		MsgParseFactory fixture = MsgParseFactory.getInstance();
		MessageBO messageBO = new MessageBO();

		IMsgParse result = fixture.getMsgParse(messageBO);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMsgParse getMsgParse(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetMsgParse_3()
		throws Exception {
		MsgParseFactory fixture = MsgParseFactory.getInstance();
		MessageBO messageBO = new MessageBO();

		IMsgParse result = fixture.getMsgParse(messageBO);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMsgParse getMsgParse(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetMsgParse_4()
		throws Exception {
		MsgParseFactory fixture = MsgParseFactory.getInstance();
		MessageBO messageBO = new MessageBO();

		IMsgParse result = fixture.getMsgParse(messageBO);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMsgParse getMsgParse(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetMsgParse_5()
		throws Exception {
		MsgParseFactory fixture = MsgParseFactory.getInstance();
		MessageBO messageBO = new MessageBO();

		IMsgParse result = fixture.getMsgParse(messageBO);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMsgParse getMsgParse(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetMsgParse_6()
		throws Exception {
		MsgParseFactory fixture = MsgParseFactory.getInstance();
		MessageBO messageBO = new MessageBO();

		IMsgParse result = fixture.getMsgParse(messageBO);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMsgParse getMsgParse(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	@Test
	public void testGetMsgParse_7()
		throws Exception {
		MsgParseFactory fixture = MsgParseFactory.getInstance();
		MessageBO messageBO = new MessageBO();

		IMsgParse result = fixture.getMsgParse(messageBO);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:24
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
	 * @generatedBy CodePro at 15-11-12 下午7:24
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
	 * @generatedBy CodePro at 15-11-12 下午7:24
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MsgParseFactoryTest.class);
	}
}