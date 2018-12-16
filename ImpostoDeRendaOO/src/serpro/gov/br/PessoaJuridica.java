package serpro.gov.br;

public class PessoaJuridica extends Contribuinte {
	private String cnpj;
	
	public PessoaJuridica(String nome, double valor, String cnpj) {
		this.nome = nome;
		this.valorSalario = valor;
		this.cnpj = cnpj;
	}

	@Override
	public Double calcularImposto() {
		return valorSalario * 0.10;
	}
	
}
