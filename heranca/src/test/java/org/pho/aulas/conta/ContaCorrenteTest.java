package org.pho.aulas.conta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaCorrenteTest {

    protected ContaCorrente cc;

    @BeforeEach
    public void setUp() {
        cc = new ContaCorrente();
        cc.depositar(200);
    }

    @Test
    public void saque() {
        int valorSacado = cc.sacar(100);
        int actual = cc.saldo();
        assertAll(
            () -> assertEquals(100, actual),
            () -> assertEquals(100, valorSacado));
    }

    @Test
    public void saqueMaiorQueSaldo() {
        int valorSacado = cc.sacar(300);
        int actual = cc.saldo();
        assertAll(
            () -> assertEquals(200, actual),
            () -> assertEquals(0, valorSacado));
    }

    @Test
    public void deposito() {
        int actual = cc.saldo();
        assertEquals(200, actual);
    }

}
