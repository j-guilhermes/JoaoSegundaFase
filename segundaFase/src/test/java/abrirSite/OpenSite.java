package abrirSite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class OpenSite {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;

	}

	@Before
	public void iniciarDriver() throws Exception {
		abrirAplicacao();
	}

	public static void abrirAplicacao() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver\\chromedriver.exe");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@After
	public void fecharAplicacao() throws Exception {
		driver.quit();
	}

}