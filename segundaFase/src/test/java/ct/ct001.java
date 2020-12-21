package ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abrirSite.OpenLink;
import func.Login;

public class ct001 {

	Login login = new Login();

	@Before
	public void setUp() throws Exception {
		OpenLink site = new OpenLink();
		site.iniciarDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {

		login.digitaLogin();

	}

}
