package func;

import tela.TelaFrete;

public class Frete {

	public void frete() {

	}

	public void selecionarFreteTermo() throws InterruptedException {
		TelaFrete frete = new TelaFrete();
		Thread.sleep(2000);
		frete.clicarAceitarTermo();
		frete.clicarChekout();

	}

}
