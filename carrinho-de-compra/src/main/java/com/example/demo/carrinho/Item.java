package com.example.demo.carrinho;

public class Item {
	
	private int pesoEntrega;
	private String descricao;
	private int preco;
	
	
	
	public Item(int pesoEntrega, String descricao, int preco) {
		this.pesoEntrega = pesoEntrega;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getPrecoPelaQuantidade() {
		return preco;
	}
	
	public int getPeso() {
		return pesoEntrega;
	}

}
