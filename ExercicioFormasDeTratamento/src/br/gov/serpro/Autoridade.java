package br.gov.serpro;

public class Autoridade {
	
	private String nome;
	private String Sobrenome;
	FormatadorNome formatadorNome = new FormatadorNome() {
		
		@Override
		public String formatarNome(String nome, String sobreNome) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	
	String getTratamento(){
		return Sobrenome;
		
	}
}
