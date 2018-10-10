package org.pho.ri.ex2.figuras.impl;

public class TrianguloRetangulo extends Triangulo {

    private double base;

    private double altura;

    private double hipotenusa;

    public TrianguloRetangulo(double base, double altura, double hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = hipotenusa;
    }

    @Override public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override public double calcularPerimetro() {
        return base + altura + hipotenusa;
    }

    @Override public String descricao() {
        return "Triângulo Retângulo";
    }
}
