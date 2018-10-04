package com.example.demo.carrinho;

public abstract class Pagamento {
	
	private int quantidade;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public abstract String  tipoPagamento();


}


