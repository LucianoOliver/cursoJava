package org.pho.ri.ex2.figuras.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrianguloTest {

    private Triangulo triangulo = new Triangulo() {

        @Override public double calcularArea() {
            return 0;
        }

        @Override public double calcularPerimetro() {
            return 0;
        }

        @Override public String descricao() {
            return null;
        }
    };

    @Test
    public void existeTriangulo() {
        assertTrue(triangulo.existe(3, 4, 5));
    }

    @Test
    public void naoExisteTriangulo() {
        assertFalse(triangulo.existe(1, 1, 5));
    }
}
