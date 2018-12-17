package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.banco.exception.SaldoInsuficienteException;

public interface Banco {
	
	public List<String> consultarExtrato(int numeroConta);	
	public BigDecimal consultarSaldo(int numeroConta);	
	public Boolean efetuarTransferencia(int contaDestino, BigDecimal valor) throws SaldoInsuficienteException;	
	public Boolean efetuarDeposito(BigDecimal valor);	
	public Boolean efetuarSaque(BigDecimal valor) throws SaldoInsuficienteException;
	
}
