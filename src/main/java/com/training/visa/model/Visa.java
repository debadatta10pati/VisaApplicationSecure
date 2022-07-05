package com.training.visa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visa {
	
	@Id
	private long id;
	
	private String visaType;
	
	private long price;
	
	private long durationInDays;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVisaType() {
		return visaType;
	}

	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getDurationInDays() {
		return durationInDays;
	}

	public void setDurationInDays(long durationInDays) {
		this.durationInDays = durationInDays;
	}




}
