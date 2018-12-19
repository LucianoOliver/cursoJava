package br.gov.serpro.caixa24h;

import java.math.BigDecimal;
import java.util.List;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;

public class BancoSantander implements Banco {

	public List<String> consultarExtrato(int numeroConta) throws ContaInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

	public BigDecimal consultarSaldo(int numeroConta) throws ContaInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean efetuarTransferencia(int contaDestino, BigDecimal valor)
			throws SaldoInsuficienteException, ContaInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean efetuarDeposito(BigDecimal valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean efetuarSaque(BigDecimal valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		return null;
	}

}
