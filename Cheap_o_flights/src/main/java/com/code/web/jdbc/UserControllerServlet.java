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

@WebServlet("/UserControllerServlet")
public class UserControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsersDbUtil usersDbUtil;

	@Resource(name = "jdbc/cheap_o_fly")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		super.init();

		// create our user db util ... and pass in the conn pool / datasource
		try {
			usersDbUtil = new UsersDbUtil(dataSource);
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
				listUsers(request, response);
				break;

			case "ADD":
				addUser(request, response);
				break;

			case "LOAD":
				loadUser(request, response);
				break;

			case "UPDATE":
				updateUser(request, response);
				break;

			case "DELETE":
				deleteUser(request, response);
				break;

			default:
				listUsers(request, response);
			}

		} catch (Exception exc) {
			throw new ServletException(exc);
		}

	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read flight id from form data
		String theAdminId = request.getParameter("adminId");

		// delete flight from database
		usersDbUtil.deleteUser(theAdminId);

		// send them back to "list flights" page
		listUsers(request, response);
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read flight info from form data
		int adminid = Integer.parseInt(request.getParameter("adminId"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// create a new student object
		Users theUser = new Users(adminid, username, password);

		// perform update on database
		usersDbUtil.updateUser(theUser);

		// send them back to the "list students" page
		listUsers(request, response);

	}

	private void loadUser(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student id from form data
		String theAdmintId = request.getParameter("adminId");

		// get student from database (db util)
		Users theUser = usersDbUtil.getUser(theAdmintId);

		// place student in the request attribute
		request.setAttribute("THE_USER", theUser);

		// send to jsp page: update-student-form.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-user-form.jsp");
		dispatcher.forward(request, response);
	}

	private void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read flight info from form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// create a new flight object
		Users theUser = new Users(username, password);

		// add the student to the database
		usersDbUtil.addUser(theUser);

		// send back to main page (the student list)
		listUsers(request, response);
	}

	private void listUsers(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// get users from db util
		List<Users> users = usersDbUtil.getUsers();

		// add flights to the request
		request.setAttribute("USER_LIST", users);

		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-users.jsp");
		dispatcher.forward(request, response);
	}

}
