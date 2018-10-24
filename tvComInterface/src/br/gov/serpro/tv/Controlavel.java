package br.gov.serpro.tv;

public interface Controlavel {
	
	public int mudarCanal(int canalMudado);
	public int aumentarCanal();
	public int diminuirCanal();

	public int aumentarVolume();

	public int baixarVolume();

	public Boolean ligar();

	public Boolean desligar();
}
