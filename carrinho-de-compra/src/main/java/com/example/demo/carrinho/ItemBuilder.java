package com.example.demo.carrinho;

public class ItemBuilder {

	private int pesoEntrega;
	private String descricao;
	private int preco;

	public int getPrecoPelaQuantidade() {
		return preco;
	}

	public int getPeso() {
		return pesoEntrega;
	}

	public ItemBuilder PesoEntrega(int pesoEntrega) {
		this.pesoEntrega = pesoEntrega;
		return this;
	}

	public ItemBuilder Descricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public ItemBuilder Preco(int preco) {
		this.preco = preco;
		return this;
	}

	public Item itemBuilder() {
		return new Item(pesoEntrega, descricao, preco);
	}

}
