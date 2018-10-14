package org.pho.aulas.conta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaEspecialTest extends ContaCorrenteTest {

    @BeforeEach
    public void setUp() {
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @Test
    public void saqueMaiorQueSaldo() {
        int valorSacado = cc.sacar(400);
        int actual = cc.saldo();
        assertAll(
            () -> assertEquals( 200, actual),
            () -> assertEquals(0, valorSacado));
    }
}
