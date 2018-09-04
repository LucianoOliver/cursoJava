package br.gov.serpro.imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PacienteTest {

	@Test
	void baixoPesoMuitoGrave() {
		
		
		Paciente elisa = new PacienteBuilder()
							.setPeso(1.5) 
							.setAltura(30.1)
							.getPaciente();
		//new Paciente(30.0, 1.5);
		assertEquals("Baixo peso muito grave", elisa.diagnostico());
		
	}
	
	@Test
	void baixopesograve() {
		Paciente roberta = new Paciente(56.0, 1.5);
		assertEquals("Peso normal", roberta.diagnostico());
		
	}
	
	@Test
	void pesoNormal() {
		Paciente regiane = new Paciente(61.0, 1.65);
		assertEquals("Peso normal", regiane.diagnostico());
		
	}

	@Test
	void pesoNormal2() {
		Paciente luciano = new Paciente(82.0, 1.75);
		assertEquals("Sobrepeso", luciano.diagnostico());
		
	}

}
