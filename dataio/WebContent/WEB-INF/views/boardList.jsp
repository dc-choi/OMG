<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>
<style>
	.body{
       text-align: center;
   }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body class="body">
	<h1>BoardList</h1>
	<a href="${pageContext.request.contextPath}/AddBoard">Add Board</a>
	<table style="margin-left: auto; margin-right: auto;" border="1">
		<tr>
			<th>b_no</th>
			<th>b_title</th>
			<th>b_user</th>
			<th>b_date</th>
		</tr>
		<c:forEach var="l" items="${list}">
			<tr>
				<td>${l.bNo}</td>
				<td><a href="${pageContext.request.contextPath}/BoardListOne?bNo=${l.bNo}">${l.bTitle}</a></td>
				<td>${l.bUser}</td>
				<td>${l.bDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>