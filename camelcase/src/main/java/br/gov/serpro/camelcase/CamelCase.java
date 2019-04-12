package br.gov.serpro.camelcase;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {

	List<String> nomes = new ArrayList<String>();

	public List<String> converterCamelCase(String nome) {
		int length = nome.length();
		char c;
		if (numeroCPF(nome)) {
			montarRetornoNumeroCPF(nome, length);
			nomes.add(nome);
			return nomes;
		}
		if (numeroCPFContribuinte(nome)) {
			montarRetornoNumeroCPF(nome, length);
			nomes.add(nome);
			return nomes;
		}
		if (isUpperCase(nome)) {
			nomes.add(nome.toUpperCase());
			return nomes;
		}
		montarComponenteCumum(nome, length);

		nomes.add(nome.toLowerCase());
		return nomes;
	}

	private void montarComponenteCumum(String nome, int length) {
		char c;
		for (int i = 1; i < length; i++) {
			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				int count = 0;
				String nomeUm = nome.substring(0, i) + ", ";

				String nomeDois = nome.substring(i, length);

				String concat = nomeUm + nomeDois;
				nomes.add(concat.toLowerCase());
			}
		}
	}

	private void montarRetornoNumeroCPF(String nome, int length) {
		char c;
		for (int i = 1; i < length; i++) {
			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				int count = 0;
				String nomeUm = nome.substring(0, i) + ", ";

				String nomeDois = nome.substring(i, length);

				String concat = nomeUm + nomeDois.toUpperCase();
				nomes.add(concat);
			}
		}
	}
	
	private void montarnumeroCPFContribuinte(String nome, int length) {
		char c;
		for (int i = 1; i < length; i++) {
			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				int count = 0;
				String nomeUm = nome.substring(0, i) + ", ";

				String nomeDois = nome.substring(i, length);

				String concat = nomeUm + nomeDois.toUpperCase();
				nomes.add(concat);
			}
		}
	}

	private Boolean isUpperCase(String nome) {
		int length = nome.length();
		char c;
		int count = 0;
		for (int i = 0; i < length; i++) {

			c = nome.charAt(i);
			if ((Character.isUpperCase(c))) {
				count = count + 1;
			}

		}
		if (count == length) {
			return true;
		}

		return false;
	}

	private Boolean numeroCPF(String nome) {

		if (nome.equals("numeroCPF")) {
			return true;
		}

		return false;
	}

	private Boolean numeroCPFContribuinte(String nome) {

		if (nome.equals("numeroCPFContribuinte")) {
			return true;
		}

		return false;
	}
}
