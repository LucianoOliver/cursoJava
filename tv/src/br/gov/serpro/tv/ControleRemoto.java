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
	
	public int diminuirCanal() {
		return tv.diminuirCanal();
	}
	
	public int aumentarVolume() {
		return tv.aumentarVolume();
	}



	public int baixarVolume() {
		return tv.baixarVolume();
	}
	
	public Boolean ligar() {
		return tv.ligada();
	}



	public Boolean desligar() {
		return tv.desligada();
	}

	
	
	
	
}
