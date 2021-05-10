package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager implements CustomerService {
	private CustomerCheckService customerCheckService;
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
	
	/*@Override
    public void Save(Customer customer) {
        System.out.println("m��teri kaydedildi. Kayededilen m��teri bilgileri: " +"\n isim: "+customer.getFirstName()+
                "\n soyisim: "+customer.getLastName()+"\n tcno: "+customer.getNationalityID());
    }*/
}
