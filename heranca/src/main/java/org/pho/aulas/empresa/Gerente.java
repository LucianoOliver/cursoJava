package org.pho.aulas.empresa;

public class Gerente extends Empregado {

    private final double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override public double liquido() {
        return super.liquido() + bonus;
    }
}
