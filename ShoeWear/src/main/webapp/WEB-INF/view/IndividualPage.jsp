<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>

<%
String Id = request.getParameter("msg");
HttpSession indi = request.getSession();
indi.setAttribute("Id", Id);

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoewear_db?useSSL=false&serverTimezone=UTC",
		"swadmin", "swpassword");

Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from products where Id='" + Id + "'");
while (rs.next()) {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NexJ Shoewear : <%=rs.getString("Companyname")%></title>
<link href="${pageContext.request.contextPath}/resources/css/Style.css" rel="stylesheet"
	type="text/css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@800&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<style>
img {
	width: 100%;
	height: 400px;
	background-position: center;
	background-size: cover;
	background-repeat: no-repeat;
}

.col-md-6 div {
	padding: 50px;
}

#buy, #addkart {
	margin-right: 20px;
	width: 140px;
}

#back {
	position: absolute;
	top: 20px;
	right: 50px;
}
</style>

<body>
	<a id="back" href="Home" class="btn btn-primary">Back</a>
	<div class="row">
		<div class="col-md-6">
			<div id="bigimage">
				<img alt="img"
					src="${pageContext.request.contextPath}/resources/img/<%=rs.getString("Imgpath")%>">
			</div>
		</div>
		<div class="col-md-6">
			<div>
				<h2><%=rs.getString("Companyname")%></h2>
				<h3><%=rs.getString("Category")%></h3>
				<p>
					Price: Rs.<%=rs.getString("Price")%></p>
				<h4 style="color: red;">Free Delivery Available!</h4>
				<p>
					Features:<br>
					<%=rs.getString("Features")%>
				</p>
			</div>
			<div>
				<a href="Buynonuser" class="btn btn-primary" id="buy">Buy</a>
				<form action="addtokart" method="post">
					<a href="#" type="submit" onclick="fun()" class="btn btn-warning"
						id="addkart">Add to Kart</a>
				</form>
			</div>
		</div>
	</div>
	<%
	}
	%>
	<script>
		function fun() {
			alert('You need to login first for add your kart!');
		}
	</script>
</body>
</html>
