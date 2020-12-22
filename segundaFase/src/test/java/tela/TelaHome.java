package tela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abrirSite.AbrirSite;

public class TelaHome {

	public static WebDriver driver = null;

	public TelaHome() {

		driver = AbrirSite.getDriver();

	}

	public void clicarSignIn() throws Exception {
		WebElement signIn = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		signIn.click();

	}

	public void clicarAbaMulher() throws Exception {
		WebElement women = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		women.click();

	}

	public void clicarAbaVestido() throws Exception {
		WebElement dresses = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
		dresses.click();
	}

	public void clicarAbaCamiseta() throws Exception {
		WebElement tShirts = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a"));
		tShirts.click();

	}

	public void clicarCarrinho() throws Exception {
		WebElement card = driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a"));
		card.click();
	}

	public void selecionarProduto() throws InterruptedException {
		WebElement produto = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div"));
		produto.isSelected();
		produto.click();
	}

	public void clicarProduto() {
		WebElement produto = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[2]"));
		produto.click();
	}

}
