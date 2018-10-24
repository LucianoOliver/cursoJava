package jogadores;

import java.util.Comparator;

public class Jogadores {

	private int gols;
	private String time;
	private String nome;
	
	
	public Jogadores(int gols, String time, String nome) {
		super();
		this.gols = gols;
		this.time = time;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "nome = " + nome+" time = " + time + ", gols = " + gols + "\n";
	}

//	@Override
//	public String toString() {
//		return "gols = " + gols;
//	}

	public Integer getGols() {
		return gols;
	}

}
