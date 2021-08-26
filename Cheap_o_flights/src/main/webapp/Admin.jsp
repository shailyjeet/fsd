<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link href="StyleSheets/IntroPage.css" rel="stylesheet" type="text/css">

<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.css">

<style>
#</style>

</head>
<body>
	<div id="header">
		<h1>Admin Dashboard</h1>

		<div id="subgroup">
			<a href="UserControllerServlet"><button class="btn btn-primary">Manage Users</button></a> 
			<a href="ControllerServlet"><button class="btn btn-primary">Manage Flight</button></a> 
			<a href="Places.jsp"><button class="btn btn-primary">Places</button></a> 
			<a href="Airlines.jsp"><button class="btn btn-primary">Airlines</button></a> 
			<a href="HomePage.jsp"><button class="btn btn-dark">Logout</button></a>
		</div>
	</div>
	<div id="table">
		<h3 id="table_title">Flight Details</h3>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Flight_id</th>
					<th scope="col">Name</th>
					<th scope="col">Source</th>
					<th scope="col">Destination</th>
					<th scope="col">To_Day</th>
					<th scope="col">Ticket_Price</th>
				</tr>
			</thead>
			<tbody>


			<%
  			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cheap_o_fly","cheap_o_user","cheap_o_pass");
			
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from flights");
				while(rs.next())
					{
			%>
				<tr>
					<th><%=rs.getString("Flight_id") %></th>
					<th><%=rs.getString("Name") %></th>
					<th><%=rs.getString("Source") %></th>
					<th><%=rs.getString("Destination") %></th>
					<th><%=rs.getString("To_Day") %></th>
					<th><%=rs.getString("Ticket_Price") %></th>
				</tr>
			<%
					}
				}
				catch(Exception e)
  				{
	  				System.out.print(e);
  				}
			%>
			</tbody>
			</table>
	</div>


</body>
</html>