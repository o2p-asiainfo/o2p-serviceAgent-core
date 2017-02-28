package com.ailk.eaap.op2.serviceagent.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TaskThreadManagerTest</code> contains tests for the class <code>{@link TaskThreadManager}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:14
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class TaskThreadManagerTest {
	/**
	 * Run the ExecutorService getSendMsgService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testGetSendMsgService_1()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));

		ExecutorService result = fixture.getSendMsgService();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isShutdown());
		assertEquals(false, result.isTerminated());
	}

	/**
	 * Run the int getThreadNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testGetThreadNum_1()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));

		int result = fixture.getThreadNum();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setSendMsgService(ExecutorService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetSendMsgService_1()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		ExecutorService sendMsgService = new ScheduledThreadPoolExecutor(1);

		fixture.setSendMsgService(sendMsgService);

		// add additional test code here
	}

	/**
	 * Run the void setTaskListeners(TaskListener[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetTaskListeners_1()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		TaskListener[] taskListeners = new TaskListener[] {};

		fixture.setTaskListeners(taskListeners);

		// add additional test code here
	}

	/**
	 * Run the void setTaskListeners(TaskListener[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetTaskListeners_2()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		TaskListener[] taskListeners = new TaskListener[] {};

		fixture.setTaskListeners(taskListeners);

		// add additional test code here
	}

	/**
	 * Run the void setThreadNum(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetThreadNum_1()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));
		int threadNum = 1;

		fixture.setThreadNum(threadNum);

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testStart_1()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.task.TaskThreadManager.start(TaskThreadManager.java:20)
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testStart_2()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(0);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));

		fixture.start();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException
		//       at java.util.concurrent.ThreadPoolExecutor.<init>(ThreadPoolExecutor.java:587)
		//       at java.util.concurrent.ThreadPoolExecutor.<init>(ThreadPoolExecutor.java:478)
		//       at java.util.concurrent.Executors.newFixedThreadPool(Executors.java:57)
		//       at com.ailk.eaap.op2.serviceagent.task.TaskThreadManager.start(TaskThreadManager.java:18)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testStop_1()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.task.TaskThreadManager.stop(TaskThreadManager.java:26)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testStop_2()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.task.TaskThreadManager.stop(TaskThreadManager.java:26)
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testStop_3()
		throws Exception {
		TaskThreadManager fixture = new TaskThreadManager();
		fixture.setThreadNum(1);
		fixture.setSendMsgService(new ScheduledThreadPoolExecutor(1));

		fixture.stop();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.task.TaskThreadManager.stop(TaskThreadManager.java:26)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
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
	 * @generatedBy CodePro at 15-12-21 下午5:14
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
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TaskThreadManagerTest.class);
	}
}