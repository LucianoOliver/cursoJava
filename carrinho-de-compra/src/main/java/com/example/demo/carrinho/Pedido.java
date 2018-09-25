package com.example.demo.carrinho;

import java.time.LocalDate;

public class Pedido {
	private Integer numero;
	private LocalDate data; 
	private String status;
	private Cliente cliente;
	private Item item;
	
	public Pedido(Integer numero, LocalDate data, String status, Cliente cliente) {
		super();
		this.data = data;
		this.status = status;
		this.cliente = cliente;
		this.numero = numero;
	}

	public double calculaTaxa() {
		return item.getPrecoPelaQuantidade() * 0.10;
	
	}
	
	public double calculaTotal() {
		return item.getPrecoPelaQuantidade() * item.getQuantidade() ;
	
	}
	
	public double calculaTotalpeso() {
		return 0;
	
	}
	
	
	
	

}
