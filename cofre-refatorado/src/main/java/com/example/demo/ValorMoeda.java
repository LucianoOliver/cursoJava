package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public enum ValorMoeda {
	
	CINCO_CENTAVOS(0.05), DEZ_CENTAVOS(0.10), VINTE_CINCO_CENTAVOS(0.25), CINQUENTA_CENTAVOS(0.50), UM_REAL(1.00);
	
	
	private Double valor;
	
	ValorMoeda(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}

}
