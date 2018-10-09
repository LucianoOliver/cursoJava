package br.gov.serpro.carro;

public class Carro {
	private int potencia;
	private int velocidade;
	private int velocidadeMaxima;
	private String nome;
	

	public Carro(String nome, int potencia, int velocidadeMaxima) {
		this.potencia = potencia;
		this.velocidade = 0;
		this.velocidadeMaxima = velocidadeMaxima;
		this.nome = nome;
	}
	
	

	public void acelerar() {
		velocidade = velocidade + potencia;
		if(velocidade > velocidadeMaxima) {
			velocidade =  velocidadeMaxima;
		}
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
