package br.gov.serpro.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




class CarrinhoTeste {
		
		@Test
		void calculaPrecoTotal() {
			Pizza mussarela = new Pizza("Mussarela");
			Entrega entrega = new Entrega("Domingo", 30);
			Carrinho carrinho = new Carrinho(mussarela, entrega);
			System.out.println(carrinho.calculaPrecoTotal());
			Double valorEsperado = new Double(45.0);
			assertEquals(valorEsperado, carrinho.calculaPrecoTotal());
			
		}

}
