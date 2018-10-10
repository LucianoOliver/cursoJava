package org.pho.aulas.pagamento;

import org.pho.aulas.pagamento.impl.CartaoCredito;
import org.pho.aulas.pagamento.impl.Cheque;
import org.pho.aulas.pagamento.impl.Dinheiro;
import org.pho.aulas.pagamento.impl.features.Bandeira;
import org.pho.aulas.pagamento.impl.features.Conta;

import java.time.LocalDate;
import java.time.Month;

public class SimuladorPagamento {

    public static void main(String[] args) {
        CaixaRegistradora caixaRegistradora = new CaixaRegistradora();

        Dinheiro dinheiro = new Dinheiro();

        CartaoCredito cartaoCredito = new CartaoCredito(
            "1234567890",
            123,
            LocalDate.of(2020, Month.DECEMBER, 31),
            "FULANO DE TAL",
            Bandeira.VISA);

        Cheque cheque = new Cheque(
            1, 1, 1234, 0, 1,
            new Conta(12345, 2), 1, 123, 12345, 1, "FULANO DE TAL".getBytes()
        );

        caixaRegistradora.pagar(dinheiro, cartaoCredito, cheque);
    }

}
