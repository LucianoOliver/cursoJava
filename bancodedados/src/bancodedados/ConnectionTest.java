package bancodedados;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConnectionTest {
	
	
	@Test
	public void testPrincipal() {
		Principal principal = new Principal();
		MySql mySql = new MySql();
		Postgres postgres = new Postgres();
		SqlServer sqlServer = new SqlServer();
		
		principal.Conexao(mySql);
		principal.Conexao(postgres);
		principal.Conexao(sqlServer);
		principal.Conexao(new Oracle());
		
	}
	
		

//	@Test
//	public void testMySql() {
//		Connection mySql = new MySql();
//		mySql.connect();
//		mySql.commit();
//		mySql.rollBack();
//	}
//	
//	@Test
//	public void testOracle() {
//		Connection oracle = new Oracle();
//		oracle.connect();
//		oracle.commit();
//		oracle.rollBack();
//	}
//	
//	@Test
//	public void tesSqlServer() {
//		Connection sqlServer = new SqlServer();
//		sqlServer.connect();
//		sqlServer.commit();
//		sqlServer.rollBack();
//	}
//	
//	@Test
//	public void testPostgres() {
//		Connection postgres = new Postgres();
//		postgres.connect();
//		postgres.commit();
//		postgres.rollBack();
//	}

}
