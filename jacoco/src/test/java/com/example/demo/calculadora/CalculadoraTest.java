package com.example.demo.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.cofrinho.Cofrinho;
import com.example.demo.cofrinho.Moeda;
import com.example.demo.cofrinho.ValorMoeda;

public class CalculadoraTest {

	Cofrinho cofrinho = new Cofrinho();
	Moeda moeda = new Moeda(ValorMoeda.UM_REAL);

	@Test
	public void testSoma() {
		Calculadora calculadora = new Calculadora();
		Integer numUm = 5;
		Integer numDois = 5;
		Integer resultadoObtido = calculadora.soma(numUm, numDois);
		Integer resultadoEsperado = 10;
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testSubtrai() {
		Calculadora calculadora = new Calculadora();
		Integer numUm = 7;
		Integer numDois = 5;
		Integer resultadoObtido = calculadora.subtrai(numUm, numDois);
		Integer resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultadoObtido);
	}

}
