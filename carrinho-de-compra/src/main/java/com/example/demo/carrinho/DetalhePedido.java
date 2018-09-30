package com.example.demo.carrinho;

public class DetalhePedido {
	
	private int quantidade;
	private Boolean statusImposto;
	private Item item;

	
	public DetalhePedido(int quantidade, Boolean statusImposto, Item item) {
		this.setQuantidade(quantidade);
		this.statusImposto = statusImposto;
		this.item = item;
	}

	public double calculaSubTotal(){
		int subTotal = 0;
		subTotal = getQuantidade() * item.getPrecoPelaQuantidade();
		return subTotal;
		
	}
	
	public double calculaPeso(){
		int subTotal = 0;
		subTotal = getQuantidade() * item.getPeso();
		return subTotal;
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
