package CampaignCreator;

public class CampaignAdd implements CampaignCreator {

	@Override
	public void createCampaign(String message) {
		System.out.println("Kampanya Eklendi " + message);
		
	}

}