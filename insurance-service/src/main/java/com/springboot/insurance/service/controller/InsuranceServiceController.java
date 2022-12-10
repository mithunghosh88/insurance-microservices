package com.springboot.insurance.service.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance-service")
public class InsuranceServiceController {

	@GetMapping("/plans")
	public List<String> getAllPlans(){
		return Stream.of("Premium","Gold","Platinum").collect(Collectors.toList());
	}
}
