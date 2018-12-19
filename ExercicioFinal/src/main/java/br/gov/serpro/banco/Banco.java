package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;

public interface Banco {
	
	 List<String> consultarExtrato(int numeroConta) throws ContaInexistenteException;	
	 BigDecimal consultarSaldo(int numeroConta)throws ContaInexistenteException;	
	 Boolean efetuarTransferencia(int contaDestino, BigDecimal valor) throws SaldoInsuficienteException, ContaInexistenteException;;	
	 Boolean efetuarDeposito(BigDecimal valor);	
	 Boolean efetuarSaque(BigDecimal valor) throws SaldoInsuficienteException;
	
}
