package tela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abrirSite.AbrirSite;

public class TelaEndereco {

	public static WebDriver driver = null;
	public static String enderecos;
	public static String enderecoAtualizado;

	public TelaEndereco() {

		driver = AbrirSite.getDriver();
	}

	public void clicarAtualizarEndereco() {

		WebElement atzEndereco = driver.findElement(By.xpath("//*[@id='address_delivery']/li[8]/a"));
		atzEndereco.click();
	}

	public void clicarAdicionarNovoEndereco() {

		WebElement aadEndereco = driver.findElement(By.xpath("//*[@id='center_column']/form/div/p/a/span"));
		aadEndereco.click();

	}

	public void digitarEndereco(String endereco) {

		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		address.clear();
		address.sendKeys(endereco);

	}

	public void guardarEndereco() {

		WebElement address = driver.findElement(By.id("address1"));
		address.getAttribute("value");
		enderecos = address.getText();
		System.out.println(enderecos);

	}

	public void validarEnderecoAtualizado() {
		WebElement attEndereco = driver.findElement(By.xpath("//*[@id='address_delivery']/li[3]"));
		enderecoAtualizado = attEndereco.getText();

	}

	public void digitarNumero(String numero) {
		WebElement address = driver.findElement(By.id("address2"));
		address.clear();
		address.sendKeys(numero);

	}

	public void digitarCidade(String cidade) {

		WebElement city = driver.findElement(By.id("city"));
		city.clear();
		city.sendKeys(cidade);

	}

	public void selecionarEstado(String estado) {

		WebElement state = driver.findElement(By.id("id_state"));
		state.sendKeys(estado);

	}

	public void digitarCEP(String cep) {

		WebElement postCode = driver.findElement(By.id("postcode"));
		postCode.sendKeys(cep);
	}

	public void selecionarPais(String pais) {

		WebElement country = driver.findElement(By.id("id_country"));
		country.sendKeys(pais);
	}

	public void digitarTelefone(String telefone) {

		WebElement phone = driver.findElement(By.id("phone"));
		phone.clear();
		phone.sendKeys(telefone);
	}

	public void digitarCelular(String celular) {

		WebElement cellphone = driver.findElement(By.id("phone_mobile"));
		cellphone.clear();
		cellphone.sendKeys(celular);
	}

	public void digitarReferencia(String referencia) {

		WebElement reference = driver.findElement(By.id("alias"));
		reference.clear();
		reference.sendKeys(referencia);
	}

	public void clicarSalvar() {

		WebElement salvar = driver.findElement(By.id("submitAddress"));
		salvar.click();

	}

	public void clicarBotaoCheckOut() {

		WebElement checkout = driver.findElement(By.xpath("//button[@name='processAddress']"));
		checkout.click();

	}

}
