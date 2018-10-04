package com.example.demo.carrinho;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Cheque extends Pagamento {
	
	private String nomeBanco;
	private Integer IDBanco;
	
	public boolean isAutorizado() {
		return false;
	}

	@Override
	public String tipoPagamento() {
		String tipo = "Cheque";
		return tipo;
	}

}
