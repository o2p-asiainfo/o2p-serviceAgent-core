package com.ailk.eaap.op2.serviceagent.task;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TaskListenerTest</code> contains tests for the class <code>{@link TaskListener}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:14
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class TaskListenerTest {
	/**
	 * Run the TaskListener() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testTaskListener_1()
		throws Exception {
		TaskListener result = new TaskListener();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the ITaskJobService getTaskJobService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testGetTaskJobService_1()
		throws Exception {
		TaskListener fixture = new TaskListener();
		fixture.setRun(true);
		fixture.setTaskJobService(new TechTaskJob());

		ITaskJobService result = fixture.getTaskJobService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TaskListener
		assertNotNull(result);
	}

	/**
	 * Run the boolean isRun() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testIsRun_1()
		throws Exception {
		TaskListener fixture = new TaskListener();
		fixture.setRun(true);
		fixture.setTaskJobService(new TechTaskJob());

		boolean result = fixture.isRun();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TaskListener
		assertTrue(result);
	}

	/**
	 * Run the boolean isRun() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testIsRun_2()
		throws Exception {
		TaskListener fixture = new TaskListener();
		fixture.setRun(false);
		fixture.setTaskJobService(new TechTaskJob());

		boolean result = fixture.isRun();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TaskListener
		assertTrue(result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testRun_1()
		throws Exception {
		TaskListener fixture = new TaskListener();
		fixture.setRun(false);
		fixture.setTaskJobService(new TechTaskJob());

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.task.TaskListener.<clinit>(TaskListener.java:15)
	}

	/**
	 * Run the void setRun(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetRun_1()
		throws Exception {
		TaskListener fixture = new TaskListener();
		fixture.setRun(true);
		fixture.setTaskJobService(new TechTaskJob());
		boolean runParm = true;

		fixture.setRun(runParm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TaskListener
	}

	/**
	 * Run the void setTaskJobService(ITaskJobService) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:14
	 */
	@Test
	public void testSetTaskJobService_1()
		throws Exception {
		TaskListener fixture = new TaskListener();
		fixture.setRun(true);
		fixture.setTaskJobService(new TechTaskJob());
		ITaskJobService taskJobService = new TechTaskJob();

		fixture.setTaskJobService(taskJobService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.task.TaskListener
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
		new org.junit.runner.JUnitCore().run(TaskListenerTest.class);
	}
}