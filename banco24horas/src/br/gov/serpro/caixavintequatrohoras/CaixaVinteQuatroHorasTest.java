package br.gov.serpro.caixavintequatrohoras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaixaVinteQuatroHorasTest {

	@Test
	public void consultaExtratoTest() {
		CaixaVinteQuatroHoras caixa24horas  = new CaixaVinteQuatroHoras();
		String extrato = caixa24horas.consultaExtrato(123456);	
		assertEquals("data: 10/11/2014 ; credito: 10000", extrato);
	}
	
	
	@Test
	public void consultaSaldoTest() {
		CaixaVinteQuatroHoras caixa24horas  = new CaixaVinteQuatroHoras();
		String saldo = caixa24horas.consultaSaldo(123456);	
		assertEquals("1000", saldo);
	}
	
	@Test
	public void efetuarTransferenciaTest() {
		CaixaVinteQuatroHoras caixa24horas  = new CaixaVinteQuatroHoras();
		String mensagem = caixa24horas.efetuarTransferencia(10000);	
		assertEquals("transferencia efetuado com sucesso", mensagem);
	}
	
	@Test
	public void efetuarDepoitoTest() {
		CaixaVinteQuatroHoras caixa24horas  = new CaixaVinteQuatroHoras();
		String mensagem = caixa24horas.efetuarDeposito(10000);	
		assertEquals("deposito efetuado com sucesso", mensagem);
	}

	
	@Test
	public void efetuarSaqueTest() {
		CaixaVinteQuatroHoras caixa24horas  = new CaixaVinteQuatroHoras();
		String mensagem = caixa24horas.efetuarSaque(10000);	
		assertEquals("saque efetuado com sucesso", mensagem);
	}


}
