package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{


private	ICustomerCheckService customerCheckService;
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
	this.customerCheckService=customerCheckService;	
	}

	@Override 
	public void save(Customer customer) {
		super.save(customer);
	}

}
 