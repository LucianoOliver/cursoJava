package br.gov.serpro.tv;

public class ControleRemoto {

	private Tv tv;
	private Som som;
	private Tablet tablet;
	private PortaRetratoDigital portaRetratoDigital;
	private Controlavel controlavel;

	public ControleRemoto(Controlavel controlavel) {
		this.controlavel = controlavel;
		
	}

	public int mudarCanal(int canal) {
		return controlavel.mudarCanal(canal);

	}

	public int aumentarCanal() {
		return controlavel.aumentarCanal();
	}

	public int diminuirCanal() {
		return controlavel.diminuirCanal();
	}

	public int aumentarVolume() {
		return controlavel.aumentarVolume();
	}

	public int baixarVolume() {
		return controlavel.baixarVolume();
	}

	public Boolean ligar() {
		return controlavel.ligar();
	}

	public Boolean desligar() {
		return controlavel.desligar();
	}
}
