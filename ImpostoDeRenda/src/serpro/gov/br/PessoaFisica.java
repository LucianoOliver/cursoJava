package serpro.gov.br;

public class PessoaFisica extends Contribuinte {
	private String cpf;
	
	public PessoaFisica(String nome, double valor, String cpf) {
		this.nome = nome;
		this.valor = valor;
		this.cpf = cpf;
	}

	@Override
	public Double calcularImposto() {
		return valor * 1.10;
	}

	
	
}
