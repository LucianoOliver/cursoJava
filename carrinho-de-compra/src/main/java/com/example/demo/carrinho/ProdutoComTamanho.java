package com.example.demo.carrinho;

public class ProdutoComTamanho extends Produto {
	
	private Integer tamanhoRoupa;

	public ProdutoComTamanho(Integer codigo, String nome, Double preco, Integer tamanhoRoupa) {
		super(codigo, nome, preco);
		this.tamanhoRoupa = tamanhoRoupa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tamanhoRoupa == null) ? 0 : tamanhoRoupa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanhoRoupa == null) {
			if (other.tamanhoRoupa != null)
				return false;
		} else if (!tamanhoRoupa.equals(other.tamanhoRoupa))
			return false;
		return true;
	}
}
