package br.gov.serpro.cofrinho;

public class Cofrinho {

	private String dono;
	private double moedaUmcentavo;
	private double moedaCincocentavo;
	private double moedaDezCentavo;
	private double moedaVinteCincoCentavos;
	private double moedaCinquentaCentavos;
	private double moedaUmreal;

	// Constructor
	public Cofrinho(String d) {
		dono = d;
		moedaUmcentavo = 0.1;
		moedaCincocentavo = 0.5;
		moedaDezCentavo = 0.10;
		moedaVinteCincoCentavos = 0.25;
		moedaCinquentaCentavos = 0.50;
		moedaUmreal = 1.00;
	}

	// Métodos
	public void setDono(String d) {
		this.dono = d;
	}

	public String getDono() {
		return this.dono;
	}

	public void depositaUmaMoedaUmCentavo() {
		this.moedaUmcentavo = this.moedaUmcentavo + moedaUmcentavo;
	}

	public void depositaUmaMoedaCinco() {
		this.moedaCincocentavo = this.moedaCincocentavo + moedaCincocentavo;
	}

	public void depositaUmaMoedaDezCentavos() {
		this.moedaDezCentavo = this.moedaDezCentavo + moedaDezCentavo;
	}

	public double total() {
		return ((moedaUmcentavo + moedaCincocentavo + moedaDezCentavo) / 100);
	}

	public double total(double valorDolar) {
		return (((moedaUmcentavo + moedaCincocentavo + moedaDezCentavo) / 100) / valorDolar);
	}
}
