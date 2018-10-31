package br.serpro.pilha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Pilha {

	private List<Object> elementos = new ArrayList<>();
	private int topo = 0;

	public Pilha() {
		elementos = new ArrayList<>();
	}

	public void empilhar(Object elemento) {
		elementos.add(elemento);
		topo++;

	}

	public Object desempilhar() {
		return elementos.remove(0);
	}

	public Object topo() throws Exception {
		if(tamanho()<=0) {
			throw new Exception("Não existem mais elementos");
		}
		return elementos.get(0);
	}

	public int tamanho() {
		return elementos.size();
	}

	public List getElementos() {
		return elementos;
	}

	public void setElementos(Object elemento) {
		this.elementos.add(elemento);
	}

}
