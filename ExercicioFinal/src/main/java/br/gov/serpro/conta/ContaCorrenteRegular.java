package br.gov.serpro.conta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.gov.serpro.banco.Extrato;

public class ContaCorrenteRegular extends ContaCorrente {

	private static final int TAXA_JUROS_CONTA_REGULAR = 5;
	private  int operacoesPorDia= 3;
	private List<Extrato> listaExtratos = new ArrayList<Extrato>();

	@Override
	public void depositar(double valor) throws LimiteDeOperacoesExcedidasException {
		
		if (operacoesPorDia <= 0) {
			throw new LimiteDeOperacoesExcedidasException("Número de Operações excedidas");
		}

		// double valorCorrigido = obterValorCorrigido(valor);
		this.saldo = this.saldo + valor;
		Extrato extrato = new Extrato("Deposito", LocalDate.now(), valor, 0);
		listaExtratos.add(extrato);
		operacoesPorDia =  operacoesPorDia -1;
	}

	@Override
	public double calcularTaxaJuros() {
		return TAXA_JUROS_CONTA_REGULAR;
	}

	@Override
	public void efetuarRetirada(double valorRetirada) throws SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		
		if (operacoesPorDia <= 0) {
			throw new LimiteDeOperacoesExcedidasException("Número de Operações excedidas");
		}
		this.saldo = this.saldo - valorRetirada;
		if (saldo < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		operacoesPorDia =  operacoesPorDia -1;
	}

	
	@Override
	public List<Extrato> extrato(int numeroConta) {
		return listaExtratos;
		
	}

	@Override
	public void efetuarTransferencia(int numeroConta, int contaDestino, double valor)
			throws SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		efetuarRetirada(valor);
	//	this.saldo = this.saldo + valor;
		Extrato extrato = new Extrato("Transferencia", LocalDate.now(), 0, valor);
		listaExtratos.add(extrato);
	}

}
