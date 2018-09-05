package br.gov.serpro.pizzaria;

public class Entrega {
	
	private String diaSemana;
	private Integer distancia;
	private Double preco;

	public Entrega(String diaSemana, Integer distancia) {
		super();
		this.diaSemana = diaSemana;
		this.distancia = distancia;
	}


	public Double calculaValorEntrega() {
		if (diaSemana.equals("Domingo") && distancia.doubleValue() > 50) {
			return 20.00;
		}else if (diaSemana.equals("Domingo") && distancia.doubleValue() < 50) {
			return  15.00;
		}
		return preco = 10.0;
	}
}
