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
		<h2>ONE BOOK</h2>
		<hr>
		<h2>Title: <c:out value="${book.title}"></c:out></h2>
		<h2>Description: <c:out value="${book.description}"></c:out></h2>
		<h2>Language: <c:out value="${book.language}"></c:out></h2>
		<h2>Pages: <c:out value="${book.pages}"></c:out></h2>
		
		<!-- IF STATEMENT - displays something or nothing -->
		<c:if test="${ book.pages < 150 }">
			<p>Little kids book</p>
		</c:if>
		
		<!-- CHOOSE to do standard else, if, elseif logic -->
		<c:choose>		
			<c:when test="${ book.pages >200 }">
				<p>Big boys book</p>
			</c:when>
			<c:when test="${ book.pages == 1000 }">
				<p>GET A LIFE</p>
			</c:when>
			<c:otherwise>
				<p> Doesnt meet requirements :( </p>
			</c:otherwise>
			
			
		</c:choose>
		
	</div>
</body>
</html>