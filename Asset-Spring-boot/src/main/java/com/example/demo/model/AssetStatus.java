package com.example.demo.model;

public class AssetStatus {
	
	private String AssetName;

    private String totalIncidents;

    private String totalUpTime;

    private String rating;

	public AssetStatus(String assetName, String totalIncidents, String totalUpTime, String rating) {
		super();
		AssetName = assetName;
		this.totalIncidents = totalIncidents;
		this.totalUpTime = totalUpTime;
		this.rating = rating;
	}

	public AssetStatus() {
		
	}

	public String getAssetName() {
		return AssetName;
	}

	public void setAssetName(String assetName) {
		AssetName = assetName;
	}

	public String getTotalIncidents() {
		return totalIncidents;
	}

	public void setTotalIncidents(String totalIncidents) {
		this.totalIncidents = totalIncidents;
	}

	public String getTotalUpTime() {
		return totalUpTime;
	}

	public void setTotalUpTime(String totalUpTime) {
		this.totalUpTime = totalUpTime;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "AssetStatus [AssetName=" + AssetName + ", totalIncidents=" + totalIncidents + ", totalUpTime="
				+ totalUpTime + ", rating=" + rating + "]";
	}
	
	
    
    

}
