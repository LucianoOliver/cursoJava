package com.example.demo.carrinho;

public class Cheque extends Pagamento {
	
	private String nomeBanco;
	private Integer IDBanco;
	
	public boolean isAutorizado() {
		return false;
	}

}
