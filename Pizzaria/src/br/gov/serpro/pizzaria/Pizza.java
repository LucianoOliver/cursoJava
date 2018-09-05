package br.gov.serpro.pizzaria;

public class Pizza {
	
	private String ingrediente;
	private Double preco;
	
	public Pizza(String ingrediente) {
		super();
		this.ingrediente = ingrediente;
	}

	public Double calculaValorPizza() {
		if (ingrediente.equals("Mussarela")) {
			return 30.00;
		}else if(ingrediente.equals("Calabresa")) {
			return  40.00;
		}
		return  0.0;
	}
	
	
	
	
	

}
