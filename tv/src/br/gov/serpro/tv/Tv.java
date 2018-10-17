package br.gov.serpro.tv;

public class Tv {
	
	private int volume;
	private Boolean ligada = false;
	private int canalAtivo = 0;
	private int[] canais;
	
	
	public Tv(int[] canais) {
		this.canais = canais;
		this.volume = 0;
		this.ligada = false;
	}
	
	public int mudarCanal(int canalMudado) {
		//int tamanho = canais.length;
		for(int canal : canais) {
			if (canalMudado == canal){
				return canalAtivo = canalMudado;
			}
		}
		return canalAtivo = 0;
	}

	public int aumentarCanal() {
	
		for (int i = 0; i < canais.length; i++) {
	       if (canais[i] == this.canalAtivo) {
	    	   return this.canalAtivo + 1;
	       }
	    }
		return 0;
	}
	
	
	
	
	
	
	
	

}
