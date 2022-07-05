package com.training.visa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.visa.model.Visa;
import com.training.visa.repository.VisaRepository;

@SpringBootTest
class VisaApplicationMysqlApplicationTests {
	
	@Autowired
	private VisaRepository visaRepository;

	@Test
	void testVisaTypeCreation() {
		
		Visa visa = new Visa();
		
		visa.setVisaType("Employment");
		visa.setPrice(300);
		visa.setDurationInDays(720);
		
		Visa newVisaType = visaRepository.save(visa);
		
		assertNotNull(newVisaType);
	}

	
	void testCountOfVisas() {
		
		List<Visa> visaTypes = visaRepository.findAll();
		
		assertEquals(visaTypes.size(),3);
	}

}
