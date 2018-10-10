package br.gov.serpro.carro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Corrida {
	private int pista;
	private Map<CarroDeCorrida, Integer> carros = new HashMap<>();

	public Corrida(int tamanho) {
		this.pista = tamanho;
	}

	public void adicionaCarro(CarroDeCorrida carro) {
		carros.put(carro, 0);
	}

	private boolean terminou() {
		for (Integer valor : carros.values()) {
			if (valor >= pista)
				return true;
		}
		return false;
	}

	public void umDoisTresJa() {
		while (!terminou()) {
			for (CarroDeCorrida carro : carros.keySet()) {
				carro.acelerar();
				int distancia = carros.get(carro);
				distancia = distancia + carro.getVelocidade();
				carros.put(carro, distancia);
			}
		}

		for (CarroDeCorrida carro : carros.keySet()) {
			String retorno = carro.getNome();
		 
			System.out.println(carro.getNome() + " - " + carros.get(carro));

		}

	}
}
