package curso.java.banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaContaEspecial extends TestaContaCorrente {

	@Before
	public void inicializaConta() {
		contaCorrente = new ContaEspecial(100);
		contaCorrente.deposita(200);
	}
	
	
	@Test
	public void sacaMaiorQueSaldo() {
		int valorSacado = contaCorrente.sacar(350);
		assertEquals(valorSacado, 0);
		assertEquals(200, contaCorrente.getSaldo());

	}
	

	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() {
		int valorSacado = contaCorrente.sacar(250);
		assertEquals(valorSacado, 250);
		assertEquals(-50, contaCorrente.getSaldo());

	}


}
