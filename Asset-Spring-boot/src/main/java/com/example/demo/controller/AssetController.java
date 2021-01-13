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
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.example.demo.model.AssetDetail;
import com.example.demo.repository.AssetRepository;

@RestController
public class AssetController {
	
	@Autowired
	private AssetRepository assetRepository;
	
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
	
	@GetMapping("/downloadcsv")
	public void downloadCsv(HttpServletResponse response) throws IOException {
		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; filename=input.csv");
		
		ICsvBeanWriter csvWriter=new CsvBeanWriter(response.getWriter(),CsvPreference.STANDARD_PREFERENCE);
		
		String[] header= {"Asset Name", "Start Time", "End Time", "Severity"};
		
		String[] pojoclassPropertyName= {"AssetName", "StartTime", "EndTime", "severity"};
		
		csvWriter.writeHeader(header);
		
		List<AssetDetail> assetDetails= listAssetstats();
		
		
		
	}

	private List<AssetDetail> listAssetstats() {
		
		List<AssetDetail> assetDetail=new ArrayList<AssetDetail>();
		assetDetail.add(new AssetDetail("System1", "01-04-2019  08:10:00", "01-04-2019  08:31:00", "1"));
		assetDetail.add(new AssetDetail("System2", "01-04-2019  08:45:00", "01-04-2019  08:45:00", "2"));
		assetDetail.add(new AssetDetail("System2", "01-04-2019  13:26:00", "01-04-2019  13:26:00", "2"));
		assetDetail.add(new AssetDetail("System2", "01-04-2019  21:05:00", "01-04-2019  21:54:00", "2"));
		assetDetail.add(new AssetDetail("System3", "01-04-2019  09:05:00", "01-04-2019  10:43:00", "3"));
		return null;
	}
	

}
