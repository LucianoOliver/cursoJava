package br.gov.serpro.conta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.gov.serpro.banco.Extrato;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;

public class ContaCorrentePremium extends ContaCorrente {
	
	private static final double PORCENTAGEM_BONIFICACAO = 1.06;
	private static final int TAXA_JUROS_CONTA_PREMIUM = 1;
    private static final double LIMITE_SALDO_PREMIUM = 1000.00;
    private List<Extrato> listaExtratos = new ArrayList<Extrato>();


	@Override
	public void depositar(double valor) {
		
		//double valorCorrigido = obterValorCorrigido(valor);
		this.saldo = this.saldo + valor;
		Extrato extrato = new Extrato("Deposito", LocalDate.now(), valor, 0);
		listaExtratos.add(extrato);
	}
	
	@Override
	public void efetuarTransferencia(int numeroConta, int contaDestino, double valor) throws SaldoInsuficienteException {
		efetuarRetirada(valor);
		Extrato extrato = new Extrato("Transferencia", LocalDate.now(), 0, valor);
		listaExtratos.add(extrato);
	}

	
	@Override
	public double calcularTaxaJuros() {
		return TAXA_JUROS_CONTA_PREMIUM;
	}
	
	private double obterValorCorrigido(double valor) {
		return valor * PORCENTAGEM_BONIFICACAO;
	}


	@Override
	public void efetuarRetirada(double valorRetirada) throws SaldoInsuficienteException {
		this.saldo = this.saldo - valorRetirada;
		if(saldo < - LIMITE_SALDO_PREMIUM ) {
			 throw new SaldoInsuficienteException("Saldo insuficiente");
		}
	}


	@Override
	public List<Extrato> extrato(int numeroConta) {
		return listaExtratos;
		
	}
}
