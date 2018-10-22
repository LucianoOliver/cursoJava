package bancodedados;

public class Postgres implements Connection {

	@Override
	public void rollBack() {
		System.out.println("RollBack Postgres");
		
	}

	@Override
	public void commit() {
		System.out.println("commit Postgres");
		
	}

	@Override
	public void connect() {
		System.out.println("commit Postgres");
		
	}
	
	

}
