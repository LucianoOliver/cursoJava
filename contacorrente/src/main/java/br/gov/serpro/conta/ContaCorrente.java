package br.gov.serpro.conta;

public abstract class ContaCorrente {
	protected double saldo;
	
	protected abstract double calcularTaxaJuros();
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}

	public double obterSaldo() {
		return saldo;
	}

	public void efetuarRetirada(double valorRetirada) throws SaldoInsuficienteException {
		
		if(saldo < 0) {
			 throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		
		this.saldo = saldo - valorRetirada;
		
		
		
	}

}
