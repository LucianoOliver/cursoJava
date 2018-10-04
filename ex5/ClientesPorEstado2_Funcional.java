package com.matera.ex5;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientesPorEstado2_Funcional {
   public static Map<String, List<Cliente>> agrupaPorEstado(List<Cliente> clientes) {
      
      return clientes.stream()
            .collect(groupingBy(Cliente::getEstado));
   }

//   public static void main(String[] args) {
//      List<Cliente> clientes = new ArrayList<>();
//      
//      clientes.add(new Cliente("José", "Campinas", "SP"));
//      clientes.add(new Cliente("Pedro", "Campinas", "SP"));
//      clientes.add(new Cliente("João", "São Paulo", "SP"));
//      clientes.add(new Cliente("Ana", "Recife", "PE"));
//      clientes.add(new Cliente("Fabiana", "Campo Grande", "MS"));
//      clientes.add(new Cliente("Cristiane", "Rio de Janeiro", "RJ"));
//      clientes.add(new Cliente("Fabricio", "Campinas", "SP"));
//      clientes.add(new Cliente("Julia", "Campo Grande", "MS"));
//      clientes.add(new Cliente("Fábio", "São Paulo", "SP"));
//
//      Map<String, List<Cliente>> clientesPorEstado = agrupaPorEstado(clientes);
//      
//      for (String estado : clientesPorEstado.keySet()) {
//         System.out.println(estado + ": " + clientesPorEstado.get(estado));
//      }
//   }
   
   
   public static void main(String[] args) {
	      List<Cliente> clientes = new ArrayList<>();
	      
	      clientes.add(new Cliente("José", "Campinas", "SP"));
	      clientes.add(new Cliente("Pedro", "Campinas", "SP"));
	      clientes.add(new Cliente("João", "São Paulo", "SP"));
	      clientes.add(new Cliente("Ana", "Recife", "PE"));
	      clientes.add(new Cliente("Fabiana", "Campo Grande", "MS"));
	      clientes.add(new Cliente("Cristiane", "Rio de Janeiro", "RJ"));
	      clientes.add(new Cliente("Fabricio", "Campinas", "SP"));
	      clientes.add(new Cliente("Julia", "Campo Grande", "MS"));
	      clientes.add(new Cliente("Fábio", "São Paulo", "SP"));

	      
	      long cont = clientes.stream().count();
	     // clientes.stream().sorted().findFirst();
	     System.out.println(cont);	
	     
	     //List<Cliente> Lclientes = new ArrayList<Cliente>();
	     List<Cliente> slist = clientes.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	     slist.forEach(c -> System.out.println("Nome: "+c.getNome()+" Cidade:" +c.getCidade()));
	     
			
//	     System.out.println("---Sorting using Comparator by Age with reverse order---");
//			slist = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
//			slist.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));
//		
	   }
}
