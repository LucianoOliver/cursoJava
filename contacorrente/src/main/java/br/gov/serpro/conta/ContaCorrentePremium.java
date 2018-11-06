package br.gov.serpro.conta;

public class ContaCorrentePremium extends ContaCorrente {
	
	private static final int CEM = 100;
	private static final int SEIS = 6;
	private static final int UM_PORCENTO = 1;

	@Override
	public void depositar(double valor) {
		double valorCorrigido = obterValorCorrigido(valor);
		this.saldo = this.saldo + valorCorrigido;
	}

	
	@Override
	public double calcularTaxaJuros() {
		return UM_PORCENTO;
	}
	
	private double obterValorCorrigido(double valor) {
		double valorCorrigido = valor + (valor  * SEIS)/CEM;
		return valorCorrigido;
	}
	

}
