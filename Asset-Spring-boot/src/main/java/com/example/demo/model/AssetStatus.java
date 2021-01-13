package com.example.demo.model;

public class AssetStatus {
	
	private String AssetName;

    private Long totalIncidents;

    private double totalUpTime;

    private Long rating;

	public AssetStatus(String assetName, Long totalIncidents, double totalUpTime, Long rating) {
		super();
		AssetName = assetName;
		this.totalIncidents = totalIncidents;
		this.totalUpTime = totalUpTime;
		this.rating = rating;
	}

	public String getAssetName() {
		return AssetName;
	}

	public void setAssetName(String assetName) {
		AssetName = assetName;
	}

	public Long getTotalIncidents() {
		return totalIncidents;
	}

	public void setTotalIncidents(Long totalIncidents) {
		this.totalIncidents = totalIncidents;
	}

	public double getTotalUpTime() {
		return totalUpTime;
	}

	public void setTotalUpTime(double totalUpTime) {
		this.totalUpTime = totalUpTime;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "AssetStatus [AssetName=" + AssetName + ", totalIncidents=" + totalIncidents + ", totalUpTime="
				+ totalUpTime + ", rating=" + rating + "]";
	}
    
    
    
    

}
