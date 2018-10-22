package br.gov.serpro.tv;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControleRemotoTest {

	@Test
	public void testMudarCanalAtivo() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		int canal = controleRemoto.mudarCanal(5);
		assertEquals(5, canal);
		
	}
	
	@Test
	public void testMudarCanalNaoAtivo() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		controleRemoto.aumentarCanal();
		int canal = controleRemoto.mudarCanal(4);
		assertEquals(0, canal);
		
	}
	
	@Test
	public void testAumentarCanal() {
		int[] canais = {1,5,6,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		controleRemoto.mudarCanal(1);
		
		int canalAumentado = controleRemoto.aumentarCanal();
		assertEquals(5, canalAumentado);
	}
	
	@Test
	public void testAumentarPermanecerNoUltimoCanal() {
		int[] canais = {1,5,6,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		controleRemoto.mudarCanal(13);
		
		int canalAumentado = controleRemoto.aumentarCanal();
		assertEquals(13, canalAumentado);
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
	public void testDiminuirPermanecerNoPrimeiroCanal() {
		int[] canais = {1,5,6,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		int canalMudado = controleRemoto.mudarCanal(1);
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
	public void testAumentarVolumeNoLimiteMaximo() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);

		for(int i = 0; i < 50; i++) {
			controleRemoto.aumentarVolume();
	
		}
		
		int volume = controleRemoto.aumentarVolume();
		assertEquals(50, volume);
		
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
	public void testBaixarVolumeNoLimiteMinimo() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Tv tv = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto(tv);
		controleRemoto.aumentarVolume();
		controleRemoto.aumentarVolume();
		controleRemoto.aumentarVolume();
		controleRemoto.baixarVolume();
		controleRemoto.baixarVolume();
		controleRemoto.baixarVolume();
		int volume = controleRemoto.baixarVolume();
		assertEquals(0, volume);
		
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
		assertEquals(false, controleRemoto.desligar());
		
	}
	
	
	@Test
	public void testLigarTablet() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Tablet tablet = new Tablet();
		ControleRemoto controleRemoto = new ControleRemoto(tablet);
		
		int volume = controleRemoto.baixarVolume();
		assertEquals(true, controleRemoto.ligar());
		
	}
	
	
	
	
	


}
