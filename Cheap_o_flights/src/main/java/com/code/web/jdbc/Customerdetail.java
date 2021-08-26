package com.code.web.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Customerdetail")
public class Customerdetail extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String passengername=req.getParameter("passenger");
		String email=req.getParameter("email");
		String mobileno=req.getParameter("mobileno");
		
		HttpSession session=req.getSession();
		
		session.setAttribute("passengername", passengername);
		session.setAttribute("email", email);
		session.setAttribute("mobileno", mobileno);
		
		// System.out.println("Please wait... Proceeding to Checkout");
		
		res.sendRedirect("Checkout.jsp");
	}
	
}




























