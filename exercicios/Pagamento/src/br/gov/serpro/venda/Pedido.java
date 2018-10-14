package br.gov.serpro.venda;

import br.gov.serpro.pagamento.FormaPagamento;

public class Pedido {
	
	private final double valor;
	
	public Pedido(double valor) {
		this.valor = valor;
	}
	
	public boolean pagar(FormaPagamento pagamento) {
		return pagamento.efetuar(valor);
	}
	
}
