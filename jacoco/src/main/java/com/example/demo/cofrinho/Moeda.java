package com.example.demo.cofrinho;

public class Moeda {
	
	private ValorMoeda valorMoeda;
	
	/**
	 * Não foi pedido no exercício mas faz parte da discussão de modelagem OO 
	 */
	private String imagem;
	private boolean isComemorativa;
	
	
	public Moeda(ValorMoeda valorMoeda) {
		this.valorMoeda = valorMoeda;
	}

	public ValorMoeda getValorMoeda() {
		return valorMoeda;
	}
	
	public Double getValorEmReais() {
		return valorMoeda.getValor();
	}

}
