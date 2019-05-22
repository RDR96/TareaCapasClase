<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	
	<style>
		i {
			font-size: 15px;
			margin-right: 8px;
		}
		
		button {
			width: 130px;
		}
		
		nav {
			position: fixed;
			width: 100%;
			height: 75px;
			border: 1px solid black;
			background-color: #01579b;		
			z-index: 5;	
		}
		
		nav div:first-child {
			height: 100%;
		}
		
		nav i {
			font-size: 65px;
		}
	
		.center-block {
			display: block;
  			margin-right: auto;
  			margin-left: auto;
		}
		
		.form-container {
			display: flex;
    		justify-content: center;
    		align-items: center;
		}
		
		.form-container .fill-full-width {
			flex: 1;
		}
		
		.row-height {
			height: 500px;
		}
						
		.border-radius-padding {
			border: 1px solid;
    		padding: 8px;
    		border-radius: 5px;
		}
		
		.library-name-section {
			display: flex;
    		font-size: 45px;
    		color: white;
    		align-items: center;
		}
		
		span > i {
		    color: white;
		}
		span > input {
		    background: none;
		    color: white;
		    padding: 0;
		    border: 0;
		}
	</style>
	
</head>
<body>

	<nav>
		<div class="row">
			<div class="col-md-1 form-container">
				<i class="fas fa-book-reader"></i>
			</div>
			<div class="col-md-11 library-name-section">
				<span>Biblioteca Municipal</span>	
			</div>
		</div>
	</nav>
	
	<div class="row row-height">
		<div class="col-md-4">
			
		</div>
		
		<div class="col-md-4 form-container">
			<div class="fill-full-width border-radius-padding">
				<form:form action="${pageContext.request.contextPath}/search-by-value" method="POST" modelAttribute="libraryForm">
				
					<div class="form-group">												
					   <label for="selectInput">Buscar por</label>
					   
					   <form:select class="form-control" name="selectInput" path="searchParam">
					   		<c:forEach items="${parameterTypes}" var="parameterType">
					   			<form:option value="${parameterType.getColumnName()}"> <c:out value = "${parameterType.getName()}"/> </form:option>				   			
					   		</c:forEach>    				
					   </form:select>
					   					   
					 </div>
					 <div class="form-group">
					 	<label for="articleNameInput">Elemento a buscar</label>
					 	<form:input type="text" class="form-control"  path="searchValue" name="articleNameInput" placeholder="Por ejemplo: 978-3-16-148410-0 | Stephen King | Miedo..."/>
					 	<form:errors path="searchValue" cssStyle="color: #E81505"/>					 						 	
					 </div>
					 <div class="row">
					 	<div class="col-md-6 form-container">
					 		<button type="submit" class="btn btn-success"><i class="fas fa-search"></i>Buscar</button>			 						 							 						 						 
					 		
					 	</div>
					 	<div class="col-md-6 form-container">
					 		
					 		<button class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/see-all'" type="reset"><i class="fas fa-search"></i>Ver todos</button>
					 			
					 		
					 						 		
					 	</div>
					 </div>					 					
				</form:form>
			</div>
		</div>
		
		<div class="col-md-4">
		
		</div>
	</div>
	
</body>
</html>