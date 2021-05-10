package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapClient client = new KPSPublicSoapClient(KPSPublicSoapClient.EndpointConfiguration.KPSPublicSoap);
        return client.TCKimlikNoDogrulaAsync
            (Convert.ToInt64(customer.NationalityId), customer.FirstName.ToUpper(),
            customer.LastName.ToUpper(), customer.BirthYear).Result.Body.TCKimlikNoDogrulaResult;
    } 
		
		return false;
	}

}
