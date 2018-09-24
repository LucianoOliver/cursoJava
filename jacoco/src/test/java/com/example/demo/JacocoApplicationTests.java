package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.calculadora.Calculadora;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JacocoApplicationTests {

	@Test
	public void contextLoads() {
	}
	
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
