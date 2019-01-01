package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

/**
 * Created by sofia on 2018-12-30
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
public class SimpleServiceConfiguration {

	@Autowired
	public IClientConfig ribbonClientConfig;
	
	@Bean
	public IPing ping(IClientConfig config) {
		return new PingUrl();
	}
	
	@Bean
	public IRule rule(IClientConfig config) {
		return new AvailabilityFilteringRule();
	}
	
}
