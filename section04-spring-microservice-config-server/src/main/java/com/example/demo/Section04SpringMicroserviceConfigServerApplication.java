package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by sofia on 2018-12-29
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableConfigServer
public class Section04SpringMicroserviceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section04SpringMicroserviceConfigServerApplication.class, args);
	}

}
