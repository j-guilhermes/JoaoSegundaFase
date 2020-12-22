package ct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abrirSite.AbrirSite;
import func.Home;
import func.Produtos;
import func.Resumo;

public class CT005 {

	Home home = new Home();
	Produtos produto = new Produtos();
	Resumo resumo = new Resumo();

	@Before
	public void setUp() throws Exception {
		AbrirSite site = new AbrirSite();
		site.iniciarDriver();

		System.out.println("CT005 - Validar inclusão de produto carrinho deslogado");

	}

	@After
	public void tearDown() throws Exception {
		AbrirSite site = new AbrirSite();
		site.fecharAplicacao();
	}

	@Test
	public void test() throws Exception {

		System.out.println("Selecionar produto na tela home");
		home.clicaAbaMulher();

		System.out.println("Selecionar quantidade, tamanho, cor e adicionar ao carrinho");
		produto.selecionaInformacoesDoProduto();

		System.out.println("Validar quantidade do carrinho");
		resumo.validarQuantidade();

	}

}
