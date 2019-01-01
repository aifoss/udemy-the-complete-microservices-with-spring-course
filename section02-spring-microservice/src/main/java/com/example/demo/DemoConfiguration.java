package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sofia on 2018-12-28
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@Configuration
public class DemoConfiguration {

	@Bean
	public List<String> cats() {
		return Arrays.asList("Bengal", "Lion");
	}
	
}
