package br.gov.serpro.cofrinho;

public class Principal {

	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho("Luciano");
		cofrinho.depositaUmaMoedaCinco();
		cofrinho.depositaUmaMoedaDezCentavos();
		cofrinho.depositaUmaMoedaUmCentavo();
		System.out.println(cofrinho.total());
		System.out.println(cofrinho.total(10));
		
		

	}

}
