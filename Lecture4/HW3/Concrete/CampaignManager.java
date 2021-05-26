package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscount()+ " oranlý " + campaign.getCampaignName()+ " isimli kampanya eklenmiþtir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya silinmiþtir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya güncellenmiþtir.");
		
	}
	

}
