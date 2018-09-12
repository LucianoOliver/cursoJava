package br.gov.serpro.calculadora;

public class Calculadora {

	public static int somar(int valorUm, int valorDois) {
		if(valorUm > valorDois) {
			return valorUm;
		}
		return valorDois;

	}

	public static int subtrair(int valorUm, int valorDois) {

		return valorUm - valorDois;

	}

	public static int multiplicar(int valorUm, int valorDois) {

		return valorUm * valorDois;

	}

	public static int dividir(int valorUm, int valorDois) {

		return valorUm / valorDois;

	}

}
