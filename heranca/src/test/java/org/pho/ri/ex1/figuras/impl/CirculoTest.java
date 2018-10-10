package org.pho.ri.ex1.figuras.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CirculoTest {

    private static final double RAIO = 1;

    private Circulo circulo;

    @BeforeEach
    public void setUp() {
        circulo = new Circulo(RAIO);
    }

    @Test
    public void cacularArea() {
        double expected = PI * pow(RAIO, 2);
        double actual = circulo.calcularArea();
        assertEquals(expected, actual);
    }

    @Test
    public void calcularPerimetro() {
        double expected = 2 * PI * RAIO;
        double actual = circulo.calcularPerimetro();
        assertEquals(expected, actual);
    }

    @Test
    public void obtemDescricao() {
        String expected = "Círculo";
        String actual = circulo.descricao();
        assertEquals(expected, actual);
    }

}
