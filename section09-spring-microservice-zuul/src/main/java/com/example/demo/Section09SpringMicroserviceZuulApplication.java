package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by sofia on 2018-12-30
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableZuulProxy
public class Section09SpringMicroserviceZuulApplication {

	@Bean
	public MyZuulFilter filter() {
		return new MyZuulFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section09SpringMicroserviceZuulApplication.class, args);
	}

}

