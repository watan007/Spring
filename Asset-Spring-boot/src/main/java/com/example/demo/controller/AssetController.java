package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.example.demo.model.AssetDetail;
import com.example.demo.model.AssetStatus;
import com.example.demo.repository.AssetRepository;
import com.example.demo.service.AssetService;

@RestController
public class AssetController {
	
	@Autowired
	private AssetRepository assetRepository;
	@Autowired
	private AssetService assetService;
	@Autowired
	private AssetDetail assetDetail;
	@Autowired
	private AssetStatus assetStatus;
	
	
	@GetMapping("/assets")
	public List<AssetDetail> getallAsset(){
		return (List<AssetDetail>) assetRepository.findAll();
	}
	
	@GetMapping("/assets/{id}")
	public Optional<AssetDetail> getAssetById(@PathVariable Integer id) {
		return assetRepository.findById(id);
	}
	
	@PostMapping("/addAsset")
	public void addAsset(@RequestBody AssetDetail assetDetail) {
		assetRepository.save(assetDetail);
	}
	
	@DeleteMapping("/deleteAsset/{id}")
	public void deleteAssetbyid(@PathVariable("id") Integer id) {
		assetRepository.deleteById(id);
	}
	
	@RequestMapping(path="feedAssetData")
	public void setAssetdatadb() throws IOException {
		assetService.saveAssetData();
	}
	
	public int totalIncidentsOfAsset() {
		Set<AssetDetail> assets = (Set<AssetDetail>) assetRepository.findAll();
		Integer a;
        Object AssetStatus;
        for(AssetDetail asset : assets) {
            if(assetDetail.getAssetName().equalsIgnoreCase(assetService)){ 
                a=Integer.valueOf(assetDetail.getAssetName().length()); 
            }
        }
        return a;
    }
	
	   
	    public void totalUptimeForAsset(String assetName) {
	        
	
	}
	    public String calculateRating(String assetName) {
	        int s1 = 30;
	        int s2_3 = 10;
	        String rating;

	        Set<AssetDetail> assets = (Set<AssetDetail>) assetRepository.findAll();
	        for (AssetDetail asset : assets) {
	            if(asset.getAssetName().equalsIgnoreCase(assetName)){
	                for (AssetDetail assetDetail : asset.getAssetName()) {
	                    if(assetDetail.getSeverity() == 1){
	                        rating += s1;
	                    }else if(assetDetail.getSeverity() == 2 || assetDetail.getSeverity() == 3){
	                        rating += s2_3;
	                    }
	                }
	            }
	        }
	        return rating;
	    }
	
	

}
