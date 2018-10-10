package com.example.demo.carrinho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
	
	private Integer numero;
	private LocalDate data; 
	private SituacaoPedido status;
	private Cliente cliente;
	private Item item;
	private List<DetalhePedido> detalhePedidos = new ArrayList<>();
	private Pagamento pagamento;
	
	public PedidoBuilder Numero(Integer numero) {
		this.numero = numero;
		return this;
	}

	public PedidoBuilder Data(LocalDate data) {
		this.data = data;
		return this;
	}

	public PedidoBuilder Status(SituacaoPedido status) {
		this.status = status;
		return this;
	}

	public PedidoBuilder Cliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}

	public PedidoBuilder Item(Item item) {
		this.item = item;
		return this;
	}

	public PedidoBuilder DetalhePedidos(List<DetalhePedido> detalhePedidos) {
		this.detalhePedidos = detalhePedidos;
		return this;
	}

	public PedidoBuilder setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
		return this;
	}
	
	
	public Pedido pedidoBuilder() {
		return new Pedido(numero, data, status, cliente);
		}
	
}
