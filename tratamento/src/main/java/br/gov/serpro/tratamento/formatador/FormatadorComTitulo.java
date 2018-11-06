package br.gov.serpro.tratamento.formatador;

public class FormatadorComTitulo implements FormatadorNome {

    private String titulo;

    public FormatadorComTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String formatarNome(String nome, String sobrenome) {
        return this.titulo + " " + nome + " " + sobrenome;
    }

}
