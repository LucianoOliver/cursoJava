package bancodedados;

public class Oracle implements Connection {

	@Override
	public void rollBack() {
		System.out.println("RollBack Oracle");
		
	}

	@Override
	public void commit() {
		System.out.println("commit Oracle");
		
	}

	@Override
	public void connect() {
		System.out.println("commit Oracle");
		
	}
	
	

}
