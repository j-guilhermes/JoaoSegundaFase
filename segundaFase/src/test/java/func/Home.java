package func;

import tela.TelaHome;

public class Home {

	public void clicaAbaMulher() throws Exception {
		TelaHome home = new TelaHome();
		home.clicarAbaMulher();
		Thread.sleep(2000);
		home.selecionarProduto();
		Thread.sleep(5000);
		home.clicarProduto();

	}

	public void clicaCarrinho() throws Exception {
		TelaHome home = new TelaHome();
		home.clicarCarrinho();
	}

	public void clicaSignIn() throws Exception {
		TelaHome home = new TelaHome();
		home.clicarSignIn();
	}

	public void selecionaProduto() throws Exception {
		TelaHome home = new TelaHome();
		home.clicarProduto();
		Thread.sleep(5000);

	}

}
