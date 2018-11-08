package br.gov.serpro.conta;

public class ContaCorrentePremium extends ContaCorrente {
	
	private static final double PORCENTAGEM_BONIFICACAO = 1.06;
	private static final int TAXA_JUROS_CONTA_PREMIUM = 1;
    private static double LIMITE_SALDO_PREMIUM = 50.00;


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
		return valorCorrigido + LIMITE_SALDO_PREMIUM;
	}


	@Override
	public void efetuarRetirada(double valorRetirada) throws SaldoInsuficienteException {
		
		this.saldo = this.saldo - valorRetirada;
		if(saldo < -LIMITE_SALDO_PREMIUM ) {
			 throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		
	}
	

}
