package curso.java.banco;

public class ContaEspecial extends ContaCorrente {

	private int limite;
	
	 
	 public ContaEspecial(int limite) {
		this.limite = limite;
	}

	public int sacar(int valor) {
		 if(valor > saldo+limite) {
			 return 0;
		 }else {
			 saldo = saldo - valor;
			 return valor;
		 }
	 }
	 
	 public void deposita(int valor){
		 saldo += valor;
	 }
	 
	 
	 public int getSaldo() {
			return saldo;
		}
}
