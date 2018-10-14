package org.pho.ri.ex2.figuras.impl;

public class Retangulo extends Quadrilatero {

    private final double lado1;

    private final double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override public double calcularArea() {
        return lado1 * lado2;
    }

    @Override public double calcularPerimetro() {
        return (lado1 * 2) + (lado2 * 2);
    }

    @Override public String descricao() {
        return "Retângulo";
    }
}
