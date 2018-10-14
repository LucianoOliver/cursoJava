package com.example.demo.carrinho;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoComTamanhoTest {

	@Test
		public void test() {
			ProdutoComTamanho produtoComTamanho = new ProdutoComTamanho(1, "Camiseta", 5.0, 35);
			assertEquals(5.0, produtoComTamanho.getPreco() ,0);
		
		}

}
