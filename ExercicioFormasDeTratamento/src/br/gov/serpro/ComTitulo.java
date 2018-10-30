package br.gov.serpro;

public class ComTitulo implements FormatadorNome {

	@Override
	public String formatarNome(String nome, String sobreNome) {
		
		return "Dr." +" "+ nome + " "+sobreNome;
	}

}
