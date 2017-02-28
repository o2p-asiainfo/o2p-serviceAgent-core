package com.ailk.eaap.op2.serviceagent.validate.service;

import java.util.IdentityHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.op2.serviceagent.common.MessageBO;
import com.ailk.eaap.op2.bo.ProofEffect;
import com.asiainfo.integretion.o2p.serviceagent.cache.CacheServiceImpl;
import com.asiainfo.integretion.o2p.serviceagent.cache.IMemcacheManageServ;

/**
 * The class <code>ProofServTest</code> contains tests for the class <code>{@link ProofServ}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午5:17
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class ProofServTest {
	/**
	 * Run the ProofServ() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testProofServ_1()
		throws Exception {
		ProofServ result = new ProofServ();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the CacheFactory<String, Object> getCacheFactory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testGetCacheFactory_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());

		CacheFactory<String, Object> result = fixture.getCacheFactory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertNotNull(result);
	}

	/**
	 * Run the IMemcacheManageServ getCacheService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testGetCacheService_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());

		IMemcacheManageServ result = fixture.getCacheService();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertNotNull(result);
	}

	/**
	 * Run the boolean ipBlackCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpBlackCheck_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipBlack = new ProofEffect();
		ipBlack.setAtts(new IdentityHashMap());
		ipBlack.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipBlackCheck(ipBlack, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipBlackCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpBlackCheck_2()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipBlack = new ProofEffect();
		ipBlack.setAtts(new IdentityHashMap());
		ipBlack.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipBlackCheck(ipBlack, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipBlackCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpBlackCheck_3()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		Object ipBlack = null;
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipBlackCheck(ipBlack, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipBlackCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpBlackCheck_4()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipBlack = new ProofEffect();
		ipBlack.setAtts(new IdentityHashMap());
		ipBlack.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipBlackCheck(ipBlack, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipBlackCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpBlackCheck_5()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipBlack = new ProofEffect();
		ipBlack.setAtts(new IdentityHashMap());
		ipBlack.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipBlackCheck(ipBlack, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipBlackCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpBlackCheck_6()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipBlack = new ProofEffect();
		ipBlack.setAtts(new IdentityHashMap());
		ipBlack.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipBlackCheck(ipBlack, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipBlackCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpBlackCheck_7()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipBlack = new ProofEffect();
		ipBlack.setStatus("");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipBlackCheck(ipBlack, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipWhiteCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpWhiteCheck_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipWhite = new ProofEffect();
		ipWhite.setAtts(new IdentityHashMap());
		ipWhite.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipWhiteCheck(ipWhite, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipWhiteCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpWhiteCheck_2()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipWhite = new ProofEffect();
		ipWhite.setAtts(new IdentityHashMap());
		ipWhite.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipWhiteCheck(ipWhite, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipWhiteCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpWhiteCheck_3()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipWhite = new ProofEffect();
		ipWhite.setAtts(new IdentityHashMap());
		ipWhite.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipWhiteCheck(ipWhite, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipWhiteCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpWhiteCheck_4()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		Object ipWhite = null;
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipWhiteCheck(ipWhite, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipWhiteCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpWhiteCheck_5()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipWhite = new ProofEffect();
		ipWhite.setAtts(new IdentityHashMap());
		ipWhite.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipWhiteCheck(ipWhite, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipWhiteCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpWhiteCheck_6()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipWhite = new ProofEffect();
		ipWhite.setAtts(new IdentityHashMap());
		ipWhite.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipWhiteCheck(ipWhite, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean ipWhiteCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testIpWhiteCheck_7()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect ipWhite = new ProofEffect();
		ipWhite.setStatus("");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.ipWhiteCheck(ipWhite, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean passwordCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPasswordCheck_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect password = new ProofEffect();
		password.setAtts(new IdentityHashMap());
		password.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.passwordCheck(password, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:107)
		//       at com.ailk.eaap.op2.serviceagent.validate.service.ProofServ.<clinit>(ProofServ.java:34)
		assertTrue(result);
	}

	/**
	 * Run the boolean passwordCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPasswordCheck_2()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect password = new ProofEffect();
		password.setAtts(new IdentityHashMap());
		password.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.passwordCheck(password, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean passwordCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPasswordCheck_3()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect password = new ProofEffect();
		password.setAtts(new IdentityHashMap());
		password.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.passwordCheck(password, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean passwordCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPasswordCheck_4()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		Object password = null;
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.passwordCheck(password, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean passwordCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPasswordCheck_5()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect password = new ProofEffect();
		password.setAtts(new IdentityHashMap());
		password.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.passwordCheck(password, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean passwordCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPasswordCheck_6()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect password = new ProofEffect();
		password.setStatus("");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.passwordCheck(password, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean psdSignCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPsdSignCheck_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect psdSign = new ProofEffect();
		psdSign.setAtts(new IdentityHashMap());
		psdSign.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.psdSignCheck(psdSign, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean psdSignCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPsdSignCheck_2()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect psdSign = new ProofEffect();
		psdSign.setAtts(new IdentityHashMap());
		psdSign.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.psdSignCheck(psdSign, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean psdSignCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPsdSignCheck_3()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		Object psdSign = null;
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.psdSignCheck(psdSign, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean psdSignCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPsdSignCheck_4()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect psdSign = new ProofEffect();
		psdSign.setAtts(new IdentityHashMap());
		psdSign.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.psdSignCheck(psdSign, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean psdSignCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testPsdSignCheck_5()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect psdSign = new ProofEffect();
		psdSign.setStatus("");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.psdSignCheck(psdSign, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the void setCacheFactory(CacheFactory<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testSetCacheFactory_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		CacheFactory<String, Object> cacheFactory = new CacheFactory();

		fixture.setCacheFactory(cacheFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
	}

	/**
	 * Run the void setCacheService(IMemcacheManageServ) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testSetCacheService_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		IMemcacheManageServ cacheService = new CacheServiceImpl();

		fixture.setCacheService(cacheService);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_1()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_2()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_3()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_4()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_5()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_6()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_7()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_8()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_9()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		Object token = null;
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_10()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_11()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setAtts(new IdentityHashMap());
		token.setStatus("A");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Run the boolean tokenCheck(Object,MessageBO<?>,StringBuffer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	@Test
	public void testTokenCheck_12()
		throws Exception {
		ProofServ fixture = new ProofServ();
		fixture.setCacheService(new CacheServiceImpl());
		fixture.setCacheFactory(new CacheFactory());
		ProofEffect token = new ProofEffect();
		token.setStatus("");
		MessageBO<Object> messageBo = new MessageBO();
		StringBuffer sb = new StringBuffer();

		boolean result = fixture.tokenCheck(token, messageBo, sb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class com.ailk.eaap.op2.serviceagent.validate.service.ProofServ
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午5:17
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
	 * @generatedBy CodePro at 15-12-21 下午5:17
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
	 * @generatedBy CodePro at 15-12-21 下午5:17
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProofServTest.class);
	}
}