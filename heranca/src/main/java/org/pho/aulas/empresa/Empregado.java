package org.pho.aulas.empresa;

public class Empregado {

    private static final double FATOR = 0.85;

    private final String nome;

    private final double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double liquido() {
        return salario * FATOR;
    }
}
