package tela;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abrirSite.AbrirSite;

public class TelaResumo {

	public static WebDriver driver = null;

	public static String mensagemCarrinhoVazio;
	public static String quantidadeObtidaCarrinho;
	public static String enderecoAtual;

	public TelaResumo() {

		driver = AbrirSite.getDriver();

	}

	public void validarQuantidade() {
		WebElement qtd = driver.findElement(By.xpath("//span[@id='summary_products_quantity']"));
		quantidadeObtidaCarrinho = qtd.getText().substring(0, 1);
		assertEquals(TelaProduto.quantidadeCarrinho, quantidadeObtidaCarrinho);
		System.out.println("Quantidade de produto no carrinho " + TelaProduto.quantidadeCarrinho + " de "
				+ quantidadeObtidaCarrinho);

	}

	public void excluirItemCarrinho() {
		WebElement excluir = driver.findElement(By.xpath("//i[@class='icon-trash']"));
		excluir.click();

	}

	public void atualizarQuantidade() {

	}

	public void clicarBotaoCheckOut() {

		WebElement checkout = driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]"));
		checkout.click();

	}

	public void validarCarrinhoVazio() throws Exception {
		try {
			WebElement cardVazio = driver
					.findElement(By.xpath("//p[text()[contains(., 'Your shopping cart is empty.')]]"));
			mensagemCarrinhoVazio = cardVazio.getText();
			assertEquals("Your shopping cart is empty.", mensagemCarrinhoVazio);
			System.out.println("Carrinho vazio validado com sucesso!");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}

	public void guardarEnderecoAtual() {
		WebElement endereco = driver.findElement(By.xpath("//span[@class='address_address1']"));
		enderecoAtual = endereco.getText();
	}
}