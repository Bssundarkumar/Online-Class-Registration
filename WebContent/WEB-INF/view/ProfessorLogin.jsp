<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
form {
	display: block;
	border: 3px solid #f1f1f1;
	position: relative;
	bottom: -70px;
}

body {
	margin-top: -42px;
	margin-right: 50px;
	margin-bottom: -25px;
	margin-left: 50px
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #d21347;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

#cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #d21347;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

img.avatar {
	width: 15%;
}

.container {
	padding: 16px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
}
</style>
<body>
	<div>

		<h2>Login Form</h2>

		<div class="imgcontainer">
			<img
				src="${pageContext.request.contextPath}/images/ucmo.jpg"
				alt="Avatar" class="avatar">
		</div>
		<form:form action="professorLogin" modelAttribute="student"
			method="POST">
			<div class="container">
				<label><b>Professor Name</b></label> 
				<input type="text" placeholder="Enter Student Id" name="firstName" required> 
				<label><b>Password</b></label>
				<input type="password" placeholder="Enter Password" name="password" required>



				<button type="submit" value="Save" class="save">Login</button>
				<input type="checkbox" checked="checked"> Remember me
			</div>
			<div class="container" style="background-color: #f1f1f1">
				<button type="button" id="cancelbtn"
					onclick="window.location.href='backToWelcomeForm'" class="welcome">Cancel</button>
				<span class="psw">Forgot <a href="#">password?</a></span>
			</div>
		</form:form>
	</div>

</body>
</html>
