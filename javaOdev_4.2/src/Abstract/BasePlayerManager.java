package Abstract;

import Entities.Player;

public class BasePlayerManager implements PlayerService {

	@Override
	public void viewCatalog(Player player) {
		System.out.println("Sayon: " +player.getFirstName()+ " Ho�geldiniz. Oyunlar�m�z a�a��daki gibidir.");
		
	}

	
}
