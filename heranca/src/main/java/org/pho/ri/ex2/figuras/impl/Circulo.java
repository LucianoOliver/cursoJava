package org.pho.ri.ex2.figuras.impl;

import org.pho.ri.ex2.figuras.Figura;

import static java.lang.Math.PI;

public class Circulo implements Figura {

    protected final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override public double calcularArea() {
        return PI * Math.pow(raio, 2);
    }

    @Override public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    @Override public String descricao() {
        return "Círculo";
    }
}
