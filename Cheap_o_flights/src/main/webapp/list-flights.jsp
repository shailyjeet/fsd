<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title> Flight Details </title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Flight Details</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Flight -->
			
			<input type="button" value="Add New Flight" 
				   onclick="window.location.href='add-flight-form.jsp'; return false;"
				   class="add-student-button"
			/>
			
			<table>
			
				<tr>
					<th>Airline Name</th>
					<th>Source</th>
					<th>Destination</th>
					<th>Email</th>
					<th>Date</th>
					<th>Ticket Price</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempFlight" items="${FLIGHT_LIST}">
					
					<!-- set up a link for each flight -->
					<c:url var="tempLink" value="ControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="flightId" value="${tempFlight.flight_id}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="ControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="flightId" value="${tempFlight.flight_id}" />
					</c:url>
																		
					<tr>
						<td> ${tempFlight.name} </td>
						<td> ${tempFlight.source} </td>
						<td> ${tempFlight.destination} </td>
						<td> ${tempFlight.email} </td>
						<td> ${tempFlight.day} </td>
						<td> ${tempFlight.ticket_price} </td>
						<td> 
							<a href="${tempLink}">Update</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this flight?'))) return false">
							Delete</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








