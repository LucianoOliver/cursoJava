package br.gov.serpro.cofrinhovirtual;

public class Main {

    public static void main(String[] args) {

        final Cofrinho cofrinho = new Cofrinho();

        cofrinho.receberMoeda(new Moeda(Moeda.Valor.CINCO_CENTAVOS));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.CINCO_CENTAVOS));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.CINCO_CENTAVOS));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.DEZ_CENTAVOS));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.DEZ_CENTAVOS));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.UM_CENTAVO));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.UM_CENTAVO));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.UM_CENTAVO));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.UM_CENTAVO));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.UM_CENTAVO));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.UM_CENTAVO));
        cofrinho.receberMoeda(new Moeda(Moeda.Valor.UM_REAL));

        cofrinho.receberMoedas(new Moeda(Moeda.Valor.UM_REAL), new Moeda(Moeda.Valor.UM_REAL), new Moeda(Moeda.Valor.UM_REAL));

        System.out.println("Total de moedas armazenadas: " + cofrinho.contarTotalMoedasArmazenadas());
        System.out.println("Quantidade armazenadas de moedas de um centavo: " + cofrinho.contarNumeroMoedasComValor(Moeda.Valor.UM_CENTAVO));
        System.out.println("Moeda de maior valor armazenada: " + cofrinho.obterMoedaComMaiorValorDepositado().valor());
        System.out.println("Valor total armazenado em centavos de reais: " + cofrinho.obterValorTotalDepositadoEmCentavos());
        System.out.println("Valor total armazenado em reais: " + cofrinho.obterValorTotalDepositadoEmReais());

    }

}
