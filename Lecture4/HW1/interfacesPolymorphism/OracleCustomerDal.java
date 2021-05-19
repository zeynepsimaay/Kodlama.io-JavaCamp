package interfacesPolymorphism;

public class OracleCustomerDal implements ICustomerDal,IRepository {
	public void Add() {
		System.out.println("Oracle eklendi.");
	}

}
