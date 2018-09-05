package br.gov.serpro.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTest {

	@Test
	void calculaPrecoTotal() {
		Pizza mussarela = new Pizza("Mussarela");
		
		mussarela.calculaValorPizza();
		System.out.println(mussarela.calculaValorPizza());
		Double valorEsperado = new Double(30.0);
		assertEquals(valorEsperado, mussarela.calculaValorPizza());
		
	}

}
