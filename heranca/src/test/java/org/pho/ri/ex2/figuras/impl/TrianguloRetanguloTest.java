package org.pho.ri.ex2.figuras.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloRetanguloTest {

    private static final double BASE = 4;

    private static final double ALTURA = 3;

    private static final double HIPOTENUSA = 5;

    private TrianguloRetangulo trianguloRetangulo;

    @BeforeEach
    public void setUp() {
        trianguloRetangulo = new TrianguloRetangulo(BASE, ALTURA, HIPOTENUSA);
    }

    @Test
    public void calcularArea() {
        boolean existe = existe(BASE, ALTURA, HIPOTENUSA);
        double expected = existe ? ((BASE * ALTURA) / 2) : -1;
        double actual = trianguloRetangulo.calcularArea();

        assertAll(
            () -> assertTrue(existe),
            () -> assertEquals(expected, actual));
    }

    @Test
    public void calcularPerimetro() {
        boolean existe = existe(BASE, ALTURA, HIPOTENUSA);
        double expected = existe ? BASE + ALTURA + HIPOTENUSA : -1;
        double actual = trianguloRetangulo.calcularPerimetro();

        assertAll(
            () -> assertTrue(existe),
            () -> assertEquals(expected, actual));
    }

    @Test
    public void obtemDescricao() {
        String expected = "Triângulo Retângulo";
        String actual = trianguloRetangulo.descricao();
        assertEquals(expected, actual);
    }

    public boolean existe(double a, double b, double c) {
        boolean condition1 = (Math.signum(b - c) < a) && a < (b + c);
        boolean condition2 = (Math.signum(a - c) < b) && b < (a + c);
        boolean condition3 = (Math.signum(a - b) < c) && c < (a + b);

        return condition1 && condition2 && condition3;
    }

}
