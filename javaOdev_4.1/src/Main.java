import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstName("Sinan");
        customer.setNationalityId("11223344551");
        customer.setLastName("Fen");
        customer.setDateOfBirth(2000);

        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.Save(customer);


    }

}