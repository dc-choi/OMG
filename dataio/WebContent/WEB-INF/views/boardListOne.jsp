<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List One</title>
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
		} if($("#cUser").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#cComment").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		}
		$("#form").submit();
	})
})
</script>
</head>
<body class="body">
	<h1>Board List One</h1>
		<c:forEach var="b" items="${BoardList}">
			<div>
				bNo : ${b.bNo}
			</div>
			<div>
				bTitle : ${b.bTitle}
			</div>
			<div>
				bUser : ${b.bUser}
			</div>
			<div>
				bContext : ${b.bContext}
			</div>
			<div>
				bDate : ${b.bDate}
			</div>
			<br>
			<div>
				<a href="${pageContext.request.contextPath}/ModifyBoard?bNo=${b.bNo}">UPDATE</a>&nbsp;
				<a href="${pageContext.request.contextPath}/RemoveBoard?bNo=${b.bNo}">DELETE</a>
			</div>
		</c:forEach>
	<h3>CommentList</h3>
		<c:forEach var="c" items="${CommentList}">
			<div>
				cNo : ${c.cNo}<br>
				cUser : ${c.cUser}<br>
				cComment : ${c.cComment}<br>
				cDate : ${c.cDate}<br>
				<a href="${pageContext.request.contextPath}/ModifyComment?cNo=${c.cNo}&&bNo=${c.bNo}">UPDATE</a>&nbsp;
				<a href="${pageContext.request.contextPath}/RemoveComment?cNo=${c.cNo}&&bNo=${c.bNo}">DELETE</a>
				<br>
				<br>
			</div>
		</c:forEach>
	<h3>AddComment</h3>
	<form id="form" method="post" action="${pageContext.request.contextPath}/AddComment">
		<div>
			<input type="hidden" name="bNo" id="bNo" value="${bNo}">
		</div>
		<div>
			b_user : 
			<input type="text" name="cUser" id="cUser">
		</div>
		<div>
			c_comment : 
			<textarea rows="5" cols="50" name="cComment" id="cComment">
				입력하세요.
			</textarea>
		</div>
		<button type="button">Add Comment</button>
	</form>
	<br>
	<a href="${pageContext.request.contextPath}/BoardList">Back</a>
</body>
</html>