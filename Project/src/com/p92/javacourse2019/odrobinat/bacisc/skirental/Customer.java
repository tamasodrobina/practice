package com.p92.javacourse2019.odrobinat.bacisc.skirental;

public class Customer {

	private int ticket;
	private int day;
	private String name;

	 Customer(int ticket, int days, String name) {
		super();
		this.ticket = ticket;
		this.day = days;
		this.name = name;

	}

	 int getDays() {
		return day;
	}

	 int getTicket() {
		return ticket;
	}

	 String getName() {
		return name;
	}

	
	public String toString() {
		return "Name: " + name + ", days: " + day + ", ticket: " + ticket + "\n";
	}

}
