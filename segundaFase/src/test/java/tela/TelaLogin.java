package tela;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abrirSite.AbrirSite;

public class TelaLogin {

	public static WebDriver driver = null;
	static String login;

	public TelaLogin() throws Exception {

		driver = AbrirSite.getDriver();

	}

	public void digitarEmail(String email) throws Exception {

		WebElement emails = driver.findElement(By.id("email"));
		emails.sendKeys(email);
	}

	public void clicarSingIn() {
		WebElement singIn = driver.findElement(By.id("SubmitLogin"));
		singIn.click();
	}

	public void digitarNovoEmail(String newEmail) {

		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys(newEmail);

	}

	public void clicarCriarConta() {

		driver.findElement(By.id("SubmitCreate")).click();
	}

	public void selecionarTitulo(String title) {

		WebElement titulo = driver.findElement(By.xpath("//*[text()[contains(., '" + title + "')]]"));
		titulo.click();
	}

	public void digitarNome(String firstName) {

		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys(firstName);

	}

	public void digitarSobrenome(String sobrenome) {

		WebElement sobreNome = driver.findElement(By.id("customer_lastname"));
		sobreNome.sendKeys(sobrenome);
	}

	public void digitarSenha(String senha) {

		WebElement passwd = driver.findElement(By.id("passwd"));
		passwd.sendKeys(senha);

	}

	public void selecionarDia(String dia) {

		WebElement day = driver.findElement(By.id("days"));
		day.sendKeys(dia);

	}

	public void selecionarMes(String mes) {

		WebElement month = driver.findElement(By.id("months"));
		month.sendKeys(mes);
	}

	public void selecionarAno(String ano) {

		WebElement year = driver.findElement(By.id("years"));
		year.sendKeys(ano);
	}

	public void clicarRegistrar() {

		WebElement registrar = driver.findElement(By.id("submitAccount"));
		registrar.click();

	}

	public void validarLogin() throws Exception {
		try {
			WebElement validaLogin = driver.findElement(By.xpath("//h1[text()[contains(., 'My account')]]"));
			login = validaLogin.getText().toLowerCase();
			assertEquals("my account", login);
			System.out.println("Login validado com sucesso !");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
}
