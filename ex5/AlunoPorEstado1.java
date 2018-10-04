package com.matera.ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AlunoPorEstado1 {
	static Map<String, List<Aluno>> agrupaPorEstado(List<Aluno> alunos) {
		Map<String, List<Aluno>> porEstado = new HashMap<>();
		for (Aluno alu : alunos) {
			String estado = alu.getEstado();
			String nome =  alu.getNome();
			List<Aluno> alunoEstado = porEstado.get(estado);
			List<Aluno> alunoEstado1 = porEstado.get(nome);
			 System.out.println(alunoEstado1);

			if (alunoEstado == null) {
				alunoEstado = new ArrayList<>();
				porEstado.put(estado, alunoEstado);
			}

			alunoEstado.add(alu);
		}
		return porEstado;
	}
	
	public static void main(String[] args) {
	      List<Aluno> alunos = new ArrayList<>();
	      
	      alunos.add(new Aluno("Josefa", "Campinas", "SP"));
	      alunos.add(new Aluno("Elvis", "Campinas", "SP"));
	      alunos.add(new Aluno("Regiane", "São Paulo", "SP"));
	      alunos.add(new Aluno("Luciano", "Recife", "PE"));
	      alunos.add(new Aluno("Selma", "Campo Grande", "MS"));
	      alunos.add(new Aluno("Gelson", "Rio de Janeiro", "RJ"));
	      alunos.add(new Aluno("Rodrigo", "Campinas", "SP"));
	      alunos.add(new Aluno("Dante", "Campo Grande", "MS"));
	      alunos.add(new Aluno("Daniel", "São Paulo", "SP"));

	      Map<String, List<Aluno>> alunosPorEstado = agrupaPorEstado(alunos);
	      
	      for (String estado : alunosPorEstado.keySet()) {
	         System.out.println(estado + ": " + alunosPorEstado.get(estado));
	      }
	   }

}
