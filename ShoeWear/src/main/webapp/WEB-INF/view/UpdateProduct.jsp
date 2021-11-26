<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/Style.css"
	rel="stylesheet" type="text/css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@900&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap"
	rel="stylesheet">

<title>NexJ Shoewear Product Page</title>
<style>
#box1 {
	height: 100vh;
	width: 300px;
	font-family: "Montserrat", Sans-serif;
	font-weight: 600px;
	font-size: 24px;
	background-color: white;
	color: white;
	text-align: left;
	padding: 0px;
	border-right: solid 1px gray;
}

a {
	text-decoration: none;
	color: black;
	padding: 20px 40px;
	border-bottom: solid 1px gray;
}

#logout {
	border: none;
}
</style>
</head>
<body>
	<div class="row">
		<div id="box1" style="box-shadow: 0px 20px 5px;" class="col-lg-4">
			<a id="logout" href="Adminhome">Back</a> <a
				href="ProductPage">Product List</a> <a href="AddProduct">Add
				Product</a> <a href="DeleteProduct">Delete Product</a> <a
				href="UpdateProduct">Update Product</a>

		</div>
		<div id="box2" class="col-lg-8">
			<h1>Product list</h1>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Company Name</th>
						<th>Category</th>
						<th>Price</th>
						<th>Features</th>
						<th>Update</th>
					</tr>
				</thead>
				<tbody>
					<%
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC",
							"swadmin", "swpassword");

					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from products");
					while (rs.next()) {
					%>

					<tr>
						<td><%=rs.getString("Id")%></td>
						<td><%=rs.getString("Companyname")%></td>
						<td><%=rs.getString("Category")%></td>
						<td><%=rs.getString("Price")%></td>
						<td><%=rs.getString("Features")%></td>
						<td><a href="updatepage?msg=<%=rs.getString("Id")%>"
							class="btn btn-danger">Update</a></td>
					</tr>

					<%
					}
					%>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>