package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = {new EmailLogger() , new DatabaseLogger()};
		CustomerManager customermanager = new CustomerManager(loggers);
		Customer arda = new Customer(1,"Arda","Yeke");
		customermanager.add(arda);
	}

}
