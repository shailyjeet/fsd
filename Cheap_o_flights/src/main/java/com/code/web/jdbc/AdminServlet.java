package com.code.web.jdbc;

import java.io.IOException;

import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		try {
			String userid = req.getParameter("userid");
			String password = req.getParameter("password");
			HttpSession session = req.getSession();
			session.setAttribute("userid", userid);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cheap_o_fly", "cheap_o_user",
					"cheap_o_pass");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(
					"select * from admin where Username='" + userid + "' and Password='" + password + "'");
			if (rs.next()) {
				res.sendRedirect("Admin.jsp");

			} else {
				res.sendRedirect("AdminPage.jsp");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
