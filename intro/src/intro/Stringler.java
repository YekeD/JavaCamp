package intro;

public class Stringler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orgrenciler = new String[3];
		orgrenciler[0] = "Ahmet";
		orgrenciler[1] = "Dogan";
		orgrenciler[2] = "mehmet";
		for(int i = 0; i<orgrenciler.length;i++) {
			System.out.println(orgrenciler[i]);			
		}
		for(String orgrenci:orgrenciler) {
			System.out.println(orgrenci);
			
		}
		double[] myList = {1.2,2.4,3.5,8.8,5.3,6.4};
		double total = 0;
		double maxSayi = myList[5];
		for(double sayi:myList ) {
			if (sayi>maxSayi) {
				maxSayi = sayi;
			}
			total = total + sayi;
			System.out.println(sayi);

		}
		System.out.println("Max Say� = "+maxSayi);
		System.out.println("Total =" + total);
		
		
		
		
		String[][] sehirler =new String[3][3];
		sehirler[0][0] ="�stanbul";
	}

}
