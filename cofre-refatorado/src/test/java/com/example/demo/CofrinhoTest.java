package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CofrinhoTest {

	@Autowired
	Cofrinho cofrinho;
	@Autowired
	ValorMoeda valorMoeda;

	@Before
	public void setUp() throws Exception {
		cofrinho.adicionarMoeda(valorMoeda.CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(valorMoeda.DEZ_CENTAVOS);
		cofrinho.adicionarMoeda(valorMoeda.VINTE_CINCO_CENTAVOS);
		cofrinho.adicionarMoeda(valorMoeda.CINQUENTA_CENTAVOS);
		cofrinho.adicionarMoeda(valorMoeda.UM_REAL);
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
