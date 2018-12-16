package serpro.gov.br;

public class PessoaFisica extends Contribuinte {
	private String cpf;
	
	public PessoaFisica(String nome, double valorSalario, String cpf) {
		this.nome = nome;
		this.valorSalario = valorSalario;
		this.cpf = cpf;
	}

	@Override
	public Double calcularImposto() {
		impostoZero();
		impostoDezPorcento();
		impostoQuinzePorcento();
		impostoVinteCincoPorCento();
		impostoTrintaporcento();
		
		return valorImposto ;
	}
	
	private void impostoTrintaporcento() {
		if(valorSalario > 8000.1) 
		this.valorImposto = this.valorSalario * 0.30;
	}

	private void impostoVinteCincoPorCento() {
		if(valorSalario >= 6000.01 && valorSalario <= 8000.0) 
			 this.valorImposto = this.valorSalario * 0.25;
		
	}

	private void impostoQuinzePorcento() {
		if(valorSalario >= 4000.01 && valorSalario <= 6000.0)
			this.valorImposto = this.valorSalario * 0.15;
		
	}

	private void impostoDezPorcento() {
		if(valorSalario >= 2000.01 && valorSalario <= 4000.0)	
			this.valorImposto = this.valorSalario * 0.10;
		
	}

	private void impostoZero() {
		if(valorSalario >= 0 && valorSalario <= 2000.0)
			this.valorImposto = this.valorSalario * 0;
		
	}
	
}
