package serpro.gov.br;

public class PessoaJuridica extends Contribuinte {
	private String cnpj;
	
	public PessoaJuridica(String nome, double valor, String cnpj) {
		this.nome = nome;
		this.valor = valor;
		this.cnpj = cnpj;
	}

	@Override
	public Double calcularImposto() {
		return valor * 1.10;
	}
	
}
