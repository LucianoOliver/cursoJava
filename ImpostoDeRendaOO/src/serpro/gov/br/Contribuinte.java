package serpro.gov.br;

public abstract class Contribuinte {
	protected String nome;
	protected double valorSalario;
	protected double valorImposto;
	

	
	
	public abstract Double calcularImposto() ;
	
	

}
