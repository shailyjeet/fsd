<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title> User Details </title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>User Details</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add User -->
			
			<input type="button" value="Add New User" 
				   onclick="window.location.href='add-user-form.jsp'; return false;"
				   class="add-student-button"
			/>
			
			<table>
			
				<tr>
					<th>User Name</th>
					<th>Password</th>
					<th>Action</th>
				</tr>
				
				<c:forEach var="tempuser" items="${USER_LIST}">
					
					<!-- set up a link for each User -->
					<c:url var="tempLink" value="UserControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="adminId" value="${tempuser.admin_id}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="UserControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="adminId" value="${tempuser.admin_id}" />
					</c:url>
																		
					<tr>
						<td> ${tempuser.username} </td>
						<td> ${tempuser.password} </td>
						<td> 
							<a href="${tempLink}">Update</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this user?'))) return false">
							Delete</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








