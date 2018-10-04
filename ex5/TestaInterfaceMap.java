package com.matera.ex5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestaInterfaceMap {

	public static void main(String[] args) {

		Map<Integer, String> mapaNomes = new HashMap<>();
		mapaNomes.put(1, "João Delfino");
		mapaNomes.put(2, "Maria do Carmo");
		mapaNomes.put(3, "Claudinei Silva2");
		mapaNomes.put(4, "Claudinei Silva3");

		System.out.println(mapaNomes);

		// resgatando o nome da posição 2
		System.out.println(mapaNomes.get(3));
		System.out.println(mapaNomes.values());
		System.out.println(mapaNomes.keySet());
		System.out.println(mapaNomes.entrySet());

		Set<Entry<Integer, String>> set = mapaNomes.entrySet();
		Iterator it = set.iterator();
		System.out.println("--------------------////-----------------------");
		System.out.println("Código\t\tValor");

		while (it.hasNext()) {
			Entry<Integer, String> entry = (Entry) it.next();
			System.out.println(entry.getKey() + "\t\t" + entry.getValue());
		}
		System.out.println("--------------------////-----------------------");
		for (int i = 1; i <= mapaNomes.size(); i++) {
			System.out.println(i + " - " + mapaNomes.get(i));
		}
		
		
		
		System.out.println("--------------------////-----------------------");
		ComparatorInts compInt = new ComparatorInts(mapaNomes);
	     
	    Map<Integer, String> mapaOrdenado = new TreeMap(compInt);
	    mapaOrdenado.putAll(mapaNomes);
	     
	    for(Integer valor : mapaOrdenado.keySet()){
	      System.out.println(valor + " " + mapaNomes.get(valor));
	    }

	}
}