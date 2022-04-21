package interfaces;

public class Firewall implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("File'a loglandı" + message);
	}

}
