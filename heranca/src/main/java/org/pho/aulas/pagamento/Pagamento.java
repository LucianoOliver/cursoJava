package org.pho.aulas.pagamento;

public abstract class Pagamento {

    protected TipoPagamento tipoPagamento;

    public Pagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getDescricaoPagamento() {
        return tipoPagamento.getDescricao();
    }

}
