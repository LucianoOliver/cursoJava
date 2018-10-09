package br.gov.serpro.carro;

public class Principal {

	public static void main(String[] args) {
		
		Carro corcel = new Carro("corcel", 10, 100);		
		corcel.acelerar();
		corcel.frear();
		corcel.imprimir();
		
		Carro etios = new Carro("etios", 10, 120);

		etios.acelerar();
		etios.frear();
		etios.frear();
		etios.imprimir();
		
		Carro corolla =new Carro("corolla", 10, 80);

		corolla.acelerar();
		corolla.imprimir();
		corolla.frear();
		corolla.imprimir();
		corolla.acelerar();
		corolla.imprimir();
		
		
	}

}
