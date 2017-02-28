package com.ailk.eaap.op2.serviceagent.route.service.batch;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.serviceagent.route.service.IRouteServ;
import com.ailk.eaap.op2.serviceagent.route.service.RouteServ;
import com.ailk.eaap.op2.bo.ToRouteEndpoint;

/**
 * The class <code>RepeatServiceImplTest</code> contains tests for the class <code>{@link RepeatServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午8:10
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class RepeatServiceImplTest {
	/**
	 * Run the RepeatServiceImpl() constructor test.
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test
	public void testRepeatServiceImpl_1()
		throws Exception {
		RepeatServiceImpl result = new RepeatServiceImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void doExecute(ToRouteEndpoint,RepeatCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoExecute_1()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		ToRouteEndpoint te = new ToRouteEndpoint();
		RepeatCallBack callBack = new RepeatCallBack(new MessageBO());

		fixture.doExecute(te, callBack);

		// add additional test code here
	}

	/**
	 * Run the void doExecute(ToRouteEndpoint,RepeatCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoExecute_2()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		ToRouteEndpoint te = new ToRouteEndpoint();
		RepeatCallBack callBack = new RepeatCallBack(new MessageBO());

		fixture.doExecute(te, callBack);

		// add additional test code here
	}

	/**
	 * Run the void doExecute(ToRouteEndpoint,RepeatCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoExecute_3()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		ToRouteEndpoint te = new ToRouteEndpoint();
		RepeatCallBack callBack = new RepeatCallBack(new MessageBO());

		fixture.doExecute(te, callBack);

		// add additional test code here
	}

	/**
	 * Run the void doExecute(ToRouteEndpoint,RepeatCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoExecute_4()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		ToRouteEndpoint te = new ToRouteEndpoint();
		RepeatCallBack callBack = new RepeatCallBack(new MessageBO());

		fixture.doExecute(te, callBack);

		// add additional test code here
	}

	/**
	 * Run the void doExecute(ToRouteEndpoint,RepeatCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoExecute_5()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		ToRouteEndpoint te = new ToRouteEndpoint();
		RepeatCallBack callBack = new RepeatCallBack(new MessageBO());

		fixture.doExecute(te, callBack);

		// add additional test code here
	}

	/**
	 * Run the void doExecute(ToRouteEndpoint,RepeatCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoExecute_6()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		ToRouteEndpoint te = new ToRouteEndpoint();
		RepeatCallBack callBack = new RepeatCallBack(new MessageBO());

		fixture.doExecute(te, callBack);

		// add additional test code here
	}

	/**
	 * Run the void recycling(ToRouteEndpoint,RepeatCallBack) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test
	public void testRecycling_1()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		ToRouteEndpoint te = new ToRouteEndpoint();
		RepeatCallBack callBack = new RepeatCallBack(new MessageBO());

		fixture.recycling(te, callBack);

		// add additional test code here
	}

	/**
	 * Run the void setRouteServ(IRouteServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test
	public void testSetRouteServ_1()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		IRouteServ routeServ = new RouteServ();

		fixture.setRouteServ(routeServ);

		// add additional test code here
	}

	/**
	 * Run the void setTaskExecutor(TaskExecutor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	@Test
	public void testSetTaskExecutor_1()
		throws Exception {
		RepeatServiceImpl fixture = new RepeatServiceImpl();
		fixture.setTaskExecutor(new SimpleAsyncTaskExecutor());
		fixture.setRouteServ(new RouteServ());
		TaskExecutor taskExecutor = new SimpleAsyncTaskExecutor();

		fixture.setTaskExecutor(taskExecutor);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午8:10
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
	 * @generatedBy CodePro at 15-11-12 下午8:10
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
	 * @generatedBy CodePro at 15-11-12 下午8:10
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RepeatServiceImplTest.class);
	}
}