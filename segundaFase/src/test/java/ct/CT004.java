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
import func.Login;

public class CT004 {

	Login login = new Login();
	Home home = new Home();

	@Before
	public void setUp() throws Exception {
		AbrirSite site = new AbrirSite();
		site.iniciarDriver();

		System.out.println("CT004 - Validar login efetuado com sucesso");

	}

	@After
	public void tearDown() throws Exception {
		AbrirSite site = new AbrirSite();
		
		try {

			Robot robot = new Robot();
			BufferedImage bi = robot.createScreenCapture(new Rectangle(1366, 768));
			ImageIO.write(bi, "jpg",
					new File("C:\\Users\\Public\\Projetos\\JoaoSegundaFase\\segundaFase\\screen\\CT004,jpg"));

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

	}

}
