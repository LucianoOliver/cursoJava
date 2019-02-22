package br.gov.serpro.banco.alpha;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.gov.serpro.banco.Extrato;
import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;
import br.gov.serpro.conta.ContaCorrente;
import br.gov.serpro.conta.ContaCorrentePremium;
import br.gov.serpro.conta.ContaCorrenteRegular;
import br.gov.serpro.conta.LimiteDeOperacoesExcedidasException;

public class BancoAlphaTest {

	@Test
	public void ConsultaExtratoComUmDepositoContaCorrentePremiotest() throws ContaInexistenteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrentePremium();
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDeposito = 100.00;
		alpha.efetuarDeposito(numeroConta, valorDeposito);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		
		assertEquals(valorDeposito, consultarExtrato.get(0).getCredito(), 0);
		           
	}
	
	@Test
	public void ConsultaExtratoComMaisDeUmDepositoCorrentePremiotest() throws ContaInexistenteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
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
	public void ConsultaExtratoComMaisDeUmDepositoEUmaRetiradaCorrentePremiotest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
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
		assertEquals("Deposito", consultarExtrato.get(0).getAcao());
		assertEquals("Deposito", consultarExtrato.get(1).getAcao());
		assertEquals(valorDepositoUm, consultarSaldo, 0);          
	}
	
	@Test
	public void ConsultaExtratoComTransferenciaCorrentePremiotest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrentePremium();
		int numeroConta = 1;
		int numeroContaDestino = 2;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorTransferencia = 100.00;
		alpha.efetuarTransferencia(numeroConta, numeroContaDestino, valorTransferencia);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroContaDestino);		 
		assertEquals(0, consultarExtrato.get(0).getCredito(), 0);
		assertEquals(100, consultarExtrato.get(0).getDebito(), 0);
		assertEquals("Transferencia", consultarExtrato.get(0).getAcao());          
	}
	
	@Test
	public void ConsultaExtratoComUmDepositoContaCorrenteRegulartest() throws ContaInexistenteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrenteRegular();
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDeposito = 100.00;
		alpha.efetuarDeposito(numeroConta, valorDeposito);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		
		assertEquals(valorDeposito, consultarExtrato.get(0).getCredito(), 0);
		           
	}
	
	@Test
	public void ConsultaExtratoComMaisDeUmDepositoContaCorrenteRegulartest() throws ContaInexistenteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrenteRegular();
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
	public void ConsultaExtratoComTransferenciaContaCorrenteRegulartest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrenteRegular();
		int numeroConta = 1;
		int numeroContaDestino = 2;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorTransferencia = 100.00;
		Double valorDeposito = 100.00;
		alpha.efetuarDeposito(numeroContaDestino, valorDeposito);
		alpha.efetuarTransferencia(numeroConta, numeroContaDestino, valorTransferencia);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroContaDestino);		 
		assertEquals(100, consultarExtrato.get(0).getCredito(), 0);
		assertEquals(0, consultarExtrato.get(0).getDebito(), 0);
		assertEquals("Deposito", consultarExtrato.get(0).getAcao());          
		assertEquals("Transferencia", consultarExtrato.get(1).getAcao());          
	}
	
	@Test
	public void ConsultaExtratoComMaisDeUmDepositoEUmaRetiradaContaCorrenteRegulartest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrenteRegular();
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
		assertEquals("Deposito", consultarExtrato.get(0).getAcao());
		assertEquals("Deposito", consultarExtrato.get(1).getAcao());
		assertEquals(valorDepositoUm, consultarSaldo, 0);          
	}
	
	@Test(expected = LimiteDeOperacoesExcedidasException.class)
	public void DeveRetornarExcecaoQuandoMaisDeTresOperacoesNaContaCorrenteRegulartest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrenteRegular();
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDepositoUm = 100.00;
		Double valorDepositoDois = 50.00;
		Double valorSaque = 50.00;
		alpha.efetuarDeposito(numeroConta, valorDepositoUm);
		alpha.efetuarDeposito(numeroConta, valorDepositoDois);
		alpha.efetuarDeposito(numeroConta, valorDepositoDois);
		alpha.efetuarSaque(numeroConta, valorSaque);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		 Double consultarSaldo = alpha.consultarSaldo(numeroConta);
		assertEquals(valorDepositoUm, consultarExtrato.get(0).getCredito(), 0);
		assertEquals(valorDepositoDois, consultarExtrato.get(1).getCredito(), 0);
		assertEquals("Deposito", consultarExtrato.get(0).getAcao());
		assertEquals("Deposito", consultarExtrato.get(1).getAcao());
		assertEquals(valorDepositoUm, consultarSaldo, 0);          
	}
	
	@Test(expected = ContaInexistenteException.class)
	public void DeveRetornarExcecaoQuandoContaInexistenteMaisDeTresOperacoesNaContaCorrenteRegulartest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = null;
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDepositoUm = 100.00;
		Double valorDepositoDois = 50.00;
		Double valorSaque = 50.00;
		alpha.efetuarDeposito(numeroConta, valorDepositoUm);
		alpha.efetuarDeposito(numeroConta, valorDepositoDois);
		alpha.efetuarDeposito(numeroConta, valorDepositoDois);
		alpha.efetuarSaque(numeroConta, valorSaque);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		 Double consultarSaldo = alpha.consultarSaldo(numeroConta);
		assertEquals(valorDepositoUm, consultarExtrato.get(0).getCredito(), 0);
		assertEquals(valorDepositoDois, consultarExtrato.get(1).getCredito(), 0);
		assertEquals("Deposito", consultarExtrato.get(0).getAcao());
		assertEquals("Deposito", consultarExtrato.get(1).getAcao());
		assertEquals(valorDepositoUm, consultarSaldo, 0);          
	}
	
	@Test(expected = br.gov.serpro.conta.SaldoInsuficienteException.class)
	public void DeveRetornarExcecaoQuandoSaldoInsuficienteMaisDeTresOperacoesNaContaCorrenteRegulartest() throws ContaInexistenteException, SaldoInsuficienteException, br.gov.serpro.conta.SaldoInsuficienteException, LimiteDeOperacoesExcedidasException {
		ContaCorrente conta = new ContaCorrenteRegular();
		int numeroConta = 1;
		BancoAlpha alpha = new BancoAlpha(conta);
		Double valorDepositoUm = 100.00;
		Double valorDepositoDois = 100.01;
		Double valorSaque = 100.01;
		alpha.efetuarDeposito(numeroConta, valorDepositoUm);
		alpha.efetuarSaque(numeroConta, valorSaque);
		List<Extrato> consultarExtrato = alpha.consultarExtrato(numeroConta);
		Double consultarSaldo = alpha.consultarSaldo(numeroConta);
		assertEquals(valorDepositoUm, consultarExtrato.get(0).getCredito(), 0);
		assertEquals(valorDepositoDois, consultarExtrato.get(1).getCredito(), 0);
		assertEquals("Deposito", consultarExtrato.get(0).getAcao());
		assertEquals("Deposito", consultarExtrato.get(1).getAcao());
		assertEquals(valorDepositoUm, consultarSaldo, 0);          
	}
	
	
}
