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
	private Map<CarroDeCorrida, Integer> carros = new HashMap<>() ;
	
	public Corrida(int tamanho) {
		this.pista = tamanho;
	}
	
	public void adicionaCarro(CarroDeCorrida carro) {
		carros.put(carro, 0 );
	}
	
	private boolean terminou() {
		for(Integer valor : carros.values()) {
			if(valor >= pista)
				return true;
		}
		return false;
	}
	
	public void umDoisTresJa() {
		while(!terminou()) {
			for(CarroDeCorrida carro :  carros.keySet()) {
				carro.acelerar();
				int distancia = carros.get(carro);
				distancia = distancia + carro.getVelocidade();
				carros.put(carro, distancia);
			}
		}
//		
//		List listaValores  = new ArrayList(carros.values());
//		Collections.reverse(listaValores);
//		
//		for(CarroDeCorrida carro :  listaValores) {
//			System.out.println(carro.getNome() + " - "+listaValores);
//			
//			//System.out.println(listaValores);
//		}
		
		for(CarroDeCorrida carro :  carros.keySet()) {
			//List listaValores  = new ArrayList(carros.values());
			//Collections.reverse(listaValores);
			
			System.out.println(carro.getNome() + " - "+carros.get(carro));
			
			//System.out.println(listaValores);
		}
		
		
		   System.out.println("Unsort Map......");
	        //printMap(unsortMap);

	        System.out.println("\nSorted Map......By Key");
	        Map<CarroDeCorrida, Integer> treeMap = new TreeMap<CarroDeCorrida, Integer>(carros);
	        printMap(treeMap);
	        
	      
		
	}

	private void printMap(Map<CarroDeCorrida, Integer> map) {
		for (Map.Entry<CarroDeCorrida, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() 
				+ " Value : " + entry.getValue());
        }
	}

}
