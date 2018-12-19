package br.gov.serpro.caixa24h;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;

public class CaixaVinteQuatroHoras {

	private Banco banco;

	public CaixaVinteQuatroHoras(Banco banco) {
		this.banco = banco;
	}

	public List<String> consultaExtrato(int numeroConta) throws ContaInexistenteException {
		return banco.consultarExtrato(numeroConta);
	}
	
	public BigDecimal consultaSaldo(int numeroConta) throws ContaInexistenteException {
		return banco.consultarSaldo(numeroConta);
	}	
	
	public Boolean efetuarTransferencia(int contaDestino, BigDecimal valor) throws SaldoInsuficienteException, ContaInexistenteException {
		return banco.efetuarTransferencia(contaDestino, valor);
	}

	public Boolean efetuarDeposito(BigDecimal valor) {
		return banco.efetuarDeposito(valor);
	}

	public Boolean efetuarSaque(BigDecimal valor) throws SaldoInsuficienteException {
		return banco.efetuarSaque(valor);
	}	
}
