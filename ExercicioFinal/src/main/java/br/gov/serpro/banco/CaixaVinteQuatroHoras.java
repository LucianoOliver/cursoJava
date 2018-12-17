package br.gov.serpro.banco;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.banco.exception.SaldoInsuficienteException;

public class CaixaVinteQuatroHoras {

	private Banco banco;

	public CaixaVinteQuatroHoras(Banco banco) {
		this.banco = banco;
	}

	public List<String> consultaExtrato(int numeroConta) {
		return banco.consultarExtrato(numeroConta);
	}
	
	public BigDecimal consultaSaldo(int numeroConta) {
		return banco.consultarSaldo(numeroConta);
	}	
	
	public Boolean efetuarTransferencia(int contaDestino, BigDecimal valor) throws SaldoInsuficienteException {
		return banco.efetuarTransferencia(contaDestino, valor);
	}

	public Boolean efetuarDeposito(BigDecimal valor) {
		return banco.efetuarDeposito(valor);
	}

	public Boolean efetuarSaque(BigDecimal valor) throws SaldoInsuficienteException {
		return banco.efetuarSaque(valor);
	}	
	

}
