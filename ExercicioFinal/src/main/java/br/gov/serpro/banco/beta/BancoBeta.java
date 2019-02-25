package br.gov.serpro.banco.beta;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.banco.BancoGeral;
import br.gov.serpro.banco.Extrato;
import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;
import br.gov.serpro.conta.ContaCorrente;
import br.gov.serpro.conta.LimiteDeOperacoesExcedidasException;

public class BancoBeta implements BancoGeral  {
	
	ContaCorrente conta;
	public BancoBeta(ContaCorrente conta) throws ContaInexistenteException {
		if(conta == null) {
			throw new ContaInexistenteException("Conta inexistente");
		}
		
	this.conta = conta;
	}

	public List<Extrato> consultarExtrato(int numeroConta) throws ContaInexistenteException {
		if(numeroConta <= 0) {
			throw new ContaInexistenteException("número da Conta inexistente");
		}
		return conta.extrato(numeroConta);
	}

	public Double consultarSaldo(int numeroConta) throws ContaInexistenteException {
		
		return conta.obterSaldo();
	}

	public void efetuarTransferencia(int numeroConta, int contaDestino, Double valor)
			throws SaldoInsuficienteException, ContaInexistenteException, SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		
		conta.efetuarTransferencia(numeroConta, contaDestino, valor);
		
		
	}

	public void efetuarDeposito(int numeroConta, Double valor) throws SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		 conta.depositar(valor);
		
	}

	public void efetuarSaque(int numeroConta, Double valor) throws SaldoInsuficienteException, SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		conta.efetuarRetirada(valor);
		
		
	}

}
