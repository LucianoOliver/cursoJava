package br.gov.serpro.caixa24h;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import br.gov.serpro.banco.Banco;
import br.gov.serpro.caixa24h.CaixaVinteQuatroHoras;
import br.gov.serpro.caixa24h.exception.ContaInexistenteException;
import br.gov.serpro.caixa24h.exception.SaldoInsuficienteException;

public class CaixaVinteQuatroHorasTest {

	Banco bancoMock = Mockito.mock(Banco.class);
	
	private int numeroConta;
	private int contaDestino;

	private Banco bancoSantander = new BancoSantander();
	
	

	@Before
	public void inicializa() {
		 numeroConta = 123456;
		 contaDestino = 12345678;
	}

	//@Test
	@Test(expected = ContaInexistenteException.class)
	public void deveRetornarUmaConsultaDoExtrato() throws ContaInexistenteException {

		List<String> extrato = new ArrayList<String>();
		extrato.add("data: 10/11/2014 ; credito: 10000");

		Mockito.when(bancoMock.consultarExtrato(numeroConta)).thenReturn(extrato);

		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(bancoMock);

		List<String> consultaExtrato = caixa24horas.consultaExtrato(123456);

		assertEquals(extrato.get(0), consultaExtrato.get(0));
		assertEquals(extrato.size(), consultaExtrato.size());
	}
	
	
	
	@Test(expected = ContaInexistenteException.class)
	public void naoDevePermitirNumeroContaInexistenteNaConsultaExtrato() throws ContaInexistenteException {
		
		List<String> extrato = new ArrayList<String>();
		extrato.add("data: 10/11/2014 ; credito: 10000");
		//Mockito.doThrow(ContaInexistenteException.class).when(bancoMock.consultarExtrato(numeroConta));
	    //Mockito.when(bancoMock.consultarExtrato(numeroConta)).thenThrow(new ContaInexistenteException("testes"));
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(bancoSantander);
		caixa24horas.consultaExtrato(123456);
		//assertEquals("ssssss",  caixa24horas.consultaExtrato(123456));
	}
	

	@Test
	public void consultaSaldoTest() throws ContaInexistenteException {
		BigDecimal saldoRetornado = new BigDecimal(10000);
		Mockito.when(bancoMock.consultarSaldo(numeroConta)).thenReturn(saldoRetornado);
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(bancoMock);
		BigDecimal consultaSaldo = caixa24horas.consultaSaldo(numeroConta);
		assertEquals(saldoRetornado, consultaSaldo);
	}

	@Test
	public void efetuarTransferenciaTest() throws SaldoInsuficienteException, ContaInexistenteException {
		BigDecimal valorTransferico = new BigDecimal(10000);
		Mockito.when(bancoMock.efetuarTransferencia(contaDestino, valorTransferico)).thenReturn(true);
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(bancoMock);
		Boolean transferenciaComSucesso = caixa24horas.efetuarTransferencia(contaDestino, valorTransferico);
		assertTrue(transferenciaComSucesso);
	}

	@Test
	public void efetuarDepoitoTest() {
		BigDecimal valorDepositado = new BigDecimal(10000);
		Mockito.when(bancoMock.efetuarDeposito(valorDepositado)).thenReturn(true);
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(bancoMock);
		Boolean depositoComSucesso = caixa24horas.efetuarDeposito(valorDepositado);
		assertTrue(depositoComSucesso);
	}

	@Test
	public void efetuarSaqueTest() throws SaldoInsuficienteException {
		BigDecimal valorSaque = new BigDecimal(10000);
		Mockito.when(bancoMock.efetuarSaque(valorSaque)).thenReturn(true);
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(bancoMock);
		Boolean saqueComSucesso = caixa24horas.efetuarSaque(valorSaque);
		assertTrue(saqueComSucesso);
	}

}
