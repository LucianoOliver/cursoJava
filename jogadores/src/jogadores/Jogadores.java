package jogadores;

public class Jogadores  implements Comparable<Jogadores>{
	
	
	private Integer gols;
	private String time;
	private String nome;
	
	public Jogadores(String time,  String nome, Integer gols) {
		
		this.time = time;
		this.gols = gols;
		this.nome = nome;
	}

	@Override
	public int compareTo(Jogadores o) {
		
		if(gols.equals(o.gols)) {
			return -1;
		}else {
			return 1;
		}
		
	}

	@Override
	public String toString() {
		return "time = " + time + ", gols = " + gols + ", nome = " + nome  + "\n";
	}
	
	

}
