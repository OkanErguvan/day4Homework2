package Adaptors;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MermisServiceAdaptor implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNatioanltyId()) , customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), 213);
		} 
		
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	

}
