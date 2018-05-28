<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="http://code.ionicframework.com/1.0.0/css/ionic.css" />
	<script src="http://code.ionicframework.com/1.0.0/js/ionic.bundle.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/TaskToDoList/mvc/editTasks" method=POST>
		<label for="taskname">Edit Task Name</label>
		<c:forEach var="edittask" items="${edittask }">
		<c:set var="taskid" value="${edittask.taskid }" scope="request"/>
		<input type="hidden" name="taskid" value="${taskid }" >
		<input name="taskname" id="taskname" data-clear-btn="true" data-mini="true" value="${edittask.taskname }" required="true" data-theme="a" type="text"/>
		<div class="ui-input-btn ui-btn ui-mini ui-btn-inline ui-corner-all ui-btn-b">
			Edit
			<input data-enhanced="true" type="submit" value="Submit" id="button-1"/>
		</div>
		</c:forEach>
		</form>
</body>
</html>