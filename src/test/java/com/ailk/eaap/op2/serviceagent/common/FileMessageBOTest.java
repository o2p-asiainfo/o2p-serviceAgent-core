package com.ailk.eaap.op2.serviceagent.common;

import java.io.File;
import java.util.IdentityHashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FileMessageBOTest</code> contains tests for the class <code>{@link FileMessageBO}</code>.
 *
 * @generatedBy CodePro at 15-12-21 下午4:46
 * @author wuwz
 * @version $Revision: 1.0 $
 */
public class FileMessageBOTest {
	/**
	 * Run the FileMessageBO() constructor test.
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testFileMessageBO_1()
		throws Exception {
		FileMessageBO result = new FileMessageBO();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the File[] getFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetFile_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());

		File[] result = fixture.getFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the File[] getFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetFile_2()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());

		File[] result = fixture.getFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Map<String, File> getFiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetFiles_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());

		Map<String, File> result = fixture.getFiles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getTempFileDirName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testGetTempFileDirName_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());

		String result = fixture.getTempFileDirName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isSub() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testIsSub_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());

		boolean result = fixture.isSub();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSub() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testIsSub_2()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(false);
		fixture.setFiles(new IdentityHashMap());

		boolean result = fixture.isSub();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setFile(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetFile_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());
		File[] file = new File[] {};

		fixture.setFile(file);

		// add additional test code here
	}

	/**
	 * Run the void setFile(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetFile_2()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());
		File[] file = new File[] {};

		fixture.setFile(file);

		// add additional test code here
	}

	/**
	 * Run the void setFiles(Map<String,File>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetFiles_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());
		Map<String, File> files = new IdentityHashMap();

		fixture.setFiles(files);

		// add additional test code here
	}

	/**
	 * Run the void setSub(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetSub_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());
		boolean sub = true;

		fixture.setSub(sub);

		// add additional test code here
	}

	/**
	 * Run the void setTempFileDirName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 15-12-21 下午4:46
	 */
	@Test
	public void testSetTempFileDirName_1()
		throws Exception {
		FileMessageBO fixture = new FileMessageBO();
		fixture.setTempFileDirName("");
		fixture.setSub(true);
		fixture.setFiles(new IdentityHashMap());
		String tempFileDirName = "";

		fixture.setTempFileDirName(tempFileDirName);

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
		new org.junit.runner.JUnitCore().run(FileMessageBOTest.class);
	}
}