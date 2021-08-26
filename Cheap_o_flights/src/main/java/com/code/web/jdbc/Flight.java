package com.code.web.jdbc;

public class Flight 
{
	
	private int flight_id;
	private String name;
	private String source;
	private String destination;
	private String email;
	private String day;
	private float ticket_price;
	
	public Flight(String name, String source, String destination, String email, String day, float ticket_price) {
		super();
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.email = email;
		this.day = day;
		this.ticket_price = ticket_price;
	}

	public Flight(int flight_id, String name, String source, String destination, String email, String day,
			float ticket_price) {
		super();
		this.flight_id = flight_id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.email = email;
		this.day = day;
		this.ticket_price = ticket_price;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public float getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(float ticket_price) {
		this.ticket_price = ticket_price;
	}

	@Override
	public String toString() {
		return "Flight [flight_id=" + flight_id + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", email=" + email + ", day=" + day + ", ticket_price=" + ticket_price + "]";
	}

}





















