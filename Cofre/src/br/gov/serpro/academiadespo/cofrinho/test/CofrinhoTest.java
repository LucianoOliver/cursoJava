/**
 * 
 */
package br.gov.serpro.academiadespo.cofrinho.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.gov.serpro.academiadespo.cofrinho.Cofrinho;
import br.gov.serpro.academiadespo.cofrinho.ValorMoeda;

public class CofrinhoTest {
	
	Cofrinho cofrinho = new Cofrinho();


	@Before
	public void setUp() throws Exception {
		cofrinho.adicionarMoeda(ValorMoeda.CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.DEZ_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.VINTE_CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.CINQUENTA_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.UM_REAL);
	}


	@Test
	public void calcularQuantidadeTotalMoedasTest() {
	
		Integer resultadoEsperado = 5;
		assertEquals(resultadoEsperado, cofrinho.calcularQuantidadeTotalMoedas());
	}
	
	@Test
	public void calcularQuantidadeTotalMoedas_NaoOtimizadoTest() {
	
		Integer resultadoEsperado = 5;
		assertEquals(resultadoEsperado, cofrinho.calcularQuantidadeTotalMoedas_NaoOtimizado());
	}
	
	@Test
	public void calcularValorTotalMoedasTest() {
		Double resultadoEsperado = 1.9;
		assertEquals(resultadoEsperado, cofrinho.calcularValorTotalMoedas());
	}

}
