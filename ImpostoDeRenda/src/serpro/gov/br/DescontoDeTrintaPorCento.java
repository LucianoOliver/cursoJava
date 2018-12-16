package serpro.gov.br;

public class DescontoDeTrintaPorCento implements CalculaValor {

	@Override
	public Double calcular(Contribuinte contribuinte) {
		
		return contribuinte.valor * 1.30;
	}

}
