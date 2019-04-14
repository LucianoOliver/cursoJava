package br.gov.serpro.camelcase;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class CamelCaseTests {
	
	@Test
	public void dadoUmaPalavraComInicialMinusculaDeveRetornarUmaUnicaPalavraEmMinusculoTest() {
		String original = "luciano";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("luciano", nome.get(0));
	}

	@Test
	public void dadoUmaPalavraComInicialMaisculaDeveRetornarUmaUnicaPalavraEmMinusculoTest() {
		String original = "Luciano";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("luciano", nome.get(0));
	}
	
	@Test
	public void dadoDuasPalavraComASegundaPalavraComInicialMaisculaDeveRetornarDuasPalavraEmMinusculoSeparadasPorVirgulaTest() {
		String original = "lucianoRocha";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("luciano, rocha", nome.get(0));
		
	}
	
	@Test
	public void dadoDuasPalavraaComAsDuasPalavrasComInicialMaisculaDeveRetornarDuasPalavraEmMinusculoSeparadasPorVirgulaTest() {
		String original = "LucianoRocha";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("luciano, rocha", nome.get(0));
		
	}
	
	@Test
	public void dadoUmaPalavraComTodasPalavrasMaisculaDeveRetornarTodasPalavraMaisculaTest() {
		String original = "CPF";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("CPF", nome.get(0));
		
	}
	
	@Test
	public void dadonumeroCPFRetornarPrimeiraPalavraMinusculaESegundaPalavraMaiscula() {
		String original = "numeroCPF";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("numeroCPF", nome.get(0));
		
	}
	
	@Test
	public void dadonumeroCPFContribuinteRetornarPrimeiraPalavraMinusculaESegundaPalavraMaisculaETerceiraPalavraminuscula() {
		String original = "numeroCPFContribuinte";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("numero, CPF, Contribuinte", nome.get(0));
		
	}
	
	@Test
	public void dadonrecupera10PrimeirosDeveRetornarPrimeiraPalavraMinusculaENumerosSeparadosPorVirgulaETerceiraPalavraMinuscula() {
		String original = "recupera10Primeiros";
		List<String> nome = CamelCase.converterCamelCase(original);
		assertEquals("recupera, 10, Primeiros", nome.get(0));
		
	}
	
	 @Test(expected = NaoDeveRecuperarComNumerosException.class)
	public void dadoUmaPalavraQueIniciaComNumeroDeveRetornarExcecao() {
		String original = "10Primeiros";
		List<String> nome = CamelCase.converterCamelCase(original);
		//assertEquals("recupera, 10, Primeiros", nome.get(0));
		
	}
	 
	 @Test(expected = NaoDevePermitirCaracterEspecialException.class)
		public void dadoUmaPalavraComCaracterEspecialDeveRetornarExcecao() {
			String original = "nome#Composto";
			List<String> nome = CamelCase.converterCamelCase(original);
			//assertEquals("recupera, 10, Primeiros", nome.get(0));
	 }		
	
}
	 
	 
