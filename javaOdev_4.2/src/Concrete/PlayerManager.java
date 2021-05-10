package Concrete;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager {

	PlayerCheckService PlayerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		this.PlayerCheckService = playerCheckService;
	}
	
	@Override
	public void viewCatalog(Player player) {
		
		if(this.PlayerCheckService.CheckIfRealPerson(player)) {
			super.viewCatalog(player);
		}else {
			System.out.println("Kay�tl� De�ilsiniz.");
		}
		
	}
	
}
