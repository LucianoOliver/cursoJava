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
		int[] canais = {1,5,6,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		int canalMudado = controleRemoto.mudarCanal(1);
		
		int canalAumentado = controleRemoto.aumentarCanal();
		assertEquals(5, canalAumentado);
	}
	
	
	@Test
	public void testDiminuirCanal() {
		int[] canais = {1,5,6,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		int canalMudado = controleRemoto.mudarCanal(5);
		int canalDiminuido = controleRemoto.diminuirCanal();
		assertEquals(1, canalDiminuido);
	}
	
	
	
	
	@Test
	public void testAumentarVolume() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		controleRemoto.aumentarVolume();
		controleRemoto.aumentarVolume();
		int volume = controleRemoto.aumentarVolume();
		assertEquals(3, volume);
		
	}
	
	
	@Test
	public void testBaixarVolume() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		controleRemoto.aumentarVolume();
		controleRemoto.aumentarVolume();
		controleRemoto.aumentarVolume();
		int volume = controleRemoto.baixarVolume();
		assertEquals(2, volume);
		
	}
	
	
	@Test
	public void testLigarTv() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		
		int volume = controleRemoto.baixarVolume();
		assertEquals(true, controleRemoto.ligar());
		
	}
	
	@Test
	public void testLigarDesligarTv() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		controleRemoto.ligar();
		int volume = controleRemoto.baixarVolume();
		assertEquals(false, controleRemoto.desligar());
		
	}


}
