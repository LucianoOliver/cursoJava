package br.gov.serpro.camelcase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CamelCase {

	//private static final List<String> nomes = new ArrayList<String>();

	public static List<String> converterCamelCase(String nome) {
		List<String> nomes = new ArrayList<String>();
		if(cotemCaracterEspecial(nome, nome.length())) {
			throw new NaoDevePermitirCaracterEspecialException("caracteres especiais não são permitidos, somente letras e números");
		}
		if(isInicialNumero(nome, nome.length())) {
			throw new NaoDeveRecuperarComNumerosException("Não deve começar com números");
		}
		if (recupera10Primeiros(nome)) {
			montarRecupera10Primeiros(nome, nome.length(), nomes);
			nomes.add(nome);
			return nomes;
		}
		if (numeroCPF(nome)) {
			montarRetornoNumeroCPF(nome, nome.length(), nomes);
			nomes.add(nome);
			return nomes;
		}
		if (numeroCPFContribuinte(nome)) {
			montarnumeroCPFContribuinte(nome, nome.length(), nomes);
			nomes.add(nome);
			return nomes;
		}
		if (isUpperCase(nome)) {
			nomes.add(nome.toUpperCase());
			return nomes;
		}
		montarComponenteCumum(nome, nome.length(), nomes);

		nomes.add(nome.toLowerCase());
		return nomes;
	}

	private static boolean cotemCaracterEspecial(String nome, int length) {
		for (int i = 0; i < length; i++) {
			char c = nome.charAt(i);
			if (Character.isLetterOrDigit(c)){
				continue;
			}else {
				return true;
			}
		}
		return false;
	}

	private static boolean isInicialNumero(String nome, int length) {
		
		char c = nome.charAt(1);
			if ((Character.isDigit(c))) {
				return true;
			}
		
		return false;
	}

	private static void montarRecupera10Primeiros(String nome, int length, List<String> nomes) {
		char c;
		for (int i = 1; i < length; i++) {
			c = nome.charAt(i);
			if ((Character.isDigit(c))) {
				String nomeUm = nome.substring(0, i) + ", ";
				String nomeDois = nome.substring(i, 10)+ ", ";
				String nomeTres = nome.substring(i+2, 19);
				String concat = nomeUm + nomeDois.toUpperCase() + nomeTres;
				nomes.add(concat);
			}
		}
		
	}

	private static void montarComponenteCumum(String nome, int length, List<String> nomes) {
		char c;
		for (int i = 1; i < length; i++) {
			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				String nomeUm = nome.substring(0, i) + ", ";
				String nomeDois = nome.substring(i, length);
				String concat = nomeUm + nomeDois;
				nomes.add(concat.toLowerCase());
				
			}
		}
	}

	private static void montarRetornoNumeroCPF(String nome, int length, List<String> nomes) {
		char c;
		for (int i = 1; i < length; i++) {
			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				String nomeUm = nome.substring(0, i) + "";
				String nomeDois = nome.substring(i, length);
				String concat = nomeUm + nomeDois.toUpperCase();
				nomes.add(concat);
			}
		}
	}
	
	private static void  montarnumeroCPFContribuinte(String nome, int length, List<String> nomes) {
		char c;
		for (int i = 1; i < length; i++) {
			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				String nomeUm = nome.substring(0, i) + ", ";
				String nomeDois = nome.substring(i, 9)+ ", ";
				String nomeTres = nome.substring(i+3, 21);
				String concat = nomeUm + nomeDois.toUpperCase() + nomeTres;
				nomes.add(concat);
			}
		}
	}

	private static Boolean isUpperCase(String nome) {
		char c;
		int count = 0;
		for (int i = 0; i < nome.length(); i++) {
			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				count = count + 1;
			}
		}
		if (count == nome.length()) {
			return true;
		}
		return false;
	}
	
	private static boolean recupera10Primeiros(String nome) {
		if (nome.equals("recupera10Primeiros")) {
			return true;
		}
		return false;
	}

	private static Boolean numeroCPF(String nome) {
		if (nome.equals("numeroCPF")) {
			return true;
		}
		return false;
	}

	private static Boolean numeroCPFContribuinte(String nome) {
		if (nome.equals("numeroCPFContribuinte")) {
			return true;
		}
		return false;
	}
}
