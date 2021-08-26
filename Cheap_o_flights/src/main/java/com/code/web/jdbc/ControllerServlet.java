package com.code.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private DbUtil DbUtil;

	@Resource(name = "jdbc/cheap_o_fly")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();

		// create our student db util ... and pass in the conn pool / datasource
		try {
			DbUtil = new DbUtil(dataSource);
		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");

			// if the command is missing, then default to listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}

			// route to the appropriate method
			switch (theCommand) {

			case "LIST":
				listFlights(request, response);
				break;

			case "ADD":
				addFlight(request, response);
				break;

			case "LOAD":
				loadFlight(request, response);
				break;

			case "UPDATE":
				updateFlight(request, response);
				break;

			case "DELETE":
				deleteFlight(request, response);
				break;

			default:
				listFlights(request, response);
			}

		} catch (Exception exc) {
			throw new ServletException(exc);
		}

	}

	private void deleteFlight(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read flight id from form data
		String theFlightId = request.getParameter("flightId");

		// delete flight from database
		DbUtil.deleteFlight(theFlightId);

		// send them back to "list flights" page
		listFlights(request, response);
	}

	private void updateFlight(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		// read flight info from form data
		int flight_id = Integer.parseInt(request.getParameter("flightId"));
		String name = request.getParameter("name");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String email = request.getParameter("email");
		String day = request.getParameter("day");
		float ticket_price = Float.parseFloat(request.getParameter("ticket_price"));

		// create a new student object
		Flight theFlight = new Flight(flight_id, name, source, destination, email, day, ticket_price);

		// perform update on database
		DbUtil.updateFlight(theFlight);

		// send them back to the "list students" page
		listFlights(request, response);

	}

	private void loadFlight(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student id from form data
		String theFlightId = request.getParameter("flightId");

		// get student from database (db util)
		Flight theFlight = DbUtil.getFlight(theFlightId);

		// place student in the request attribute
		request.setAttribute("THE_FLIGHT", theFlight);

		// send to jsp page: update-student-form.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-flight-form.jsp");
		dispatcher.forward(request, response);
	}

	private void addFlight(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read flight info from form data
		String name = request.getParameter("name");
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String email = request.getParameter("email");
		String day = request.getParameter("day");
		float ticket_price = Float.parseFloat(request.getParameter("ticket_price"));

		// create a new flight object
		Flight theFlight = new Flight( name, source, destination, email, day, ticket_price);

		// add the student to the database
		DbUtil.addFlight(theFlight);

		// send back to main page (the student list)
		listFlights(request, response);
	}

	
	private void listFlights(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// get flights from db util
		List<Flight> flights =  DbUtil.getFlights();

		// add flights to the request
		request.setAttribute("FLIGHT_LIST", flights);

		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-flights.jsp");
		dispatcher.forward(request, response);
	}

}
