package jogadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Jogadores> lista = new ArrayList<>();
		lista.add(new Jogadores("Corinthians", "Neto", 15));
		lista.add(new Jogadores("São paulo", "Raí", 3));
		lista.add(new Jogadores("Santos", "Neymar", 1));
		lista.add(new Jogadores("Vasco da Gama", "Romário", 15));
	
		Collections.sort(lista);
		for (Jogadores jogadores : lista) {
			System.out.println(jogadores);

		}
		
	}

}
