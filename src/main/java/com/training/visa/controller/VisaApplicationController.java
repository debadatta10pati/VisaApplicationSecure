package com.training.visa.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.visa.model.VisaApplication;
import com.training.visa.repository.VisaApplicationRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class VisaApplicationController {

	@Autowired
	VisaApplicationRepository visaApplicationRepository;

	@Autowired
	private JmsTemplate jmsTemplate;

	@ApiOperation(value = "Get list of applications ", response = Iterable.class, tags = "getAllApplications")
	@GetMapping("/getapplicationlist")
	public List<VisaApplication> getAllApplications() {
		return visaApplicationRepository.findAll();

	}

	@ApiOperation(value = "Get application by passport ", response = VisaApplication.class, tags = "getApplicationbyPassport")
	@GetMapping("/getapplication/{passport}")
	public VisaApplication getAllApplicationByPassport(@PathVariable String passport) {

		return visaApplicationRepository.findByPassport(passport);

	}

	@ApiOperation(value = "Apply for a visa ", response = Object.class, tags = "newApplication")
	@PostMapping("/newvisaapplication")
	public ResponseEntity<Object> newVisaApplication(@RequestBody VisaApplication application)

	{
		application.setVisaApplicationDate(new Date());
		application.setDecision("UnderProcess");
		application.setVisaDuration(0);
		visaApplicationRepository.save(application);
	//	jmsTemplate.convertAndSend("visaapplication.queue", application.toString());
		return new ResponseEntity<>(HttpStatus.CREATED);

	}

	@ApiOperation(value = "Visa approval decision ", response = Object.class, tags = "visaDecison")
	@PutMapping("/visadecision")
	public ResponseEntity<Object> takeVisaDecision(@RequestBody VisaApplication application)

	{
		VisaApplication existingApplication = visaApplicationRepository.findByPassport(application.getPassport());

		if (existingApplication != null) {
			existingApplication.setDecision(application.getDecision());

			if (application.getVisaDuration() != 0) {
				existingApplication.setVisaDuration(application.getVisaDuration());
			}

			visaApplicationRepository.save(existingApplication);
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
