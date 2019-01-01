package com.example.demo;

import java.util.Date;

/**
 * Created by sofia on 2018-12-31
 */

/**
 * Source: Udemy: The Complete Spring Microservices Course
 */
public class Reservation {

	private int reservationId;

	private String username;

	private int bookId;

	private Date date;

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
