package com.ailk.eaap.op2.serviceagent.route.service.batch;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.FlatFileReaderEndpoint;

/**
 * The class <code>AbstractBatchEndpointTest</code> contains tests for the class <code>{@link AbstractBatchEndpoint}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:08
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class AbstractBatchEndpointTest {
	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testClear_1()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void close(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testClose_1()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		MessageBO messageBo = new MessageBO();

		fixture.close(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void close(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testClose_2()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		MessageBO messageBo = new MessageBO();

		fixture.close(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void open(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testOpen_1()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		MessageBO messageBo = new MessageBO();

		fixture.open(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void open(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testOpen_2()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		MessageBO messageBo = new MessageBO();

		fixture.open(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void open(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testOpen_3()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		MessageBO messageBo = new MessageBO();

		fixture.open(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void open(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testOpen_4()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		MessageBO messageBo = new MessageBO();

		fixture.open(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void open(MessageBO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testOpen_5()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		MessageBO messageBo = new MessageBO();

		fixture.open(messageBo);

		// add additional test code here
	}

	/**
	 * Run the void subtraThreadNum(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testSubtraThreadNum_1()
		throws Exception {
		AbstractBatchEndpoint fixture = new FlatFileReaderEndpoint();
		String servId = "";

		fixture.subtraThreadNum(servId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
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
	 * @generatedBy CodePro at 15-12-21 下午5:08
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
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractBatchEndpointTest.class);
	}
}