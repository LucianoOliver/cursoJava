package br.gov.serpro.tv;

import java.util.Arrays;
import java.util.List;

public class Tv {

	private static final int ZERO = 0;
	private static final int UM = 1;
	private static final int VOLUME_MAXIMO = 50;
	private static final int VOLUME_MINIMO = 0;
	private int volume;
	private Boolean ligada = false;
	private int canalAtivo = 0;
	private int[] canais;

	public Tv(int[] canais) {
		this.canais = canais;
		this.volume = 0;
		this.ligada = false;
	}

	private Boolean canalAtivo(int canalMudado) {
		int tamanho = canais.length;
		for (int i = 0; i < canais.length; i++) {
			if (canais[i] == canalMudado) {
				if (i < canais.length && canais[i] > ZERO) {
					return true;
				}
			}
		}
		return false;
	}

	public int mudarCanal(int canalMudado) {
		if (canalAtivo(canalMudado)) {
			return canalAtivo = canalMudado;
		} else {
			return canalAtivo;
		}

	}

	public int aumentarCanal() {
		int canalRetornado = canalAtivo;
		for (int canal : canais) {
			canalRetornado = canalRetornado + UM;
			if (canalAtivo(canalRetornado))
				return canalRetornado;
		}
		return canalAtivo;
	}

	public int diminuirCanal() {
		int canalRetornado = canalAtivo;
		for (int canal : canais) {
			canalRetornado = canalRetornado - UM;
			if (canalAtivo(canalRetornado))
				return canalRetornado;
		}
		return canalAtivo;
	}

	public int aumentarVolume() {

		if (volume < VOLUME_MAXIMO) {
			this.volume = volume + UM;
		}
		return volume;
	}

	public int baixarVolume() {
		if (volume > VOLUME_MINIMO) {
			this.volume = volume - UM;

		}
		return volume;
	}

	public Boolean ligar() {
		return ligada = true;

	}

	public Boolean desligar() {
		return ligada = false;

	}

}
