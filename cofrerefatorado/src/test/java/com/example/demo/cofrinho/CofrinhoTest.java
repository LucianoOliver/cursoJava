package com.example.demo.cofrinho;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CofrinhoTest {

	Cofrinho cofrinho = new Cofrinho();
	Moeda moeda = new Moeda(ValorMoeda.UM_REAL);

	
	@Before
	public void setUp() throws Exception {
		cofrinho.adicionarMoeda(ValorMoeda.CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.DEZ_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.VINTE_CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.CINQUENTA_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.UM_REAL);
		cofrinho.adicionarMoeda(moeda);
	}


	@Test
	public void calcularQuantidadeTotalMoedasTest() {
	
		Integer resultadoEsperado = 6;
		assertEquals(resultadoEsperado, cofrinho.calcularQuantidadeTotalMoedas());
	}	
	
	@Test
	public void calcularQuantidadeTotalMoedas_NaoOtimizadoTest() {
	
		Integer resultadoEsperado = 6;
		assertEquals(resultadoEsperado, cofrinho.calcularQuantidadeTotalMoedas_NaoOtimizado());
	}
	
	@Test
	public void calcularValorTotalMoedasTest() {
		Double resultadoEsperado = 2.9;
		assertEquals(resultadoEsperado, cofrinho.calcularValorTotalMoedas());
	}
	
	@Test
	public void obterMaiorValorDaMoedaTest() {
		Double resultadoEsperado = 1.0;
		assertEquals(resultadoEsperado, cofrinho.obterValorDaMoedaDeMaiorValorDentroCofrinho());
	}
	
	@Test
	public void obterQuantidadeMoedasPorMoedaTest() {
		Integer resultadoEsperado = 1;
		
		assertEquals(resultadoEsperado, cofrinho.obterQuantidadeMoedasPorMoeda(ValorMoeda.CINCO_CENTAVOS));
	}

	@Test
	public void obterMaiorValorDaMoedaPorMoedasTest() {
		Integer resultadoEsperado = 1;
		
		Moeda moedaDeComparar = new Moeda(ValorMoeda.CINCO_CENTAVOS);
		assertEquals(resultadoEsperado, cofrinho.obterQuantidadeMoedasPorMoeda(moedaDeComparar));
	}


}
