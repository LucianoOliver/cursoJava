package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.carrinho.CarrinhoDeCompras;
import com.example.demo.carrinho.Produto;

public class CarrinhoDeComprasTest {

	@Test
	public void deveRetornarQuantidadeProdutos() {
		
		Produto produto = new Produto(1, "Camiseta", 20.0);
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarProduto(produto, 1);

		assertEquals(1,carrinhoDeCompras.recuperaTotalProdutos() ,0);
		
	}

	@Test
	public void deveRetornarValorTotalProdutos() {
		
		Produto produto = new Produto(1, "Camiseta", 20.0);
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarProduto(produto, 3);

		assertEquals(60,carrinhoDeCompras.calculaValorTotalCompra(),0);
		
	}

}
