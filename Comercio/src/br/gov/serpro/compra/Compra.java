package br.gov.serpro.compra;

public class Compra {

	int valorTotal;
	int numerosParcelas;

	// a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		numerosParcelas = 1;
	}

	// parcelado
	public Compra(int qtdParcelas, int valorParcelas) {
		this.valorTotal = valorParcelas * qtdParcelas;
		this.numerosParcelas = qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumerosParcelas() {
		return numerosParcelas;
	}

	public int getValorParcela() {
		return valorTotal / numerosParcelas;
	}

}
