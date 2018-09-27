package com.example.demo.carrinho;

public class DetalhePedido {
	
	private int quantidade;
	private String totalImposto;
	private Item item;

	
	public double calculaSubTotal(){
		int subTotal = 0;
		subTotal = item.getQuantidade() * item.getPrecoPelaQuantidade();
		return subTotal;
		
	}
	
	public double calculaPeso(){
		int subTotal = 0;
		subTotal = item.getQuantidade() * item.getPeso();
		return subTotal;
		
	}
	
}
