package interfaceAbstractDemo;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
		
		
		customerManager.Save(new Customer( "Zeynep Simay", "K�l�n�", LocalDate.of(1998,11,10), "23185923520"));
		
	}

}
