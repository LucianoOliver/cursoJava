package br.gov.serpro.conta;

public class ContaCorrentePremium extends ContaCorrente {
	
	private static final double PORCENTAGEM_BONIFICACAO = 1.06;
	private static final int TAXA_JUROS_CONTA_PREMIUM = 1;

	@Override
	public void depositar(double valor) {
		double valorCorrigido = obterValorCorrigido(valor);
		this.saldo = this.saldo + valorCorrigido;
	}

	
	@Override
	public double calcularTaxaJuros() {
		return TAXA_JUROS_CONTA_PREMIUM;
	}
	
	private double obterValorCorrigido(double valor) {
		double valorCorrigido = valor * PORCENTAGEM_BONIFICACAO;
		return valorCorrigido;
	}
	

}
