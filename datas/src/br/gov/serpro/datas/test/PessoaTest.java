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
	private LocalDate dataAtual;

	@Before
	public void preparar() {
		dataAtual = LocalDate.of(2049, 9, 12); //LocalDate.now();
		LocalDate dataNascimentoLuciano = LocalDate.of(1978, 9, 12);
		LocalDate dataNascimentoRegiane = LocalDate.of(1987, 6, 13);
		LocalDate dataNascimentoJosefa = LocalDate.of(1950, 11, 20);
		luciano = new Pessoa("Luciano", dataNascimentoLuciano);
		regiane = new Pessoa("Regiane", dataNascimentoRegiane);
		josefa = new Pessoa("Josefa", dataNascimentoJosefa);
	}

	@Test
	public void deveRetornarAIdadeAPartirDaDataDeNasimento() {
		assertEquals(31, regiane.getIdade(dataAtual));
		assertEquals(40, luciano.getIdade(dataAtual));
		assertEquals(67, josefa.getIdade(dataAtual));	
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
