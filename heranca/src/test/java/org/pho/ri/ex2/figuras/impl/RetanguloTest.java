package org.pho.ri.ex2.figuras.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RetanguloTest {

    private static final double LADO1 = 4;

    private static final double LADO2 = 8;

    private Retangulo retangulo;

    @BeforeEach
    public void setUp() {
        retangulo = new Retangulo(LADO1, LADO2);
    }

    @Test
    public void calcularArea() {
        double expected = LADO1 * LADO2;
        double actual = retangulo.calcularArea();
        assertEquals(expected, actual);
    }

    @Test
    public void calcularPerimetro() {
        double expected = (LADO1 * 2) + (LADO2 * 2);
        double actual = retangulo.calcularPerimetro();
        assertEquals(expected, actual);
    }

    @Test
    public void obtemDescricao() {
        String expected = "Retângulo";
        String actual = retangulo.descricao();
        assertEquals(expected, actual);
    }

}
