package com.example.demo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by sofia on 2018-12-28
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@RestController
@Import(DemoConfiguration.class)
@ImportResource("/simple-context.xml")
public class Section02SpringMicroserviceApplication {

	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean registration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(), "/servlet/*");
		registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME);
		return registration;
	}
	
	@Autowired
	@Resource(name="cats")
	public List<String> listFromConfig;
	
	@Autowired
	@Resource(name="circus")
	public List<String> listFromContext;
	
	@RequestMapping("/cats")
	public String cats() {
		return String.join(", ", listFromConfig);
	}
	
	@RequestMapping("/circus")
	public String message() {
		return String.join(", ", listFromContext);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section02SpringMicroserviceApplication.class, args);
	}

}
