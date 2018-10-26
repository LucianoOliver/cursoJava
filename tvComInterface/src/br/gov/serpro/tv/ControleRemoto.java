package br.gov.serpro.tv;

public class ControleRemoto {

	public ControleRemoto() {
		
	}

	public int mudarCanal(ControlavelCanal controlavelCanal, int canal) {
		return controlavelCanal.mudarCanal(canal);

	}

	public int aumentarCanal(ControlavelCanal controlavelCanal) {
		return controlavelCanal.aumentarCanal();
	}

	public int diminuirCanal(ControlavelCanal controlavelCanal) {
		return controlavelCanal.diminuirCanal();
	}

	public int aumentarVolume(ControlavelVolume controlavelVolume) {
		return controlavelVolume.aumentarVolume();
	}

	public int baixarVolume(ControlavelVolume controlavelVolume) {
		return controlavelVolume.baixarVolume();
	}

	public Boolean ligar(Controlavel controlavel) {
		return controlavel.ligar();
	}

	public Boolean desligar(Controlavel controlavel) {
		return controlavel.desligar();
	}
}
