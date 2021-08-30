package com.code.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class DbUtil {

	private DataSource dataSource;

	public DbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	public List<Flight> getFlights() throws Exception {

		List<Flight> flights = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			// get a connection
			myConn = dataSource.getConnection();

			// create sql statement
			String sql = "select * from flights order by Flight_id";

			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int flight_id = myRs.getInt("Flight_id");
				String name = myRs.getString("Name");
				String source = myRs.getString("Source");
				String destination = myRs.getString("Destination");
				String email = myRs.getString("email");
				String day = myRs.getString("To_Day");
				float ticket_price = myRs.getFloat("Ticket_Price");

				// create new student object
				Flight tempFlight = new Flight(flight_id, name, source, destination, email, day, ticket_price);

				// add it to the list of students
				flights.add(tempFlight);
			}

			return flights;
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}

			if (myStmt != null) {
				myStmt.close();
			}

			if (myConn != null) {
				myConn.close(); // doesn't really close it ... just puts back in connection pool
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public void addFlight(Flight theFlight) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create sql for insert
			String sql = "insert into flights " + "(Name, Source, Destination,email,To_Day,Ticket_Price) "
					+ "values (?, ?, ? , ?, ?, ?)";

			myStmt = myConn.prepareStatement(sql);

			// set the param values for the student
			myStmt.setString(1, theFlight.getName());
			myStmt.setString(2, theFlight.getSource());
			myStmt.setString(3, theFlight.getDestination());
			myStmt.setString(4, theFlight.getEmail());
			myStmt.setString(5, theFlight.getDay());
			myStmt.setFloat(6, theFlight.getTicket_price());

			// execute sql insert
			myStmt.execute();

		} finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public Flight getFlight(String theFlightId) throws Exception {

		Flight theFlight = null;

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int flightId;

		try {
			// convert student id to int
			flightId = Integer.parseInt(theFlightId);

			// get connection to database
			myConn = dataSource.getConnection();

			// create sql to get selected student
			String sql = "select * from flights where Flight_id=?";

			// create prepared statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setInt(1, flightId);

			// execute statement
			myRs = myStmt.executeQuery();

			// retrieve data from result set row
			if (myRs.next()) {
				String name = myRs.getString("Name");
				String source = myRs.getString("Source");
				String destination = myRs.getString("Destination");
				String email = myRs.getString("email");
				String day = myRs.getString("To_Day");
				Float ticket_price = myRs.getFloat("Ticket_Price");

				// use the flightId during construction
				theFlight = new Flight(flightId, name, source, destination, email, day, ticket_price);
			} else {
				throw new Exception("Could not find student id: " + flightId);
			}

			return theFlight;
		} finally {
			// clean up JDBC objects
			close(myConn, myStmt, myRs);
		}
	}

	public void updateFlight(Flight theFlight) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create SQL update statement
			String sql = "update flights " + "set Name=?, Source=?, Destination=?, email=?, To_Day=?, Ticket_Price=? "
					+ "where Flight_id=?";

			// prepare statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setString(1, theFlight.getName());
			myStmt.setString(2, theFlight.getSource());
			myStmt.setString(3, theFlight.getDestination());
			myStmt.setString(4, theFlight.getEmail());
			myStmt.setString(5, theFlight.getDay());
			myStmt.setFloat(6, theFlight.getTicket_price());
			myStmt.setInt(7, theFlight.getFlight_id());

			// execute SQL statement
			myStmt.execute();
		} finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public void deleteFlight(String theFlightId) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// convert student id to int
			int flightId = Integer.parseInt(theFlightId);

			// get connection to database
			myConn = dataSource.getConnection();

			// create sql to delete student
			String sql = "delete from flights where Flight_id=?";

			// prepare statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setInt(1, flightId);

			// execute sql statement
			myStmt.execute();
		} finally {
			// clean up JDBC code
			close(myConn, myStmt, null);
		}
	}

}
