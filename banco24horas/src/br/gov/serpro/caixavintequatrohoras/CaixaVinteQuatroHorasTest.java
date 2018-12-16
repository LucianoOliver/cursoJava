package br.gov.serpro.caixavintequatrohoras;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;


public class CaixaVinteQuatroHorasTest {
	Banco bancoMock = Mockito.mock(Banco.class);
	

	@Test
	public void consultaExtratoTest() {
		int numeroConta = 123456;
		List<String> extrato = new ArrayList<>();
		extrato.add(1, "data: 10/11/2014 ; credito: 10000");
		
		Mockito.when(bancoMock.consultarExtrato(numeroConta))
		.thenReturn(extrato);

		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(bancoMock);
		assertEquals(extrato, caixa24horas.consultaExtrato(123456));
		
	}
	
	@Test
	public void consultaExtratoBetaTest() {
		Banco banco = new Beta();

		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(banco);
		List<String> extrato = caixa24horas.consultaExtrato(123456);
		assertEquals("data: 10/11/2014 ; credito: 10000", extrato);
		
	}


	@Test
	public void consultaSaldoTest() {
		Banco banco = new Alfa();

		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(banco);
		BigDecimal saldo = caixa24horas.consultaSaldo(123456);
		assertEquals("1000", saldo);
	}

	@Test
	public void efetuarTransferenciaTest() throws SaldoInsuficienteException {
		Banco banco = new Alfa();
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(banco);
		Boolean mensagem = caixa24horas.efetuarTransferencia(10000, null);
		assertEquals("transferencia efetuado com sucesso", mensagem);
	}

	@Test
	public void efetuarDepoitoTest() {
		Banco banco = new Alfa();
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(banco);
		BigDecimal valorDeposito = new BigDecimal(10000);
		Boolean mensagem = caixa24horas.efetuarDeposito(valorDeposito);
		assertEquals("deposito efetuado com sucesso", mensagem);
	}

	@Test
	public void efetuarSaqueTest() throws SaldoInsuficienteException {
		Banco banco = new Alfa();
		CaixaVinteQuatroHoras caixa24horas = new CaixaVinteQuatroHoras(banco);
		BigDecimal valorSaque = new BigDecimal(10000);
		Boolean mensagem = caixa24horas.efetuarSaque(valorSaque);
		assertEquals("saque efetuado com sucesso", mensagem);
	}

}
