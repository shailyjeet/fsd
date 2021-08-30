<!DOCTYPE html>
<html>

<head>
<title>Update Flight Details</title>

<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Update Flight Details</h2>
		</div>
	</div>

	<div id="container">
		<h3>Update Flight</h3>

		<form action="ControllerServlet" method="GET">

			<input type="hidden" name="command" value="UPDATE" /> <input
				type="hidden" name="flightId" value="${THE_FLIGHT.flight_id}" />

			<table>
				<tbody>

					<tr>
						<td><label>Airline name:</label></td>
						<td><input type="text" name="name" value="${THE_FLIGHT.name}" /></td>
					</tr>

					<tr>
						<td><label>Source:</label></td>
						<td><input type="text" name="source"
							value="${THE_FLIGHT.source}" /></td>
					</tr>

					<tr>
						<td><label>Destination:</label></td>
						<td><input type="text" name="destination"
							value="${THE_FLIGHT.destination}" /></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><input type="text" name="email"
							value="${THE_FLIGHT.email}" /></td>
					</tr>

					<tr>
						<td><label>Date:</label></td>
						<td><input type="text" name="day" value="${THE_FLIGHT.day}" /></td>
					</tr>

					<tr>
						<td><label>Ticket Price:</label></td>
						<td><input type="text" name="ticket_price"
							value="${THE_FLIGHT.ticket_price}" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				</tbody>
			</table>
		</form>

		<div style="clear: both;"></div>

		<p>
			<a href="ControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











