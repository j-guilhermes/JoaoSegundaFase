package func;

import tela.TelaEndereco;
import tela.TelaResumo;

public class Endereco {

	public void endereco() {

	}

	public void atualizarEndereco() throws InterruptedException {
		TelaEndereco endereco = new TelaEndereco();
		endereco.clicarAtualizarEndereco();
		endereco.digitarEndereco("travessa colorado do sasl");
		Thread.sleep(1000);
		endereco.digitarNumero("1101");
		endereco.digitarCidade("SP");
		endereco.selecionarEstado("Califórnia");
		Thread.sleep(1000);
		endereco.clicarSalvar();
		Thread.sleep(3000);
		endereco.validarEnderecoAtualizado();
		if (!TelaResumo.enderecoAtual.equals(TelaEndereco.enderecoAtualizado)) {
			System.out.println("Endereço Atualizado com sucesso\n" + "Endereço atual: " + TelaResumo.enderecoAtual
					+ "\nEndereço atualizado: " + TelaEndereco.enderecoAtualizado);
		} else {
			System.out.println("Endereço não atualizado");

		}
	}

	public void adicionarNovoEndereco() throws Exception {
		TelaEndereco endereco = new TelaEndereco();

		endereco.clicarAdicionarNovoEndereco();
		Thread.sleep(2000);
		endereco.digitarEndereco("rua pari");
		Thread.sleep(1000);
		endereco.digitarNumero("110");
		Thread.sleep(1000);
		endereco.digitarCidade("United States");
		Thread.sleep(1000);
		endereco.selecionarEstado("alaska");
		Thread.sleep(1000);
		endereco.digitarCEP("00000");
		Thread.sleep(1000);
		endereco.digitarTelefone("41170226");
		Thread.sleep(1000);
		endereco.digitarCelular("988776655");
		Thread.sleep(1000);
		endereco.digitarReferencia("cas3a");
		Thread.sleep(1000);
		endereco.guardarEndereco();
		Thread.sleep(1000);
		endereco.clicarSalvar();
		Thread.sleep(1000);
		endereco.validarEnderecoAtualizado();
		if (!TelaEndereco.enderecoAtualizado.equals(TelaEndereco.enderecos)) {
			System.out.println("Endereço cadastrado com sucesso" + TelaEndereco.enderecoAtualizado + " - "
					+ TelaEndereco.enderecos);
		} else {
			System.out.println("Endereço não adicionado");
		}
	}

	public void clicaCheckoutEndereco() throws InterruptedException {
		TelaEndereco endereco = new TelaEndereco();
	Thread.sleep(2000);
		endereco.clicarBotaoCheckOut();

	}

}