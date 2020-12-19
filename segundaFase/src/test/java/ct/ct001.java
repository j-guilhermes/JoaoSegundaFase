package ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abrirSite.chromeDriver;

public class ct001 {

	chromeDriver driver = new chromeDriver();

	@Before
	public void setUp() throws Exception {

		driver.setUp();

	}

	@After
	public void tearDown() throws Exception {
		driver.tearDown();
	}

	@Test
	public void test() throws Exception {

	}

}
