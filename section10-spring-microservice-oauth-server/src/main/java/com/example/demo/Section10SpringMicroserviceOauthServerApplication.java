package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sofia on 2018-12-30
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableResourceServer
@EnableAuthorizationServer
@RestController
public class Section10SpringMicroserviceOauthServerApplication {

	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(Section10SpringMicroserviceOauthServerApplication.class);
//		app.setWebApplicationType(WebApplicationType.NONE);
//		app.run(args);
		
		SpringApplication.run(Section10SpringMicroserviceOauthServerApplication.class, args);
	}

}
