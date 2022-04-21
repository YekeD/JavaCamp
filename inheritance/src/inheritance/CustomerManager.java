package inheritance;


public class CustomerManager {
	public void add(Customer customer) {
		//customer kendi extends lerinideki ayrýntýlarý çalýþtýramaz.
		// ama extendslerin temeli olduðu için customerNumber ve id gibi deðiþkenleri
		//çalýþtýrabilir **veri tipi customer deðil extendlerinden biri olsa bile**
		//extendler ise customerý baz aldýðýn için customerNumber ve id yi çalýþtýrabilri.
		System.out.println(customer.customerNumber + "Kaydedildi.");
	}
	//bulk insert
	public void  addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
			
		}
		
	}
	
}
