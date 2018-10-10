package org.pho.ri.ex2.figuras.impl;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TrianguloIsosceles extends Triangulo {

    private double lado;

    private double base;

    public TrianguloIsosceles(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    @Override public double calcularArea() {
        return existe(lado, lado, base) ? ((base * altura()) / 2) : -1;
    }

    @Override public double calcularPerimetro() {
        return existe(lado, lado, base) ? ((lado * 2) + base) : -1;
    }

    @Override public String descricao() {
        return "Triângulo Isósceles";
    }

    private double altura() {
        return sqrt(pow(lado, 2) - pow(base / 2, 2));
    }
}
