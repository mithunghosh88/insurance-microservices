package com.springboot.insurance.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("insurance-client")
@RefreshScope
public class InsuranceClientController {

	@Autowired
	private RestTemplate template;
	
	@Value("${insurance.provider.url}")
	private String url;
	
	@GetMapping("/plans")
	public List<String> getAllPlans(){
		return template.getForObject(url, List.class);
	}
}
