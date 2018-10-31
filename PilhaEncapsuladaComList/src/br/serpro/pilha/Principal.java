package br.serpro.pilha;

import java.util.List;

public class Principal {

	public static void main(String[] args) throws Exception {
		try {
			Pilha p = new Pilha();
			p.empilhar("Eduardo");
			p.empilhar("Maria");
			p.empilhar("Jose");
			
			
			System.out.println("Lista: "+p.getElementos());
			System.out.println("topo da Lista: "+p.topo());
			System.out.println("Qantidade de elentos: "+p.tamanho());
			
			
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
