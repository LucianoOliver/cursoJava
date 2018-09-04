package br.gov.serpro.imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaPaciente {

	@Test
	void baixoPesoMuitoGrave() {
		Paciente elisa = new Paciente(30.0, 1.5);
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
		assertEquals("Peso normal", luciano.diagnostico());
		
	}

}
