package br.gov.serpro.venda;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.gov.serpro.pagamento.CartaoCredito;
import br.gov.serpro.pagamento.Cheque;
import br.gov.serpro.pagamento.Dinheiro;
import br.gov.serpro.pagamento.FormaPagamento;

public class PedidoTeste {

	@Test
	public void deveEfetuarPagamentoDinheiro() {
		FormaPagamento pagamento = new Dinheiro();
		
		Pedido pedido = new Pedido(100.0);
		assertTrue(pedido.pagar(pagamento));
	}
	
	@Test
	public void deveEfetuarPagamentoCartao() {
		FormaPagamento pagamento = new CartaoCredito();
		
		Pedido pedido = new Pedido(100.0);
		assertTrue(pedido.pagar(pagamento));
	}
	
	@Test
	public void deveEfetuarPagamentoCheque() {
		FormaPagamento pagamento = new Cheque();
		
		Pedido pedido = new Pedido(100.0);
		assertTrue(pedido.pagar(pagamento));
	}

}
