package com.example.demo.carrinho;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto, Integer> produtos = new HashMap<>();
	
	public void adicionarProduto(Produto produto, Integer Quantidade) {
		produtos.put(produto, Quantidade);
	}

	public void removerProduto(Produto produto, Integer Quantidade) {
		produtos.remove(produto, 0);
	}
	
	//distancia = distancia + carro.getVelocidade();

	
	public Double calculaValorTotalCompra() {
		Double valorDaCompra = 0.0;
		int quantidade = 0;
		for (Produto produto : produtos.keySet()) {
			quantidade = produtos.get(produto);
			valorDaCompra = valorDaCompra + produto.getPreco();
		}
		
		return valorDaCompra * quantidade;

	}
	
	public Integer recuperaTotalProdutos() {
		Integer tamanho;
		return  tamanho = produtos.size();
	}
}
