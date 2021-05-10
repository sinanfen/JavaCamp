package CampaignCreator;

import GameCreator.Game;

public class CampaignManager {
	private CampaignCreator campaignCreator;
	
	public CampaignManager(CampaignCreator campaignCreator) {
		super();
		this.campaignCreator = campaignCreator;
	}
	
	public void AddCampaign(Game game) {

		this.campaignCreator.createCampaign(game.getGameName());
	}
	
	public void DeleteCampaign(Game game) {

		this.campaignCreator.createCampaign(game.getGameName());
	}
	
	public void UpdateCampaign(Game game) {
		System.out.println("Kampanya Güncellendi " + game.getGameName());
		this.campaignCreator.createCampaign(game.getGameName());
	}
}
