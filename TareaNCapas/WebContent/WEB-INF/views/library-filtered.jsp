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
		
		button {
			position: fixed;
			margin-top: 100px;
		}
	</style>
	
</head>
<body>
	<nav>
		<div class="row">
			<div class="col-md-1 form-container">
				<i class="fas fa-book-reader"></i>
			</div>
			<div class="col-md-5 library-name-section">
				<span>Biblioteca Municipal</span>	
			</div>
			<div class="col-md-6 library-name-section">
				<span style="font-size: 20px;">
					
					Se encontraron ${cantidad} resultados para '${dato}' en '${criterio}'
				
				</span>	
			</div>
		</div>
		
	</nav>
	<div class="row row-height">
		<div class="col-md-2">
			
		</div>
		
		<div class="col-md-8 form-container" style="padding-top:100px;">
		<p>${numero}</p>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Titulo</th>
						<th>Autor</th>
						<th>Genero</th>
						<th>ISBN</th>
						<th>Cantidad</th>
					</tr>
				</thead>
				<c:forEach items="${libros}" var="libro"> 
					<tr>
						<td><c:out value = "${libro.getTitulo()}"/></td>
						<td><c:out value = "${libro.getAutor()}"/></td>
						<td><c:out value = "${libro.getGenero()}"/></td>
						<td><c:out value = "${libro.getNumber()}"/></td>
						<td><c:out value = "${libro.getCantidad()}"/></td>
					</tr>
				</c:forEach>	
			</table>
		</div>
		
		<div class="col-md-2">
			<div class="col-md-2">
				<button class="btn btn-success" onclick="location.href='${pageContext.request.contextPath}/'">Regresar</button>
			</div>
		</div>
	</div>
	
</body>
</html>