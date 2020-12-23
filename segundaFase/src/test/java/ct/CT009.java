package ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abrirSite.AbrirSite;
import func.Endereco;
import func.Home;
import func.Login;
import func.Produtos;
import func.Resumo;

public class CT009 {

	Login login = new Login();
	Home home = new Home();
	Produtos produto = new Produtos();
	Resumo resumo = new Resumo();
	Endereco endereco = new Endereco();

	@Before
	public void setUp() throws Exception {
		AbrirSite site = new AbrirSite();
		site.iniciarDriver();

		System.out.println("CT009 - Validar atualizar endereço de entrega");

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

		System.out.println("Realizar Login");
		login.digitaLogin();

		System.out.println("Selecionar produto na tela home");
		home.clicaAbaMulher();

		System.out.println("Selecionar quantidade, tamanho, cor e adicionar ao carrinho");
		produto.selecionaInformacoesDoProduto();

		System.out.println("Validar quantidade do carrinho");
		resumo.validaQuantidade();

		System.out.println("Clicar no botão check out na tela Resumo");
		resumo.clicaBotaoCheckOutResumo();

		System.out.println("Atualizar endereço");
		endereco.atualizarEndereco();
	}

}
