package br.gov.serpro.tv;

public class ControleRemoto {

	private Tv tv;

	public ControleRemoto(Controlavel controlavel) {
		this.tv = tv;
	}

	public int mudarCanal(int canal) {
		return tv.mudarCanal(canal);

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
		return tv.ligar();
	}

	public Boolean desligar() {
		return tv.desligar();
	}
}
