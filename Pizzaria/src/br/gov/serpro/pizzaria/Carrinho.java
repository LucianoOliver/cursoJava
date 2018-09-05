package br.gov.serpro.pizzaria;

public class Carrinho {
	
	private Pizza pizza;
	private Entrega entrega;
	private Double precoTotal;
	
	
	
	public Carrinho(Pizza pizza, Entrega entrega) {
		super();
		this.pizza = pizza;
		this.entrega = entrega;
	}



	public Double calculaPrecoTotal() {
		
	return	this.precoTotal = this.pizza.calculaValorPizza() + this.entrega.calculaValorEntrega();
		
	}

}
