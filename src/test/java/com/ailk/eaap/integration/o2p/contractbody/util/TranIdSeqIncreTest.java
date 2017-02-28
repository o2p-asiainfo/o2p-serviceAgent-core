package com.ailk.eaap.integration.o2p.contractbody.util;

import org.junit.*;
import static org.junit.Assert.*;
import com.ailk.eaap.o2p.common.cache.CacheFactory;
import com.ailk.eaap.o2p.common.cache.ICacheFactory;

/**
 * The class <code>TranIdSeqIncreTest</code> contains tests for the class <code>{@link TranIdSeqIncre}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:26
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class TranIdSeqIncreTest {
	/**
	 * Run the int cal(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCal_1()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = -1;
		String logo = "";
		String code = "";

		int result = fixture.cal(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int cal(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCal_2()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = -1;
		String logo = "";
		String code = "";

		int result = fixture.cal(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int cal(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCal_3()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 0;
		String logo = "";
		String code = "";

		int result = fixture.cal(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int cal(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCal_4()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = -1;
		String logo = "";
		String code = "";

		int result = fixture.cal(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the TranIdSeqIncre getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		TranIdSeqIncre result = TranIdSeqIncre.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_1()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_2()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_3()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_4()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_5()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_6()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_7()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_8()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_9()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the void getLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetLogo_10()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String ipPort = "";

		fixture.getLogo(ipPort);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getLogo(TranIdSeqIncre.java:140)
	}

	/**
	 * Run the String getNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetNum_1()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "aaaa";
		String code = "";

		String result = fixture.getNum(logo, code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p.serviceAgent.transformer.SerialNumber' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getNum(TranIdSeqIncre.java:105)
		assertNotNull(result);
	}

	/**
	 * Run the String getNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetNum_2()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "aaa";
		String code = "";

		String result = fixture.getNum(logo, code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p.serviceAgent.transformer.SerialNumber' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getNum(TranIdSeqIncre.java:105)
		assertNotNull(result);
	}

	/**
	 * Run the String getNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetNum_3()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		String result = fixture.getNum(logo, code);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.springframework.context.NoSuchMessageException: No message found under code 'o2p.serviceAgent.transformer.SerialNumber' for locale 'zh_CN'.
		//       at org.springframework.context.support.AbstractMessageSource.getMessage(AbstractMessageSource.java:159)
		//       at com.asiainfo.foundation.util.MessageSourceUtils.getMessage(MessageSourceUtils.java:41)
		//       at com.asiainfo.foundation.exception.BusinessException.getMessage(BusinessException.java:151)
		//       at com.asiainfo.foundation.exception.BusinessException.<init>(BusinessException.java:105)
		//       at com.ailk.eaap.integration.o2p.contractbody.util.TranIdSeqIncre.getNum(TranIdSeqIncre.java:105)
		assertNotNull(result);
	}

	/**
	 * Run the String getSIzeString(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetSIzeString_1()
		throws Exception {
		String str = "";
		int size = 1;

		String result = TranIdSeqIncre.getSIzeString(str, size);

		// add additional test code here
		assertEquals("0", result);
	}

	/**
	 * Run the String getSIzeString(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetSIzeString_2()
		throws Exception {
		String str = "";
		int size = 1;

		String result = TranIdSeqIncre.getSIzeString(str, size);

		// add additional test code here
		assertEquals("0", result);
	}

	/**
	 * Run the String getSIzeString(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetSIzeString_3()
		throws Exception {
		String str = "";
		int size = 1;

		String result = TranIdSeqIncre.getSIzeString(str, size);

		// add additional test code here
		assertEquals("0", result);
	}

	/**
	 * Run the String getSizeNum(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetSizeNum_1()
		throws Exception {
		int num = 1;
		int size = 1;

		String result = TranIdSeqIncre.getSizeNum(num, size);

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the String getSizeNum(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetSizeNum_2()
		throws Exception {
		int num = 1;
		int size = 1;

		String result = TranIdSeqIncre.getSizeNum(num, size);

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the String getSizeNum(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testGetSizeNum_3()
		throws Exception {
		int num = 1;
		int size = 1;

		String result = TranIdSeqIncre.getSizeNum(num, size);

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the int initStartNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testInitStartNum_1()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		int result = fixture.initStartNum(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int initStartNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testInitStartNum_2()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		int result = fixture.initStartNum(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int initStartNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testInitStartNum_3()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		int result = fixture.initStartNum(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int initStartNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testInitStartNum_4()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		int result = fixture.initStartNum(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int initStartNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testInitStartNum_5()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		int result = fixture.initStartNum(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int initStartNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testInitStartNum_6()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		int result = fixture.initStartNum(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int initStartNum(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testInitStartNum_7()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";

		int result = fixture.initStartNum(logo, code);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void resetSerialNum() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testResetSerialNum_1()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;

		fixture.resetSerialNum();

		// add additional test code here
	}

	/**
	 * Run the void setCacheFactory(ICacheFactory<String,Object>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testSetCacheFactory_1()
		throws Exception {
		ICacheFactory<String, Object> cacheFactory = new CacheFactory();

		TranIdSeqIncre.setCacheFactory(cacheFactory);

		// add additional test code here
	}

	/**
	 * Run the void setLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testSetLogo_1()
		throws Exception {
		String logo = "aaaa";

		TranIdSeqIncre.setLogo(logo);

		// add additional test code here
	}

	/**
	 * Run the void setLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testSetLogo_2()
		throws Exception {
		String logo = "";

		TranIdSeqIncre.setLogo(logo);

		// add additional test code here
	}

	/**
	 * Run the void setLogo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test
	public void testSetLogo_3()
		throws Exception {
		String logo = "aaa";

		TranIdSeqIncre.setLogo(logo);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_1()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_2()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_3()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_4()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_5()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_6()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_7()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Run the void updateStartNum(String,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testUpdateStartNum_8()
		throws Exception {
		TranIdSeqIncre fixture = TranIdSeqIncre.getInstance();
		fixture.intervalMax = 1;
		fixture.serialNum = 1;
		String logo = "";
		String code = "";
		int intervalMax = 1;

		fixture.updateStartNum(logo, code, intervalMax);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:26
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
	 * @generatedBy CodePro at 15-12-21 下午4:26
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
	 * @generatedBy CodePro at 15-12-21 下午4:26
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TranIdSeqIncreTest.class);
	}
}