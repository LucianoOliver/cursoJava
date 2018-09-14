package br.gov.serpro.cofrinhovirtual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Cofrinho {

    private final Collection<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void receberMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void receberMoedas(Moeda... moedas) {
        this.moedas.addAll(Arrays.asList(moedas));
    }

    public int obterValorTotalDepositadoEmCentavos() {
        return moedas.stream().mapToInt(moeda -> moeda.quantidadeEmCentavos()).sum();
    }

    public double obterValorTotalDepositadoEmReais() {
        return obterValorTotalDepositadoEmCentavos() / 100.0;
    }

    public int contarTotalMoedasArmazenadas() {
        return moedas.size();
    }

    public long contarNumeroMoedasComValor(Moeda.Valor valor) {
        return moedas.stream().filter(moeda -> moeda.valor().equals(valor)).count();
    }

    public Moeda obterMoedaComMaiorValorDepositado() {
        return moedas.stream().max(Comparator.comparing(Moeda::valor)).orElse(null);
    }

}
