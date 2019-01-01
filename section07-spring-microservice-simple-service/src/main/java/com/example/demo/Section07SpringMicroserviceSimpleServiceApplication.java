package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sofia on 2018-12-29
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@RestController
public class Section07SpringMicroserviceSimpleServiceApplication {

	@RequestMapping("/service")
	public List<String> execute() {
		return Arrays.asList("Value1", "Value2");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section07SpringMicroserviceSimpleServiceApplication.class, args);
	}

}

