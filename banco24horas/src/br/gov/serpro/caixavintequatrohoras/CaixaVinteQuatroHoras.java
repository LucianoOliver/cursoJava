package br.gov.serpro.caixavintequatrohoras;

import java.math.BigDecimal;
import java.util.List;

public class CaixaVinteQuatroHoras {

	private Banco banco;

	public CaixaVinteQuatroHoras(Banco banco) {
		this.banco = banco;
	}

	public List<String> consultaExtrato(int numeroConta) {
		return banco.consultarExtrato(numeroConta);
//		String extrato = "data: 10/11/2014 ; credito: 10000";
//		return extrato;
	}
	
	public BigDecimal consultaSaldo(int numeroConta) {
		return banco.consultarSaldo(numeroConta);
//		String saldo = "1000";
//		return saldo;
	}	
	
	public Boolean efetuarTransferencia(int contaDestino, BigDecimal valor) throws SaldoInsuficienteException {
		return banco.efetuarTransferencia(contaDestino, valor);
//		String mensagem = "transferencia efetuado com sucesso";
//		return mensagem;
	}

	public Boolean efetuarDeposito(BigDecimal valor) {
		return banco.efetuarDeposito(valor);
//		String mensagem = "deposito efetuado com sucesso";
//		return mensagem;
	}

	public Boolean efetuarSaque(BigDecimal valor) throws SaldoInsuficienteException {
		return banco.efetuarSaque(valor);
//		String mensagem = "saque efetuado com sucesso";
//		return mensagem;
	}	
	

}
