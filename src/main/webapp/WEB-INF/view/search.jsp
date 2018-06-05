<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta charset="utf-8">
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<link rel="stylesheet" type="text/css" href="../css/indexStyles.css" />
		<link rel="stylesheet" type="text/css" href="../css/searchStyles.css" />
		<title>SpringBoot Template</title>
	</head>
	
	<body>
		<div class="container">
			<div class="jumbotron">
				<h1 class="display-4">Hire A Programmer</h1>
			  	<p class="lead">Select the skills that you are looking for!</p>
			  	<hr class="my-4">
			  	<form:form action="/submit" modelAttribute="skills">
			  		<div class="row">
			  			<c:forEach items="${skills}" var="s">
				  			<div class="form-check">
							  <input class="form-check-input" type="checkbox" name="skills" value="${s}" id="${s}">
							  <label class="form-check-label" for="${s}">
							    ${s}
							  </label>
							</div>
						</c:forEach>
					</div>
				  	<p class="lead">
				    	<input class="btn btn-primary btn-lg" type="submit" value="Submit" />
				  	</p>
			  	</form:form>
			</div>
		</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</body>
</html>