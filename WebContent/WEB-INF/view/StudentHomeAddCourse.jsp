<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
div.container {
	width: 100%;
	border: 1px solid gray;
	margin: 0;
	padding: 0;
	border: 0;
	outline: 0
}

header, footer {
	padding: 1em;
	color: white;
	background-color: #d21347;
	clear: left;
	text-align: center;
}

* {
	box-sizing: border-box
}

body {
	font-family: "Lato", sans-serif;
}

/* Style the tab */
div.tab {
	float: left;
	border: 1px solid #ccc;
	background-color: #f1f1f1;
	width: 30%;
	height: 460px;
}

/* Style the buttons inside the tab */
div.tab button {
	display: block;
	background-color: inherit;
	color: black;
	padding: 22px 16px;
	width: 100%;
	border: none;
	outline: none;
	text-align: left;
	cursor: pointer;
	transition: 0.3s;
	font-size: 17px;
}

/* Change background color of buttons on hover */
div.tab button:hover {
	background-color: #ddd;
}

/* Create an active/current "tab button" class */
div.tab button.active {
	background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
	float: left;
	padding: 0px 12px;
	border: 1px solid #ccc;
	width: 70%;
	border-left: none;
	height: 460px;
}

.dropbtn {
	background-color: #d21347;
	color: white;
	font-size : 18px;
	border: none;
	cursor: pointer;
	position: relative;
	bottom: 13px;
	
	
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
}
</style>
</head>
<body>

	<div class="container">

		<header>
			<h1>Welcome ${student.firstName}</h1>
		</header>


		<div class="tab">
			<button class="tablinks" onclick="openCity(event, 'viewDetail')"
				id="defaultOpen">View Detail</button>
			<button class="tablinks"
				onclick="openCity(event, 'coursesRegestered')"
				onclick="window.location.href='coursesRegestered'">Courses
				Regestered</button>
			<button class="tablinks" onclick="openCity(event, 'feesDetails')">Fees
				Details</button>
		</div>

		<div id="viewDetail" class="tabcontent">
			<h3>View Detail</h3>

			<table>
				<tr>
					<td>Studnet Id</td>
					<td>${student.studentId}</td>
				</tr>
				<tr>
					<td>First Name</td>
					<td>${student.firstName}</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>${student.lastName}</td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td>${student.emailId}</td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>${student.gender}</td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td>${student.dateOfBirth}</td>
				</tr>
				<tr>
					<td>Address</td>
					<td>${student.address}</td>
				</tr>
				<tr>
					<td>Department Name</td>
					<td>${student.departmentId}</td>
				</tr>
				<tr>
					<td>Year Of Enrollment</td>
					<td>${student.yearEnrolled}</td>
				</tr>
				<tr>
					<td>Over all GPA</td>
					<td>${student.overALlGPA}</td>
				</tr>
			</table>
		</div>

		<div id="coursesRegestered" class="tabcontent">
			<h3>Courses Regestered</h3>
			<form action="" modelattribute="courses">
				<div id="container">
					<div id="content">
						<!-- addnewcourse -->
						
						

					</div>

					
				</div>
			</form>
		</div>

		<div id="feesDetails" class="tabcontent">
			<h3>Fees Details</h3>
			<p>Tokyo is the capital of Japan.</p>
		</div>

		<div id="Tokyo" class="tabcontent">
			<h3></h3>
			<p>Tokyo is the capital of Japan.</p>
		</div>

		<footer>Copyright &copy; MSD</footer>

	</div>

</body>
<script>
	function openCity(evt, cityName) {
		var i, tabcontent, tablinks;
		tabcontent = document.getElementsByClassName("tabcontent");
		for (i = 0; i < tabcontent.length; i++) {
			tabcontent[i].style.display = "none";
		}
		tablinks = document.getElementsByClassName("tablinks");
		for (i = 0; i < tablinks.length; i++) {
			tablinks[i].className = tablinks[i].className
					.replace(" active", "");
		}
		document.getElementById(cityName).style.display = "block";
		evt.currentTarget.className += " active";
	}

	// Get the element with id="defaultOpen" and click on it
	document.getElementById("defaultOpen").click();
</script>

</html>
