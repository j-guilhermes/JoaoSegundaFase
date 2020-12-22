package func;

import tela.TelaLogin;

public class Login {

	public Login() {

	}

	public void digitaLogin() throws Exception {
		TelaLogin login = new TelaLogin();
		login.digitarEmail("joaozinhos@yahoo.com");
		Thread.sleep(1000);
		login.digitarSenha("12345");
		Thread.sleep(1000);
		login.clicarSingIn();
		Thread.sleep(3000);
		login.validarLogin();
		Thread.sleep(1000);

	}

	public void clicaCreateAccount() throws Exception {
		TelaLogin login = new TelaLogin();
		login.digitarNovoEmail("joaozinhos@yahoo.com");
		login.clicarCriarConta();
		Thread.sleep(1000);

	}

	public void digitaInformacoesPessoais() throws Exception {
		TelaLogin login = new TelaLogin();
		login.selecionarTitulo("Mrs.");
		Thread.sleep(1000);
		login.digitarNome("Jao");
		Thread.sleep(1000);
		login.digitarSobrenome("Silva");
		Thread.sleep(1000);
		login.digitarSenha("12345");
		Thread.sleep(1000);
		login.selecionarDia("12");
		Thread.sleep(1000);
		login.selecionarMes("12");
		Thread.sleep(1000);
		login.selecionarAno("1980");
		Thread.sleep(1000);

	}

	public void digitaInformacoesEndereco() throws Exception {
		TelaLogin login = new TelaLogin();
		login.digitarEndereco("travessa colorado do oeste");
		Thread.sleep(1000);
		login.digitarCidade("United States");
		Thread.sleep(1000);
		login.selecionarEstado("alaska");
		Thread.sleep(1000);
		login.digitarCEP("00000");
		Thread.sleep(1000);
		login.digitarTelefone("41170226");
		Thread.sleep(1000);
		login.digitarCelular("988776655");
		Thread.sleep(1000);
		login.digitarReferencia("My home");
		Thread.sleep(1000);
		login.clicarRegistrar();
		Thread.sleep(1000);
		login.validarLogin();
	}
}
