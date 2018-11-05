package com.example.demo.util;

public class Ifelse {
	
	public static void main(String[] args) {
		int a = 0;
		
		int b = 1;
		
		boolean retorno = false;
		
		retorno = a == 0 ? true : false;
		System.out.println(retorno);
		
		b = (b == 1) ? 5 : 1;
		
		System.out.println(b);
		
		b = (a >=0) ? 5 : 1;
		System.out.println(b);

		System.out.println(1 == 1 ? "Verdadeiro" : "False");

		String teste = 1 == 1 ? "Verdadeiro" : "False";
		System.out.println(teste);

		
		//getCodigo() != null ? getCodigo().hashCode() : 0;
	}

}
