package Entities;

public class Campaign {
	
	public Campaign( int id, String campaignName, String discount) {
		
		this.setId(id);
		this.setCampaignName(campaignName);
		this.setDiscount(discount);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	private int id;
	private String campaignName;
	private String discount;
}
