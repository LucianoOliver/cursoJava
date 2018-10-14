package org.pho.ri.ex1.figuras.impl;

public class Quadrado extends Retangulo {

    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override public String descricao() {
        return "Quadrado";
    }
}
