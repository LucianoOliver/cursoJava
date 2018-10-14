package org.pho.ri.ex2.figuras.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ElipseTest {

    private static final double RAIO1 = 1;

    private static final double RAIO2 = 2;

    private Elipse elipse;

    @BeforeEach
    public void setUp() {
        elipse = new Elipse(RAIO1, RAIO2);
    }

    @Test
    public void cacularArea() {
        double expected = PI * RAIO1 * RAIO2;
        double actual = elipse.calcularArea();
        assertEquals(expected, actual);
    }

    @Test
    public void calcularPerimetro() {
        double expected = 2 * PI * sqrt((pow(RAIO1, 2) + pow(RAIO2, 2)) / 2);
        double actual = elipse.calcularPerimetro();
        assertEquals(expected, actual);
    }

    @Test
    public void obtemDescricao() {
        String expected = "Elipse";
        String actual = elipse.descricao();
        assertEquals(expected, actual);
    }

}
