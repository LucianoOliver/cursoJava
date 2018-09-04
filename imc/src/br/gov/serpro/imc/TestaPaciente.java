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
		assertEquals("Baixo peso grave", roberta.diagnostico());
		
	}

}
