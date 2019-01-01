package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class Section04SpringMicroserviceConfigClientApplication {

	@Value("${message}")
	private String message;
	
	@RequestMapping("/message")
	public String message() {
		return this.message;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section04SpringMicroserviceConfigClientApplication.class, args);
	}

}
