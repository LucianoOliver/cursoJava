package br.gov.serpro.pizzaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class testaCarrinho {
	
	@Test
	void baixoPesoMuitoGrave() {
		Pizza mussarela = new Pizza("Mussarela");
		Entrega entrega = new Entrega("Domingo", 30);
		Carrinho carrinho = new Carrinho(mussarela, entrega);
		
		assertEquals(50.00, carrinho.calculaPrecoTotal());
		
		
	}

}
