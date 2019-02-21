package br.gov.serpro.banco.alpha;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import br.gov.serpro.banco.Extrato;
import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;
import br.gov.serpro.conta.ContaCorrente;
import br.gov.serpro.conta.ContaCorrentePremium;

public class BancoAlphaTest {

	@Test
	public void ConsultaExtratoComUmDepositotest() throws ContaInexistenteException {
		ContaCorrente conta = new ContaCorrentePremium();
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDeposito = 100.00;
		alpha.efetuarDeposito(numeroConta, valorDeposito);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		
		assertEquals(valorDeposito, consultarExtrato.get(0).getCredito(), 0);
		           
	}
	
	@Test
	public void ConsultaExtratoComMaisDeUmDepositotest() throws ContaInexistenteException {
		ContaCorrente conta = new ContaCorrentePremium();
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDepositoUm = 100.00;
		Double valorDepositoDois = 50.00;
		alpha.efetuarDeposito(numeroConta, valorDepositoUm);
		alpha.efetuarDeposito(numeroConta, valorDepositoDois);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		assertEquals(valorDepositoUm, consultarExtrato.get(0).getCredito(), 0);
		assertEquals(valorDepositoDois, consultarExtrato.get(1).getCredito(), 0);
		           
	}
	
	@Test
	public void ConsultaExtratoComMaisDeUmDepositoEUmaRetiradatest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException {
		ContaCorrente conta = new ContaCorrentePremium();
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDepositoUm = 100.00;
		Double valorDepositoDois = 50.00;
		Double valorSaque = 50.00;
		
		alpha.efetuarDeposito(numeroConta, valorDepositoUm);
		alpha.efetuarDeposito(numeroConta, valorDepositoDois);
		alpha.efetuarSaque(numeroConta, valorSaque);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		 Double consultarSaldo = alpha.consultarSaldo(numeroConta);
		 
		
		assertEquals(valorDepositoUm, consultarExtrato.get(0).getCredito(), 0);
		assertEquals(valorDepositoDois, consultarExtrato.get(1).getCredito(), 0);
		assertEquals(valorDepositoUm, consultarSaldo, 0);
		           
	}
	
	
	

}
