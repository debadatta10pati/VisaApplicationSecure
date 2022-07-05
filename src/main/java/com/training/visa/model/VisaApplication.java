package com.training.visa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VisaApplication {

	@Id
	private long id;

	private String visaType;

	private String name;

	private String passport;

	private long age;

	private Date visaApplicationDate;

	private long numberOfDocuments;

	private String decision;

	private long visaDuration;

	private String employmentStatus;

	private String maritalStatus;

	public long getVisaDuration() {
		return visaDuration;
	}

	public void setVisaDuration(long visaDuration) {
		this.visaDuration = visaDuration;
	}

	public long getNumberOfDocuments() {
		return numberOfDocuments;
	}

	public void setNumberOfDocuments(long numberOfDocuments) {
		this.numberOfDocuments = numberOfDocuments;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public Date getVisaApplicationDate() {
		return visaApplicationDate;
	}

	public void setVisaApplicationDate(Date visaApplicationDate) {
		this.visaApplicationDate = visaApplicationDate;
	}

	@Override
	public String toString() {
		return "VisaApplication [id=" + id + ", visaType=" + visaType + ", name=" + name + ", passport=" + passport
				+ ", age=" + age + ", visaApplicationDate=" + visaApplicationDate + ", numberOfDocuments="
				+ numberOfDocuments + ", decision=" + decision + ", visaDuration=" + visaDuration
				+ ", employmentStatus=" + employmentStatus + ", maritalStatus=" + maritalStatus + "]";
	}

	
}
