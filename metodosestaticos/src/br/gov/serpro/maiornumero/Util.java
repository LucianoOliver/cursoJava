package br.gov.serpro.maiornumero;

import java.util.Formatter;
import java.util.Random;

public class Util {

	public static int maiorNumero(int valorUm, int valorDois) {
		if(valorUm > valorDois) {
			return valorUm;
		}
		return valorDois;
	}
	
	 public static int converteCelsiusParafahrenheit(int cels) {
		  int celsius;
	      celsius = (cels - 32) * 5 / 9;
	      return celsius;
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
	
	public static int numeroAleatorio(int min, int max){

	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	private static int calcularDigito(String str, int[] peso) {
	      int soma = 0;
	      for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
	         digito = Integer.parseInt(str.substring(indice,indice+1));
	         soma += digito*peso[peso.length-str.length()+indice];
	      }
	      soma = 11 - soma % 11;
	      return soma > 9 ? 0 : soma;
	   }
	
	public static boolean validaCpf(String cpf) {
		   int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
	      if ((cpf==null) || (cpf.length()!=11)) return false;

	      Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
	      Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
	      return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
	   }

	public static String formatarCpf(String cpf) {
		String cpf_formatado = "";

		cpf_formatado = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11); 
				return cpf_formatado;
	}


}
