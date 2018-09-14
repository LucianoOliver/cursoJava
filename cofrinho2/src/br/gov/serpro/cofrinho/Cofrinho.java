package br.gov.serpro.cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

	List<Moeda> moedasDepositadas = new ArrayList<>();

	void adicionarMoeda(Moeda moeda1) {

		moedasDepositadas.add(moeda1);
	}

	double calcularTotalDepositado() {
		double totalDepositado = 0;
		for (int i = 0; i < moedasDepositadas.size(); i++) {
			Moeda moedaLida = moedasDepositadas.get(i);
			totalDepositado = totalDepositado + moedaLida.valor;
		}
		return totalDepositado;
	}

	int contarMoedaDepositada() {
		int numeroMoedaDepositada = moedasDepositadas.size();
		return numeroMoedaDepositada;
	}

	int contarMoedaPorValor(double valor) {
		int numeroMoedaDoValor = 0;
		for (int i = 0; i < moedasDepositadas.size(); i++) {
			Moeda moedaLida = moedasDepositadas.get(i);
			if (moedaLida.valor == valor) {
				numeroMoedaDoValor = numeroMoedaDoValor + 1;
			}
		}
		return numeroMoedaDoValor;
	}

	double identificarMoedaMaiorValor() {
		double maiorValor = 0;
		for (int i = 0; i < moedasDepositadas.size(); i++) {
			Moeda moedaLida = moedasDepositadas.get(i);
			if (moedaLida.valor > maiorValor) {
				maiorValor = moedaLida.valor;
			}
			//maiorValor = moedaLida.valor;

		}
		return maiorValor;
	}

}