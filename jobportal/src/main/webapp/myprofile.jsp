<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My profile</title>
<style type="text/css">
#Profile {
	margin-left: 7em;
}
#Functional {
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
	padding-top: 2rem;
	padding-left: 14rem;
}
</style>
</head>
<body>
	<nav class="mb-1 navbar navbar-expand-lg navbar-dark info-color">
	<h2>Joodle jobs</h2>
	<div class="collapse navbar-collapse" id="navbar">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="home.jsp">Jobs </a></li>
			<li1 class="nav-item"> <a class="nav-link" href="#">Recruiters</a></li1>
			<li2 class="nav-item"> <a class="nav-link" href="#">Notification</a></li2>
			<div class="collapse navbar-collapse" id="navbarSupportedContent-4">
				<ul class="navbar-nav ml-auto">

					<li class="nav-item dropdown show"><a
						class="nav-link dropdown-toggle" id="navbarDropdownMenuLink-4"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
							<i class="fa fa-user"></i><span
								class="sr-only">(current)</span> Profile
					</a>
						<div class="dropdown-menu dropdown-menu-right dropdown-info"
							aria-labelledby="navbarDropdownMenuLink-4">
							<a class="dropdown-item active" href="#" id="Pnav" >My profile</a> 
								 <a class="dropdown-item"
								href="#" id="Fnav">Functional area</a> 
								<a class="dropdown-item" href="#">Language
								known</a> <a class="dropdown-item" href="#">Project details</a>
						</div></li>
				</ul>
			</div>
			<li3 class="nav-item"> <a class="nav-link" href="index.jsp"><i
				class="fa fa-sign-out"></i> Logout</a></li3>
		</ul>

	</div>
	
	</nav>
	<div class="search">
		<div class="row">
			<div class="col-sm-7">
				<input class="form-control" type="text"
					placeholder="Search by Jobs, Skills, Recruiters"
					aria-label="Search">

			</div>
		</div>
	</div>

	<main class="pt-5 mx-lg-5"> <!--Grid row-->
	<div class="row wow fadeIn" id="Profile">
		<!--Grid column-->
		<div class="col-md-9 mb-4">
			<!--Card-->
			<div class="card">
				<!--Card content-->
				<div class="card-body">
					<form>
						<h3>Update Personal Details</h3>
						<div class="form-group row">
							<label for="input-group date" class="col-sm-2 col-form-label">Date
								of Birth</label>
							<div class="col-sm-5">
								<input type="date" class="form-control" id="inputEmail3"
									placeholder="Date of Birth">
							</div>
						</div>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0">Gender</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" name="gridRadios"
											id="gridRadios1" value="option1"> <label
											class="form-check-label" for="gridRadios1"> Male</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="gridRadios"
											id="gridRadios2" value="option2"> <label
											class="form-check-label" for="gridRadios2"> Female</label>
									</div>
								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<label for="inputAddress" class="col-sm-2 col-form-label">Hometown</label>
							<div class="col-sm-5">
								<input type="address" class="form-control" id="inputAddress"
									placeholder="Address">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputPincode" class="col-sm-2 col-form-label">Pincode</label>
							<div class="col-sm-5">
								<input type="tel" class="form-control" id="inputPincode"
									placeholder="Pincode">
							</div>
						</div>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0">Marial
									Status</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" name="gridRadios"
											id="gridRadios1" value="option1"> <label
											class="form-check-label" for="gridRadios1"> Married </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="gridRadios"
											id="gridRadios2" value="option2"> <label
											class="form-check-label" for="gridRadios2"> Unmarried</label>
									</div>

								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<label for="inputClgname" class="col-sm-2 col-form-label">College
								Name</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputClgname"
									placeholder="College Name">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputDegree" class="col-sm-2 col-form-label">Degree</label>
							<div class="col-sm-5">
								<input type="text" class="form-control" id="inputDegree"
									placeholder="Degree">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputYear" class="col-sm-2 col-form-label">Year
								of Passing</label>
							<div class="col-sm-5">
								<input type="tel" class="form-control" id="inputYear"
									placeholder="Year of Passing">
							</div>
						</div>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0">Relocate
									Anywhere</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" name="gridRadios"
											id="gridRadios1" value="option1"> <label
											class="form-check-label" for="gridRadios1"> Yes</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="gridRadios"
											id="gridRadios2" value="option2"> <label
											class="form-check-label" for="gridRadios2"> No</label>
									</div>

								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary">Update
									Profile</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	
	<div class="row wow fadeIn" id="Functional">
		<!--Grid column-->
		<div class="col-md-9 mb-4">
			<!--Card-->
			<div class="card">
				<!--Card content-->
				<div class="card-body">
					<form >
						<h3>Desired Career Profile</h3>
				</div>
				<fieldset class="form-group">
					<div class="row">
						<legend class="col-form-label col-sm-2 pt-0">Job Type</legend>
						<div class="col-sm-10">
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gridRadios"
									id="gridRadios1" value="option1"> <label
									class="form-check-label" for="gridRadios1"> Permanent</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gridRadios"
									id="gridRadios2" value="option2"> <label
									class="form-check-label" for="gridRadios2"> Contractual</label>
							</div>

						</div>
					</div>
				</fieldset>


				<fieldset class="form-group">
					<div class="row">
						<legend class="col-form-label col-sm-2 pt-0">Employment
							Type</legend>
						<div class="col-sm-10">
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gridRadios"
									id="gridRadios1" value="option1"> <label
									class="form-check-label" for="gridRadios1"> Fulltime</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="gridRadios"
									id="gridRadios2" value="option2"> <label
									class="form-check-label" for="gridRadios2"> Parttime</label>
							</div>

						</div>
					</div>
				</fieldset>
				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary">Update
							Career</button>
					</div>
				</div>
				</form>
			</div>
		</div>
	</div>
	</main>
	<script type="text/javascript">
	$("#Profile").show();
    $("#Fuctional").hide();
   
    $("#Pnav").click(()=> {
        $("#Profile").show()
        $("#Functional").hide()
        
    })
    $("#Fnav").click(()=> {
        $("#Profile").hide()
        $("#Functional").show()
        $("#Functional").current()
    })</script>

</body>
</html>