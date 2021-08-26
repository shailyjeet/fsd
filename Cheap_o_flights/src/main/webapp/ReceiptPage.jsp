<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.*" %>
    <%
    	HttpSession Session=request.getSession();
    
    	// session details from  customerdetail.jsp
    	String name=(String)Session.getAttribute("name");
    	String tp=(String)Session.getAttribute("ticketprice");
    	float ticketprice=Float.parseFloat(tp);
    	int flightid=(int)Session.getAttribute("flightid");
    	
	    // Session details from customerdetail.java
    	String passengername=(String)Session.getAttribute("passengername");
    	String email=(String)Session.getAttribute("email");
    	String mobileno=(String)Session.getAttribute("mobileno");	    
    	
    	// Session details from ticketbooking.java
    	String source=(String)Session.getAttribute("source");
    	String destination=(String)Session.getAttribute("destination");
    	String seats =(String) Session.getAttribute("seats");
    	int seat = Integer.parseInt(seats);
    	String date = (String)Session.getAttribute("date");
    	String day = (String)Session.getAttribute("Day");
    	
    	// Session details from checkout.java
    	
	    String cardname=(String)Session.getAttribute("cardname");
	    String cardno=(String)Session.getAttribute("cardno");
	    String cvv=(String)Session.getAttribute("cvv");
	    String cardholdername=(String)Session.getAttribute("cardholdername");
	    // String phone = (String)Session.getAttribute("phone");
	    // String email = (String)Session.getAttribute("email");
    	
 		double sum=seat*ticketprice;
     
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Receipt</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link href="StyleSheets/IntroPage.css" rel="stylesheet" type="text/css">
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.css">

</head>
<body>
	<div style="text-align:center">
		<h1>Thank You</h1>
		<p>Your ticket has been booked successfully!</p>
	</div>
	
	<div style="padding:40px 100px">
		<div>
			<h3>TICKET SUMMARY</h3>
			<br>
			<h5><%=source%> to <%=destination%> | Date: <%=date%></h5>
			<br>
			<p>No of Seats Booked: <b><%=seat %></b><br>
			   Flight Name: <b><%=name %></b> (Flight Id:<b><%=flightid %></b>)<br><br>
			   Ticket Price: <b>Rs.<%=ticketprice %></b>
		</div>
		<br>
		<div>
			<h3>PASSENGER SUMMARY</h3>
			<br>
			<h5>Passenger Name - <%=passengername %> | EMail - <%=email %> | Phone - <%=mobileno %></h5>
			
		</div>
		<br>
		<h3 style="text-align:right">Total Amount Paid - RS.<%=sum %></h3>
		<button type="button" class="btn btn-dark" onclick="window.print()">Print</button>
	</div>	
</body>
</html>