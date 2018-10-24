package jogadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Jogadores> lista = new ArrayList<>();
		lista.add(new Jogadores(15, "Corinthians", "Neto" ));
		lista.add(new Jogadores(1, "santos", "Neymar" ));
		lista.add(new Jogadores(10, "Flamengo", "Zico" ));
		lista.add(new Jogadores(5, "São paulo", "Raí" ));
		lista.add(new Jogadores(12, "Corinthians", "Tupanzinho" ));
		
		
	
		//Collections.sort(lista);
		//Collections.reverseOrder(lista, new JogadoresComparator(15));
		Collections.sort(lista, Comparator.comparing(Jogadores::getGols));

		for (Jogadores jogadores : lista) {
			System.out.println(jogadores);

		}
		
	}

}
