package com.luv2code.springdemo.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/Home")
	public String home() {
		return "Home";
	}

	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}
	
	@RequestMapping("/Admin")
	public String Admin() {
		return "Admin";
	}
	
	@RequestMapping("/ProductPage")
	public String ProductPage() {
		return "ProductPage";
	}
	
	@RequestMapping("/Adminhome")
	public String Adminhome() {
		return "Adminhome";
	}
	
	@RequestMapping("/Delivery")
	public String Delivery() {
		return "Delivery";
	}
	
	@RequestMapping("/Deliverynonuser")
	public String Deliverynonuser() {
		return "Deliverynonuser";
	}
	
	@RequestMapping("/ParchaseReport")
	public String ParchaseReport() {
		return "ParchaseReport";
	}
	
	@RequestMapping("/BrowseUser")
	public String BrowseUser() {
		return "BrowseUser";
	}
	
	@RequestMapping("/UserHomePage")
	public String UserHomePage() {
		return "UserHomePage";
	}
	
	@RequestMapping("/updatepage")
	public String updatepage() {
		return "updatepage";
	}
	
	@RequestMapping("/IndividualPage")
	public String IndividualPage() {
		return "IndividualPage";
	}
	@RequestMapping("/IndividualPageuserlogin")
	public String IndividualPageuserlogin() {
		return "IndividualPageuserlogin";
	}
	
	@RequestMapping("/Kart")
	public String Kart() {
		return "Kart";
	}
	
	@RequestMapping("/Newuser")
	public String Newuser() {
		return "Newuser";
	}
	
	@RequestMapping("/Buy")
	public String Buy() {
		return "Buy";
	}
	
	@RequestMapping("/Buynonuser")
	public String Buynonuser() {
		return "Buynonuser";
	}
	
	@RequestMapping("/AddProduct")
	public String AddProduct() {
		return "AddProduct";
	}
	
	@RequestMapping("/UpdateProduct")
	public String UpdateProduct() {
		return "UpdateProduct";
	}
	
	@RequestMapping("/DeleteProduct")
	public String DeleteProduct() {
		return "DeleteProduct";
	}
	
	
	
	
	@RequestMapping("/adminlogin")
	public ModelAndView adminlogin(HttpServletRequest req, HttpServletResponse res) {

		String aid = req.getParameter("adminid");
		String apass = req.getParameter("adminpassword");

		ModelAndView mv = new ModelAndView();
		mv.addObject("adminid", aid);
		mv.addObject("adminpassword", apass);

		if (aid.equals("Admin")) {
			if (apass.equals("123")) {
				mv.setViewName("Adminhome");
			} else {
				mv.setViewName("Admin");
			}
		} else {
			mv.setViewName("Admin");
		}
		return mv;
	}

	@RequestMapping("/addproduct")
	public void addproduct(HttpServletRequest req, HttpServletResponse res)
			throws ClassNotFoundException, SQLException, IOException {
		String companyname = req.getParameter("companyname");
		String category = req.getParameter("category");
		String price = req.getParameter("price");
		String features = req.getParameter("features");
		String imgpath = req.getParameter("imgpath");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

		PreparedStatement ps = con
				.prepareStatement("insert into products(Companyname,Category,Price,Features,Imgpath)values(?,?,?,?,?)");
		ps.setString(1, companyname);
		ps.setString(2, category);
		ps.setString(3, price);
		ps.setString(4, features);
		ps.setString(5, imgpath);
		ps.executeUpdate();

		res.sendRedirect("ProductPage");
	}

	@RequestMapping("/deleteproduct")
	public void deleteproduct(HttpServletRequest req, HttpServletResponse res)
			throws ClassNotFoundException, SQLException, IOException {

		String id = req.getParameter("msg");
		// System.out.println(id);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

		PreparedStatement ps = con.prepareStatement("delete from products where Id='" + id + "'");
		ps.executeUpdate();

		res.sendRedirect("ProductPage");

	}

	@RequestMapping("/updateproduct")
	public void updateproduct(HttpServletRequest req, HttpServletResponse res)
			throws ClassNotFoundException, SQLException, IOException {
		HttpSession s1 = req.getSession();
		String Id = (String) s1.getAttribute("Id");
		String companyname = req.getParameter("companyname");
		String category = req.getParameter("category");
		String price = req.getParameter("price");
		String features = req.getParameter("features");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

		PreparedStatement ps = con.prepareStatement("update products set Companyname='" + companyname + "', Category='"
				+ category + "', Price='" + price + "', Features='" + features + "' where Id='" + Id + "'");
		ps.executeUpdate();

		res.sendRedirect("ProductPage");

	}

	@RequestMapping("/signup")
	public void signup(HttpServletRequest req, HttpServletResponse res)
			throws ClassNotFoundException, SQLException, IOException {
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String phoneno = req.getParameter("phoneno");
		String userid = req.getParameter("userid");
		String password = req.getParameter("password");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

		PreparedStatement ps = con
				.prepareStatement("insert into newusers(Name,Mail,Phoneno,Userid,Password)values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, mail);
		ps.setString(3, phoneno);
		ps.setString(4, userid);
		ps.setString(5, password);
		ps.executeUpdate();

		res.sendRedirect("Login");

	}

	@RequestMapping("/userlogin")
	public void userlogin(HttpServletRequest req, HttpServletResponse res)
			throws ClassNotFoundException, SQLException, IOException {
		String userid = req.getParameter("userid");
		String password = req.getParameter("password");
		HttpSession user = req.getSession();
		user.setAttribute("userid", userid);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

		Statement st = con.createStatement();
		ResultSet rs = st
				.executeQuery("select * from newusers where Userid='" + userid + "' and Password='" + password + "'");
		if (rs.next()) {
			res.sendRedirect("UserHomePage");
		} else {
			res.sendRedirect("Login");
		}

	}

	@RequestMapping("/buy")
	public void buy(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String cardnumber = req.getParameter("cardnumber");
		String cvv = req.getParameter("cvv");
		String username = req.getParameter("username");
		String address = req.getParameter("address");
		HttpSession indi = req.getSession();
		indi.setAttribute("cardnumber", cardnumber);
		indi.setAttribute("cvv", cvv);
		indi.setAttribute("username", username);
		indi.setAttribute("address", address);

		res.sendRedirect("Delivery");
	}

	@RequestMapping("/buynonuser")
	public void buynonuser(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String cardnumber = req.getParameter("cardnumber");
		String cvv = req.getParameter("cvv");
		String username = req.getParameter("username");
		String address = req.getParameter("address");
		HttpSession indi = req.getSession();
		indi.setAttribute("cardnumber", cardnumber);
		indi.setAttribute("cvv", cvv);
		indi.setAttribute("username", username);
		indi.setAttribute("address", address);

		res.sendRedirect("Deliverynonuser");
	}

	@RequestMapping("/minisearch")
	public void search(HttpServletRequest req, HttpServletResponse res)
			throws ClassNotFoundException, SQLException, IOException {
		String search = req.getParameter("search");
		HttpSession session1 = req.getSession();
		session1.setAttribute("search", search);

		res.sendRedirect("ParchaseReport");

	}

	@RequestMapping("/minisearch2")
	public void search2(HttpServletRequest req, HttpServletResponse res)
			throws ClassNotFoundException, SQLException, IOException {
		String search = req.getParameter("search");
		HttpSession session2 = req.getSession();
		session2.setAttribute("search", search);

		res.sendRedirect("BrowseUser");

	}

	@RequestMapping("/addtokart")
	public void addtokart(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ClassNotFoundException, SQLException {
		HttpSession indi = req.getSession();
		String id = (String) indi.getAttribute("Id");
		HttpSession user = req.getSession();
		String name = (String) user.getAttribute("userid");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from products where Id='" + id + "'");

		String brand = null;
		String category = null;
		String price = null;
		String address = null;
		if (rs.next()) {
			brand = rs.getString("Companyname");
			category = rs.getString("Category");
			price = rs.getString("Price");
			address = rs.getString("Features");
		}

		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

		PreparedStatement ps1 = conn
				.prepareStatement("insert into kart(Name,Company,Category,Price,Itemid,Address)values(?,?,?,?,?,?)");
		ps1.setString(1, name);
		ps1.setString(2, brand);
		ps1.setString(3, category);
		ps1.setString(4, price);
		ps1.setString(5, id);
		ps1.setString(6, address);
		ps1.executeUpdate();
		res.sendRedirect("IndividualPageuserlogin?msg=" + id + "");
	}

}
