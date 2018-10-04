package com.example.demo.carrinho;

public class Dinheiro extends Pagamento {

	private Double dinheiroOferecido;

	/**
	 * @return the dinheiroOferecido
	 */
	public Double getDinheiroOferecido() {
		return dinheiroOferecido;
	}


	/**
	 * @param dinheiroOferecido the dinheiroOferecido to set
	 */
	public void setDinheiroOferecido(Double dinheiroOferecido) {
		this.dinheiroOferecido = dinheiroOferecido;
	}
	
	@Override
	public String tipoPagamento() {
		String tipo = "Dinheiro";
		return tipo;
	}


	
}
