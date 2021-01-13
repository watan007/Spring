package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssetDetail {
	@Id
	private int id;
	@Column
	private String AssetName;
	@Column
	private LocalDateTime StartTime;
	@Column
	private LocalDateTime EndTime;
	@Column
	private int severity;
	public AssetDetail(int id, String assetName, LocalDateTime startTime, LocalDateTime endTime, int severity) {
		super();
		this.id = id;
		AssetName = assetName;
		StartTime = startTime;
		EndTime = endTime;
		this.severity = severity;
	}
	public AssetDetail(String string, String string2, String string3, String string4) {
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
	public LocalDateTime getStartTime() {
		return StartTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		StartTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return EndTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		EndTime = endTime;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	@Override
	public String toString() {
		return "AssetDetail [id=" + id + ", AssetName=" + AssetName + ", StartTime=" + StartTime + ", EndTime="
				+ EndTime + ", severity=" + severity + "]";
	}
	
}
