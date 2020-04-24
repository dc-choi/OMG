<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify Comment</title>
<style>
	.body{
       text-align: center;
   }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("button").click(function(){
		if($("#cNo").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#bNo").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#cUser").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#cComment").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#cDate").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		}
		$("#form").submit();
	})
})
</script>
</head>
<body class="body">
	<h1>Modify Comment</h1>
	<form method="post" action="${pageContext.request.contextPath}/ModifyComment">
		<c:forEach var="l" items="${list}">
		<div>
			<input type="hidden" name="cNo" id="cNo" value="${l.cNo}">
			<input type="hidden" name="bNo" id="bNo" value="${l.bNo}">
		</div>
		<div>
			c_user : 
			<input type="text" name="cUser" id="cUser" value="${l.cUser}">
		</div>
		<div>
			c_comment : 
			<textarea rows="5" cols="50" name="cComment" id="cComment">
				${l.cComment}
			</textarea>
		</div>
		<div>
			c_date : 
			<input type="text" name="cDate" id="cDate" value="${l.cDate}">
		</div>
		</c:forEach>
		<button type="button">Modify Comment</button>
	</form>
	<br>
	<a href="${pageContext.request.contextPath}/BoardListOne?bNo=${bNo}">Back</a>
</body>
</html>