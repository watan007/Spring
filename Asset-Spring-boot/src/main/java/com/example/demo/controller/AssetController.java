package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.example.demo.repository.AssetRepository;
import com.example.demo.service.AssetService;

@RestController
public class AssetController {
	
	@Autowired
	private AssetRepository assetRepository;
	private AssetService assetService;
	
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
		

		
		
		
		

}
