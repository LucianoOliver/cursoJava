package br.gov.serpro.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EntregaTest {

	@Test
	void calculaPrecoTotalDomingoComDistanciaMaiorQueCinquentaQuilometro() {
		Entrega entrega = new Entrega("Domingo", 51);
		
		entrega.calculaValorEntrega();
		System.out.println(entrega.calculaValorEntrega());
		Double valorEsperado = new Double(20.0);
		assertEquals(valorEsperado, entrega.calculaValorEntrega());
		
	}
	
	@Test
	void calculaPrecoTotalSabadoComDistanciaMaiorQueCinquentaQuilometro() {
		Entrega entrega = new Entrega("Sabado", 51);
		
		entrega.calculaValorEntrega();
		System.out.println(entrega.calculaValorEntrega());
		Double valorEsperado = new Double(20.0);
		assertEquals(valorEsperado, entrega.calculaValorEntrega());
		
	}
	
	@Test
	void calculaPrecoTotalDomingoComDistanciaMenorQueCinquentaKm() {
		Entrega entrega = new Entrega("Domingo", 49);
		
		entrega.calculaValorEntrega();
		System.out.println(entrega.calculaValorEntrega());
		Double valorEsperado = new Double(15.0);
		assertEquals(valorEsperado, entrega.calculaValorEntrega());
		
	}
	
	@Test
	void calculaPrecoTotalSabadoComDistanciaMenorQueCinquentaKm() {
		Entrega entrega = new Entrega("Domingo", 49);
		
		entrega.calculaValorEntrega();
		System.out.println(entrega.calculaValorEntrega());
		Double valorEsperado = new Double(15.0);
		assertEquals(valorEsperado, entrega.calculaValorEntrega());
		
	}
	
	@Test
	void calculaPrecoTotalDiferenteDeDomingoComDistanciaMenorQueCinquentaKm() {
		Entrega entrega = new Entrega("Domingo", 49);
		
		entrega.calculaValorEntrega();
		System.out.println(entrega.calculaValorEntrega());
		Double valorEsperado = new Double(15.0);
		assertEquals(valorEsperado, entrega.calculaValorEntrega());
		
	}

}
