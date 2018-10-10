package org.pho.ri.ex2.core.decorators;

import org.pho.ri.ex2.core.DecoradorDeFiguras;
import org.pho.ri.ex2.core.decorators.features.Linha;
import org.pho.ri.ex2.figuras.Figura;

public class DecoradorDeFigurasLinha extends DecoradorDeFiguras {

    private Linha linha;

    public DecoradorDeFigurasLinha(Figura figuraDecorada, Linha linha) {
        super(figuraDecorada);
        this.linha = linha;
    }

    @Override public double calcularArea() {
        return figuraDecorada.calcularArea();
    }

    @Override public double calcularPerimetro() {
        return figuraDecorada.calcularPerimetro();
    }

    @Override public String descricao() {
        return figuraDecorada.descricao() + " com linha " + linha.name();
    }
}
