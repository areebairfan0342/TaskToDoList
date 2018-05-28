<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div data-role="tabs" id="tabs-1">
		<div data-role="navbar">
			<ul>
				<li><a href="#tab-1a" data-ajax="false" data-theme="b">Create Task</a></li>
				<li><a href="#tab-1b" data-ajax="false" data-theme="b">Delete Task</a></li>
				<li><a href="#tab-1c" data-ajax="false" data-theme="b">Edit Task</a></li>
				<li><a href="#tab-1d" data-ajax="false" data-theme="b">Mark Task as Completed</a></li>
				<li><a href="#tab-1e" data-ajax="false" data-theme="b">View All Task</a></li>
			</ul>
		</div>
		<div id="tab-1a" class="ui-body-d ui-content">
			<h4>Craete a task here</h4>
			
			
		</div>
		<div id="tab-1b" class="ui-body-d ui-content">
			<h4>Choose Task which you want to delete</h4>
			<fieldset data-role="controlgroup" id="checkboxes-1">
				<legend></legend>
				<input name="checkbox-1a" id="checkbox-1a" data-mini="true" data-theme="a" type="checkbox"/>
				<label for="checkbox-1a">A</label>
				<input name="checkbox-1b" id="checkbox-1b" data-mini="true" data-theme="a" type="checkbox"/>
				<label for="checkbox-1b">B</label>
				<input name="checkbox-1c" id="checkbox-1c" data-mini="true" data-theme="a" type="checkbox"/>
				<label for="checkbox-1c">C</label>
			</fieldset>
		</div>
		<div id="tab-1c" class="ui-body-d ui-content">
			<h4>Tab 3</h4>
		</div>
	</div>

</body>
</html>