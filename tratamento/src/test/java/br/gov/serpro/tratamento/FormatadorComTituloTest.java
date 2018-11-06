package br.gov.serpro.tratamento;

import br.gov.serpro.tratamento.formatador.FormatadorComTitulo;
import br.gov.serpro.tratamento.formatador.FormatadorNome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatadorComTituloTest {

    @Test
    public void deveRetornarTituloNomeSobrenome() {

        FormatadorNome formatadorComTitulo = new FormatadorComTitulo("Magnifico");
        Autoridade autoridade = new Autoridade("Marcio", "David", formatadorComTitulo);

        assertEquals("Magnifico Marcio David", autoridade.getTratamento());
    }

}
