package br.gov.serpro.pagamento;

public class CartaoCredito extends FormaPagamento {

	private static final double DESCONTO = 0.00;

	@Override
	protected boolean finalizar(double valor) {
		System.out.println("Recebendo em cartão R$ "+valor);
		return verificarLimite(valor);
	}

	private boolean verificarLimite(double valor) {
		return true;
	}

	@Override
	protected double calcularDesconto(double valor) {
		return valor * DESCONTO;
	}

}
