package inheritance;


public class CustomerManager {
	public void add(Customer customer) {
		//customer kendi extends lerinideki ayr�nt�lar� �al��t�ramaz.
		// ama extendslerin temeli oldu�u i�in customerNumber ve id gibi de�i�kenleri
		//�al��t�rabilir **veri tipi customer de�il extendlerinden biri olsa bile**
		//extendler ise customer� baz ald���n i�in customerNumber ve id yi �al��t�rabilri.
		System.out.println(customer.customerNumber + "Kaydedildi.");
	}
	//bulk insert
	public void  addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
			
		}
		
	}
	
}
