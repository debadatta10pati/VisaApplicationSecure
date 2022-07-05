package com.training.visa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.visa.model.Visa;

public interface VisaRepository extends JpaRepository<Visa, Long> {

	Visa findByVisaType(String visaType);
}
