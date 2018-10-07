package curso.java.banco;

public class ContaCorrente {

	protected int saldo;
	 
	 public int sacar(int valor) {
		 if(valor > saldo) {
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
