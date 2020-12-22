package func;

import tela.TelaResumo;

public class Resumo {

	public void validaCardVazio() throws Exception {

		TelaResumo resumo = new TelaResumo();
		resumo.validarCarrinhoVazio();

	}

	public void validarQuantidade() throws InterruptedException {
		TelaResumo resumo = new TelaResumo();
		Thread.sleep(3000);
		resumo.validarQuantidade();

	}

}
