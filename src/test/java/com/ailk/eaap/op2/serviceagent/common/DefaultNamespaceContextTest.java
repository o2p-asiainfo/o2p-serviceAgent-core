package com.ailk.eaap.op2.serviceagent.common;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.namespace.NamespaceContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultNamespaceContextTest</code> contains tests for the class <code>{@link DefaultNamespaceContext}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:46
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class DefaultNamespaceContextTest {
	/**
	 * Run the DefaultNamespaceContext() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testDefaultNamespaceContext_1()
		throws Exception {

		DefaultNamespaceContext result = new DefaultNamespaceContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultNamespaceContext(Map<String,String>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testDefaultNamespaceContext_2()
		throws Exception {
		Map<String, String> map = new IdentityHashMap();

		DefaultNamespaceContext result = new DefaultNamespaceContext(map);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultNamespaceContext(NamespaceContext,Map<String,String>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testDefaultNamespaceContext_3()
		throws Exception {
		NamespaceContext parent = new DefaultNamespaceContext();
		Map<String, String> map = new IdentityHashMap();

		DefaultNamespaceContext result = new DefaultNamespaceContext(parent, map);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultNamespaceContext add(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		String prefix = "";
		String uri = "";

		DefaultNamespaceContext result = fixture.add(prefix, uri);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetNamespaceURI_1()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		String prefix = "";

		String result = fixture.getNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetNamespaceURI_2()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		String prefix = "";

		String result = fixture.getNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetNamespaceURI_3()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext((NamespaceContext) null, new IdentityHashMap());
		String prefix = "";

		String result = fixture.getNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNamespaceURI(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetNamespaceURI_4()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), (Map<String, String>) null);
		String prefix = "";

		String result = fixture.getNamespaceURI(prefix);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetPrefix_1()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		String namespaceURI = "";

		String result = fixture.getPrefix(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefix(DefaultNamespaceContext.java:48)
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefix(DefaultNamespaceContext.java:55)
		assertNotNull(result);
	}

	/**
	 * Run the String getPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetPrefix_2()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		String namespaceURI = "";

		String result = fixture.getPrefix(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefix(DefaultNamespaceContext.java:48)
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefix(DefaultNamespaceContext.java:55)
		assertNotNull(result);
	}

	/**
	 * Run the String getPrefix(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetPrefix_3()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext((NamespaceContext) null, new IdentityHashMap());
		String namespaceURI = "";

		String result = fixture.getPrefix(namespaceURI);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Iterator<String> getPrefixes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetPrefixes_1()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		String namespaceURI = "";

		Iterator<String> result = fixture.getPrefixes(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefixes(DefaultNamespaceContext.java:62)
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefixes(DefaultNamespaceContext.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<String> getPrefixes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetPrefixes_2()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		String namespaceURI = "";

		Iterator<String> result = fixture.getPrefixes(namespaceURI);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefixes(DefaultNamespaceContext.java:62)
		//       at com.ailk.eaap.op2.serviceagent.common.DefaultNamespaceContext.getPrefixes(DefaultNamespaceContext.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<String> getPrefixes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetPrefixes_3()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext((NamespaceContext) null, new IdentityHashMap());
		String namespaceURI = "";

		Iterator<String> result = fixture.getPrefixes(namespaceURI);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the void setNamespaces(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetNamespaces_1()
		throws Exception {
		DefaultNamespaceContext fixture = new DefaultNamespaceContext(new DefaultNamespaceContext(), new IdentityHashMap());
		Map<String, String> namespaces = new IdentityHashMap();

		fixture.setNamespaces(namespaces);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
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
	 * @generatedBy CodePro at 15-12-21 下午4:46
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
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultNamespaceContextTest.class);
	}
}