package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CofreRefatorado2ApplicationTests {

	@Test
	public void contextLoads() {
		Cofrinho cofrinho = new Cofrinho();
		
		Moeda moeda = new Moeda(ValorMoeda.CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(moeda);
		assertEquals(1, cofrinho.calcularQuantidadeTotalMoedas(), 1);
	}
	
	@Test
	public void contextLoads2() {
		Cofrinho cofrinho = new Cofrinho();
		
		Moeda moeda = new Moeda(ValorMoeda.CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(moeda);
		assertEquals(1, cofrinho.calcularValorTotalMoedas(), 1);
	}

}
