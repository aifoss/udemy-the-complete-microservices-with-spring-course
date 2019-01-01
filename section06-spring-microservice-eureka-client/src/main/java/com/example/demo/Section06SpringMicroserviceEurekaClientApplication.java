package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sofia on 2018-12-29
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableEurekaClient
public class Section06SpringMicroserviceEurekaClientApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section06SpringMicroserviceEurekaClientApplication.class, args);
	}

}
