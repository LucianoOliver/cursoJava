package br.gov.serpro.camelcase;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CamelCaseTests {
	
	@Test
	public void dadoUmaPalavraComInicialMinusculaDeveRetornarUmaUnicaPalavraEmMinusculoTest() {
		CamelCase camelCase = new CamelCase();
		String original = "luciano";
		List<String> nome = camelCase.converterCamelCase(original);
		assertEquals("luciano", nome.get(0));
	}

	@Test
	public void dadoUmaPalavraComInicialMaisculaDeveRetornarUmaUnicaPalavraEmMinusculoTest() {
		CamelCase camelCase = new CamelCase();
		String original = "Luciano";
		List<String> nome = camelCase.converterCamelCase(original);
		assertEquals("luciano", nome.get(0));
	}
	
	@Test
	public void dadoDuasPalavraComASegundaPalavraComInicialMaisculaDeveRetornarDuasPalavraEmMinusculoSeparadasPorVirgulaTest() {
		CamelCase camelCase = new CamelCase();
		String original = "lucianoRocha";
		List<String> nome = camelCase.converterCamelCase(original);
		assertEquals("luciano, rocha", nome.get(0));
		
	}
	
	@Test
	public void dadoDuasPalavraaComAsDuasPalavrasComInicialMaisculaDeveRetornarDuasPalavraEmMinusculoSeparadasPorVirgulaTest() {
		CamelCase camelCase = new CamelCase();
		String original = "LucianoRocha";
		List<String> nome = camelCase.converterCamelCase(original);
		assertEquals("luciano, rocha", nome.get(0));
		
	}
	
	@Test
	public void dadoUmaPalavraComTodasPalavrasMaisculaDeveRetornarTodasPalavraMaisculaTest() {
		CamelCase camelCase = new CamelCase();
		String original = "CPF";
		List<String> nome = camelCase.converterCamelCase(original);
		assertEquals("CPF", nome.get(0));
		
	}
	
	@Test
	public void dadonumeroCPFRetornarPrimeiraPalavraMinusculaESegundaPalavraMaiscula() {
		CamelCase camelCase = new CamelCase();
		String original = "numeroCPF";
		List<String> nome = camelCase.converterCamelCase(original);
		assertEquals("numeroCPF", nome.get(0));
		
	}
	
	@Test
	public void dadonumeroCPFContribuinteRetornarPrimeiraPalavraMinusculaESegundaPalavraMaisculaETerceiraPalavraminuscula() {
		CamelCase camelCase = new CamelCase();
		String original = "numeroCPFContribuinte";
		List<String> nome = camelCase.converterCamelCase(original);
		assertEquals("numero, CPF, Contribuinte", nome.get(0));
		
	}
	
}
