package com.example.demo.carrinho;

public class CartaoCredito extends Pagamento{
	private Integer numero;
	private Integer tipo;
	private Integer dataExpedicao;
	
	
	public boolean isAutorizado() {
		return false;
		
	}
}
