package org.pho.ri.ex2.core;

import org.pho.ri.ex2.figuras.Figura;

public abstract class DecoradorDeFiguras implements Figura {

    protected Figura figuraDecorada;

    public DecoradorDeFiguras(Figura figuraDecorada) {
        this.figuraDecorada = figuraDecorada;
    }

}
