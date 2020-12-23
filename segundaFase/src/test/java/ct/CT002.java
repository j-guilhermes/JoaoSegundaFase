package ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abrirSite.AbrirSite;
import func.Home;
import func.Login;
import func.Resumo;

public class CT002 {

	Login login = new Login();
	Home home = new Home();
	Resumo resumo = new Resumo();

	@Before
	public void setUp() throws Exception {
		AbrirSite site = new AbrirSite();
		site.iniciarDriver();

		System.out
				.println("CT002 - Validar mensagem 'Your shopping cart is empty.' do carinho vazio com usuário logado");

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

		System.out.println("Realizar");
		login.digitaLogin();

		System.out.println("Clicar no Carrinho");
		home.clicaCarrinho();

		System.out.println("Validar Mensagem de carrinho vazio");
		resumo.validaCarrinhoVazio();
	}

}
