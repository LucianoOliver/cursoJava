package org.pho.ri.ex1.figuras.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrianguloTest {

    private Triangulo triangulo = new Triangulo();

    @Test
    public void existeTriangulo() {
        assertTrue(triangulo.existe(3, 4, 5));
    }

    @Test
    public void naoExisteTriangulo() {
        assertFalse(triangulo.existe(1, 1, 5));
    }
}
