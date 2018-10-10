package br.gov.serpro.carro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.gov.serpro.carro.CarroSoma;
import br.gov.serpro.carro.CarroDeCorrida;
import br.gov.serpro.carro.CarroMult;

public class CarroMultTest {
	CarroDeCorrida corcel;
	CarroDeCorrida etios;
	CarroDeCorrida corolla;
	@Before
	public void inicializaCarro() {
		corcel = new CarroMult("corcel", 10, 100);
		etios = new CarroMult("etios", 10, 120);
		corolla =new CarroMult("corolla", 10, 80);
	}

	@Test
	public void AcelerarTest() {
	
		corcel.acelerar();
		int resultadoEsperado = 10;
		assertEquals(resultadoEsperado, corcel.getVelocidade());
		
		etios.acelerar();
		etios.frear();
		etios.frear();
		etios.imprimir();
		
		
		corolla.acelerar();
		corolla.imprimir();
		corolla.frear();
		corolla.imprimir();
		corolla.acelerar();
		corolla.imprimir();
	}

	
	@Test
	public void AcelerarFrearTest() {

		etios.acelerar();
		etios.frear();
		int resultadoEsperado = 5;
		assertEquals(resultadoEsperado, etios.getVelocidade());
		
		

		corolla.acelerar();
		corolla.imprimir();
		corolla.frear();
		corolla.imprimir();
		corolla.acelerar();
		corolla.imprimir();
	}
	
	
	@Test
	public void AcelerarFrearAtePararTest() {

		corolla.acelerar();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();

	
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, corolla.getVelocidade());
	}
	
	@Test
	public void carroParadoTest() {

		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, corolla.getVelocidade());
	}
	
	@Test
	public void testAcelerarVelocidadeMaximaTest() {
		for(int i = 0; i<14; i++) {
			corolla.acelerar();
		}
		
		int resultadoEsperado = 80;
		assertEquals(resultadoEsperado, corolla.getVelocidade());
	}


}
