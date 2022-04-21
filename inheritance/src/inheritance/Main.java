package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer arda = new IndividualCustomer();		
		arda.customerNumber = "123123";
		arda.firstName = "ardyae";
		
		CorparateCustomer hepsiburada = new CorparateCustomer();
		hepsiburada.customerNumber = "12313123";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "00099991";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {arda,abc,hepsiburada};
		customerManager.add(arda);
		customerManager.addMultiple(customers);
	}

}
