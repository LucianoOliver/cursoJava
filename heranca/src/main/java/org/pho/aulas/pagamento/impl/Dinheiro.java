package org.pho.aulas.pagamento.impl;

import org.pho.aulas.pagamento.Pagamento;
import org.pho.aulas.pagamento.TipoPagamento;

public class Dinheiro extends Pagamento {

    public Dinheiro() {
        super(TipoPagamento.DINHEIRO);
    }
}
