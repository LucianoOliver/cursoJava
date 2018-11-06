package br.gov.serpro.conta;

public class ContaCorrenteRegular extends ContaCorrente {

	private static final int CINCO_PORCENTO = 5;

	@Override
	public double calcularTaxaJuros() {
		return CINCO_PORCENTO;
	}

}
