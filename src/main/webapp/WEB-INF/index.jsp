<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Hello world</h1>
		<!-- KEY FROM CONTROLLER -->
		<table class="table table-danger">
			<thead>
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Description</th>
					<th>Language</th>
					<th>Pages</th>
					<th>Created At</th>
					<th>Updated At</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="oneBook" items="${ allBooks}">
					<tr>
					
						<td><c:out value="${ oneBook.id}" /></td>
			
						<td><c:out value="${ oneBook.title}" /> </td>
				
						<td><c:out value="${ oneBook.description}" /></td>
				
						<td><c:out value="${ oneBook.language}" /></td>
				
						<td><c:out value="${ oneBook.pages}" /></td>
				
						<td><c:out value="${ oneBook.createdAt}" /></td>
						
						<td><c:out value="${ oneBook.updatedAt}" /></td>
					</tr>
				</c:forEach>
			</tbody>	
		</table>
		<form action="/books/new" method="POST">
			<p>
				Title:
				<input type="text" name="title" id="">
			</p>
			<p>
				Description:
				<input type="text" name="description" id="">
			</p>
			<p>
				Language:
				<input type="text" name="language" id="">
			</p>
			<p>
				Pages:
				<input type="text" name="pages" id="">
			</p>
			<button>Submit</button>
		</form>	
	</div>
</body>
</html>