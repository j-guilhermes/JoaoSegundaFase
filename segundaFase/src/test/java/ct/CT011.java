package ct;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import abrirSite.AbrirSite;
import func.Endereco;
import func.Frete;
import func.Home;
import func.Login;
import func.Pagamento;
import func.Produtos;
import func.Resumo;

public class CT011 {

	Login login = new Login();
	Home home = new Home();
	Produtos produto = new Produtos();
	Resumo resumo = new Resumo();
	Endereco endereco = new Endereco();
	Frete frete = new Frete();
	Pagamento pagamento = new Pagamento();

	@Before
	public void setUp() throws Exception {
		AbrirSite site = new AbrirSite();
		site.iniciarDriver();

		System.out.println("CT010 - Validar criar novo endereço de entrega");
	}

	@After
	public void tearDown() throws Exception {
		AbrirSite site = new AbrirSite();
		try {

			Robot robot = new Robot();
			BufferedImage bi = robot.createScreenCapture(new Rectangle(1920, 1080));
			ImageIO.write(bi, "jpg",
					new File("C:\\Users\\Public\\Projetos\\JoaoSegundaFase\\segundaFase\\screen\\CT0011,jpg"));

		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

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

		System.out.println("Clicar no botão check out na tela Endereço");
		endereco.clicaCheckoutEndereco();

		System.out.println("Aceitar termo de serviços e clicar em check out");
		frete.selecionarFreteTermo();

		System.out.println("Selecionar forma de pagamento e confirmar pedido");
		pagamento.confirmaPedido();

	}

}
