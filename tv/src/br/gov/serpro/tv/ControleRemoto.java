package br.gov.serpro.tv;

public class ControleRemoto {
	
	private Tv tv;
	
	
	
	public ControleRemoto(Tv tv) {
		this.tv = tv;
	}



	public int mudarCanal(int canal) {
		return  tv.mudarCanal(canal);
		
	}

	public int aumentarCanal() {
		return tv.aumentarCanal();
	}
	

	
	
	
	
}
