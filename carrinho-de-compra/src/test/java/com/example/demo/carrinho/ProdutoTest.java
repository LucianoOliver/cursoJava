package com.example.demo.carrinho;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProdutoTest {

	@Test
	public void test() {
		Produto produto = new Produto(1, "Coca-cola", 5.0 );
		assertEquals(5.0, produto.getPreco() ,0);
	
	}

}
