package org.pho.ri.ex1.core.decorators;

import org.pho.ri.ex1.core.DecoradorDeFiguras;
import org.pho.ri.ex1.core.decorators.features.Cor;
import org.pho.ri.ex1.figuras.Figura;

public class DecoradorDeFigurasPreenchimento extends DecoradorDeFiguras {

    private Cor preenchimento;

    public DecoradorDeFigurasPreenchimento(Figura figuraDecorada, Cor preenchimento) {
        super(figuraDecorada);
        this.preenchimento = preenchimento;
    }

    @Override public double calcularArea() {
        return figuraDecorada.calcularArea();
    }

    @Override public double calcularPerimetro() {
        return figuraDecorada.calcularPerimetro();
    }

    @Override public String descricao() {
        return figuraDecorada.descricao() + ", preenchimento: " + preenchimento.name();
    }
}
