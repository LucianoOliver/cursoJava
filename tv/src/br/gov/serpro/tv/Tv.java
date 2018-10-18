package br.gov.serpro.tv;

import java.util.Arrays;
import java.util.List;

public class Tv {

	private static final int ZERO = 0;
	private static final int UM = 1;
	private static final int VOLUME_MAXIMO = 50;
	private int volume;
	private Boolean ligada = false;
	private int canalAtivo = 0;
	private int[] canais;

	public Tv(int[] canais) {
		this.canais = canais;
		this.volume = 0;
		this.ligada = false;
	}

	public Boolean canalAtivo(int canalMudado) {
		// int tamanho = canais.length;
		for (int canal : canais) {
			if (canalMudado == canal) {
				return true;
			}
		}
		return false;
	}

	public int mudarCanal(int canalMudado) {
		// int tamanho = canais.length;
		if (canalAtivo(canalMudado)) {
			return canalAtivo = canalMudado;
		} else {
			return canalAtivo = 0;
		}

	}

	public int aumentarCanal() {

		for (int canal : canais) {
			if (canalAtivo(canalAtivo + UM)) {
				return canalAtivo + UM;
			} else {
				canalAtivo = canalAtivo + UM;
			}

		}
		return canalAtivo;
	}
	
	public int diminuirCanal() {

		for (int canal : canais) {
			if (canalAtivo(canalAtivo - UM)) {
				return canalAtivo - UM;
			} else {
				canalAtivo = canalAtivo - UM;
			}

		}
		return canalAtivo;
	}

	public int aumentarVolume() {

		if (volume <= VOLUME_MAXIMO) {
			this.volume = volume + UM;

		}
		return volume;
	}

	public int baixarVolume() {
		if (volume >= ZERO) {
			this.volume = volume - UM;

		}
		return volume;
	}

	public Boolean ligada() {
		return ligada = true;

	}
	
	public Boolean desligada() {
		return ligada = false;

	}

}
