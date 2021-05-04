package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adaptors.MermisServiceAdaptor;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Engin");
		customer.setLastName("Demiroð");
		customer.setId(1);
		customer.setNatioanltyId("16006960446");
		
		BaseCustomerManager customerManager=new NeroCustomerManager(new MermisServiceAdaptor());
		customerManager.save(customer);
 
	}

}
