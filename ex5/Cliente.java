package com.matera.ex5;

public class Cliente implements Comparable<Cliente> {
   private String nome;
   private String cidade;
   private String estado;

   public Cliente(String nome, String cidade, String estado) {
      this.nome = nome;
      this.cidade = cidade;
      this.estado = estado;
   }

   public String getNome() {
      return nome;
   }

   public String getCidade() {
      return cidade;
   }
   
   public String getEstado() {
      return estado;
   }

   @Override
   public String toString() {
      return nome;
   }

@Override
public int compareTo(Cliente o) {
	return nome.compareTo(o.getNome());
}

}
