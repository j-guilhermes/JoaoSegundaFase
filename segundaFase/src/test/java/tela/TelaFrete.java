package tela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abrirSite.AbrirSite;

public class TelaFrete {
	public static WebDriver driver = null;

	public TelaFrete() {
		driver = AbrirSite.getDriver();

	}

	public void clicarAceitarTermo() {
		WebElement termo = driver.findElement(By.xpath("//input[@id='cgv']"));
		termo.click();

	}

	public void clicarChekout() {

		WebElement checkout = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		checkout.click();

	}
}
