package br.gov.serpro.tv;

public class PortaRetratoDigital implements Controlavel {

	private static final int ZERO = 0;
	private static final int UM = 1;
	private static final int VOLUME_MAXIMO = 50;
	private static final int VOLUME_MINIMO = 0;
	private int volume;
	private Boolean ligada = false;

	
	@Override
	public int aumentarVolume() {
		if (volume < VOLUME_MAXIMO) {
			this.volume = volume + UM;
		}
		return volume;
	}
	
	@Override
	public int baixarVolume() {
		if (volume > VOLUME_MINIMO) {
			this.volume = volume - UM;
		}
		return volume;
	}
	
	@Override
	public Boolean ligar() {
		return ligada = true;

	}
	
	@Override
	public Boolean desligar() {
		return ligada = false;

	}

	@Override
	public int mudarCanal(int canalMudado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int aumentarCanal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int diminuirCanal() {
		// TODO Auto-generated method stub
		return 0;
	}


}
