<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
body {
	margin-top: 0px;
	margin-right: 50px;
	margin-bottom: -25px;
	margin-left: 50px
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
	position: relative;
	bottom: -94px;
}

img.avatar {
	width: 15%;
	position: relative;
	bottom: 8px;
}

.container {
	padding: 16px;
}

header, footer {
	padding: 1em;
	color: white;
	background-color: #d21347;
	clear: left;
	text-align: center;
	button
}

.dropbtn {
	background-color: #d21347;
	color: white;
	padding: 16px;
	font-size: 16px;
	border: none;
	cursor: pointer;
	position: relative;
	bottom: 34px;
	left: -40px;
}

}
.dropbtn:hover, .dropbtn:focus {
	background-color: rgb(127, 11, 43);
}

.dropdown {
	float: right;
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	overflow: auto;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	right: 0;
	z-index: 1;
	position: relative;
	bottom: 34px;
}
/* button */
.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown a:hover {
	background-color: #f1f1f1
}

.show {
	display: block;
}
</style>
<body>
	<div>
		<header>
		<h1>Welcome</h1>
		<div class="dropdown">
			<button onclick="myFunction()" class="dropbtn">Login</button>
			<div id="myDropdown" class="dropdown-content">
				<a href="${pageContext.request.contextPath}/login/student">Student</a>
				<a href="${pageContext.request.contextPath}/login/professor">Professor</a>
				<a href="${pageContext.request.contextPath}/login/admin">Admin</a>
			</div>
		</div>
		</header>


		<div class="imgcontainer">

			<!--<marquee behavior="scroll" speed="1" direction="right"><img src="ucmo.jpg" width="94" height="88" alt="Swimming fish" /></marquee>-->
			<img
				src="E:\AsE\ProjectImplementatrion\OnlineClassRegestration\WebContent\WEB-INF\images\ucmo.jpg"
				alt="Avatar" class="avatar">
			<h2>UNIVERSITY OF CENTRAL MISSOURI</h2>
			<marquee behavior="scroll" direction="left">LEARNING TO A
				GREATER DEGREE </marquee>
		</div>

	</div>

	<script>
		/* When the user clicks on the button, 
		 toggle between hiding and showing the dropdown content */
		function myFunction() {
			document.getElementById("myDropdown").classList.toggle("show");
		}

		// Close the dropdown if the user clicks outside of it
		window.onclick = function(event) {
			if (!event.target.matches('.dropbtn')) {

				var dropdowns = document
						.getElementsByClassName("dropdown-content");
				var i;
				for (i = 0; i < dropdowns.length; i++) {
					var openDropdown = dropdowns[i];
					if (openDropdown.classList.contains('show')) {
						openDropdown.classList.remove('show');
					}
				}
			}
		}
	</script>


</body>
</html>
