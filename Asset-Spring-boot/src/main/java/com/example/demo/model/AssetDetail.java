package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AssetDetail {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String AssetName;
	@Column
	private String StartTime;
	@Column
	private String EndTime;
	@Column
	private String severity;
	public AssetDetail(int id, String assetName, String startTime, String endTime, String severity) {
		super();
		this.id = id;
		AssetName = assetName;
		StartTime = startTime;
		EndTime = endTime;
		this.severity = severity;
	}
	public AssetDetail() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssetName() {
		return AssetName;
	}
	public void setAssetName(String assetName) {
		AssetName = assetName;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	@Override
	public String toString() {
		return "AssetDetail [id=" + id + ", AssetName=" + AssetName + ", StartTime=" + StartTime + ", EndTime="
				+ EndTime + ", severity=" + severity + "]";
	}
	
	
	
}
