<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Board Form</title>
<style>
	.body{
       text-align: center;
   }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("button").click(function(){
		if($("#bTitle").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#bUser").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		} if($("#bContext").val().length == 0) {
			alert("값을 입력해주세요!");
			return;
		}
		$("#form").submit();
	})
})
</script>
</head>
<body class="body">
	<h1>Add Board Form</h1>
		<form id="form" method="post" action="${pageContext.request.contextPath}/AddBoard">
			<div>
				b_title : 
				<input type="text" name="bTitle" id="bTitle">
			</div>
			<div>
				b_user : 
				<input type="text" name="bUser" id="bUser">
			</div>
			<div>
				b_context : 
				<textarea rows="5" cols="50" name="bContext" id="bContext">
				</textarea>
			</div>
			<button type="button">Add Board</button>
		</form>
	<br>
	<a href="${pageContext.request.contextPath}/BoardList">Back</a>
</body>
</html>