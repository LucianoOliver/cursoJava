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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(int preco) {
		 this.preco = preco;
		
	}
	
	public int getPreco() {
		return preco;
	}

	public void setPeso(int peso) {
		this.pesoEntrega = peso;
		
	}
	
	

}
