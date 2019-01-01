package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

/**
 * Created by sofia on 2018-12-29
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Section06SpringMicroserviceEurekaClient2Application {

	@Autowired
	private EurekaClient client;
	
	@RequestMapping("/serviceinfo")
	public String serviceInfo() {
		InstanceInfo instance = client.getNextServerFromEureka("eureka-client-2", false);
		return instance.getHomePageUrl();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section06SpringMicroserviceEurekaClient2Application.class, args);
	}

}
