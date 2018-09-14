package br.gov.serpro.academiadespo.cofrinho;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Moeda moedaCincoCents = new Moeda(ValorMoeda.CINCO_CENTAVOS);
		Moeda moedaDezCents1 = new Moeda(ValorMoeda.DEZ_CENTAVOS);
		Moeda moedaVinteCincoCents = new Moeda(ValorMoeda.VINTE_CINCO_CENTAVOS);
		Moeda moedaCinquentaCents = new Moeda(ValorMoeda.CINQUENTA_CENTAVOS);
		Moeda moedaUmReal = new Moeda(ValorMoeda.UM_REAL);
		
		
		Cofrinho cofrinho = new Cofrinho();
		
		cofrinho.adicionarMoeda(moedaCincoCents);
		cofrinho.adicionarMoeda(moedaDezCents1);
		cofrinho.adicionarMoeda(moedaDezCents1);
		cofrinho.adicionarMoeda(moedaDezCents1);
		cofrinho.adicionarMoeda(moedaVinteCincoCents);
		cofrinho.adicionarMoeda(moedaCinquentaCents);
		//cofrinho.adicionarMoeda(moedaUmReal);
		
		System.out.println("O cofre tem um total de " + cofrinho.calcularQuantidadeTotalMoedas() + " moedas.");
		System.out.println("O cofre tem um total de " + cofrinho.calcularQuantidadeTotalMoedas_NaoOtimizado() + " moedas(Não otimizado).");
		System.out.println("O cofre tem um total de " + cofrinho.calcularValorTotalMoedas() + " real(is).");
		System.out.println("Qtde moedas de 10 centavos: " + cofrinho.obterQuantidadeMoedasPorMoeda(moedaDezCents1));
		System.out.println("Qtde moedas de 25 centavos: " + cofrinho.obterQuantidadeMoedasPorMoeda(moedaVinteCincoCents));
		System.out.println("Qtde moedas de 1 real: " + cofrinho.obterQuantidadeMoedasPorMoeda(moedaUmReal));
		System.out.println("O valor da moeda de maior valor é: " + cofrinho.obterValorDaMoedaDeMaiorValorDentroCofrinho());
		
		
	}

	
}
