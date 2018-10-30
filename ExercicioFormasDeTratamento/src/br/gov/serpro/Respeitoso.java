package br.gov.serpro;

public class Respeitoso implements FormatadorNome {

	@Override
	public String formatarNome(String nome, String sobreNome) {
		return "Sr." +nome;
	}

}
