package br.gov.serpro.banco;

import java.time.LocalDate;

public class Extrato {

	private LocalDate data;
	private double credito;
	private int debito;

	public Extrato(LocalDate data, double saldo, int debito) {
		this.data = data;
		this.credito = saldo;
		this.debito = debito;
	}

	public LocalDate getData() {
		return data;
	}

	public double getCredito() {
		return credito;
	}

	public int getDebito() {
		return debito;
	}
	
	
	

}
