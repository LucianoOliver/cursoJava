package br.gov.serpro.pizzaria;



import org.junit.Assert;
import org.junit.Test;


class CarrinhoTeste {
		
		@Test
		void testaValorCarrinho() {
			Pizza mussarela = new Pizza("Mussarela");
			Entrega entrega = new Entrega("Domingo", 30);
			Carrinho carrinho = new Carrinho(mussarela, entrega);
			
			Assert.assertEquals(50.00, carrinho.calculaPrecoTotal());
			
			
		}

}
