package ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abrirSite.AbrirSite;
import func.Home;
import func.Login;
import func.Resumo;

public class CT003 {

	Login login = new Login();
	Home home = new Home();
	Resumo resumo = new Resumo();

	@Before
	public void setUp() throws Exception {
		AbrirSite site = new AbrirSite();
		site.iniciarDriver();

		System.out.println("CT003 - Validar a criação de um novo cadastro");

	}

	@After
	public void tearDown() throws Exception {
		AbrirSite site = new AbrirSite();
		site.fecharAplicacao();
	}

	@Test
	public void test() throws Exception {

		System.out.println("Clicar em Sign in na tela home");
		home.clicaSignIn();

		System.out.println("Digitar novo e-mail e clicar em CreateAccount");
		login.clicaCreateAccount();

		System.out.println("Digitar dados para cadastro");
		login.digitaInformacoesPessoais();

		System.out.println("Digitar dados para Endereço");
		login.digitaInformacoesEndereco();
	}

}
