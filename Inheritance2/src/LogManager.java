
public class LogManager {
	public void log(int logType) {
		//if elif else veya say�lar kullan�l�or ise kod spagetti (��p)
		if(logType == 1) {
			System.out.println("Veritaban�na logland�");
			
		}else if(logType == 2) {
			System.out.println("Dosyaya logland�.");
			
		}else {
			System.out.println("Email g�nderildi.");
		}
		
	}
}

//1- database
//2- File
//3- E-mail