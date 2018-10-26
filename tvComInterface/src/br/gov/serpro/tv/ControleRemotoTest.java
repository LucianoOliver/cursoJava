package br.gov.serpro.tv;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControleRemotoTest {
	
	@Test
	public void testAumentarVolume() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		//Tv tv = new Tv(canais);
		ControlavelVolume controlavelVolume = new Tv(canais);
		
		ControleRemoto controleRemoto = new ControleRemoto();
		controleRemoto.aumentarVolume(controlavelVolume);
		controleRemoto.aumentarVolume(controlavelVolume);
		int volume = controleRemoto.aumentarVolume(controlavelVolume);
		assertEquals(3, volume);
		
	}
	
	@Test
	public void testAumentarVolumeNoLimiteMaximo() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		ControlavelVolume controlavelVolume = new Tv(canais);

		ControleRemoto controleRemoto = new ControleRemoto();

		for(int i = 0; i < 50; i++) {
			controleRemoto.aumentarVolume(controlavelVolume);
	
		}
		
		int volume = controleRemoto.aumentarVolume(controlavelVolume);
		assertEquals(50, volume);
		
	}
	
	
	@Test
	public void testBaixarVolume() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
			
		ControlavelVolume controlavelVolume = new Tv(canais);

		ControleRemoto controleRemoto = new ControleRemoto();
		controleRemoto.aumentarVolume(controlavelVolume);
		controleRemoto.aumentarVolume(controlavelVolume);;
		controleRemoto.aumentarVolume(controlavelVolume);
		int volume = controleRemoto.baixarVolume(controlavelVolume);
		assertEquals(2, volume);
		
	}
	
	@Test
	public void testBaixarVolumeNoLimiteMinimo() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		ControlavelVolume controlavelVolume = new Tv(canais);

		ControleRemoto controleRemoto = new ControleRemoto();
		controleRemoto.aumentarVolume(controlavelVolume);
		controleRemoto.aumentarVolume(controlavelVolume);
		controleRemoto.aumentarVolume(controlavelVolume);
		controleRemoto.baixarVolume(controlavelVolume);
		controleRemoto.baixarVolume(controlavelVolume);
		controleRemoto.baixarVolume(controlavelVolume);
		int volume = controleRemoto.baixarVolume(controlavelVolume);
		assertEquals(0, volume);
		
	}
	
	@Test
	public void testLigarTv() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		
		Controlavel controlavel = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto();
		ControlavelVolume controlavelVolume = new Tv(canais);
		int volume = controleRemoto.baixarVolume(controlavelVolume);
		assertEquals(true, controleRemoto.ligar(controlavel));
		
	}
	
	@Test
	public void testLigarDesligarTv() {
		int[] canais = {1,3,5,6,7,8,9,10,11,12,13};
		Controlavel controlavel = new Tv(canais);
		ControleRemoto controleRemoto = new ControleRemoto();
		controleRemoto.ligar(controlavel);
		assertEquals(false, controleRemoto.desligar(controlavel));
		
	}
	
	
	@Test
	public void testLigarTablet() {
		
		Tablet tablet = new Tablet();
		ControlavelVolume controlavelVolume = new Tablet();
		Controlavel controlavel = new Tablet();
		ControleRemoto controleRemoto = new ControleRemoto();
		
		int volume = controleRemoto.baixarVolume(controlavelVolume);
		assertEquals(true, controleRemoto.ligar(controlavel));
		
	}
	
	@Test
	public void testLigarDesligarTablet() {
		
		Controlavel controlavel = new Tablet();
		ControleRemoto controleRemoto = new ControleRemoto();
		controleRemoto.ligar(controlavel);
		assertEquals(false, controleRemoto.desligar(controlavel));
		
	}

}
