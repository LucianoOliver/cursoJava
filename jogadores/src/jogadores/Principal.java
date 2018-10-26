package jogadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Jogador> jogadores = new ArrayList<>();
		jogadores.add(new Jogador(15, "Corinthians", "Neto" ));
		jogadores.add(new Jogador(1, "santos", "Neymar" ));
		jogadores.add(new Jogador(10, "Flamengo", "Zico" ));
		jogadores.add(new Jogador(5, "S�o paulo", "Ra�" ));
		jogadores.add(new Jogador(12, "Corinthians", "Tupanzinho" ));
	
		//Collections.sort(jogadores);
		//Collections.reverse(jogadores);
		
		//jogadores.sort((o1, o2) -> o1.compareTo(o2));
		//Collections.reverseOrder(lista, new JogadoresComparator(15));
		Collections.sort(jogadores, Comparator.comparing(Jogador::getGols).reversed());

		for (Jogador jogador : jogadores) {
			System.out.println(jogador);

		}
		
	}

}
