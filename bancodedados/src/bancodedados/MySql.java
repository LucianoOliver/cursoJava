package bancodedados;

public class MySql implements Connection {

	@Override
	public void rollBack() {
		System.out.println("RollBack mysql");
		
	}

	@Override
	public void commit() {
		System.out.println("commit mysql");
		
	}

	@Override
	public void connect() {
		System.out.println("commit mysql");
		
	}
	
	

}
