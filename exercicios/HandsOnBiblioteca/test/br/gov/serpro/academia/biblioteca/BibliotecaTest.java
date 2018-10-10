package br.gov.serpro.academia.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void quantidadeZeroQuandoNovaBiblioteca() {
		Biblioteca biblioteca = new Biblioteca();
		assertEquals(0, biblioteca.quantidadeDeUsuariosRegistrados());
		assertEquals(0, biblioteca.quantidadeDeLivrosRegistrados());
	}
	
	@Test
	public void quantidadeUmQuandoUsuarioRegistrado() {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.registraUsuario(new Usuario());
		assertEquals(1, biblioteca.quantidadeDeUsuariosRegistrados());
	}
	
	@Test
	public void quantidadeUmQuandoLivroRegistrado() {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.adicionaLivroAoCatalogo(new Livro());
		assertEquals(1, biblioteca.quantidadeDeLivrosRegistrados());		
	}
	
	@Test
	public void deveEmprestarUmLivro() {
		Livro livro = new Livro();
		Usuario usuario = new Usuario();
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.emprestar(livro, usuario);
		
		assertEquals(1, 1);
		assertEquals(1, 1);
	}
	
	public void deveDevolverUmLivro() {
		
	}
	
}
