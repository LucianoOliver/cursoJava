package br.gov.serpro.tratamento;

public enum Genero {

    MASCULINO("Sr."), FEMININO("Sra.");

    private String tratamento;

    Genero(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getTratamento() {
        return tratamento;
    }
}
