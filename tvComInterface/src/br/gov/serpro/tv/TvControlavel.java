package br.gov.serpro.tv;

public interface TvControlavel extends ControlavelCanal, ControlavelVolume, Controlavel {
	
	public int mudarCanal(int canalMudado);
	public int aumentarCanal();
	public int diminuirCanal();

}
