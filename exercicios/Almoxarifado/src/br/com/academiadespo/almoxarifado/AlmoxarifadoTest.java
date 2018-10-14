package br.com.academiadespo.almoxarifado;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * O almoxarifado de uma empresa estoca materiais e deve fazer o 
 * controle disso.
 * Para cada material ali depositado, deve-se saber o seu 
 * código numérico, seu nome e o seu saldo (quantidade em estoque 
 * no momento). O saldo pode ser alterado quando há retiradas 
 * ou abastecimentos, o nome pode ser mudado e deve-se mostrar 
 * os dados do material quando necessário. O sistema deve
 * permitir as operações de entrada e saída do estoque e 
 * montar uma lista de produtos em estoque.
 * 
 *
 */
public class AlmoxarifadoTest {

	@Test
	public void quantidadeEmEstoqueVazio() {
		// dado que
		// eu tenha um estoque vazio
		Estoque estoque = new Estoque();
		
		// quando
		// eu requisitar a quantidade total de materiais deste estoque
		Integer quantidade = estoque.quantidadeTotalDeMateriais();
		
		// entao
		// a quantidade deve ser ZERO 
		assertEquals(0, (int) quantidade);
	}
	
	@Test
	public void quantidadeEmEstoqueComMateriais() {
		// dado que
		// eu tenha um estoque com materiais
		Estoque estoque = new Estoque();
		Material material = new Material(1);
		estoque.abastecer(material);
		
		// quando
		// eu requisitar a quantidade total de materiais deste estoque
		Integer quantidade = estoque.quantidadeTotalDeMateriais();
		
		// entao
		// a quantidade deve ser alguma coisa
		assertEquals(1, (int) quantidade);
	}
	
	@Test
	public void quantidadeEmEstoqueAposUmaRetirada() {
		// dado que 
		// eu tenha um material em estoque
		int codigoNumerico = 1;
		Material material = new Material(codigoNumerico);
		
		Estoque estoque = new Estoque();
		estoque.abastecer(material);
				
		// quando
		// eu retira-lo
		estoque.retirar(material);
		
		// entao
		// meu estoque deve ficar vazio
		assertEquals(0, (int) estoque.quantidadeTotalDeMateriais());
	}
	
	@Test
	public void quantidadeEmEstoqueAposUmaRetiradaDeMaterialInexistente() {
		// dado que 
		// eu tenha um material em estoque
		int codigoNumerico = 1;
		Material material = new Material(codigoNumerico);
		Estoque estoque = new Estoque();
		estoque.abastecer(material);
		
		// quando
		// eu tentar retirar uma material nao estocado
		Material outroMaterial = new Material(2);
		estoque.retirar(outroMaterial);
		
		// entao
		// a quantidade em estoque deve ser a mesma
		assertEquals(1, (int) estoque.quantidadeTotalDeMateriais());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
