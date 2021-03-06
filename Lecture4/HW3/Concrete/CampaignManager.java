package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscount()+ " oranlı " + campaign.getCampaignName()+ " isimli kampanya eklenmiştir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya silinmiştir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya güncellenmiştir.");
		
	}
	

}
