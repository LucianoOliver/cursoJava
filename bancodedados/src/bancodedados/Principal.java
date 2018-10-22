package bancodedados;

public class Principal {

	public static void Conexao(Connection connection) {
		connection.connect();
		connection.commit();
		connection.rollBack();
		
		
	}
}
