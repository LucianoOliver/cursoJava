package org.pho.aulas.pagamento;

public class CaixaRegistradora {

    public void pagar(Pagamento... pagamentos) {
        for (Pagamento pagamento : pagamentos) {
            System.out.println(pagamento.getDescricaoPagamento());
        }
    }

}
