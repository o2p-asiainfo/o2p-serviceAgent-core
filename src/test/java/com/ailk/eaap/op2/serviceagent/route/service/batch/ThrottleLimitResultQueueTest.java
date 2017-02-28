package com.ailk.eaap.op2.serviceagent.route.service.batch;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ThrottleLimitResultQueueTest</code> contains tests for the class <code>{@link ThrottleLimitResultQueue}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:08
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ThrottleLimitResultQueueTest {
	/**
	 * Run the ThrottleLimitResultQueue(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testThrottleLimitResultQueue_1()
		throws Exception {
		int throttleLimit = 1;

		ThrottleLimitResultQueue result = new ThrottleLimitResultQueue(throttleLimit);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEmpty());
		assertEquals(false, result.isExpecting());
	}

	/**
	 * Run the void decrease() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testDecrease_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		fixture.decrease();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
	}

	/**
	 * Run the void expect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testExpect_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		fixture.expect();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
	}

	/**
	 * Run the void expect() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testExpect_2()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		fixture.expect();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
	}

	/**
	 * Run the void increase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testIncrease_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		fixture.increase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testIsEmpty_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.increase();

		boolean result = fixture.isEmpty();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEmpty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testIsEmpty_2()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		boolean result = fixture.isEmpty();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
		assertTrue(result);
	}

	/**
	 * Run the boolean isExpecting() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testIsExpecting_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		boolean result = fixture.isExpecting();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
		assertTrue(result);
	}

	/**
	 * Run the boolean isExpecting() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testIsExpecting_2()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());

		boolean result = fixture.isExpecting();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
		assertTrue(result);
	}

	/**
	 * Run the void put(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testPut_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		Object holder = new Object();

		fixture.put(holder);

		// add additional test code here
	}

	/**
	 * Run the void put(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testPut_2()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();
		Object holder = new Object();

		fixture.put(holder);

		// add additional test code here
	}

	/**
	 * Run the Object take() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testTake_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());

		Object result = fixture.take();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the Object take() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testTake_2()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		Object result = fixture.take();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the Object take() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testTake_3()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();

		Object result = fixture.take();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
		assertNotNull(result);
	}

	/**
	 * Run the void updateThrottleLimit(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:08
	 */
	@Test
	public void testUpdateThrottleLimit_1()
		throws Exception {
		ThrottleLimitResultQueue fixture = new ThrottleLimitResultQueue(1);
		fixture.put(new Object());
		fixture.increase();
		int throttleLimit = 1;

		fixture.updateThrottleLimit(throttleLimit);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Not expecting a result.  Call expect() before put().
		//       at com.ailk.eaap.op2.serviceagent.route.service.batch.ThrottleLimitResultQueue.put(ThrottleLimitResultQueue.java:94)
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
		new org.junit.runner.JUnitCore().run(ThrottleLimitResultQueueTest.class);
	}
}