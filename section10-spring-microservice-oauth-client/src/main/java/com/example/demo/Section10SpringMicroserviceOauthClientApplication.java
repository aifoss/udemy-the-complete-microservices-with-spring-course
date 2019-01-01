package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.DefaultResponseErrorHandler;

/**
 * Created by sofia on 2018-12-30
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@EnableOAuth2Client
@RestController
public class Section10SpringMicroserviceOauthClientApplication {

	@Autowired
	private OAuth2RestTemplate restTemplate;
	
	@Bean
	public OAuth2RestTemplate restTemplate() {
		OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resource(), new DefaultOAuth2ClientContext());
		
		restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		restTemplate.setErrorHandler(new DefaultResponseErrorHandler() {
		    public boolean hasError(ClientHttpResponse response) throws IOException {
		        HttpStatus statusCode = response.getStatusCode();
		        return statusCode.series() == HttpStatus.Series.SERVER_ERROR;
		    }
		});
		
		return restTemplate;
	}
	
	@Bean
	protected OAuth2ProtectedResourceDetails resource() {
		ResourceOwnerPasswordResourceDetails details = new ResourceOwnerPasswordResourceDetails();
		details.setAccessTokenUri("http://localhost:9090/oauth/token");
		details.setClientId("webapp");
		details.setClientSecret("websecret");
		details.setGrantType("password");
		return details;
	}
	
	@RequestMapping("/execute")
	public String execute(Principal principal) throws URISyntaxException {
		User user = (User) ((Authentication) principal).getPrincipal();
		URI uri = new URI("http://localhost:7070/resource/endpoint");
		RequestEntity<String> request = new RequestEntity<>(HttpMethod.POST, uri);
		AccessTokenRequest accessTokenRequest = this.restTemplate.getOAuth2ClientContext().getAccessTokenRequest();
		accessTokenRequest.set("username", user.getUsername());
		accessTokenRequest.set("password", user.getPassword());
		return this.restTemplate.exchange(request, String.class).getBody();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section10SpringMicroserviceOauthClientApplication.class, args);
	}

}
