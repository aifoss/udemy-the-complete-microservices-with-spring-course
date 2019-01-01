package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sofia on 2018-12-31
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class Section11SpringMicroserviceLibraryReservationApplication {

	@Value("${server.port}")
	private String port;
	
	private Map<Integer, Reservation> reservations = new HashMap<>();
	
	@CrossOrigin
	@RequestMapping("/reservation/user/{username}/book/{bookId}")
	public String reserve(@PathVariable("username") String username, @PathVariable("bookId") int bookId) {
		Reservation reservation = new Reservation();
		reservation.setBookId(bookId);
		reservation.setUsername(username);
		reservation.setDate(new Date());
		reservation.setReservationId(new Random().nextInt());
		
		reservations.put(reservation.getReservationId(), reservation);
		
		System.out.println(reservations.size());
		
		return "Title has been reserved using server on port: " + port + ".";
	}
	
	@CrossOrigin
	@RequestMapping("/reservation/user/{username}")
	public List<Reservation> reservationsByUser(@PathVariable("username") String username) {
		List<Reservation> userReservations = new ArrayList<>();
		
		for (Reservation reservation : this.reservations.values()) {
			if (reservation.getUsername().contentEquals(username)) {
				userReservations.add(reservation);
			}
		}
		
		return userReservations;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Section11SpringMicroserviceLibraryReservationApplication.class, args);
	}

}
