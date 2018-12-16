package br.gov.serpro.caixavintequatrohoras;

import java.math.BigDecimal;
import java.util.List;

public class Alfa implements Banco {

	@Override
	public List<String> consultarExtrato(int numeroConta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal consultarSaldo(int numeroConta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean efetuarTransferencia(int contaDestino, BigDecimal valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean efetuarDeposito(BigDecimal valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean efetuarSaque(BigDecimal valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
