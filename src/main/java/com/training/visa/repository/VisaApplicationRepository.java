package com.training.visa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.visa.model.VisaApplication;

public interface VisaApplicationRepository extends JpaRepository<VisaApplication, Long> {

	VisaApplication findByPassport( String passport);
}
