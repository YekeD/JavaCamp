package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Asus G14",16.12312,"24GB RAM",10); //referans olu�turma , intance 
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("g15");
		product2.setDetail("16gb");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yimeh");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("asdYimeh");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		System.out.println(product1.getName());
 	}

}
