<!DOCTYPE html>
<html>

<head>
	<title>Update User Details </title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Update User Details </h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Update User details  </h3>
		
		<form action="UserControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="adminId" value="${THE_USER.admin_id}" />
			
			<table>
				<tbody>
				
					<tr>
						<td><label>User Name:</label></td>
						<td><input type="text" name="username" 
								   value="${THE_USER.username}" /></td>
					</tr>
					
					<tr>
						<td><label>Password:</label></td>
						<td><input type="text" name="password" 
								   value="${THE_USER.password}" /></td>
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
			<a href="UserControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











