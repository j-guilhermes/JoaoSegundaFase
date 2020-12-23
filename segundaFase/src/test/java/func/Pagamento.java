package func;

import tela.TelaPagamento;

public class Pagamento {

	public void pagamento() {

	}

	public void confirmaPedido() {
		TelaPagamento pagamento = new TelaPagamento();
		pagamento.selecionarTransferenciaBancaria();
		pagamento.clicarConfirmarPedido();
		pagamento.validarMensagemFinal();
	}

}
