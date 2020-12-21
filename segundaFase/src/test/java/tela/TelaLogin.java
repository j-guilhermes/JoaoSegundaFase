package tela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abrirSite.OpenLink;

public class TelaLogin {

	public static WebDriver driver = null;

	public TelaLogin() throws Exception {

		driver = OpenLink.getDriver();

	}

	public void digitarEmail(String emails) throws Exception {

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(emails);
	}

	public void clicarSingIn() {
		driver.findElement(By.id("SubmitLogin")).click();
	}

	public void digitarNewEmail(String newEmail) {

		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys(newEmail);

	}

	public void clicarCreateAccount() {

		driver.findElement(By.id("SubmitCreate")).click();
	}

	public void selecionarMr() {

		WebElement mr = driver.findElement(By.id("id_gender1"));
		mr.click();
	}

	public void selecionarMrs() {

		WebElement mra = driver.findElement(By.id("id_gender2"));
		mra.click();

	}

	public void digitarFirstName(String firstName) {

		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys(firstName);

	}

	public void digitarLastName(String lasttname) {

		WebElement lasttName = driver.findElement(By.id("customer_lasttname"));
		lasttName.sendKeys(lasttname);
	}

	public void digitarPassword(String password) {

		driver.findElement(By.id("passwd")).sendKeys("password");
	}

	public void selecionarDay(String day) {

		WebElement days = driver.findElement(By.id("days"));
		days.sendKeys(day);

	}

	public void selecionarMonth(String months) {

		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("months");
	}

	public void selecionarYears(String year) {

		WebElement years = driver.findElement(By.id("years"));
		years.sendKeys(year);
	}

	public void digitarAddress(String address) {

		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("address");
	}

	public void digitarCity(String cities) {

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("cities");

	}

	public void selecionarState(String states) {

		WebElement state = driver.findElement(By.id("id_state"));
		state.sendKeys("states");

	}

	public void digitarPostalCode(String code) {

		WebElement postCode = driver.findElement(By.id("postcode"));
		postCode.sendKeys("code");
	}

	public void selecionarCountry(String countries) {

		WebElement country = driver.findElement(By.id("id_country"));
		country.sendKeys("countries");
	}

	public void digitarHomePhone(String homePhone) {

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("homePhone");
	}

	public void digitarMobilePhone(String phoneMobile) {

		WebElement cellphone = driver.findElement(By.id("phone_mobile"));
		cellphone.sendKeys("phoneMobile");
	}

	public void digitarAddress2(String address2) {

		WebElement addresse2 = driver.findElement(By.id("alias"));
		addresse2.sendKeys("address2");
	}

	public void clicarRegister() {

		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();

	}

}
