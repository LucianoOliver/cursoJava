package br.gov.serpro.tratamento;

import br.gov.serpro.tratamento.formatador.FormatadorNome;

public class Autoridade {

    private final String nome;
    private final String sobrenome;
    private final FormatadorNome formatadorNome;

    public Autoridade(String nome, String sobrenome, FormatadorNome formatadorNome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.formatadorNome = formatadorNome;
    }

    public String getTratamento() {
        return formatadorNome.formatarNome(this.nome, this.sobrenome);
    }

}
