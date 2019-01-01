package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sofia on 2018-12-28
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@RestController
@RequestMapping("/book/search")
public class BookController {
	
	@RequestMapping("/title")
	public String findByTitle(@Param("title") String title) throws URISyntaxException {
		RestTemplate template = new RestTemplate();
		URI uri = new URI("http://localhost:9999/book/search/title?title=" + title);
		return template.getForObject(uri, String.class);
	}

}
