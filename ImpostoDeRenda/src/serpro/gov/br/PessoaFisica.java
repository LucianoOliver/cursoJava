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
		
		impostoZero();
		impostoDezPorcento();
		impostoQuinzePorcento();
		impostoVinteCincoPorCento();
		
		return impostoTrintaporcento();
	}

	private Double impostoTrintaporcento() {
		return valor * 1.30;
	}

	private Double impostoVinteCincoPorCento() {
		if(valor >= 6000.01 && valor <= 8000.0) {
			return valor *1.25;
		}
		return valor;
	}

	private Double impostoQuinzePorcento() {
		if(valor >= 4000.01 && valor <= 6000.0) {
			return valor *1.15;
		}
		return valor;
	}

	private Double impostoDezPorcento() {
		if(valor >= 2000.01 && valor <= 4000.0) {	
			return valor *1.10;
		}
		return valor;
	}

	private Double impostoZero() {
		if(valor >= 0 && valor <= 2000.0) {
			return valor * 0;
		}
		return valor;
	}

	
	
}
