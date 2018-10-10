package org.pho.aulas.pagamento.impl;

import org.pho.aulas.pagamento.Pagamento;
import org.pho.aulas.pagamento.TipoPagamento;
import org.pho.aulas.pagamento.impl.features.Bandeira;

import java.time.LocalDate;

public class CartaoCredito extends Pagamento {

    private final String numeroCartao;

    private final int codigoSeguranca;

    private final LocalDate dataExpiracao;

    private final String titular;

    private final Bandeira bandeira;

    public CartaoCredito(String numeroCartao, int codigoSeguranca, LocalDate dataExpiracao, String titular,
        Bandeira bandeira) {
        super(TipoPagamento.CARTAO_DE_CREDITO);
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
        this.dataExpiracao = dataExpiracao;
        this.titular = titular;
        this.bandeira = bandeira;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public String getTitular() {
        return titular;
    }
}
