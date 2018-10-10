package br.gov.serpro.carro;

public class CarroSoma extends CarroDeCorrida {
	private double potencia;
	
	public CarroSoma(String nome, double potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	
	}

	@Override
	public void acelerar() {
		velocidade += potencia;
		if(velocidade > velocidadeMaxima) {
			velocidade =  velocidadeMaxima;
		}
	}

}
