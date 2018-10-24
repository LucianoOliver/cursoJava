package jogadores;

import java.util.Comparator;

public class Jogador implements Comparable<Jogador>{

	private int gols;
	private String time;
	private String nome;
	
	
	public Jogador(int gols, String time, String nome) {
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

	@Override
	public int compareTo(Jogador outroJogador) {
		if (this.gols < outroJogador.gols) {
            return -1;
        }
        if (this.gols > outroJogador.gols) {
            return 1;
        }
        return 0;
	}

}
