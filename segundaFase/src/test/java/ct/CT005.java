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
		try {

			Robot robot = new Robot();
			BufferedImage bi = robot.createScreenCapture(new Rectangle(1366, 768));
			ImageIO.write(bi, "jpg",
					new File("C:\\Users\\Public\\Projetos\\JoaoSegundaFase\\segundaFase\\screen\\CT005,jpg"));

		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		site.fecharAplicacao();
	}

	@Test
	public void test() throws Exception {

		System.out.println("Selecionar produto na tela home");
		home.clicaAbaMulher();

		System.out.println("Selecionar quantidade, tamanho, cor e adicionar ao carrinho");
		produto.selecionaInformacoesDoProduto();

		System.out.println("Validar quantidade do carrinho");
		resumo.validaQuantidade();

	}

}
