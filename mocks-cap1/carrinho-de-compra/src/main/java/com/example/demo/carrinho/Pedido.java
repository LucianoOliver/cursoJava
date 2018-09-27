package com.example.demo.carrinho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private Integer numero;
	private LocalDate data; 
	private String status;
	private Cliente cliente;
	private Item item;
	private List<Item> itens = new ArrayList<>();
	
	public Pedido(Integer numero, LocalDate data, String status, Cliente cliente, DetalhePedido detalhePedido) {
		super();
		this.data = data;
		this.status = status;
		this.cliente = cliente;
		this.numero = numero;
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}

	public double calculaTaxa() {
		double valorTaxa = 0;

		for (Item item : itens) {
			valorTaxa += item.getPreco() * 0.10;
		}

		return valorTaxa;
	
	
	}
	
	public double calculaValorTotal() {
		double valorTotal = 0;

		for (Item item : itens) {
			valorTotal += item.getPreco() * item.getQuantidade();
		}

		return valorTotal;
	
	}
	
	
	public double calculaTotalPeso() {
		double valorTotalPeso = 0;

		for (Item item : itens) {
			valorTotalPeso += item.getPeso();
		}
		return valorTotalPeso;
	
	}
	
}
