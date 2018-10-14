package br.gov.serpro.academia.biblioteca;

import java.util.ArrayList;
import java.util.Collection;

public class Biblioteca {

	private Collection<Usuario> usuariosRegistrados;
	private Collection<Livro> catalogoDeLivros;
	
	public Biblioteca() {
		this.usuariosRegistrados = new ArrayList<>();
		this.catalogoDeLivros = new ArrayList<>();
	}
	
	public void registraUsuario(Usuario usuario) {
		usuariosRegistrados.add(usuario);
	}
	
	public int quantidadeDeUsuariosRegistrados() {
		return usuariosRegistrados.size();
	}

	public void adicionaLivroAoCatalogo(Livro livro) {
		catalogoDeLivros.add(livro);
	}

	public Object quantidadeDeLivrosRegistrados() {
		return catalogoDeLivros.size();
	}

	public void emprestar(Livro livro, Usuario usuario) {
		System.out.println("Aqui vai a resposta!");
		System.out.println("Aqui vai a resposta!");
		System.out.println("Aqui vai a resposta!");
		System.out.println("Aqui vai a resposta!");
		System.out.println("Aqui vai a resposta!");
	}
	
	
	
	
	
	
	
	
}
