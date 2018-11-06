

public abstract class ContaCorrente {
	protected double saldo;
	
	protected abstract double calcularTaxaJuros();
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		
	}

	public double obterSaldo() {
		return saldo;
	}

}
