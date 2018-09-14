package br.gov.serpro.academiadespo.cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

	/**
	 * Lista onde ficarão todas as moedas
	 */
	private List<Moeda> moedas = new ArrayList<>();

	/**
	 * Adiciona uma moeda ao cofrinho
	 * 
	 * @param moeda
	 */
	public void adicionarMoeda(Moeda moeda) {
		moedas.add(moeda);
	}

	/**
	 * Adiciona uma moeda ao cofrinho
	 * 
	 * @param valorMoeda
	 */
	public void adicionarMoeda(ValorMoeda valorMoeda) {
		moedas.add(new Moeda(valorMoeda));
	}

	/**
	 * Calcula o total de moedas no cofrinho
	 * 
	 * @return
	 */
	public Integer calcularQuantidadeTotalMoedas() {
		return moedas.size();
	}

	/**
	 * Calcula o total de moedas no cofrinho
	 * 
	 * @return
	 */
	public Integer calcularQuantidadeTotalMoedas_NaoOtimizado() {

		int quantidadeTotalMoedas = 0;

		for (Moeda moeda : moedas) {
			quantidadeTotalMoedas++;
		}

		return quantidadeTotalMoedas;
	}
	
	/**
	 * Soma o total de moedas no cofrinho
	 * @return
	 */
	public Double calcularValorTotalMoedas() {

		double valorTotalMoedas = 0;

		for (Moeda moeda : moedas) {
			valorTotalMoedas += moeda.getValorEmReais();
		}

		return valorTotalMoedas;
	}


	/**
	 * Obtem a quantidade de Moedas de algum valor
	 * 
	 * @param moedaDeComparar
	 * @return
	 */
	public Integer obterQuantidadeMoedasPorMoeda(Moeda moedaDeComparar) {

		int quantidadeMoedas = 0;

		for (Moeda moeda : moedas) {
			if (moeda.getValorMoeda() == moedaDeComparar.getValorMoeda()) {
				quantidadeMoedas++;
			}
		}

		return quantidadeMoedas;
	}

	/**
	 * Obtem a quantidade de Moedas de algum valor
	 * 
	 * @param valorMoeda
	 * @return
	 */
	public Integer obterQuantidadeMoedasPorMoeda(ValorMoeda valorMoeda) {
		return (int) this.moedas.stream().filter(moeda -> moeda.getValorMoeda() == valorMoeda).count();
	}

	/**
	 * Retorna o valor da moeda de maior valor dentro do cofrinho
	 * @return
	 */
	public Double obterValorDaMoedaDeMaiorValorDentroCofrinho() {

		double maiorValor = 0.0;

		for (Moeda moeda : moedas) {
			if (moeda.getValorEmReais() > maiorValor) {
				maiorValor = moeda.getValorEmReais();
			}
		}

		return maiorValor;
	}

}
