package br.serpro.pilha;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws Exception {
		try {
			Pilha p = new Pilha();
			p.empilhar("Eduardo");
			p.empilhar("Maria");
			p.empilhar("Jose");
			List<Object> listaElementos = new ArrayList<>();
			listaElementos.add("elemento um");
			listaElementos.add("elemento dois");
			listaElementos.add("elemento tres");
			listaElementos.add("elemento quatro");
			
			p.adicionarLista(listaElementos);
			p.adicionarListaAPartirdoIndice(0, listaElementos);
			
			
			System.out.println("Lista: "+p.getElementos());
			System.out.println("Contem Jose: "+p.Contem("Jose"));
			System.out.println("Contem Silva: "+p.Contem("Silva"));
			System.out.println("Pilha esta vazia: "+p.pilhaVazia());
			System.out.println("topo da Lista: "+p.topo());
			System.out.println("Quantidade de elentos: "+p.tamanho());
			
			
			//p.setTopo(6);
			
			List list = p.getElementos();
			//list.add("Luciano");
			
			
			
			System.out.println("--------------------");
			System.out.println("Desempilhamento");
			System.out.println("--------------------");
			
			System.out.println("Desempilhando: " +p.desempilhar());
			System.out.println("Desempilhando: " +p.desempilhar());
			System.out.println("Desempilhando: " +p.desempilhar());
			System.out.println("Lista: "+p.getElementos());
			System.out.println("topo da Lista: "+p.topo());
			System.out.println("Qantidade de elentos: "+p.tamanho());
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
}
