package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by sofia on 2018-12-31
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Section11SpringMicroserviceLibraryEdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section11SpringMicroserviceLibraryEdgeApplication.class, args);
	}

}
