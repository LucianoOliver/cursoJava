package br.gov.serpro.cofrinhovirtual;

public class Moeda {

    private final Valor valor;

    public Moeda(Valor valorMoeda) {
        this.valor = valorMoeda;
    }

    public int quantidadeEmCentavos() {
        return this.valor.quantidadeEmCentavos;
    }

    public Valor valor() {
        return this.valor;
    }

    public enum Valor {

        UM_CENTAVO(1, "1 centavo"), CINCO_CENTAVOS(5, "5 centavos"), DEZ_CENTAVOS(10, "10 centavos"), VINTE_CINCO_CENTAVOS(25, "25 centavos"), CINQUENTA_CENTAVOS(50, "50 centavos"), UM_REAL(100, "1 real");

        private final int quantidadeEmCentavos;
        private final String descricao;

        Valor(int quantidadeEmCentavos, String descricao) {
            this.quantidadeEmCentavos = quantidadeEmCentavos;
            this.descricao = descricao;
        }

        @Override
        public String toString() {
            return descricao;
        }
    }

}
