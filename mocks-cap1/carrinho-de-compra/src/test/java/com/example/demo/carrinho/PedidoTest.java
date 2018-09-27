package com.example.demo.carrinho;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class PedidoTest {

	@Test
	public void calculaTaxatest() {
		
		LocalDate dataPedido =  LocalDate.now();
		Item item = new Item();
		DetalhePedido detalhePedido = new DetalhePedido();
		
		
		item.setDescricao("Celular");
		item.setQuantidade(1);
		item.setPreco(5);
		Cliente luciano = new Cliente("Luciano", "Rua Um");
		Integer numeroPedido = 1;
		Pedido pedidoUm = new Pedido(numeroPedido, dataPedido, "Em processamento", luciano, detalhePedido);
		
		//detalhePedido.calculaPeso();
		//detalhePedido.calculaSubTotal();
		pedidoUm.adicionarItem(item);
		double calculaTaxa = pedidoUm.calculaTaxa();
		double resultadoEsperado = 0.5;
		
		assertEquals(resultadoEsperado, calculaTaxa, 0);
		
		
		
	}
	
	
	@Test
	public void calculaValorTotaltest() {
		
		LocalDate dataPedido =  LocalDate.now();
		Item item = new Item();
		DetalhePedido detalhePedido = new DetalhePedido();
		
		
		item.setDescricao("Celular");
		item.setQuantidade(2);
		item.setPreco(5);
		Cliente luciano = new Cliente("Luciano", "Rua Um");
		Integer numeroPedido = 1;
		Pedido pedidoUm = new Pedido(numeroPedido, dataPedido, "Em processamento", luciano, detalhePedido);
		
		
		pedidoUm.adicionarItem(item);
		double valorTotal = pedidoUm.calculaValorTotal();
		double resultadoEsperado = 10;
		
		assertEquals(resultadoEsperado, valorTotal, 0);
		
		
		
	}
	
	@Test
	public void calculaTotalPesotest() {
		
		LocalDate dataPedido =  LocalDate.now();
		Item celular = new Item();
		DetalhePedido detalhePedido = new DetalhePedido();
		
		celular.setDescricao("Celular");
		celular.setQuantidade(2);
		celular.setPreco(5);
		celular.setPeso(10);
		
		Item tablet = new Item();
		
		tablet.setDescricao("Celular");
		tablet.setQuantidade(2);
		tablet.setPreco(5);
		tablet.setPeso(10);
		
		Cliente luciano = new Cliente("Luciano", "Rua Um");
		Integer numeroPedido = 1;
		Pedido pedidoUm = new Pedido(numeroPedido, dataPedido, "Em processamento", luciano, detalhePedido);
		
		pedidoUm.adicionarItem(celular);
		pedidoUm.adicionarItem(tablet);
		double totalPeso = pedidoUm.calculaTotalPeso();
		double resultadoEsperado = 20;
		
		assertEquals(resultadoEsperado, totalPeso, 0);
		
	}
	
	
	

}
