<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.ionicframework.com/1.0.0/css/ionic.css" />
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.ionicframework.com/1.0.0/js/ionic.bundle.js"></script>
	<script src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<title>Creating a Task</title>
</head>
<body>
<div id="tab-1a" class="ui-body-d ui-content">
			<h4>Craete a task here</h4>
			<form id="form-1" action="/TaskToDoList/mvc/mainform" method="post">
				<label id="input-1">Enter Task Name:</label>
				<input id="input-1" placeholder="Text" type="text" name="taskname"/>
				<input type="submit" value="Submit" id="button-1"/>
			</form>
			
		</div>
</body>
</html>