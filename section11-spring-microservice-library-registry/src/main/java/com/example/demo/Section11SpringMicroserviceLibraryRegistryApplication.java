package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sofia on 2018-12-31
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableEurekaServer
public class Section11SpringMicroserviceLibraryRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section11SpringMicroserviceLibraryRegistryApplication.class, args);
	}

}

