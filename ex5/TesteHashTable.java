package com.matera.ex5;

import java.util.Hashtable;

public class TesteHashTable {

	public static void main(String[] args) {
     
    Cliente1 c1 = new Cliente1("754.856.869-88","Valdinei Santos");
    Cliente1 c2 = new Cliente1("828.929.222.12","Claire Moura");
    Cliente1 c3 = new Cliente1("156.565.556-88","Vagner Seller");
     
    Hashtable<Integer, Cliente1> ht = new Hashtable<Integer, Cliente1>();
    ht.put(1, c1);
    ht.put(2, c2);
    ht.put(3, c3);
     
    System.out.println("CPF \t\t Cliente");
    for (int i = 1; i <= ht.size(); i++) {
    	 //System.out.println(ht.remove(3));
      System.out.println(ht.get(i));
     
    }
    
    //System.out.println(ht.clone());
    
    
  }
}

class Cliente1 {
	public String cpf;
	public String nome;

	public Cliente1(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return cpf + " | " + nome;
	}
}