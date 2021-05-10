package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	
	
	@Override
	public boolean CheckIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			return client.TCKimlikNoDogrula(
					Long.parseLong(player.getIdentityNumber()),
					player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), 
					player.getDateOfBirth().getYear()
					);
		} catch (RemoteException e) {
			result = false;
			System.out.println("Client Sistemi bozuk");
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
		
	
	}
	
}