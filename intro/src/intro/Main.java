package intro;

public class Main {

	public static void main(String[] args) {
		
		//CamelCase (First Letter should be small)
		//Don't repeat yourself!!
		String networkClassButton = "Network Class";
		double dolarYesterday = 8.40 ;
		double dolarToday = 8.40 ;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(networkClassButton);
		
		if(dolarYesterday<dolarToday) 
		{
			System.out.println("Dolar Arttý");
			
		}
		else if(dolarToday==dolarYesterday) {
			System.out.println("Dolar Eþit Kaldý");
			
		}
		else {System.out.println("Dolar Düþtü");}
		
		String[] krediler = {"kredi1",
				"kredi2",
				"kredi3",
				"kredi4"
				};
		//foreach dongusu
		for(String kredi : krediler) {
			System.out.println(kredi);
			
		}
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		} 	
		int sayi1 = 20;
		int sayi2 = 30;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		//bu deðerleri iþaretler
		
		int[] sayilar1 = {1,2,3,4,5};	
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		//bu ise = yapýldýðýnda adresleri eþitler bundan kaynaklý 
		//sayilar1[0] 100 olur.
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
		// stringlere özel istisna
		
		
		
		
	}
}
