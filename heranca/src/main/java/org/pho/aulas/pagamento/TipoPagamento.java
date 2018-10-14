package org.pho.aulas.pagamento;

public enum TipoPagamento {

    CARTAO_DE_CREDITO("Cartão de Crédito"),
    CARTAO_DE_DEBITO("Cartão de Débito"),
    DINHEIRO("Dinheiro"),
    CHEQUE("Cheque"),
    PAY_PAL("Paypal"),
    TRANSFERWISE("Transferwise"),
    TRANSFERENCIA_BANCARIA("Transferência Bancária");

    private String descricao;

    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
