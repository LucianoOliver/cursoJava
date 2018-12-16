package serpro.gov.br;

public class CalcularImpostoDeRenda {
	
	private CalculaValor calcula;
	private Contribuinte contribuinte;
	
	public Double calcular() {
		return calcula.calcular(contribuinte);		
	}

	public void setCalcula(CalculaValor calcula) {
		this.calcula = calcula;
	}
}
