package org.pho.ri.ex1.core;

import org.pho.ri.ex1.figuras.Figura;

public class DecoradorDeFiguras extends Figura {

    protected Figura figuraDecorada;

    public DecoradorDeFiguras(Figura figuraDecorada) {
        this.figuraDecorada = figuraDecorada;
    }

}
