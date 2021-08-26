package com.code.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class UsersDbUtil {

	private DataSource dataSource;

	public UsersDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	public List<Users> getUsers() throws Exception {

		List<Users> users = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			// get a connection
			myConn = dataSource.getConnection();

			// create sql statement
			String sql = "select * from admin order by Admin_id";

			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result set
			while (myRs.next()) {

				// retrieve data from result set row
				int admin_id = myRs.getInt("Admin_id");
				String username = myRs.getString("Username");
				String password = myRs.getString("Password");

				// create new student object
				Users tempUser = new Users(admin_id, username, password);

				// add it to the list of students
				users.add(tempUser);
			}

			return users;
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

	public void addUser(Users theUser) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create sql for insert
			String sql = "insert into admin " + "(Username, Password ) " + "values (?, ?)";

			myStmt = myConn.prepareStatement(sql);

			// set the param values for the user
			myStmt.setString(1, theUser.getUsername());
			myStmt.setString(2, theUser.getPassword());

			// execute sql insert
			myStmt.execute();

		} finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public Users getUser(String theAdminId) throws Exception {

		Users theUser = null;

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int adminId;

		try {
			// convert student id to int
			adminId = Integer.parseInt(theAdminId);

			// get connection to database
			myConn = dataSource.getConnection();

			// create sql to get selected student
			String sql = "select * from admin where Admin_id=?";

			// create prepared statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setInt(1, adminId);

			// execute statement
			myRs = myStmt.executeQuery();

			// retrieve data from result set row
			if (myRs.next()) {
				String username = myRs.getString("Username");
				String password = myRs.getString("Password");

				// use the flightId during construction
				theUser = new Users(adminId, username, password);
			} else {
				throw new Exception("Could not find student id: " + adminId);
			}

			return theUser;
		} finally {
			// clean up JDBC objects
			close(myConn, myStmt, myRs);
		}
	}

	public void updateUser(Users theUser) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create SQL update statement
			String sql = "update admin " + "set Username=?, Password=? " + "where Admin_id=?";

			// prepare statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setString(1, theUser.getUsername());
			myStmt.setString(2, theUser.getPassword());
			myStmt.setInt(3, theUser.getAdmin_id());

			// execute SQL statement
			myStmt.execute();
		} finally {
			// clean up JDBC objects
			close(myConn, myStmt, null);
		}
	}

	public void deleteUser(String theAdminId) throws Exception {

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// convert student id to int
			int adminId = Integer.parseInt(theAdminId);

			// get connection to database
			myConn = dataSource.getConnection();

			// create sql to delete student
			String sql = "delete from admin where Admin_id=?";

			// prepare statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setInt(1, adminId);

			// execute sql statement
			myStmt.execute();
		} finally {
			// clean up JDBC code
			close(myConn, myStmt, null);
		}
	}

}
