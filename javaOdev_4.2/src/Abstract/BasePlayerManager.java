package Abstract;

import Entities.Player;

public class BasePlayerManager implements PlayerService {

	@Override
	public void viewCatalog(Player player) {
		System.out.println("Sayon: " +player.getFirstName()+ " Hoþgeldiniz. Oyunlarýmýz aþaðýdaki gibidir.");
		
	}

	
}
