<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>customer list</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Student</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<!-- put new customer -->
			<input type="button" value="ADD Custromer"
				onclick="window.location.href='showFormForAdd'"
				class="add-customer" />

			<!-- add out html table -->
			<table>
				<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
				</tr>
				<c:forEach var="tempCustomer" items="${students}">
					<tr>
						<th>${tempCustomer.firstName}</th>
						<th>${tempCustomer.lastName}</th>
						<th>${tempCustomer.emailId}</th>
					</tr>

				</c:forEach>

			</table>

		</div>


	</div>

</body>
</html>