package bancodedados;

public class SqlServer implements Connection {

	@Override
	public void rollBack() {
		System.out.println("RollBack SqlServer");
		
	}

	@Override
	public void commit() {
		System.out.println("commit SqlServer");
		
	}

	@Override
	public void connect() {
		System.out.println("commit SqlServer");
		
	}
	
	

}
