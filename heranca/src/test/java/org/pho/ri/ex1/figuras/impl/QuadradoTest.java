package org.pho.ri.ex1.figuras.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadradoTest {

    private static final double LADO = 8;

    private Quadrado quadrado;

    @BeforeEach
    public void setUp() {
        quadrado = new Quadrado(LADO);
    }

    @Test
    public void calcularArea() {
        double expected = LADO * LADO;
        double actual = quadrado.calcularArea();
        assertEquals(expected, actual);
    }

    @Test
    public void calcularPerimetro() {
        double expected = (LADO * 4);
        double actual = quadrado.calcularPerimetro();
        assertEquals(expected, actual);
    }

    @Test
    public void obtemDescricao() {
        String expected = "Quadrado";
        String actual = quadrado.descricao();
        assertEquals(expected, actual);
    }

}
