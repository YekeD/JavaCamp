
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 1;
		boolean isPrime = true;
		if(sayi <= 1) {
			System.out.println("Geçerli bir sayı giriniz");
			return;
		}
		
		for( int i = 2; i<sayi;i++) {
			if(sayi % i == 0) {
				isPrime = false;	
				break;
				}
		}
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
			
		} 
		
	}

}
