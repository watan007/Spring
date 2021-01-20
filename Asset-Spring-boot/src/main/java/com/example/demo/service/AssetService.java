package com.example.demo.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AssetDetail;
import com.example.demo.model.AssetStatus;
import com.example.demo.repository.AssetRepository;

@Service
public class AssetService {
	
	@Autowired
	private AssetRepository assetrepository;
	@Autowired
	private AssetDetail assetDetail;
	@Autowired
	private AssetStatus assetStatus;
	
	String line ="";
	
	public void saveAssetData() throws IOException {
		try {
			BufferedReader br=new BufferedReader(new FileReader("src/main/resources/Input.csv"));
			while((line=br.readLine())!=null) {
				String[] data=line.split(",");
				AssetDetail assetDetail=new AssetDetail();
				assetDetail.setAssetName(data[0]);
				assetDetail.setStartTime(data[1]);
				assetDetail.setEndTime(data[2]);
				assetDetail.setSeverity(data[3]);
				assetrepository.save(assetDetail);
				
			}
		} catch (IOException e)  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void totalIncidentsOfAsset(String AssetName) {
		
	}
	
	public void totalUptimeForAsset(String assetName) {
        
	}
	

}
