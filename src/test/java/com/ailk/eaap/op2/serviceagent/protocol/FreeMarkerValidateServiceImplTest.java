package com.ailk.eaap.op2.serviceagent.protocol;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FreeMarkerValidateServiceImplTest</code> contains tests for the class <code>{@link FreeMarkerValidateServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-11-12 下午7:34
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class FreeMarkerValidateServiceImplTest {
	/**
	 * Run the FreeMarkerValidateServiceImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:34
	 */
	@Test
	public void testFreeMarkerValidateServiceImpl_1()
		throws Exception {

		FreeMarkerValidateServiceImpl result = new FreeMarkerValidateServiceImpl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setFreeMarkerTemplate(FreeMarkerTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:34
	 */
	@Test
	public void testSetFreeMarkerTemplate_1()
		throws Exception {
		FreeMarkerValidateServiceImpl fixture = new FreeMarkerValidateServiceImpl();
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		FreeMarkerTemplate freeMarkerTemplate = new FreeMarkerTemplate();

		fixture.setFreeMarkerTemplate(freeMarkerTemplate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:94)
		//       at freemarker.log.Log4JLoggerFactory.getLogger(Log4JLoggerFactory.java:65)
		//       at freemarker.log.Logger.getLogger(Logger.java:284)
		//       at freemarker.template.utility.SecurityUtilities.<clinit>(SecurityUtilities.java:67)
		//       at freemarker.ext.beans.BeansWrapper.<clinit>(BeansWrapper.java:147)
		//       at freemarker.template.ObjectWrapper.<clinit>(ObjectWrapper.java:69)
		//       at freemarker.core.Configurable.<init>(Configurable.java:139)
		//       at freemarker.template.Configuration.<init>(Configuration.java:142)
		//       at freemarker.template.Configuration.<clinit>(Configuration.java:127)
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
	}

	/**
	 * Run the String validateBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:34
	 */
	@Test
	public void testValidateBody_1()
		throws Exception {
		FreeMarkerValidateServiceImpl fixture = new FreeMarkerValidateServiceImpl();
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		String templateStr = "";

		String result = fixture.validateBody(templateStr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the String validateBody(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:34
	 */
	@Test
	public void testValidateBody_2()
		throws Exception {
		FreeMarkerValidateServiceImpl fixture = new FreeMarkerValidateServiceImpl();
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		String templateStr = "";

		String result = fixture.validateBody(templateStr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the String validateHeader(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:34
	 */
	@Test
	public void testValidateHeader_1()
		throws Exception {
		FreeMarkerValidateServiceImpl fixture = new FreeMarkerValidateServiceImpl();
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		String templateStr = "";

		String result = fixture.validateHeader(templateStr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
		assertNotNull(result);
	}

	/**
	 * Run the String validateHeader(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:34
	 */
	@Test
	public void testValidateHeader_2()
		throws Exception {
		FreeMarkerValidateServiceImpl fixture = new FreeMarkerValidateServiceImpl();
		fixture.setFreeMarkerTemplate(new FreeMarkerTemplate());
		String templateStr = "";

		String result = fixture.validateHeader(templateStr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class freemarker.template.Configuration
		//       at com.ailk.eaap.op2.serviceagent.protocol.FreeMarkerTemplate.<init>(FreeMarkerTemplate.java:56)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-11-12 下午7:34
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
	 * @generatedBy CodePro at 15-11-12 下午7:34
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
	 * @generatedBy CodePro at 15-11-12 下午7:34
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeMarkerValidateServiceImplTest.class);
	}
}