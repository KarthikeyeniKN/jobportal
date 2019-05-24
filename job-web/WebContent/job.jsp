<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.8/css/mdb.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">

<title>Home</title>
<style>
#Vacancy {
	margin-left: 7em;
}
#viewbtn {
	margin-left: 7em;
}
h2 {
	font-family: 'Kaushan Script', cursive;
	padding-right: 5rem;
	padding-left: 10rem;
}
h3 {
	font-family: 'Kaushan Script', cursive;
	text-align: center;
}

li1 {
	padding-right: 2rem;
}

li2 {
	padding-right: 2rem;
}

li3 {
	padding-left: 14rem;
}

li {
	padding-right: 2rem;
}

.navbar {
	font-size: 18px;
}
.search {
	padding-top: 5rem;
	padding-left: 11rem;
}
</style>
</head>
<body>
	<nav class="mb-1 navbar navbar-expand-lg navbar-dark info-color">
	<h2>Joodle jobs</h2>
	<div class="collapse navbar-collapse" id="navbar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Jobs
					<span class="sr-only">(current)</span>
			</a></li>
			<li1 class="nav-item"> <a class="nav-link" href="#">Recruiters</a></li1>
			<li2 class="nav-item"> <a class="nav-link" href="#">Notification</a></li2>
			<div class="collapse navbar-collapse" id="navbarSupportedContent-4">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item dropdown show"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<i class="fa fa-user"></i> Profile
					</a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4">
							<a class="dropdown-item" href="myprofile.jsp#Pnav" id="Pnav">My
								profile</a> <a class="dropdown-item" href="#">Functional area</a> <a
								class="dropdown-item" href="#">Language known</a> <a
								class="dropdown-item" href="#">Project details</a>
						</div></li>
				</ul>
			</div>
			<li3 class="nav-item"> <a class="nav-link" href="index.jsp"><i
				class="fa fa-sign-out"></i> Logout</a></li3>
		</ul>
	</div>
	</nav>
	<%-- <%@ include file="navbar.jsp" %> --%>
	<div class="search">
		<div class="row">
			<div class="col-sm-7">
				<input class="form-control" type="text"
					placeholder="Search by Jobs, Skills, Recruiters"
					aria-label="Search">
			</div>
		</div>
	</div>
	<form method="post" action="JobServlet" id="vacancybtn">
		<button type="submit" name="Vacancy" value="Vacancy"
			class="btn btn-success waves-effect btn-sm">
			<i class="fa fa-th-list" aria-hidden="true"></i>&nbsp;&nbsp;Vacancy
		</button>
	</form>
	<main class="pt-5 mx-lg-5"> <!--Grid row--> <c:forEach
		var="vaccancyList" items="${VACCANCYLIST}">
		<div class="row wow fadeIn" id="Vacancy">
			<!--Grid column-->
			<div class="col-md-7 mb-4">
				<!--Card-->
				<div class="card">
					<!--Card content-->
					<div class="card-body">
						<form method="post" action="ViewCompany">
							<table>
								<h3>Vacancy Details</h3>
								<tbody>
									<tr>
										<th>Company name</th>
										<td><a href=${vaccancyList.company_name}>${vaccancyList.company_name}</a></td>
									</tr>
									<tr>
										<th>Recruiters Name</th>
										<td>${vaccancyList.recruiters_name}</td>
									<tr>
										<th>Position</th>
										<td>${vaccancyList.position}</td>
									<tr>
										<th>Location</th>
										<td>${vaccancyList.location}</td>
									<tr>
										<th>Vacancy Position</th>
										<td>${vaccancyList.vaccancy_position}</td>
									<tr>
										<th>Skills Required</th>
										<td>${vaccancyList.skill_required}</td>
									<tr>
										<th>Vacancy</th>
										<td>${vaccancyList.vaccancy}</td>
									<tr>
										<td><button type="submit" name="companyname" id="viewbtn"
												value="${vaccancyList.company_name}"
												class="btn btn-primary waves-effect btn-sm">View</button></td>
									</tr>
								</tbody>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</c:forEach> </main>
</body>
</html>