
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "bugün hava çok güzel";
		
		/*System.out.println(mesaj);
		System.out.println("as" + mesaj.charAt(4));
		System.out.println("sa" + mesaj.length());
		System.out.println(mesaj.concat("Yaşasın"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("A"));*/
		
		
		System.out.println(mesaj.replace(" ", "-"));
		String yenimesaj = mesaj.replace("b", "a");
		System.out.println(yenimesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		for(String kelime : mesaj.split("")) {
			System.out.println(kelime);
			} 
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
	}
}