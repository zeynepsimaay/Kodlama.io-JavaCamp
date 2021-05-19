package interfacesPolymorphism;

public class MySqlCustomerDal implements ICustomerDal, IRepository{
	public void Add() {
		System.out.println("Mysql eklendi.");
	}

}
