package br.gov.serpro.imc;

public class Paciente {
	static String baixopesomuitograve = "Baixo peso muito grave";
	static String baixopesograve = "Baixo peso grave";
	static String baixopeso = "Baixo peso";
	static String pesonormal = "Peso normal";
	static String sobrepeso = "Sobrepeso";
	static String obesidadegrauI = "Obesidade grau I";
	static String obesidadegrauII = "Obesidade grau II";
	static String obesidadegrauIII = "Obesidade grau III (obesidade mórbida)";
	private Double peso;
	private Double altura;

	public Paciente(Double peso, Double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	private Double calculaIMC() {
		
		Double imc = peso / (altura * altura);
		System.out.println(imc);
		return imc;

	}

	public String diagnostico() {

		if (calculaIMC() < 16.0) {
			return baixopesomuitograve;
		} else if (calculaIMC() >= 16.0 && calculaIMC() <= 16.99) {
			return baixopesograve;
		} else if (calculaIMC() >= 17.0 && calculaIMC() <= 18.49) {
			return baixopeso;
		} else if (calculaIMC() >= 18.5 && calculaIMC() <= 24.99 ) {
			return pesonormal;
		} else if (calculaIMC() >= 25.0 && calculaIMC() <= 29.99) {
			return sobrepeso;
		} else if (calculaIMC() >= 30.0 && calculaIMC() <= 34.99) {
			return obesidadegrauI;
		} else if (calculaIMC() >= 35.0 && calculaIMC() <= 39.99) {
			return obesidadegrauII;
		} 
		return obesidadegrauIII;

	}

}
