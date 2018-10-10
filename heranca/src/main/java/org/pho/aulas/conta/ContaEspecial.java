package org.pho.aulas.conta;

public class ContaEspecial extends ContaCorrente {

    private int limite;

    public ContaEspecial(int limite) {
        this.limite = limite;
    }

    @Override public int sacar(int valor) {
        if (valor > (saldo + limite)) {
            return 0;
        } else {
            saldo -= valor;
            return saldo;
        }
    }
}
