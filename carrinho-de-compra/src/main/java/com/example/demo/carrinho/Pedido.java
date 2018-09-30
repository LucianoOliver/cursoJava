package com.example.demo.carrinho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private Integer numero;
	private LocalDate data; 
	private SituacaoPedido status;
	private Cliente cliente;
	private Item item;
	private List<DetalhePedido> detalhePedidos = new ArrayList<>();
	private Pagamento pagamento = new Pagamento();
	public Pedido(Integer numero, LocalDate data, SituacaoPedido status, Cliente cliente) {
		super();
		this.data = data;
		this.status = status;
		this.cliente = cliente;
		this.numero = numero;
	}
	
	public void adicionarDetalhePedido(DetalhePedido detalhePedido) {
		detalhePedidos.add(detalhePedido);
	}

	public double calculaTaxa() {
		double valorTaxa = 0;

		for (DetalhePedido detalhePedido : detalhePedidos) {
			valorTaxa += detalhePedido.calculaSubTotal() * 0.10;
		}

		return valorTaxa;
	
	
	}
	
	public double calculaValorTotal() {
		double valorTotal = 0;

		for (DetalhePedido detalhePedido : detalhePedidos) {
			valorTotal += detalhePedido.calculaSubTotal() * detalhePedido.getQuantidade();
		}

		return valorTotal;
	
	}
	
	
	public double calculaTotalPeso() {
		double valorTotalPeso = 0;

		for (DetalhePedido detalhePedido : detalhePedidos) {
			valorTotalPeso += detalhePedido.calculaPeso();
		}
		return valorTotalPeso;
	
	}
	
	public double efetuarPagamento() {
		double valorTotalPeso = 0;
		
		for (DetalhePedido detalhePedido : detalhePedidos) {
			valorTotalPeso += detalhePedido.calculaPeso();
		}
		return valorTotalPeso;
	
	}
	
}
