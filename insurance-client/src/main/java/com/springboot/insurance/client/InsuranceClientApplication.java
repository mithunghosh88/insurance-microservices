package com.springboot.insurance.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class InsuranceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceClientApplication.class, args);
	}

	@Bean
	public RestTemplate geTemplate() {
		return new RestTemplate();
	}
}
