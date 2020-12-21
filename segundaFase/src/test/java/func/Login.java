package func;

import tela.TelaLogin;

public class Login {

	public Login() {

	}

	public void digitaLogin() throws Exception {
		TelaLogin login = new TelaLogin();
		login.digitarEmail("camiilasouza@ymail.com");
		login.digitarPassword("123456");
		login.clicarSingIn();
	}

	public void clicaCreateAccount() throws Exception {
		TelaLogin login = new TelaLogin();
		login.clicarCreateAccount();

	}
}
