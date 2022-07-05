package com.training.visa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJms
@EnableWebMvc
@SpringBootApplication
public class VisaApplicationMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisaApplicationMysqlApplication.class, args);
	}

}
