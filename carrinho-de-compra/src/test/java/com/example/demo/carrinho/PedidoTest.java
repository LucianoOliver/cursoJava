package com.example.demo.carrinho;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class PedidoTest {

	private Integer numeroPedido;
	private LocalDate dataPedido;
	private Item item;
	private DetalhePedido detalhePedido;
	private Cliente luciano;
	private Pedido pedidoUm;

	@Before
	public void informacoesPedido() {
		numeroPedido = 1;
		dataPedido = LocalDate.now();
		item = new Item(1, "Coca Lata", 5);
		detalhePedido = new DetalhePedido(1, false, item);
		luciano = new Cliente("Luciano", "Rua Um");
		pedidoUm = new Pedido(numeroPedido, dataPedido, SituacaoPedido.EM_PRCESSAMENTO, luciano);

	}

	@Test
	public void calculaTaxatest() {
		pedidoUm.adicionarDetalhePedido(detalhePedido);
		double calculaTaxa = pedidoUm.calculaTaxa();
		double resultadoEsperado = 0.5;

		assertEquals(resultadoEsperado, calculaTaxa, 0);

	}

	@Test
	public void calculaValorTotaltest() {
		pedidoUm.adicionarDetalhePedido(detalhePedido);
		double valorTotal = pedidoUm.calculaValorTotal();
		double resultadoEsperado = 5;

		assertEquals(resultadoEsperado, valorTotal, 0);

	}

	@Test
	public void calculaTotalPesotest() {

		pedidoUm.adicionarDetalhePedido(detalhePedido);
		double totalPeso = pedidoUm.calculaTotalPeso();
		double resultadoEsperado = 1;

		assertEquals(resultadoEsperado, totalPeso, 0);

	}

}
