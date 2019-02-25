package br.gov.serpro.conta;

import java.util.List;

import br.gov.serpro.banco.Extrato;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;

public abstract class ContaCorrente {
	public int numero;
	protected double saldo;
	
	protected abstract double calcularTaxaJuros();
	
	public abstract void efetuarRetirada(double valorRetirada) throws SaldoInsuficienteException, LimiteDeOperacoesExcedidasException;
	
	public void depositar(double valor) throws SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		this.saldo = this.saldo + valor;
		
	}

	public double obterSaldo() {
		return saldo;
	}

	public abstract List<Extrato> extrato(int numeroConta);

	public abstract void efetuarTransferencia(int numeroConta, int contaDestino, double valor) throws SaldoInsuficienteException, LimiteDeOperacoesExcedidasException;
	

}

