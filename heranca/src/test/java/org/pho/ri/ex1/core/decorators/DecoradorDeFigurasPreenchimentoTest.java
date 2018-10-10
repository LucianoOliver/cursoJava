package org.pho.ri.ex1.core.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pho.ri.ex1.core.DecoradorDeFiguras;
import org.pho.ri.ex1.core.decorators.features.Cor;
import org.pho.ri.ex1.figuras.impl.Circulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoradorDeFigurasPreenchimentoTest {

    private static final Cor COR = Cor.PRETO;

    private Circulo figura;

    @BeforeEach
    public void setUp() {
        figura = new Circulo(4);
    }

    @Test
    public void devePreencherFigura() {
        DecoradorDeFiguras decoradorDeFiguras = new DecoradorDeFigurasPreenchimento(figura, COR);
        String expected = "Círculo, preenchimento: PRETO";
        String actual = decoradorDeFiguras.descricao();
        assertEquals(expected, actual);
    }

}
