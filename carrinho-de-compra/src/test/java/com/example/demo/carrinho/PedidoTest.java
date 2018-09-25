package com.example.demo.carrinho;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class PedidoTest {

	@Test
	public void test() {
		
		LocalDate dataPedido =  LocalDate.now();
		Item item = new Item();
		item.setDescricao("Celular");
		Cliente luciano = new Cliente("Luciano", "Endereço");
		Integer numeroPedido = 1;
		Pedido pedidoUm = new Pedido(numeroPedido, dataPedido, "Em processamento", luciano);
		double calculaTaxa = pedidoUm.calculaTaxa();
		
		
		
	}

}
