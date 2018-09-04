package br.gov.serpro.imc;

public class PacienteBuilder {
	
	private Double peso;
	private Double altura;
	
	
	public PacienteBuilder setPeso(Double peso) {
		this.peso = peso;
		return this;
	}
	public PacienteBuilder setAltura(Double altura) {
		this.altura = altura;
		return this;
	}
	
	
	public Paciente getPaciente() {
		return new Paciente(peso, altura);
		
}

	
	

}
