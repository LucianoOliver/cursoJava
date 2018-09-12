package br.gov.serpro.compra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestaCompra {

	@Test
	void compraAVsita() {
		Compra compra1 = new Compra(500);
		assertEquals(1, compra1.getNumerosParcelas());
		assertEquals(500, compra1.getValorTotal());
		assertEquals(500, compra1.getValorParcela());
	}
	
	@Test
	void compraParcelada() {
		Compra compra1 = new Compra(4, 250);
		assertEquals(4, compra1.getNumerosParcelas());
		assertEquals(1000, compra1.getValorTotal());
		assertEquals(250, compra1.getValorParcela());
	}


}
