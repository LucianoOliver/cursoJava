package br.gov.serpro.conta;

import java.util.List;

import br.gov.serpro.banco.Extrato;

public class ContaCorrenteRegular extends ContaCorrente {

	private static final int TAXA_JUROS_CONTA_REGULAR = 5;

	@Override
	public double calcularTaxaJuros() {
		return TAXA_JUROS_CONTA_REGULAR;
	}

	@Override
	public void efetuarRetirada(double valorRetirada) throws SaldoInsuficienteException {
		this.saldo = this.saldo - valorRetirada;
		if(saldo < 0) {
			 throw new SaldoInsuficienteException("Saldo insuficiente");
		}
	}

	@Override
	public List<Extrato> extrato(int numeroConta) {
		return null;
	}

	@Override
	public void efetuarTransferencia(double valor) {
		// TODO Auto-generated method stub
		
	}

}
