package br.gov.serpro;

public class Autoridade {
	
	private String nome;
	private String sobreNome;	
	private FormatadorNome formatadorNome;
	
	
	public Autoridade(String nome, String sobreNome, FormatadorNome formatadorNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.formatadorNome = formatadorNome;
	}


	public String getTratamento(){
		return formatadorNome.formatarNome(nome, sobreNome);
		
	}
}
