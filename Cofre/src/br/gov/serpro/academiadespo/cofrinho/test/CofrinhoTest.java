/**
 * 
 */
package br.gov.serpro.academiadespo.cofrinho.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.gov.serpro.academiadespo.cofrinho.Cofrinho;
import br.gov.serpro.academiadespo.cofrinho.Moeda;
import br.gov.serpro.academiadespo.cofrinho.ValorMoeda;

/**
 * @author 25918442839
 *
 */
class CofrinhoTest {
	
	Cofrinho cofrinho = new Cofrinho();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cofrinho.adicionarMoeda(ValorMoeda.CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.DEZ_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.VINTE_CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.CINQUENTA_CENTAVOS);
		cofrinho.adicionarMoeda(ValorMoeda.UM_REAL);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void calcularQuantidadeTotalMoedasTest() {
	
		Integer resultadoEsperado = 5;
		assertEquals(resultadoEsperado, cofrinho.calcularQuantidadeTotalMoedas());
	}
	
	@Test
	void calcularQuantidadeTotalMoedas_NaoOtimizadoTest() {
	
		Integer resultadoEsperado = 5;
		assertEquals(resultadoEsperado, cofrinho.calcularQuantidadeTotalMoedas_NaoOtimizado());
	}
	
	@Test
	void calcularValorTotalMoedasTest() {
		Double resultadoEsperado = 1.9;
		assertEquals(resultadoEsperado, cofrinho.calcularValorTotalMoedas());
	}
	
	

}
