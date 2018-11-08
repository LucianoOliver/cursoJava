package br.gov.serpro.conta;

public abstract class ContaCorrente {
	protected double saldo;
	
	protected abstract double calcularTaxaJuros();
	
	protected abstract void efetuarRetirada(double valorRetirada) throws SaldoInsuficienteException;
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}

	public double obterSaldo() {
		return saldo;
	}

}
