package br.gov.serpro.academia.biblioteca;

public class Livro {
	private int codigo;
	private String titulo;
	private String autor;
	private boolean disponivel;
	private Usuario usuario;
	
	private static int next = 0;
	
	public Livro() {
		proximo();
	}
	
	public Livro(String titulo, String autor, boolean disponivel) {
		proximo();
		codigo = next;
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
	}
	
	
	private void proximo() {
		next++;
	}
}
