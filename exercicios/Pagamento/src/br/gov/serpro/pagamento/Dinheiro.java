package br.gov.serpro.pagamento;

public class Dinheiro extends FormaPagamento {

	private static final double DESCONTO = 0.10;

	@Override
	protected boolean finalizar(double valor) {
		System.out.println("Recebendo em dinheiro R$ "+valor);
		return true;
	}

	@Override
	protected double calcularDesconto(double valor) {
		return valor * DESCONTO;
	}

}
