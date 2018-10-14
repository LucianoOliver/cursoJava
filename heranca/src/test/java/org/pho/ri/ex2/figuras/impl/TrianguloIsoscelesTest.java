package org.pho.ri.ex2.figuras.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

class TrianguloIsoscelesTest {

    private static final int LADO = 5;

    private static final int BASE = 8;

    private TrianguloIsosceles trianguloIsosceles;

    @BeforeEach
    public void setUp() {
        trianguloIsosceles = new TrianguloIsosceles(LADO, BASE);
    }

    @Test
    public void calcularArea() {
        boolean existe = existe(LADO, LADO, BASE);
        double expected = existe ? ((BASE * altura()) / 2) : -1;
        double actual = trianguloIsosceles.calcularArea();

        assertAll(
            () -> assertTrue(existe),
            () -> assertEquals(expected, actual));
    }

    @Test
    public void calcularPerimetro() {
        boolean existe = existe(LADO, LADO, BASE);
        double expected = existe ? BASE + LADO * 2 : -1;
        double actual = trianguloIsosceles.calcularPerimetro();

        assertAll(
            () -> assertTrue(existe),
            () -> assertEquals(expected, actual));
    }

    @Test
    public void obtemDescricao() {
        String expected = "Triângulo Isósceles";
        String actual = trianguloIsosceles.descricao();
        assertEquals(expected, actual);
    }

    private double altura() {
        return sqrt(pow(LADO, 2) - pow(BASE / 2, 2));
    }

    public boolean existe(double a, double b, double c) {
        boolean condition1 = (Math.signum(b - c) < a) && a < (b + c);
        boolean condition2 = (Math.signum(a - c) < b) && b < (a + c);
        boolean condition3 = (Math.signum(a - b) < c) && c < (a + b);

        return condition1 && condition2 && condition3;
    }
}
