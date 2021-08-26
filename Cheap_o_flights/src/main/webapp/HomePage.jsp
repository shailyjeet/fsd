<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

 <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="frontimage">
		<div id="backgroundcontainer">
			<ul id="brandname" class="row">
				<li style="color: white">Cheap_O_Flights</li>
			</ul>

		</div>
		<div id="buttonbox">
			<form action="BookTicket.jsp">
				<button type="submit" class="btn btn-dark">Book Flights</button>
			</form>
			<form action="AdminPage.jsp">
				<button type="submit" class="btn btn-dark">Admin</button>

			</form>
		</div>
	</div>

</body>
</html>