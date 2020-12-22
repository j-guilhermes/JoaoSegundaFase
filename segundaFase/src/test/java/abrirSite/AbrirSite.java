package abrirSite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirSite {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;

	}

	@Before
	public void iniciarDriver() throws Exception {
		abrirAplicacao();
	}

	public static void abrirAplicacao() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@After
	public void fecharAplicacao() throws Exception {
		driver.quit();
	}

}
