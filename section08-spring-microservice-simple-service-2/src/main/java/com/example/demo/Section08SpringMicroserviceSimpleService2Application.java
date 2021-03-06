package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
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
public class Section08SpringMicroserviceSimpleService2Application {

	@Value("${server.port}")
	public String port;
	
	@RequestMapping("/execute")
	public String execute() {
		return "Hello from the port " + this.port;
	}
	
	@RequestMapping("/")
	public String status() {
		return "Up";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section08SpringMicroserviceSimpleService2Application.class, args);
	}

}
