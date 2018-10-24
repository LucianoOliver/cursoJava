package br.gov.serpro.tv;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControleRemotoTest {
	
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
		
		Tablet tablet = new Tablet();
		ControleRemoto controleRemoto = new ControleRemoto(tablet);
		
		int volume = controleRemoto.baixarVolume();
		assertEquals(true, controleRemoto.ligar());
		
	}
	
	@Test
	public void testLigarDesligarTablet() {
		
		Tablet tablet = new Tablet();
		ControleRemoto controleRemoto = new ControleRemoto(tablet);
		controleRemoto.ligar();
		assertEquals(false, controleRemoto.desligar());
		
	}

}
