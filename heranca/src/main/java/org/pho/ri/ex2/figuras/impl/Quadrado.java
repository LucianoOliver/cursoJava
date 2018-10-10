package org.pho.ri.ex2.figuras.impl;

public class Quadrado extends Retangulo {

    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override public String descricao() {
        return "Quadrado";
    }
}
