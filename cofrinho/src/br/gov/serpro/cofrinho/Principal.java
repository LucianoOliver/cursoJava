package br.gov.serpro.cofrinho;

public class Principal {

	public static void main(String[] args) {
		
		Moeda moeda1 = new Moeda(0.10);
		Cofrinho cofrinho = new Cofrinho();
		
		Moeda moeda2 = new Moeda(0.10);
		Moeda moeda3 = new Moeda(0.25);

		
		cofrinho.adicionarMoeda(moeda1);
		cofrinho.adicionarMoeda(moeda2);
		cofrinho.adicionarMoeda(moeda3);		
		
		cofrinho.calcularTotalDepositado();
		
		
		System.out.println("Total Depositado " +cofrinho.calcularTotalDepositado());
		System.out.println("Quantidade de moedas depositadas " + cofrinho.contarMoedaDepositada());
		System.out.println("Maior Valor " +cofrinho.identificarMoedaMaiorValor());
	}

}
