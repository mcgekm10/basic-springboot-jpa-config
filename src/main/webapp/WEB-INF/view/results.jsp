<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" %>

<html>
	<head>
		<meta charset="utf-8">
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  		<!-- Compiled and minified CSS -->
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" type="text/css" href="../css/indexStyles.css" />
		<link rel="stylesheet" type="text/css" href="../css/resultsStyles.css" />
		<title>SpringBoot Template</title>
	</head>
	
	<body modelAttribute="programmers">
		<%! int count = 1; %>
		<div class="container">
			<div class="jumbotron">
				<h1 class="display-4">Here's What I Found!</h1>
			  	<hr class="my-4">
			  	<div class="row">
				<c:forEach items="${programmers}" var="p">
					<div class="col s4">
						<div class="card">
							<h4 class="card-title">${p.name}</h4>
							<div class="card-content grey-text">
								<p class="card-text">${p.formatPerc}% Match!</p><br>
								<a class="btn btn-primary modal-trigger darkgreen" href="#modal<%= count %>">Details</a>
							</div>
						</div>
					</div>
					<div id="modal<%= count %>" class="modal">
						<div class="modal-content">
						    <h5>${p.name}'s Skills</h5><br>
					    	<div class="row">
					    		<c:forEach items="${p.skills}" var="skill">
					    			<h6>${skill}</h6>
					    		</c:forEach>
							</div>
						</div>
					</div>
					<% count++; %>
				</c:forEach>
				</div>
				<a class="btn btn-primary modal-trigger darkgreen" href="/search">Search Again</a>
			</div>
		</div>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>
		<script>
		  $(document).ready(function(){
		    $('.modal').modal();
		  });
		</script>
	</body>
</html>