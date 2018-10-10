package org.pho.ri.ex2.figuras.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Math.hypot;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TrapezioTest {

    private static final double LADO_MAIOR = 5;

    private static final double LADO_MENOR = 3;

    private static final double ALTURA = 4;

    private Trapezio trapezio;

    @BeforeEach
    public void setUp() {
        trapezio = new Trapezio(LADO_MENOR, LADO_MAIOR, ALTURA);
    }

    @Test
    public void cacularArea() {
        double expected = ((LADO_MAIOR + LADO_MENOR) / 2) * ALTURA;
        double actual = trapezio.calcularArea();
        assertEquals(expected, actual);
    }

    @Test
    public void calcularPerimetro() {
        double ladoInclinado = hypot(ALTURA, LADO_MAIOR - LADO_MENOR);
        double expected = LADO_MAIOR + LADO_MENOR + ALTURA + ladoInclinado;
        double actual = trapezio.calcularPerimetro();
        assertEquals(expected, actual);
    }

    @Test
    public void obtemDescricao() {
        String expected = "Trapézio";
        String actual = trapezio.descricao();
        assertEquals(expected, actual);
    }

}
