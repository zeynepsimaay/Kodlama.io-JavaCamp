package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscount()+ " oranl� " + campaign.getCampaignName()+ " isimli kampanya eklenmi�tir.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" isimli kampanya silinmi�tir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya g�ncellenmi�tir.");
		
	}
	

}
