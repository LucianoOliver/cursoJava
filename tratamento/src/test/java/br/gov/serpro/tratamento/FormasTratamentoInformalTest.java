package br.gov.serpro.tratamento;

import br.gov.serpro.tratamento.formatador.FormatadorInformal;
import br.gov.serpro.tratamento.formatador.FormatadorNome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormasTratamentoInformalTest {

    @Test
    public void deveRetornarPrimeiroNome() {

        FormatadorNome formatadorInformal = new FormatadorInformal();
        Autoridade autoridade = new Autoridade("Marcio", "David", formatadorInformal);

        assertEquals("Marcio", autoridade.getTratamento());
    }

}
