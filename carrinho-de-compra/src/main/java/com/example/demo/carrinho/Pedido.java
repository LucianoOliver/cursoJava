package com.example.demo.carrinho;

import java.time.LocalDate;

public class Pedido {
	private LocalDate data; 
	private String status;
	private Cliente cliente;
	
	public Pedido(LocalDate data, String status, Cliente cliente) {
		super();
		this.data = data;
		this.status = status;
		this.cliente = cliente;
	}

	public double calculaTaxa() {
		return 0;
	
	}
	
	public double calculaTotal() {
		return 0;
	
	}
	
	public double calculaTotalpeso() {
		return 0;
	
	}
	
	
	
	

}
