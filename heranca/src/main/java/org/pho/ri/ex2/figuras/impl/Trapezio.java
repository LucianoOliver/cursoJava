package org.pho.ri.ex2.figuras.impl;

import static java.lang.Math.hypot;

public class Trapezio extends Quadrilatero {

    private final double ladoMenor;

    private final double ladoMaior;

    private final double altura;

    private final double ladoInclinado;

    public Trapezio(double ladoMenor, double ladoMaior, double altura) {
        this.ladoMenor = ladoMenor;
        this.ladoMaior = ladoMaior;
        this.altura = altura;
        this.ladoInclinado = hypot(altura, ladoMaior - ladoMenor);
    }

    @Override public double calcularArea() {
        return ((ladoMaior + ladoMenor) / 2) * altura;
    }

    @Override public double calcularPerimetro() {
        return ladoMaior + ladoMenor + altura + ladoInclinado;
    }

    @Override public String descricao() {
        return "Trapézio";
    }
}
