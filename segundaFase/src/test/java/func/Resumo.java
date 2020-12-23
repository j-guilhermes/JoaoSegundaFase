package func;

import tela.TelaResumo;

public class Resumo {
	
	public void resumo() {
		
	}

	static String qtd;

	public void validaCarrinhoVazio() throws Exception {

		TelaResumo resumo = new TelaResumo();
		Thread.sleep(2000);
		resumo.validarCarrinhoVazio();

	}

	public void validaQuantidade() throws InterruptedException {
		TelaResumo resumo = new TelaResumo();
		Thread.sleep(3000);
		resumo.validarQuantidade();

	}

	public void excluiProdutoCarrinho() throws Exception {
		TelaResumo resumo = new TelaResumo();

		int valor = Integer.parseInt(TelaResumo.quantidadeObtidaCarrinho);

		if (valor >= 1) {

			resumo.excluirItemCarrinho();

		} else {
			validaCarrinhoVazio();

		}

	}

	public void clicaBotaoCheckOutResumo() {
		TelaResumo resumo = new TelaResumo();
		resumo.guardarEnderecoAtual();
		resumo.clicarBotaoCheckOut();
	}

}
