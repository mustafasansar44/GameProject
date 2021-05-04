package Entity;

public class Campaign {
	int campaignId;
	int campaignPercent;

	public Campaign(int campaignId, int campaignPercent) {
		this.campaignPercent = campaignPercent;
		this.campaignId = campaignId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public int getCampaignPercent() {
		return campaignPercent;
	}

	public void setCampaignPercent(int campaignPercent) {
		this.campaignPercent = campaignPercent;
	}


	
}
