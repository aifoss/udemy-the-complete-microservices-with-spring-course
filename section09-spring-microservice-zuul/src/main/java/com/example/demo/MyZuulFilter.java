package com.example.demo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * Created by sofia on 2018-12-30
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
public class MyZuulFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("This request has passed thorugh the custom Zuul filter...");
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
