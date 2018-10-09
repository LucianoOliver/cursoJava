package br.gov.serpro.carro;

public abstract class CarroDeCorrida {

	public abstract void acelerar();

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;
	
	public CarroDeCorrida(String nome,  int velocidadeMaxima) {
		this.velocidade = 0;
		this.velocidadeMaxima = velocidadeMaxima;
		this.nome = nome;
	}

	public void frear() {
		velocidade = velocidade / 2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void imprimir() {
		System.out.println("O carro "+nome+" esta a velocidade de "+velocidade +" km/h");
	}

	
}
