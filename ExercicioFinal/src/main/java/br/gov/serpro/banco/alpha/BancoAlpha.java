package br.gov.serpro.banco.alpha;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.banco.BancoGeral;
import br.gov.serpro.banco.Extrato;
import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;
import br.gov.serpro.conta.ContaCorrente;

public class BancoAlpha implements BancoGeral  {
	
	ContaCorrente conta;
	public BancoAlpha(ContaCorrente conta) {
	this.conta = conta;
	}

	public List<Extrato> consultarExtrato(int numeroConta) throws ContaInexistenteException {
		
		return conta.extrato(numeroConta);
	}

	public Double consultarSaldo(int numeroConta) throws ContaInexistenteException {
		
		return conta.obterSaldo();
	}

	public void efetuarTransferencia(int numeroConta, int contaDestino, BigDecimal valor)
			throws SaldoInsuficienteException, ContaInexistenteException {
		
		
	}

	public void efetuarDeposito(int numeroConta, Double valor) {
		 conta.depositar(valor);
		
	}

	public void efetuarSaque(int numeroConta, Double valor) throws SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException {
		conta.efetuarRetirada(valor);
		
		
	}

	public void efetuarDeposito(int numeroConta, BigDecimal valor) {
		// TODO Auto-generated method stub
		
	}

	public void efetuarSaque(int numeroConta, BigDecimal valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		
	}


}
