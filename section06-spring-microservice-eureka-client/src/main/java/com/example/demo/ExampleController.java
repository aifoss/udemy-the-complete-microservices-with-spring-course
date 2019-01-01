package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sofia on 2018-12-29
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@RestController
public class ExampleController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/execute")
	public String execute() {
		return restTemplate.getForObject("http://eureka-client-2/serviceinfo", String.class);
	}
	
}
