package br.gov.serpro.tv;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControleRemotoTest {

	@Test
	public void testMudarCanal() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		
		int canal = controleRemoto.mudarCanal(5);
		assertEquals(5, canal);
		
	}
	
	@Test
	public void testAumentarCanal() {
		int[] canais = {1,3,5,6,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		int canalMudado = controleRemoto.mudarCanal(6);
		
		int canalAumentado = controleRemoto.aumentarCanal();
		assertEquals(6, canalAumentado);
	}
	
//	@Test
//	public void testaumentarVolume() {
//		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
//		
//		Tv tv = new Tv(canais);
//		ControleRemoto controleRemoto = new ControleRemoto(tv);
//		
//		int canal = controleRemoto.aumentarVolume();
//		assertEquals(1, canal);
//		
//	}

}
