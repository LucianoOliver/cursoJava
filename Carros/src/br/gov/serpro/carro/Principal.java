package br.gov.serpro.carro;

public class Principal {

	public static void main(String[] args) {
		
		CarroDeCorrida corcel = new CarroSoma("corcel", 10, 100);		
		corcel.acelerar();
		corcel.frear();
		corcel.imprimir();
		
		CarroDeCorrida etios = new CarroSoma("etios", 10, 120);

		etios.acelerar();
		etios.frear();
		etios.frear();
		etios.imprimir();
		
		CarroDeCorrida corolla =new CarroSoma("corolla", 10, 80);

		corolla.acelerar();
		corolla.imprimir();
		corolla.frear();
		corolla.imprimir();
		corolla.acelerar();
		corolla.imprimir();
		
		
	}

}
