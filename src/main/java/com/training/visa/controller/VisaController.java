package com.training.visa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.training.visa.model.Visa;
import com.training.visa.repository.VisaRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class VisaController {
	
	@Autowired
	VisaRepository visaRespository;
	
	@ApiOperation(value = "Get list of visas ", response = Iterable.class, tags = "getAllVisas")
	@GetMapping("/getvisalist")
	public List<Visa> getAllVisas()
	{
		return visaRespository.findAll();
		 
	}
	@ApiOperation(value = "Get Visa Details by Type ", response = Visa.class, tags = "getVisaByType")
	@GetMapping("/getvisadetailsbytype/{visa}")
	public Visa getVisaDetailsByType(@PathVariable String visa)
	{
		return visaRespository.findByVisaType(visa);
		 
	}


}
