package br.gov.serpro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.gov.serpro.Autoridade;
import br.gov.serpro.ComTitulo;
import br.gov.serpro.Informal;
import br.gov.serpro.Respeitoso;

public class AutoridadeTest {

	@Test
	public void autoridadeRespeitoso() {
		String nome = "Luciano";
		String sobreNome = "Oliveira";
		Respeitoso respeitoso = new Respeitoso();
		Autoridade autoridade = new Autoridade(nome, sobreNome, respeitoso);
		
		assertEquals("Sr.Luciano", autoridade.getTratamento());
		
	}
	
	@Test
	public void autoridadeInformal() {
		String nome = "Luciano";
		String sobreNome = "Oliveira";
		Informal informal = new Informal();
		Autoridade autoridade = new Autoridade(nome, sobreNome, informal);
		
		assertEquals("Luciano", autoridade.getTratamento());
		
	}
	
	@Test
	public void autoridadeComTitulo() {
		String nome = "Luciano";
		String sobreNome = "Oliveira";
		ComTitulo comTitulo = new ComTitulo();
		Autoridade autoridade = new Autoridade(nome, sobreNome, comTitulo);
		
		assertEquals("Dr. Luciano Oliveira", autoridade.getTratamento());
		
	}

}
