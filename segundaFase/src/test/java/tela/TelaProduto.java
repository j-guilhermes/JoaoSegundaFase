package tela;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import abrirSite.AbrirSite;

public class TelaProduto {

	public static WebDriver driver = null;

	public static String mensagemCarrinho;
	public static String validaTela;
	public static String quantidadeCarrinho;
	public static String quantidadeCarrinhos;

	public TelaProduto() {

		driver = AbrirSite.getDriver();

	}

	public void digitarQuantidade(String quantidade) throws Exception {
		WebElement produto = driver.findElement(By.xpath("//*[@id='quantity_wanted']"));
		produto.click();
		Thread.sleep(1000);
		produto.clear();
		Thread.sleep(1000);
		produto.sendKeys(quantidade);
	}

	public void selecionarTamanho(String tamanho) throws Exception {
		Select tamanhos = new Select(driver.findElement(By.xpath("//select[@id='group_1']")));
		tamanhos.selectByVisibleText(tamanho);

	}

	public void selecionarCor(String cor) throws Exception {
		WebElement cores = driver.findElement(By.xpath("//a[@title='" + cor + "']"));
		cores.click();
	}

	public void clicarAdicionarCarrinho() {
		WebElement carrinho = driver.findElement(By.id("add_to_cart"));
		carrinho.click();

	}

	public void validarMensagemProdutoAdicionado() {
		WebElement pagina = driver.findElement(By.xpath("//i[@class='icon-ok']"));
		pagina.isSelected();

		WebElement mensagem = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2"));
		mensagemCarrinho = mensagem.getText();
		assertEquals("Product successfully added to your shopping cart", mensagemCarrinho);
		System.out.println("Produto adicionado no carrinho com sucesso!");

	}

	public void validarQuantidadeCarrinho() {
		WebElement carrinhoquantidade = driver.findElement(By.xpath("//span[@id='layer_cart_product_quantity']"));
		quantidadeCarrinho = carrinhoquantidade.getText();
	}

	public void clicarFazerCheckOut() {
		WebElement checkOut = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
		checkOut.click();
	}

}