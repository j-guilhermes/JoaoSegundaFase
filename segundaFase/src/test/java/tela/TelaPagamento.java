package tela;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abrirSite.AbrirSite;

public class TelaPagamento {
	public static WebDriver driver = null;

	public static String pedidos;

	public TelaPagamento() {

		driver = AbrirSite.getDriver();

	}

	public void selecionarTransferenciaBancaria() {

		WebElement transf = driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
		transf.click();
	}

	public void selecionarPagueCheque() {

	}

	public void clicarConfirmarPedido() {

		WebElement pedido = driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span"));
		pedido.click();

	}

	public void validarMensagemFinal() {
		WebElement pedido = driver
				.findElement(By.xpath("//strong[contains(text(), 'Your order on My Store is complete.')]"));
		pedidos = pedido.getText();
		assertEquals("Your order on My Store is complete.", pedidos);
		System.out.println("Your order on My Store is complete. - " + pedidos);

	}

}
