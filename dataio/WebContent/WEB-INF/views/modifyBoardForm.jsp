<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify Board</title>
<style>
	.body{
       text-align: center;
   }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("button").click(function(){
		if($("#bNo").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#bTitle").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#bUser").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#bContext").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#bDate").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		}
		$("#form").submit();
	})
})
</script>
</head>
<body class="body">
	<h1>Modify Board</h1>
	<form id="form" method="post" action="${pageContext.request.contextPath}/ModifyBoard">
		<c:forEach var="l" items="${list}">
			<div>
				<input type="hidden" name="bNo" id="bNo" value="${l.bNo}">
			</div>
			<div>
				bTitle : 
				<input type="text" name="bTitle" id="bTitle" value="${l.bTitle}">
			</div>
			<div>
				bUser : 
				<input type="text" name="bUser" id="bUser" value="${l.bUser}">
			</div>
			<div>
				bContext : 
				<textarea rows="5" cols="50" name="bContext" id="bContext">
				${l.bContext}
				</textarea>
			</div>
			<div>
				bDate : 
				<input type="text" name="bDate" id="bDate" value="${l.bDate}">
			</div>
		</c:forEach>
		<button type="button">Modify</button>
	</form>
	<br>
	<a href="${pageContext.request.contextPath}/BoardListOne?bNo=${bNo}">Back</a>
</body>
</html>