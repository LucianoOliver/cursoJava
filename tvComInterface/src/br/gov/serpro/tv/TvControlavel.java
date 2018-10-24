package br.gov.serpro.tv;

public interface TvControlavel extends Controlavel {
	
	public int mudarCanal(int canalMudado);
	public int aumentarCanal();
	public int diminuirCanal();

}
