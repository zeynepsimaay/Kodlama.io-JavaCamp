package interfacesPolymorphism;

public class CustomerManager {
	
	ICustomerDal customerDal;
	public void add() {
		//i� kodlar� yaz�l�r
		customerDal.Add();
		
	}
}
