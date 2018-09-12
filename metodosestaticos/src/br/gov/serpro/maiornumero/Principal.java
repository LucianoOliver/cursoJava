package br.gov.serpro.maiornumero;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Retorna maior número = "+Util.maiorNumero(11, 12));
		System.out.println("Converte Celsius para Fahrenheit = "+Util.converteCelsiusParafahrenheit(25));
		System.out.println("Numero a aleatório = "+Util.numeroAleatorio(4, 8));
		System.out.println("Dividir = " +Util.validaCpf("71008545040"));
		System.out.println("Dividir = " +Util.formatarCpf("71008545040"));

	}

}
