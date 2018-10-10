package org.pho.ri.ex2.figuras.impl;

import static java.lang.Math.*;

public class Elipse extends Circulo {

    private final double raio2;

    public Elipse(double raio1, double raio2) {
        super(raio1);
        this.raio2 = raio2;
    }

    @Override public double calcularArea() {
        return PI * raio * raio2;
    }

    @Override public double calcularPerimetro() {
        return 2 * PI * sqrt((pow(raio, 2) + pow(raio2, 2)) / 2);
    }

    @Override public String descricao() {
        return "Elipse";
    }
}
