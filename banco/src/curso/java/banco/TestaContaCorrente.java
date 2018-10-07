package curso.java.banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaContaCorrente {
	ContaCorrente contaCorrente;

	@Before
	public void inicializaConta() {
		contaCorrente = new ContaCorrente();
		contaCorrente.deposita(200);
	}

	@Test
	public void deposita() {

		assertEquals(200, contaCorrente.getSaldo());

	}

	@Test
	public void saca() {

		int valorSacado = contaCorrente.sacar(50);
		assertEquals(valorSacado, 50);
		assertEquals(150, contaCorrente.getSaldo());

	}

	@Test
	public void sacaMaiorQueSaldo() {
		int valorSacado = contaCorrente.sacar(250);
		assertEquals(valorSacado, 0);
		assertEquals(200, contaCorrente.getSaldo());

	}

}
