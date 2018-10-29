package br.gov.serpro.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class Pessoa {
	private LocalDate dataNasimento;
	private String nome;

	public Pessoa(String nome, LocalDate dataNasimento) {
		this.nome = nome;
		this.dataNasimento = dataNasimento;
	}

	public int getIdade(LocalDate dataAtual) {
		final Period periodo = Period.between(dataNasimento, dataAtual);
		return periodo.getYears();
	}

	public String getSigno() {
		int mes = dataNasimento.getMonthValue();
		int dia = dataNasimento.getDayOfMonth();

		Signo signo = new Signo(mes, dia);
		return signo.toString();

	}

	public String diaSemana() {
		return dataNasimento.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt"));
	}

}
