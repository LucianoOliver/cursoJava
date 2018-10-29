package br.gov.serpro.datas.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import br.gov.serpro.datas.Pessoa;

public class PessoaTest {
	
	private Pessoa luciano;
	private Pessoa regiane;
	private Pessoa josefa;

	@Before
	public void preparar() {
		LocalDate dataNascimentoLuciano = LocalDate.of(1978, 9, 12);
		LocalDate dataNascimentoRegiane = LocalDate.of(1987, 6, 13);
		LocalDate dataNascimentoJosefa = LocalDate.of(1950, 11, 20);
		luciano = new Pessoa("Luciano", dataNascimentoLuciano);
		regiane = new Pessoa("Regiane", dataNascimentoRegiane);
		josefa = new Pessoa("Josefa", dataNascimentoJosefa);
	}


	@Test
	public void deveRetornarAIdadeAPartirDaDataDeNasimento() {
		assertEquals(40, luciano.getIdade());
		assertEquals(31, regiane.getIdade());
		assertEquals(67, josefa.getIdade());	
	}
	
	@Test
	public void deveRetornarSignoAPartirDaDataDeNasimento() {
		assertEquals("virgem", luciano.getSigno());
		assertEquals("gêmeos", regiane.getSigno());
		assertEquals("escorpião", josefa.getSigno());		
	}
	
	@Test
	public void deveRetornarDiaDaSemanaAPartirDaDataDeNasimento() {
		assertEquals("Terça-feira", luciano.diaSemana());
		assertEquals("Sábado", regiane.diaSemana());
		assertEquals("Segunda-feira" ,josefa.diaSemana());
	}

}
