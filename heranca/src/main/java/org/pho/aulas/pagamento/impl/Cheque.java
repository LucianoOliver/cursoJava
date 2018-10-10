package org.pho.aulas.pagamento.impl;

import org.pho.aulas.pagamento.Pagamento;
import org.pho.aulas.pagamento.TipoPagamento;
import org.pho.aulas.pagamento.impl.features.Conta;

import java.time.LocalDate;
import java.time.Period;

public class Cheque extends Pagamento {

    private final int comp;

    private final int banco;

    private final int agencia;

    private final int dv;

    private final int c1;

    private final Conta conta;

    private final int c2;

    private final int serie;

    private final int numero;

    private final int c3;

    private final byte[] assinaturaDigital;

    private final LocalDate bomPara = LocalDate.now();

    public Cheque(int comp, int banco, int agencia, int dv, int c1,
        Conta conta, int c2, int serie, int numero, int c3, byte[] assinaturaDigital) {
        super(TipoPagamento.CHEQUE);
        this.comp = comp;
        this.banco = banco;
        this.agencia = agencia;
        this.dv = dv;
        this.c1 = c1;
        this.conta = conta;
        this.c2 = c2;
        this.serie = serie;
        this.numero = numero;
        this.c3 = c3;
        this.assinaturaDigital = assinaturaDigital;
    }

    public Cheque(int comp, int banco, int agencia, int dv, int c1,
        Conta conta, int c2, int serie, int numero, int c3, byte[] assinaturaDigital, Period bomPara) {
        super(TipoPagamento.CHEQUE);
        this.comp = comp;
        this.banco = banco;
        this.agencia = agencia;
        this.dv = dv;
        this.c1 = c1;
        this.conta = conta;
        this.c2 = c2;
        this.serie = serie;
        this.numero = numero;
        this.c3 = c3;
        this.assinaturaDigital = assinaturaDigital;
        this.bomPara.plus(bomPara);
    }

    public int getComp() {
        return comp;
    }

    public int getBanco() {
        return banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getDv() {
        return dv;
    }

    public int getC1() {
        return c1;
    }

    public Conta getConta() {
        return conta;
    }

    public int getC2() {
        return c2;
    }

    public int getSerie() {
        return serie;
    }

    public int getNumero() {
        return numero;
    }

    public int getC3() {
        return c3;
    }

    public byte[] getAssinaturaDigital() {
        return assinaturaDigital;
    }

    public LocalDate getBomPara() {
        return bomPara;
    }
}
