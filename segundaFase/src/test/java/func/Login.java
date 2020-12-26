package func;

import tela.TelaEndereco;
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
		TelaEndereco endereco = new TelaEndereco();
		endereco.digitarEndereco("travessa colorado do oeste");
		Thread.sleep(1000);
		endereco.digitarNumero("110");
		Thread.sleep(1000);
		endereco.digitarCidade("United States");
		Thread.sleep(1000);
		endereco.selecionarEstado("alaska");
		Thread.sleep(1000);
		endereco.digitarCEP("00000");
		Thread.sleep(1000);
		endereco.digitarTelefone("41170226");
		Thread.sleep(1000);
		endereco.digitarCelular("988776655");
		Thread.sleep(1000);
		endereco.digitarReferencia("My home");
		Thread.sleep(1000);
		login.clicarRegistrar();
		Thread.sleep(1000);
		login.validarLogin();
	}
}
