<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.* "%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/css/Style.css" rel="stylesheet"
	type="text/css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@800&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>NexJ Shoewear</title>
<style>
.col-md-4 {
	margin: 20px 0px;
	padding: 10px;
}

.box {
	width:100%;
	height:280px;
	background-position:center;
	background-size:cover;
	background-repeat:no-repeat;
	color:white;
	padding:100px 0px;
	font-size:30px;
}

#shoebox {
	margin: 40px 0px;
	box-shadow: 2px 0px 8px black;
	border: none;
}

#shoecontent {
	color: gray;
	text-align: left;
	padding: 20px 0px 10px 40px;
}
</style>
</head>
<body>
	<div>
		<div id="s1" class="section">
			<div id="navbar">
				<div id="logo">NexJ Shoewear</div>
				<div id="options">
					<ul>

						<li><a href="Login">Login</a></li>
						<li><a href="Admin">Admin</a></li>
					</ul>
				</div>
			</div>
			<div id="coverimg"></div>
		</div>
		<div id="s2" class="section">
			<div class="row" id="row1">
				<div class="col-md-4">
					<div id="sportshoe" class="box">Sports Shoe</div>
				</div>
				<div class="col-md-4">
					<div id="casualshoe" class="box">Casual Shoe</div>
				</div>
				<div class="col-md-4">
					<div id="formalshoe" class="box">Formal Shoe</div>
				</div>
			</div>
			<div class="row" id="row2">
				<div class="col-md-4">
					<div id="sneakers" class="box">Sneakers</div>
				</div>
				<div class="col-md-4">
					<div id="boots" class="box">Boots</div>
				</div>
				<div class="col-md-4">
					<div id="crocs" class="box">Crocs</div>
				</div>
			</div>
		</div>
		<div id="s3" class="section">
			<h1>Mens Shoes</h1>
			<%
			int num = 0;

			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC", "swadmin", "swpassword");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from products");
			while (rs.next()) {
			%>

			<a href="IndividualPage?msg=<%=rs.getString("Id")%>"
				style="padding: 0px; text-decoration: none;"><div id="shoebox"
					class="row">
					<img id="shoeimg" class="col-md-3"
						src="${pageContext.request.contextPath}/resources/img/<%=rs.getString("Imgpath")%>"
						style="padding: 0px;"></img>
					<div id="shoecontent" class="col-md-8">
						<div>
							<h2><%=rs.getString("Companyname")%></h2>
							<h3><%=rs.getString("Category")%></h3>
							<p>
								Price: Rs.<%=rs.getString("Price")%></p>
							<h4 style="color: gold;">Free Delivery Available!</h4>
						</div>
					</div>
				</div></a>
			<%
			}
			%>
		</div>
		<div id="s4" class="section"></div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>