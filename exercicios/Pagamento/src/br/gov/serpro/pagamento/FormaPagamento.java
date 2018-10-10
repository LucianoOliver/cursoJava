package br.gov.serpro.pagamento;

public abstract class FormaPagamento {

	protected abstract boolean finalizar(double d);
	protected abstract double calcularDesconto(double valor);

	public final boolean efetuar(double valor) {
		double desconto = calcularDesconto(valor);
		if (!validarDesconto(desconto, valor)) {
			return false;
		}
		return finalizar(valor - desconto);
	}

	private boolean validarDesconto(double desconto, double valor) {
		if (desconto < valor && desconto >= 0) {
			return true;
		}else {
			return false;
		}
	}
}
