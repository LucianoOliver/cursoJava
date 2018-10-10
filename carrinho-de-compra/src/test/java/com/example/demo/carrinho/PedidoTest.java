package carrinho;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.carrinho.CartaoCredito;
import com.example.demo.carrinho.Cheque;
import com.example.demo.carrinho.Cliente;
import com.example.demo.carrinho.DetalhePedido;
import com.example.demo.carrinho.Dinheiro;
import com.example.demo.carrinho.Item;
import com.example.demo.carrinho.ItemBuilder;
import com.example.demo.carrinho.Pedido;
import com.example.demo.carrinho.PedidoBuilder;
import com.example.demo.carrinho.SituacaoPedido;

public class PedidoTest {

	private Integer numeroPedido;
	private LocalDate dataPedido;
	private Item item;
	private DetalhePedido detalhePedido;
	private Cliente luciano;
	private Pedido pedidoEfetuadoComDinheiro;
	private Pedido pedidoEfetuadoComCheque;
	private Pedido pedidoEfetuadoComCartaoCredito;
	private Dinheiro dinheiro;
	private Cheque cheque;
	private CartaoCredito cartaoCredito;

	@Before
	public void informacoesPedido() {
		numeroPedido = 1;
		dataPedido = LocalDate.now();
		item = new ItemBuilder().PesoEntrega(1).Descricao("Coca-cola").Preco(5).itemBuilder();

		detalhePedido = new DetalhePedido(1, false, item);
		luciano = new Cliente("Luciano", "Rua Um");
		dinheiro = new Dinheiro();

		cartaoCredito = new CartaoCredito();
		cheque = new Cheque();

		pedidoEfetuadoComDinheiro = new PedidoBuilder().Numero(numeroPedido).Data(dataPedido)
				.Status(SituacaoPedido.EM_PRCESSAMENTO).Cliente(luciano).pedidoBuilder();
		
		pedidoEfetuadoComCheque = new PedidoBuilder().Numero(numeroPedido).Data(dataPedido)
				.Status(SituacaoPedido.EM_PRCESSAMENTO).Cliente(luciano).pedidoBuilder();
		
		pedidoEfetuadoComCartaoCredito = new PedidoBuilder().Numero(numeroPedido).Data(dataPedido)
				.Status(SituacaoPedido.EM_PRCESSAMENTO).Cliente(luciano).pedidoBuilder();
	}

	@Test
	public void calculaTaxatest() {
		pedidoEfetuadoComDinheiro.adicionarDetalhePedido(detalhePedido);
		double calculaTaxa = pedidoEfetuadoComDinheiro.calculaTaxa();
		double resultadoEsperado = 0.5;

		assertEquals(resultadoEsperado, calculaTaxa, 0);

	}

	@Test
	public void calculaValorTotaltest() {
		pedidoEfetuadoComDinheiro.adicionarDetalhePedido(detalhePedido);
		double valorTotal = pedidoEfetuadoComDinheiro.calculaValorTotal();
		double resultadoEsperado = 5;

		assertEquals(resultadoEsperado, valorTotal, 0);

	}

	@Test
	public void calculaTotalPesotest() {

		pedidoEfetuadoComDinheiro.adicionarDetalhePedido(detalhePedido);
		double totalPeso = pedidoEfetuadoComDinheiro.calculaTotalPeso();
		double resultadoEsperado = 1;

		assertEquals(resultadoEsperado, totalPeso, 0);

	}

	@Test
	public void efetuaPagamentoComDinheirotest() {

		pedidoEfetuadoComDinheiro.adicionarDetalhePedido(detalhePedido);
		dinheiro.setDinheiroOferecido(100.0);

		String tipoPagamento = pedidoEfetuadoComDinheiro.efetuarPagamento(dinheiro);
		double totalPeso = pedidoEfetuadoComDinheiro.calculaTotalPeso();
		String resultadoEsperado = "Dinheiro";

		assertEquals(resultadoEsperado, tipoPagamento);

	}

	@Test
	public void efetuaPagamentoComChequetest() {

		pedidoEfetuadoComCheque.adicionarDetalhePedido(detalhePedido);

		String tipoPagamento = pedidoEfetuadoComDinheiro.efetuarPagamento(cheque);
		String resultadoEsperado = "Cheque";

		assertEquals(resultadoEsperado, tipoPagamento);

	}

	@Test
	public void efetuaPagamentoComCartaoCreditotest() {

		pedidoEfetuadoComCartaoCredito.adicionarDetalhePedido(detalhePedido);

		String tipoPagamento = pedidoEfetuadoComDinheiro.efetuarPagamento(cartaoCredito);
		String resultadoEsperado = "Cartão de Credito";

		assertEquals(resultadoEsperado, tipoPagamento);

	}

}
