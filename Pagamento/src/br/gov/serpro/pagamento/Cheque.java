package br.gov.serpro.pagamento;

public class Cheque extends FormaPagamento {

	private static final double DESCONTO = 0.05;

	@Override
	protected boolean finalizar(double valor) {
		System.out.println("Recebendo em cheque R$ "+valor);
		return verificarSpc();
	}
	
	private boolean verificarSpc() {
		return true;
	}

	@Override
	protected double calcularDesconto(double valor) {
		return valor * DESCONTO;
	}

}
