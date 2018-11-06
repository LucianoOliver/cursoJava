package br.gov.serpro.tratamento.formatador;

import br.gov.serpro.tratamento.Genero;

public class FormatadorRespeitoso implements FormatadorNome {

    private Genero genero;

    public FormatadorRespeitoso(Genero genero) {
        this.genero = genero;
    }

    public String formatarNome(String nome, String sobrenome) {
        return this.genero.getTratamento() + " "  + sobrenome;
    }
}
