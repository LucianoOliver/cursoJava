package org.pho.aulas.pagamento.impl.features;

public class Conta {

    private final int base;

    private final int dv;

    public Conta(int base, int dv) {
        this.base = base;
        this.dv = dv;
    }

    public int getBase() {
        return base;
    }

    public int getDv() {
        return dv;
    }
}
