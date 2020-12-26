package func;

import tela.TelaProduto;

public class Produtos {
	public static String quantidadeCarrinho;

	public void selecionaInformacoesDoProduto() throws Exception {
		TelaProduto produto = new TelaProduto();
		Thread.sleep(5000);
		produto.digitarQuantidade("1");
		Thread.sleep(1000);
		produto.selecionarTamanho("M");
		Thread.sleep(1000);
		produto.selecionarCor("White");
		Thread.sleep(1000);
		produto.clicarAdicionarCarrinho();
		Thread.sleep(2000);
		produto.validarQuantidadeCarrinho();
		Thread.sleep(1000);
		produto.validarMensagemProdutoAdicionado();
		Thread.sleep(1000);
		produto.clicarFazerCheckOut();

	}

}
