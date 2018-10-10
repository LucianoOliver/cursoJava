package org.pho.ri.ex2.core.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pho.ri.ex2.core.DecoradorDeFiguras;
import org.pho.ri.ex2.core.decorators.features.Linha;
import org.pho.ri.ex2.figuras.impl.Circulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoradorDeFigurasLinhaTest {

    private static final Linha LINHA = Linha.PONTILHADO;

    private Circulo figura;

    @BeforeEach
    public void setUp() {
        figura = new Circulo(4);
    }

    @Test
    public void devePreencherFigura() {
        DecoradorDeFiguras decoradorDeFiguras = new DecoradorDeFigurasLinha(figura, LINHA);
        String expected = "Círculo com linha PONTILHADO";
        String actual = decoradorDeFiguras.descricao();
        assertEquals(expected, actual);
    }
}
