package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sofia on 2018-12-30
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@RestController
public class Section09SpringMicroserviceSimpleService3Application {

	@RequestMapping("/execute")
	public String execute() {
		return "Executed ...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section09SpringMicroserviceSimpleService3Application.class, args);
	}

}
