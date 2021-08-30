package com.code.web.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Checkout")
public class Checkout extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String cardname = req.getParameter("cardname");
		String cardno = req.getParameter("cardno");
		String cvv = req.getParameter("cvv");
		String cardholdername = req.getParameter("cardholdername");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");

		HttpSession session = req.getSession();

		session.setAttribute("cardname", cardname);
		session.setAttribute("cardno", cardno);
		session.setAttribute("cvv", cvv);
		session.setAttribute("cardholdername", cardholdername);

		res.sendRedirect("ReceiptPage.jsp");
	}

}
