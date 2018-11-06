package br.gov.serpro.tratamento;

import br.gov.serpro.tratamento.formatador.FormatadorNome;
import br.gov.serpro.tratamento.formatador.FormatadorRespeitoso;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormasTratamentoRespeitosoTest {

    @Test
    public void deveRetornarSrSobrenomeQuandoGeneroMasculino() {

        FormatadorNome formatadorRespeitoso = new FormatadorRespeitoso(Genero.MASCULINO);
        Autoridade autoridade = new Autoridade("Marcio", "David", formatadorRespeitoso);

        assertEquals("Sr. David", autoridade.getTratamento());
    }

    @Test
    public void deveRetornarSraSobrenomeQuandoGeneroFeminino() {

        FormatadorNome formatadorRespeitoso = new FormatadorRespeitoso(Genero.FEMININO);
        Autoridade autoridade = new Autoridade("Marcia", "David", formatadorRespeitoso);

        assertEquals("Sra. David", autoridade.getTratamento());
    }

}
